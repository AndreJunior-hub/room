package com.aguaviva.sqlroom

class UserRepository( private val userDao: UserDao) {

    val selecterUsers = userDao.selectUsers()

    fun addUser(usuario: Usuario){
        userDao.addUser(usuario)
    }
}