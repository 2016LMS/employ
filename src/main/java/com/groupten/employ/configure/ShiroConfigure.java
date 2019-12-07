package com.groupten.employ.configure;

import com.groupten.employ.secuirty.AccountRealm;
import org.apache.shiro.authc.pam.ModularRealmAuthenticator;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.shiro.mgt.SecurityManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class ShiroConfigure {
    @Bean()
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        Map<String, String> filterChainMap = new HashMap<>();

        filterChainMap.put("/css/**","anon");
        filterChainMap.put("/fonts/**","anon");
        filterChainMap.put("/img/**","anon");
        filterChainMap.put("/js/**","anon");
        filterChainMap.put("/lib/**","anon");
        filterChainMap.put("/login/do", "anon");
        filterChainMap.put("/logout","logout");
        filterChainMap.put("/","authc");
        filterChainMap.put("/**", "authc");
        shiroFilterFactoryBean.setLoginUrl("/login/form");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainMap);
        return shiroFilterFactoryBean;
    }


    @Bean
    public SecurityManager securityManager() {
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        defaultWebSecurityManager.setAuthenticator(new ModularRealmAuthenticator());
        List<Realm> realms = new ArrayList<>();
        realms.add(accountRealm());
        defaultWebSecurityManager.setRealms(realms);
        return defaultWebSecurityManager;
    }

    @Bean
    public AccountRealm accountRealm() {
        return new AccountRealm();
    }
  @Bean
    public DefaultWebSessionManager sessionManager(){
      DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
      sessionManager.setSessionIdUrlRewritingEnabled(false);
      return sessionManager;

  }
}
