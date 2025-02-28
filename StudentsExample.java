public class StudentsExample{
	int num;
	String name;
	public int getnum()
	{
		return num;
	}
	public void setnum(int num)
	{
		this.num=num;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public static void main(String[] args)
	{
		StudentsExample ob1 = new StudentsExample();
		ob1.setnum(1);
		ob1.setname("jahnavi");
		System.out.println(ob1.getnum()+"."+ob1.getname());
		StudentsExample ob2 = new StudentsExample();
		ob2.setnum(2);
		ob2.setname("sharvani");
		System.out.println(ob2.getnum()+"."+ob2.getname());
		StudentsExample ob3 = new StudentsExample();
		ob3.setnum(3);
		ob3.setname("anuradha");
		System.out.println(ob3.getnum()+"."+ob3.getname());
		StudentsExample ob4 = new StudentsExample();
		ob4.setnum(4);
		ob4.setname("likhitha");
		System.out.println(ob4.getnum()+"."+ob4.getname());
		StudentsExample ob5 = new StudentsExample();
		ob5.setnum(5);
		ob5.setname("yamini");
		System.out.println(ob5.getnum()+"."+ob5.getname());
	}
}