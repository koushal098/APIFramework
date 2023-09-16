package org.testing.utilities;

import java.util.Random;

public class generateRandomNumber 
{
public static int randomnumber()
{
    Random r=new Random();	
    Integer I=r.nextInt();
    return I;
}
}
