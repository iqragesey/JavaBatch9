package com.class25.overriding;

public class KhadijaTester {
    public static void main(String[] args) {

        Object [] arr={new String("test"), new Khadija("iqra")};
        //^^ all
       /* Father obj1=new*/// Ozoda("Ozoda");
       /* obj1.eat();*/
       /* obj1.sleep();*/
     //   executeAll(new Father("mirza"), new Ozoda("Ozodoa"),new Khadija("khadija"));
        Father [] fatherArr={new Father("Mirza"), new Ozoda("Ozoda"),new Khadija("Khadija")};
      executeAll(fatherArr);

      Father obj1=new Ozoda("Ozoda");
      obj1.sleep();
      Father obj2=new Khadija("Khadija");
      obj2.sleep();
      

    }
    
    static void executeAll(Father father, Ozoda ozoda, Khadija khadija){

        father.eat();
        father.sleep();
        ozoda.eat();
        ozoda.sleep();
        khadija.eat();
        khadija.sleep();
    }
  
    static void executeAll(Father [] fatherArr){

        for(Father father: fatherArr){
            father.sleep();
            father.eat();
        }
        
    }

}
