window.onscroll = function() {myFunction()};

var navbar = document.getElementById("navbar");
var sticky = navbar.offsetTop;

function myFunction() {
  if (window.pageYOffset >= sticky) {
    navbar.classList.add("sticky")
  } else {
    navbar.classList.remove("sticky");
  }
}

function showPass()
		{
			var x = document.getElementById("loginPassword");
			if (x.type === "password")
			{
				x.type = "text";
			}
			else
			{
				x.type = "password";
			}
		}


	function bill() {
		var price1 = document.getElementById('quantity1').value * 450;
		var price2 = document.getElementById('quantity2').value * 640;
		var price3 = document.getElementById('quantity3').value * 570;
		var tot = price1+price2+price3;
		document.getElementById('total_price').innerHTML=tot;
	}