package JavaNewFeatures;

class Emp{
    int eno;
    String name;
    double salary;

    Emp(int eno , String name , double salary){
        this.name=name;
        this.eno=eno;
        this.salary=salary;
    }

    public String toString(){
        return eno + "\t" + name + "\t" + salary ;
    }
}

public class GenericsExam {

    public static  void main(String [] args){

        Emp emp = new Emp(101, "Hanuman" , 140050.00);
        
    }
}
