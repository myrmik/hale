package ga.asev.hale.spy.nyaa

import ga.asev.hale.api.spy.Spy
import ga.asev.hale.api.spy.SpyConfig

class NyaaSpy internal constructor(val spyConfig: SpyConfig) : Spy {
    override fun run() {
        println("NyaaSpy started: ${spyConfig.id}, ${spyConfig.name}, ${spyConfig.cron}, ${spyConfig.parameters}")
    }
}