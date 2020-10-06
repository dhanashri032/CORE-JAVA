class Student{
	private int rollNumber;
	private String studName;

	void setData(int rno,String name)
	{
		rollNumber = rno;
		studName = name;
	}
	void showData()
	{
		System.out.println(rollNumber+" "+studName);
	}
}

class StudentDemo{
	public static void main(String args[])
	{
		Student s = new Student();
		s.setData(12,"Akash");
		s.showData();
	}
}