package Collection;

import java.util.Scanner;

public class subapk {
	Scanner sc=new Scanner(System.in);
	public int opern() {
		System.out.print("1.Display installed application\n2.Install an application\n3.Uninstall an application\n4.Update\n5.Quit\nEnter your choice\t");
		int mod=sc.nextInt();
		return mod;
	}

}
