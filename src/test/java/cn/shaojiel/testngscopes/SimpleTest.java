package cn.shaojiel.testngscopes;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Slf4j
class SimpleTest {

    @BeforeClass
    public void setUp() {
        // code that will be invoked when this test is instantiated
    }

    @Test(groups = {"fast"})
    public void aFastTest() {
        log.info("Fast test");
    }

    @Test(groups = {"slow"})
    public void aSlowTest() {
        log.info("Slow test");
    }
}
