package Collections;
import java.util.*;
import java.util.ArrayList;
public class Arraylist {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> li=new ArrayList<>();
		System.out.println("enter the song1:");
		String song1=sc.nextLine();
		System.out.println("enter the song2:");
		String song2=sc.nextLine();
		System.out.println("enter the song3:");
		String song3=sc.nextLine();
		
		li.add(song1);
		li.add(song2);
		li.add(song3);
		
		li.remove(1);//index & element
		
		li.get(1);//index
		
		System.out.println("index of elements in the array:"+li.indexOf(song3));
		
		System.out.println("size of arraylist:"+li.size());
		System.out.println("the playlist:"+li);
		
	
	}

}
