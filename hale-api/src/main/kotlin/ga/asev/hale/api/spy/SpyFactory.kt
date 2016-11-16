package ga.asev.hale.api.spy

interface SpyFactory {
    fun createSpy(spyConfig: SpyConfig): Spy
}

