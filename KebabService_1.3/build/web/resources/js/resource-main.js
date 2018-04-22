// A $( document ).ready() block.
var sidebaropenened = true;
$( document ).ready(function() {
    $(".appear").hide();
    $(".appear").fadeIn(1000);
    $(".sidebarbutton").click(function(){
        $('.ui.sidebar').sidebar('toggle');
    });
});