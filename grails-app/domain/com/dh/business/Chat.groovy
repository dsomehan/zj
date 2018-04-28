package com.dh.business

class Chat {
    /***聊天频道
     * 系统sysChat
     * 世界worldChat
     * 国家countryChat
     * 小队teamChat
     * 私人privateChat
     * */
    String chatLv
    String sendUserName
    String receivaUserId
    String receiveUserName
    String receiveUserId
    Date dateCreated
    Date lastUpdated

    static constraints = {
        chatLv nullable: true
        sendUserName nullable: true
        dateCreated nullable: true
        lastUpdated nullable: true
        receivaUserId nullable: true
        receiveUserId nullable: true
        receiveUserName nullable: true
    }
    static mapping = {
        id generator:'assigned', params:[separator:'-']
    }
}
