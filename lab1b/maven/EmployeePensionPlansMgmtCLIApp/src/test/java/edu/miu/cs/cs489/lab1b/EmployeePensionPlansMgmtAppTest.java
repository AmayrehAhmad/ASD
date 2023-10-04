package edu.miu.cs.cs489.lab1b;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class EmployeePensionPlansMgmtAppTest
    extends TestCase
{
    public EmployeePensionPlansMgmtAppTest(String testName )
    {
        super( testName );
    }

    
    public static Test suite()
    {
        return new TestSuite( EmployeePensionPlansMgmtAppTest.class );
    }

    
    public void testApp()
    {
        assertTrue( true );
    }
}
