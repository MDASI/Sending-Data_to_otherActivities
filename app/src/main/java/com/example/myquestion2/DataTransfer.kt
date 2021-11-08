package com.example.myquestion2

import java.io.Serializable

class DataTransfer:Serializable{
    var username="";


    constructor(name: String, password:String ){
        username=name;



    }
    constructor()
}