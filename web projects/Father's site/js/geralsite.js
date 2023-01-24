var parallaxImage = document.querySelector(".parallax-image");

window.addEventListener("scroll", function(){
  var scrollPosition = window.pageYOffset;
  parallaxImage.style.transform = "translateY(" + -scrollPosition * 0.3 + "px)";
});