/**
 * Script for Flight 
 */
F_NO = "fno"; //flight no
SRC = "src"; //source
DST = "dst"; //destination
DPT = "dpt"; //departure
JT = "jt"; //arrival
SEAT = "st"; //seats
DT = "dt"; //distance
FQ = "fq"; //freq
FR = "fr"; //fare

//edit input field ids
E_F_NO = "eflightno";
E_SRC = "esource";
E_DST = "edestination";
E_DPT = "edeparture";
E_AVL = "ejourney";
E_SEAT = "eseats";
E_DT = "edistance";
E_FQ = "efrequency";
E_FR = "efare";

D_F_NO = "dflightno";

function editFlight(tagId, flightno){
   document.getElementsByName(E_F_NO)[0].value = document.getElementById(F_NO + tagId).textContent;
   document.getElementsByName(E_SRC)[0].value = document.getElementById(SRC + tagId).textContent;
   document.getElementsByName(E_DST)[0].value = document.getElementById(DST + tagId).textContent;
   document.getElementsByName(E_DPT)[0].value = document.getElementById(DPT + tagId).textContent;
   document.getElementsByName(E_AVL)[0].value = document.getElementById(JT + tagId).textContent;
   document.getElementsByName(E_SEAT)[0].value = document.getElementById(SEAT + tagId).textContent;
   document.getElementsByName(E_DT)[0].value = document.getElementById(DT + tagId).textContent;
   document.getElementsByName(E_FQ)[0].value = document.getElementById(FQ + tagId).textContent;
   document.getElementsByName(E_FR)[0].value = document.getElementById(FR + tagId).textContent;
   
   $('#editflight').modal({show: true});
}

function deleteFlight(flightno){
	document.getElementsByName(D_F_NO)[0].value = flightno;
	$('#deleteflight').modal({show: true});
}

