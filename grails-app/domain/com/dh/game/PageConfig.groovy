package com.dh.game
/**页面配置**/
class PageConfig {
    Date dateCreated
    Date lastUpdated
    static mapping = {
        id generator:'assigned', params:[separator:'-']
    }
}
