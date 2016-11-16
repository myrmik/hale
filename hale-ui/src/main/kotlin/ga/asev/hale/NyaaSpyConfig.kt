package ga.asev.hale

import ga.asev.hale.api.spy.SpyConfig
import ga.asev.hale.api.spy.SpyParameter
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix="hale.spy.nyaa")
open class NyaaSpyConfig() : SpyConfig {
    override var id: String = ""
    override var name: String = ""
    override var cron: String = ""
    override var parameters: List<SpyParameter> = emptyList()
}