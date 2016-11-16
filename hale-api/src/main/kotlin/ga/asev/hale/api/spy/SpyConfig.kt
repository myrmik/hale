package ga.asev.hale.api.spy

interface SpyConfig {
    var id: String
    var name: String
    var cron: String
    var parameters: List<SpyParameter>

/*
    fun getId(): String
    fun getName(): String
    fun getCron(): String
    fun getParameters(): List<SpyParameter>
*/
}