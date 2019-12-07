package com.groupten.employ.secuirty;

import com.groupten.employ.service.CompanyService;
import com.groupten.employ.service.GraduateService;
import com.groupten.employ.service.RootService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;


public class AccountRealm extends AuthorizingRealm {
    @Autowired
    private GraduateService graduateService;
    @Autowired
    private CompanyService companyService;
@Autowired
private RootService rootService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    // 根据token进行身份验证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        CustomAccountToken customUserToken = (CustomAccountToken) token;
        String accountName = String.valueOf(customUserToken.getPrincipal());
        String accountPwd = String.valueOf(customUserToken.getCredentials());
        String role = customUserToken.getRole();
        if (role.equals("graduate")) {
            if (graduateService.authenticateGraduate(accountName, accountPwd, role) == null)
                throw new AuthenticationException("毕业生信息验证失败!");
            else return new SimpleAuthenticationInfo(customUserToken, accountPwd, getName());
        } else if (role.equals("company")) {
            if (companyService.authenticateCompany(accountName, accountPwd, role) == null)
                throw new AuthenticationException("企业信息验证失败!"+accountName+accountPwd+role);
            else return new SimpleAuthenticationInfo(customUserToken, accountPwd, getName());
        }else{
            if(rootService.authenticateRoot(accountName,accountPwd)==null)
                throw new AuthenticationException("管理员信息验证失败!"+accountName+accountPwd+role);
            else return new SimpleAuthenticationInfo(customUserToken, accountPwd, getName());
        }
    }

    // 识别自定义的CustomUserToken
    @Override
    public boolean supports(AuthenticationToken token) {
        return (token instanceof CustomAccountToken || token instanceof UsernamePasswordToken);
    }
}
