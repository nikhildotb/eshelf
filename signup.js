
function next_disp() {
	
	var mail = document.getElementById("email").value;
	var pass = document.getElementById("pass").value;
	var con_pass = document.getElementById("con_pass").value;
    var at_pos = mail.indexOf("@");
    var dot_pos = mail.lastIndexOf(".");
    if (at_pos<1 || dot_pos<at_pos+2 || dot_pos+2>=mail.length)
	{
        alert("Enter valid e-mail address");
	}

	else if (pass.length<8)
	{
		alert("Password should contain atleast 8 characters");
	}
	
	else if ( con_pass != pass)
	{
		alert("Confirm Password nd Password should match");
	}

	else
	{
		document.getElementById('fs_1').style.display='none';
		document.getElementById('fs_2').style.display='block';
	}
}

function prev_disp() {
	document.getElementById('fs_2').style.display='none';
	document.getElementById('fs_1').style.display='block';
}

function valid() {
	var phone = document.getElementById("phone").value;

	var phoneno = /^\d{10}$/;  
	if(phone.match(phoneno))  
	{
		return true;
	}
	else
	{  
		alert("Enter valid mobile number");  
		return false;
    }

}