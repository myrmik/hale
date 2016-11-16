package ga.asev.hale.spy.nyaa

import ga.asev.hale.api.spy.Spy
import ga.asev.hale.api.spy.SpyConfig
import ga.asev.hale.api.spy.SpyFactory

class NyaaSpyFactory() : SpyFactory {
    override fun createSpy(spyConfig: SpyConfig): Spy {
        return NyaaSpy(spyConfig)
    }

}