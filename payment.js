function pay_func()
{
	var optns = document.getElementsByClassName("options");
	if(optns[0].checked==true)
	{
		document.getElementById("credit").style.display="block";
		document.getElementById("debit").style.display="none";
	}
	else if(optns[1].checked==true)
	{
		document.getElementById("credit").style.display="none";
		document.getElementById("debit").style.display="block";
	}
	else if(optns[2].checked==true)
	{
		document.getElementById("credit").style.display="none";
		document.getElementById("debit").style.display="none";
	}

}

function exp(int)
{
	var mm=document.getElementsByClassName("mm");
	if(mm[int].value.length==2)
	{
		if(mm[int].value<13 && mm[int].value>0)
		{
			var yy=document.getElementsByClassName("yy");
			yy[int].focus();
		}
		else
		{
			alert("Month should be between 01 & 12");
		}
	}
	
}