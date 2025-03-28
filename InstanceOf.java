class  InstanceOfDemo
{
	void display(Object o){
		if(o instanceof Integer){
			int i = (Integer)o;
			System.out.println(i*i*i);
		}
	}
	
	else if (o instanceof Float)
	{
		float f = (Float)o;
		System.out.println(f+5);
	}
	
	else if (o instanceof String)
	{
		String s = (String)o;
		System.out.println(s.toUpperCase());
	}
	
	else{
		System.out.println("Invalid ")
	}
		
		public static void main(String [] args){
			
			Demo d = new Demo();
			
			d.display(34);
			d.display("Welcome");
			d.display(50.0f);
			d.display('a');
		}
}