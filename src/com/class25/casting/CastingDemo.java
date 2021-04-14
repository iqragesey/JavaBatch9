package com.class25.casting;


import com.class25.overriding.Father;
import com.class25.overriding.Khadija;
import com.class25.overriding.Ozoda;

public class CastingDemo {

    public static void main(String[] args) {
        Father father=new Ozoda("Ozoda");


        Ozoda ozoda=(Ozoda) father;

        double var1=10.0;
        int var2=(int)var1;


    }

}
