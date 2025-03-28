package JavaNewFeatures;
class Empl{
    private int empno;
    private String ename;
    private float salary;

    Empl(int empno , String ename , float salary){
        this.empno=empno;
        this.ename=ename;
        this.salary=salary;
    }
	
	int empno(){
		return empno;
	}
	
	String ename(){
		return ename;
	}
	
	float salary(){
		return salary;
	}
	    public  String toString(){
        return ename +"\t" + ename + "\t" +salary;
    }
}

public class Record {
    public static void main(String[] args) {

        Empl e = new Empl(101,"Hanuman" ,35140);
		System.out.println(e.empno());
		System.out.println(e.ename());
		System.out.println(e.salary());
        e.toString();
    }
}
