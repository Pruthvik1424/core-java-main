function tvRecharge(){
	console.log("Running..")


	var customerId=document.getElementById("customerId").value;
	console.log(customerId)
	console.log(customerId.value)
	//var letterNumber = /^[0-9a-zA-Z]+$/;
	//if(!customerId.value.match(letterNumber))
	let submitButton = document.getElementById("submit_button")
	
	//submitButton.disabled = false
	if(customerId.length < 8)
	{
		console.log("Please Enter Customer  ID")
		var nameError=document.getElementById("nameError")
		nameError.innerHTML="Please Enter Customer ID"
		nameError.style.color='red'
		return;
	}
	
	
	var vendor=document.getElementById("vendor")
	console.log(vendor)
	console.log(vendor.value)
	submitButton.disabled = false
	
	if(vendor.value=='')
	{
		console.log("Please Select Vendor")
		var vendorError=document.getElementById("vendorError")
		vendorError.innerHTML="Please Select Vendor"
		vendorError.style.color='red'
		
	}
	submitButton.enabled = false
	
	var amount=document.getElementById("amount")
	console.log(amount)
	console.log(amount.value)
	if(amount.value=="")
	{
		console.log("Please Enter Tv Recharge Amount")
		var amountError=document.getElementById("amountError")
		amountError.innerHTML="Please Enter Tv Recharge Amount"
		amountError.style.color='red'
	}
	
	//var rechargeType=document.getElementById("rechargeType")
	//console.log(rechargeType)
	//console.log(rechargeType.value)
	//if(rechargeType.value=="")
	//{
	//	console.log("Please Enter  Recharge Type")
	//	var rechargeError=document.getElementById("rechargeError")
	//	rechargeError.innerHTML="Please Select Recharge Type"
	//	rechargeError.style.color='red'
	//}
	var radio = document.getElementById("radio")
	radio.innerHTML ="please select any one of thid buttons";
	radio.style.color="red";
	if(isAnyRadioButtonIsSelected()){
		submitButton.removeAttribute("disabled");
		
	}
	
	
	
	
	var check=document.getElementById("check")
	if(check.value=''){
		console.log("Please checked this one")
	}
	
	submitButton.disabled = false 

}