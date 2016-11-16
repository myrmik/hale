package ga.asev.hale

import ga.asev.hale.spy.nyaa.NyaaSpy
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class HaleApplicationTests {

	@Test
	fun contextLoads() {
	}


    @Autowired
    lateinit var nyaaSpy: NyaaSpy

    @Test
	fun contextLoads1() {
        nyaaSpy.run()
	}

}
