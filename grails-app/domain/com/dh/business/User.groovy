package com.dh.business

class User {
    String id
    String userName
    String userSex
    String password
    int level=1
    long exp=0
    String country="新手"
    int hp=50
    int sp=10
    int damage=20
    int defense=10
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
