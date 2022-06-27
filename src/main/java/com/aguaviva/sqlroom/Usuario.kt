package com.aguaviva.sqlroom

import androidx.room.Entity

@Entity(tableName = "user_table")
class Usuario (
    val id: Long,
    var nome:String,
    var idade: Int
        ){
}