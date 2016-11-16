package ga.asev.hale

import ga.asev.hale.api.spy.Spy
import ga.asev.hale.spy.nyaa.NyaaSpyFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class SpyConfig {

    @Bean
    open fun nyaaSpy(nyaaSpyConfig: NyaaSpyConfig): Spy {
        return NyaaSpyFactory().createSpy(nyaaSpyConfig)
    }
}