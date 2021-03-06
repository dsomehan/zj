package com.dh.business

class User {
    String id
    String userName
    String password
    Date dateCreated
    Date lastUpdated

    static mapping = {
        id generator:'assigned', params:[separator:'-']
    }
    static constraints = {
        userName nullable: true
        userSex nullable: true
        password nullable: true

    }
}
