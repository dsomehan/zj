package com.dh.game
/**房间**/
class House {
    String id
    String houseName
    String houseDesc
    Date dateCreated
    Date lastUpdated
    static mapping = {
        id generator:'assigned', params:[separator:'-']
    }
}
