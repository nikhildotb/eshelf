/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function my_function(){
    var pass = document.getElementById("pass").value;
    var con_pass = document.getElementById("con_pass").value;
    if(con_pass == pass ){
        return true;
    }
    else{
        window.alert("password not matching");
        return false;
    }   
}
