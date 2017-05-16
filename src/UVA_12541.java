import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class UVA_12541 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =Integer.parseInt(sc.nextLine());
		TreeSet<Student> ts =new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return (int)(o2.age-o1.age);
			}
		});
		
		
		for(int i=0;i<T;i++){
			String line =sc.nextLine();
			String [] strs = line.split("\\s+");
			String name =strs[0];
			int dd = Integer.parseInt(strs[1]);
			int mm = Integer.parseInt(strs[2]);
			int yy = Integer.parseInt(strs[3]);
			long time = dd +mm*30+yy*365;
			Student st =new Student(name, time);
			ts.add(st);
		}
		sc.close();
		Student first = ts.first();
		Student last =ts.last();
		System.out.println(first.name);
		System.out.println(last.name);
	}

}


class Student{
	public String name;
	public long age;
	public Student(String name, long age) {
		this.name = name;
		this.age = age;
	}
	
}