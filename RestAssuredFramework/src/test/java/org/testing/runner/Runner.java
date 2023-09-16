package org.testing.runner;

import org.testing.testscripts.TC1_PostRequest;
import org.testing.testscripts.TC2_GetAllData;
import org.testing.testscripts.TC3_GetData;
import org.testing.testscripts.TC4_UpdateRequest;
import org.testing.testscripts.TC5_DeleteRequest;

public class Runner 
{
public static void main(String[] args) throws Exception
{
    TC1_PostRequest PR=new TC1_PostRequest();
    PR.testcase1();
    TC2_GetAllData GT= new TC2_GetAllData();
    GT.testcase2();
    TC3_GetData get=new TC3_GetData();
    get.GetData();
    TC4_UpdateRequest update=new TC4_UpdateRequest();
    update.Putrequest();
    TC5_DeleteRequest delete=new TC5_DeleteRequest();
    delete.deleteRequest();
    
    
  }
}
