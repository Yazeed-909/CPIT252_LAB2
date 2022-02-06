/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loggertest;

import newpackage.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author yzeed
 */
public class LoggerTest {
    
    public LoggerTest() {
    }

    @org.junit.jupiter.api.Test
    public void testSomeMethod() {
    }
     @Test
  public void shouldBeIdenticals()
  {
    Logger log1 = Logger.getLogger();
    Logger log2 = Logger.getLogger();
    
    
    assertEquals(log1, log2);
  }
}
