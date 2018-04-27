package com.dh.zj.game
/**房间**/
class House {
    String id
    String houseName
    String houseDesc
    static mapping = {
        id generator:'assigned', params:[separator:'-']
    }
}
