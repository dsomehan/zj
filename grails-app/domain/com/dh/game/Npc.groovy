package com.dh.game
/**npc**/
class Npc {
    String id
    String userName
    String userSex
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
}
