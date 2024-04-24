import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Sr daily challenges
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		Set<Character> as=new HashSet<>();
		Set<Character> bs=new HashSet<>();
		for(char i : a.toCharArray()) as.add(i);
		for(char i: b.toCharArray()) bs.add(i);
		System.out.print((as.equals(bs))?"yes":"no");

	}
}
