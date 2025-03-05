package p1;

	import java.util.*;
	import java.util.stream.Collectors;
	 class Employee1 {
		private String name;
		private int id;
		private int age;
		private String gender;
		private int yoj;
		public Employee1()
		{
			
		}
		public Employee1(String name,int id,int age,String gender,int yoj)
		{
			this.name=name;
			this.id=id;
			this.age=age;
			this.gender=gender;
			this.yoj=yoj;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getYoj() {
			return yoj;
		}
		public void setYoj(int yoj) {
			this.yoj = yoj;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", id=" + id + ", age=" + age + ", gender=" + gender + ", yoj=" + yoj + "]";
		}
		//public int compareTo(Employee e)
		//{
			//return this.id-e.id;
		//}
	}
	public class Employee2
	{
		public static void main(String[]args)
		{
			List<Employee1>li=new ArrayList<>();
			li.add(new Employee1("sam",5,21,"female",2020));
			li.add(new Employee1("santhose",2,20,"male",2023));
			li.add(new Employee1("rithu",4,21,"female",2019));
			li.add(new Employee1("subin",4,21,"male",2025));
			li.add(new Employee1("hema",4,21,"female",2022));
			
			li.stream()
			.filter(am->am.getName().startsWith("s"))
			.forEach(dt -> System.out.println(dt));
			System.out.println(""
					+ ""
					+ ""
					+ "");
			li.stream()
			.filter(am->am.getName().startsWith("s")).distinct()
			.forEach(dt -> System.out.println(dt));
			System.out.println(""
					+ ""
					+ ""
					+ "");
			
			li.stream()
			.filter(ys->ys.getYoj()>(2020))
			.forEach(ym->System.out.println(ym.getName()+" "+ym.getId()+" "+ym.getAge()+" "+ym.getGender()+" "+ym.getYoj()));
			System.out.println(""
					+ ""
					+ ""
					+ "");
			li.stream()
			.sorted(Comparator.comparing(Employee1::getName))
			.forEach(vm->System.out.println(vm.getName()+" "+vm.getId()+" "+vm.getAge()+" "+vm.getGender()+" "+vm.getYoj()));
			System.out.println(""
					+ ""
					+ ""
					+ "");
			List<Employee1>newlist=
					li.stream()
					.collect(Collectors.toList());
			newlist.forEach(ty->System.out.println(ty.getName()+" "+ty.getId()+" "+ty.getAge()+" "+ty.getGender()+" "+ty.getYoj()));
		}
}
