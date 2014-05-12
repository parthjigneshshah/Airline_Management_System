/**
 * Script for Employee 
 */
E_NO = "eno"; //Employee no
F_N = "efn"; //source
L_N = "eln"; //destination
EML = "eml"; //departure
ADD = "eadd"; //arrival
WD = "ewd"; //seats
POS = "ep"; //distance
HD = "ehd"; //freq
DOB = "edob"

//edit input field ids
E_E_NO = "eemployeeNo";
E_F_N = "efirstName";
E_L_N = "elastName";
E_EML = "eemail";
E_STR = "estreet";
E_CTY = "ecity";
E_ST = "estate";
E_ZIP = "ezip";
E_WD = "eworkDescription";
E_POS = "eposition";
E_HD = "ehireDate";
E_DOB = "eDob";

D_F_NO = "demployeeno";

function editEmployee(tagId, Employeeno){
	var add = document.getElementById(ADD + tagId).textContent.split(",");
	var street = add[0].trim();
	var city = add[1].trim();
	var sz = add[2].split("-");
	var state = sz[0].trim();
	var zip = sz[1].trim();
	var selectedPos = document.getElementById(POS + tagId).textContent;
	
    document.getElementsByName(E_E_NO)[0].value = document.getElementById(E_NO + tagId).textContent;
    document.getElementsByName(E_F_N)[0].value = document.getElementById(F_N + tagId).textContent;
    document.getElementsByName(E_L_N)[0].value = document.getElementById(L_N + tagId).textContent;
    document.getElementsByName(E_EML)[0].value = document.getElementById(EML + tagId).textContent;
    document.getElementsByName(E_STR)[0].value = street;
    document.getElementsByName(E_CTY)[0].value = city;
    document.getElementsByName(E_ST)[0].value = state;
    document.getElementsByName(E_ZIP)[0].value = zip;
    document.getElementsByName(E_WD)[0].value = document.getElementById(WD + tagId).textContent;
    var select = document.getElementsByName(E_POS)[0];
    for (var i=0; i< select.length;i++) {
    	if (select[i].label == selectedPos) {
    		select[i].selected = true;
    		break;
    	}
    }
    document.getElementsByName(E_HD)[0].value = document.getElementById(HD + tagId).textContent;
    document.getElementsByName(E_DOB)[0].value = document.getElementById(DOB + tagId).textContent;
   
   $('#editemployee').modal({show: true});
}

function deleteEmployee(employeeno){
	document.getElementsByName(D_F_NO)[0].value = employeeno;
	$('#deleteemployee').modal({show: true});
}