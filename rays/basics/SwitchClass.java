package in.co.rays.basics;

public class SwitchClass {
public static void main(String[] args) {
	
	int size = args.length;
	switch(0) {
	case 0:System.out.println("hyy " + args[0]); 
	break;
	case 1: System.out.println("hello =" + args[1]);
	break;
	case 2: System.out.println("hello =" + args[2]);
	break;
	default : for(int i=1; i<=size; i++) {
		System.out.println(i +" Hello all " + args[3]);
		break;
		}
	}
	}
	
}

