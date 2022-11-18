package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Application {
	ArrayList<String> apk=new ArrayList<String>();
	public static void main(String[] args) {
		Application obj2=new Application();
		obj2.display();
	}
    void display() {
    	Iterator<String> itr=apk.iterator();
    	subapk obj=new subapk();
    	Scanner sc=new Scanner(System.in);
    	int mod=obj.opern();
		switch(mod) {
		case 1:
			int size=apk.size();
			if(size==0) {
				System.out.println("There is no application installed");
			}else {
				while(itr.hasNext())
			System.out.println(itr.next());
			}
			display();
			break;
		case 2:
			System.out.println("Enter application name");
			apk.add(sc.next());
			System.out.println("Application Successfully installed...");
			display();
			break;
		case 3:
			int l=0;
			while(itr.hasNext()) {
				System.out.println(l+"\t"+ itr.next());
				l++;
			}
			System.out.println("Enter the index no. to be deleted...");
			apk.remove(sc.nextInt());
			System.out.println("Application uninstalled successfully...");
			display();
			break;
		case 4:
			int m=0;
			while(itr.hasNext()) {
				System.out.println(m+"\t"+ itr.next());
				m++;
			}
			System.out.println("Enter the index number to be updated...");
			int k=sc.nextInt();
			System.out.println("Enter application do you want to update:");
			apk.set(k,sc.next());
			while(itr.hasNext())
				System.out.println(itr.next());
			display();
			break;
		case 5:
			System.out.println("Successfully exit");
			break;
		}
    }
}
