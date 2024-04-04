function SubmitFunction(){
	
	console.log("running java script...");
	
	
}

if(state.value="")
{
	console.log("Please Select Dist")
	var stateError=document.getElementById("stateError")
	stateError.innerHTML="Please Enter Dist"
	stateError.style.color='red'
}


var zip=document.getElementById("zip")
console.log(zip.value)
if(zip.value=="")
{
	var zipError=document.getElementById("zipError")
	zipError.innerHTML="Please Enter Zip Code"
	zipError.style.color='red'
}

document.getElementById(Region.)

console.log(document.addressForm.Region)
console.log(document.addressForm.Region[0])
console.log(document.addressForm.Region[1])

console.log(document.addressForm.Region[0].checked)
console.log(document.addressForm.Region[1].checked)

if(document.addressForm.Region[0].checked==false &&
document.addressForm.Region[1].checked==false)
{
	console.log("Please Select the Region")
	var regionError=document.getElementById("regionError")
	regionError.innerHTML="Please Select Region"
	regionError.style.color='red'
}







