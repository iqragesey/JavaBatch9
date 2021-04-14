package com.class24.homework;

public class Degree {

    void getPrerequisite(){
        System.out.println("To get a degree you need a high school diploma");
    }
}

class Bachelors extends Degree{

}

class Masters extends Degree{
    void getPrerequisite(){
        System.out.println("To get this degree, you need a Bachelor's degree");
    }

}

class Tester{
    public static void main(String[] args) {

        Degree degree=new Degree();
        degree.getPrerequisite();
        Bachelors bachelors = new Bachelors();
        bachelors.getPrerequisite();
        Masters masters=new Masters();
        masters.getPrerequisite();
    }
}
