(function ($) {
"use strict";

// preloader
function preloader() {
   $('#preloader').delay(0).fadeOut();
};

$(window).on('load', function() {
    preloader(),
    wowanimation();
});

// meanmenu
$('#mobile-menu').meanmenu({
	meanMenuContainer: '.mobile-menu',
	meanScreenWidth: "992"
});


$(window).on('scroll', function () {
	var scroll = $(window).scrollTop();
	if (scroll < 250) {
		$("#header-sticky").removeClass("sticky-menu");
	} else {
		$("#header-sticky").addClass("sticky-menu");
	}
});


// data - background
$("[data-background]").each(function () {
	$(this).css("background-image", "url(" + $(this).attr("data-background") + ")")
})



// mainSlider
function mainSlider() {
	var BasicSlider = $('.slider-active');
	BasicSlider.on('init', function (e, slick) {
		var $firstAnimatingElements = $('.single-slider:first-child').find('[data-animation]');
		doAnimations($firstAnimatingElements);
	});
	BasicSlider.on('beforeChange', function (e, slick, currentSlide, nextSlide) {
		var $animatingElements = $('.single-slider[data-slick-index="' + nextSlide + '"]').find('[data-animation]');
		doAnimations($animatingElements);
	});
	BasicSlider.slick({
		autoplay: false,
		autoplaySpeed: 10000,
		dots: false,
		fade: true,
		arrows: false,
		responsive: [
			{ breakpoint: 767, settings: { dots: false, arrows: false } }
		]
	});

	function doAnimations(elements) {
		var animationEndEvents = 'webkitAnimationEnd mozAnimationEnd MSAnimationEnd oanimationend animationend';
		elements.each(function () {
			var $this = $(this);
			var $animationDelay = $this.data('delay');
			var $animationType = 'animated ' + $this.data('animation');
			$this.css({
				'animation-delay': $animationDelay,
				'-webkit-animation-delay': $animationDelay
			});
			$this.addClass($animationType).one(animationEndEvents, function () {
				$this.removeClass($animationType);
			});
		});
	}
}
mainSlider();


// countdown
$('[data-countdown]').each(function () {
	var $this = $(this), finalDate = $(this).data('countdown');
	$this.countdown(finalDate, function (event) {
		$this.html(event.strftime('<div class="time-count">%D <span>Days</span></div><div class="time-count">%H <span>Hours</span></div><div class="time-count">%M <span>minutes</span></div><div class="time-count">%S <span>seconds</span></div>'));
	});
});

// testimonial-active
$('.testimonial-active').slick({
  dots: false,
  infinite: true,
  speed: 300,
  prevArrow: '<button type="button" class="slick-prev"><i class="arrow_carrot-left"></i></button>',
  nextArrow: '<button type="button" class="slick-next"><i class="arrow_carrot-right"></i></button>',
  slidesToShow: 1,
  slidesToScroll: 1,
  responsive: [
    {
      breakpoint: 1200,
      settings: {
        slidesToShow: 1,
        slidesToScroll: 1,
        infinite: true,
      }
    },
    {
      breakpoint: 992,
      settings: {
        slidesToShow: 1,
		slidesToScroll: 1,
		arrows: false,
      }
    },
    {
      breakpoint: 767,
      settings: {
        slidesToShow: 1,
		slidesToScroll: 1,
		  arrows: false,
      }
    }
  ]
});

// side-event-active
$('.side-event-active').slick({
  dots: false,
  infinite: true,
  arrows: false,
  speed: 900,
  autoplay: false,
  slidesToShow: 1,
  slidesToScroll: 1,
  responsive: [
    {
      breakpoint: 1200,
      settings: {
        slidesToShow: 1,
        slidesToScroll: 1,
        infinite: true,
      }
    },
    {
      breakpoint: 992,
      settings: {
        slidesToShow: 1,
		slidesToScroll: 1,
      }
    },
    {
      breakpoint: 767,
      settings: {
        slidesToShow: 1,
        slidesToScroll: 1
      }
    }
  ]
});

// e-details-img-active
$('.e-details-img-active').slick({
  dots: false,
  infinite: true,
  arrows: false,
  speed: 900,
  autoplay: true,
  slidesToShow: 1,
  slidesToScroll: 1,
  responsive: [
    {
      breakpoint: 1200,
      settings: {
        slidesToShow: 1,
        slidesToScroll: 1,
        infinite: true,
      }
    },
    {
      breakpoint: 992,
      settings: {
        slidesToShow: 1,
		slidesToScroll: 1,
      }
    },
    {
      breakpoint: 767,
      settings: {
        slidesToShow: 1,
        slidesToScroll: 1
      }
    }
  ]
});

// blog
$('.blog-active').slick({
	dots: false,
	infinite: true,
	arrows: true,
	speed: 1500,
	slidesToShow: 1,
	slidesToScroll: 1,
	fade: true,
	prevArrow: '<button type="button" class="slick-prev"><i class="fas fa-arrow-left"></i></button>',
	nextArrow: '<button type="button" class="slick-next"><i class="fas fa-arrow-right"></i></button>',
});

// brand
$('.brand-active').slick({
  dots: false,
  infinite: true,
  arrows: false,
  speed: 900,
  autoplay: false,
  slidesToShow: 5,
  slidesToScroll: 2,
  responsive: [
    {
      breakpoint: 1200,
      settings: {
        slidesToShow: 5,
        slidesToScroll: 2,
        infinite: true,
      }
    },
    {
      breakpoint: 992,
      settings: {
        slidesToShow: 4,
		slidesToScroll: 1,
      }
    },
    {
      breakpoint: 767,
      settings: {
        slidesToShow: 2,
        slidesToScroll: 1
      }
    },
    {
      breakpoint: 575,
      settings: {
        slidesToShow: 1,
        slidesToScroll: 1
      }
    }
  ]
});

/* magnificPopup img view */
$('.popup-image').magnificPopup({
	type: 'image',
	gallery: {
	  enabled: true
	}
});


/* magnificPopup video view */
$('.popup-video').magnificPopup({
	type: 'iframe'
});


// niceSelect;
 $(".selected").niceSelect();


// Tabs
(function ($) {
$('.tab ul.tabs').addClass('active').find('> li:eq(0)').addClass('current');
	$('.tab ul.tabs li a').on('click', function (g) {
		var tab = $(this).closest('.tab'),
			index = $(this).closest('li').index();
		tab.find('ul.tabs > li').removeClass('current');
		$(this).closest('li').addClass('current');
		tab.find('.tab_content').find('div.tabs_item').not('div.tabs_item:eq(' + index + ')').slideUp();
		tab.find('.tab_content').find('div.tabs_item:eq(' + index + ')').slideDown();
		g.preventDefault();
	});
})(jQuery);


// owlCarousel
$('.projects-carousel').owlCarousel({
	loop: false,
	margin: 30,
	items: 3,
	autoplay: false,
	autoplayTimeout: 5000,
	autoplaySpeed: 1000,
	nav: false,
	dots: false,
	responsive: {
		0: {
			items: 1,
			center: false,
			margin: 30
		},
		575: {
			items: 1,
			center: false,
			margin: 30
		},
		768: {
			items: 2,
			center: false,
			margin: 30
		},
		1200: {
			items: 3
		},
	}
})


// counterUp
$(".count").counterUp({
  delay: 10,
  time: 1000
});


// scrollToTop
$.scrollUp({
	scrollName: 'scrollUp',
	topDistance: '300',
	topSpeed: 300,
	animation: 'fade',
	animationInSpeed: 200,
	animationOutSpeed: 200,
	scrollText: '<i class=" arrow_carrot-2up"></i>',
	activeOverlay: false,
});

  // WOW active
function wowanimation() {
    var wow = new WOW({
      boxClass: 'wow',
      animateClass: 'animated',
      offset: 0,
      mobile: false,
      live: true
    });
    wow.init();
}


})(jQuery);