package com.class28.GroupWork;

abstract class  Marks {
    public abstract double getPercentage();

}
class A extends Marks{
    double grade1, grade2, grade3;
    A(double grade1, double grade2, double grade3){
        this.grade1=grade1;
        this.grade2=grade2;
        this.grade3=grade3;
    }
    public double getPercentage(){

          double total=((grade1+grade2+grade3)/300)*100;
          return total;
    }
}
class B extends Marks{
    double grade1, grade2, grade3, grade4;
    B(double grade1, double grade2, double grade3, double grade4){
        this.grade1=grade1;
        this.grade2=grade2;
        this.grade3=grade3;
        this.grade4=grade4;
    }
    public double getPercentage(){
        double total=((grade1+grade2+grade3+grade4)/400)*100;
        return total;

    }

}

