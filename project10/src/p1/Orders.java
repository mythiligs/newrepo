package p1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
class Neworders{
	private int id;
	private String name;
	private double price;
	private String month;
	private int year;
	private String city;
	private String category;
	private int quantity;
	public Neworders()
	{

	}
	public Neworders(int id, String name, double price, String month, int year, String city, String category,
			int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.month = month;
		this.year = year;
		this.city = city;
		this.category = category;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", price=" + price + ", month=" + month + ", year=" + year
				+ ", city=" + city + ", category=" + category + ", quantity=" + quantity + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(category, city, id, month, name, price, quantity, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Neworders other = (Neworders) obj;
		return Objects.equals(category, other.category) && Objects.equals(city, other.city) && id == other.id
				&& Objects.equals(month, other.month) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && quantity == other.quantity
				&& year == other.year;
	}


}
public class Orders {
	public static void question1(List<Neworders>ob)
	{
		Optional<Neworders>rem=ob.stream()
				.max(Comparator.comparing(nm->nm.getPrice()*nm.getQuantity()));
		Neworders res=rem.get();
		System.out.println("Name:"+" "+res.getName());
		System.out.println("..................................................................");
	}
	public static void question2(List<Neworders>ob)
	{
		Map<String,List<Neworders>>res=ob.stream()
				.collect(Collectors.groupingBy(Neworders::getCategory));
		for(String k:res.keySet())
		{
			System.out.println("category:"+k);
			List<Neworders>o1=res.get(k);
			for(Neworders dt:o1)
			{
				System.out.println(dt);
			}
		}
		System.out.println("..................................................................");
	}
	public static void question3(List<Neworders>ob)
	{
		Optional<Neworders>res=
				ob.stream()
				.sorted(Comparator.comparing(Neworders::getPrice).reversed())
				.findFirst();
		Neworders rem=res.get();
		System.out.println(rem.getName()+" "+"is the highest price order with price: "+" "+rem.getPrice());
		System.out.println(rem.getId()+" "+rem.getName()+" "+rem.getPrice()+" "+rem.getMonth()+" "+rem.getYear()+" "+rem.getCity()+" "+rem.getCategory()+" "+rem.getQuantity());
		System.out.println("..................................................................");
	}
	public static void question4(List<Neworders>ob)
	{
		Map<String,Double>rem=ob.stream()
				.collect(Collectors.groupingBy(Neworders::getCategory,Collectors.averagingDouble(nm->nm.getPrice()*nm.getQuantity())));
		System.out.println("Average of each category");
		System.out.println(rem);
		System.out.println("..................................................................");
	}

	public static void question5(List<Neworders>ob)
	{
		Optional<Neworders>res=ob.stream()
				.sorted(Comparator.comparing(Neworders::getPrice))
				.findFirst();
		Neworders rem=res.get();
		System.out.println(rem.getName()+" "+"is the lowest price order with price: "+" "+rem.getPrice());
		System.out.println(rem.getId()+" "+rem.getName()+" "+rem.getPrice()+" "+rem.getMonth()+" "+rem.getYear()+" "+rem.getCity()+" "+rem.getCategory()+" "+rem.getQuantity());
		System.out.println("..................................................................");
	}
	public static void question6(List<Neworders>ob)
	{
		Optional<Neworders>res=ob.stream()
				.sorted(Comparator.comparing(Neworders::getId))
				.findFirst();
		Neworders rem=res.get();
		System.out.println("The first order with ID:"+" "+rem.getId());
		System.out.println("The first order with Name:"+" "+rem.getName());
		System.out.println(" ");
	}
	public static void main(String[] args) {
		List<Neworders>li=new ArrayList<>();
		li.add(new Neworders(101,"strawberry",500.00,"dec",2025,"ooty","fruits",12));
		li.add(new Neworders(102,"carrot",50.00,"jan",2024,"ooty","vege",14));
		li.add(new Neworders(103,"dates",250.00,"march",2025,"northside","nuts",10));
		li.add(new Neworders(108,"apple",585.00,"jan",2021,"cbe","fruits",12));
		li.add(new Neworders(100,"tomato",100.00,"april",2022,"kodaikanal","fruits",5));
		li.add(new Neworders(107,"beetroot",200.00,"nov",2021,"ooty","vege",17));
		li.add(new Neworders(144,"orange",150.00,"march",2025,"assam","fruits",64));
		li.add(new Neworders(122,"brinjal",80.00,"feb",2024,"UP","vege",2));
		li.add(new Neworders(176,"melon",20.00,"nov",2022,"AP","fruits",81));
		li.add(new Neworders(192,"raspberry",790.00,"dec",2026,"ooty","fruits",36));
		Orders.question1(li);
		Orders.question2(li);
		Orders.question3(li);
		Orders.question4(li);
		Orders.question5(li);
		Orders.question6(li);
	}
}

