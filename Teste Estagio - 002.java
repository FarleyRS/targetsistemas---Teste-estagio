/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    String value = s.nextLine();
	    
	    char[] array = value.toCharArray();
	    int count = 0;
	    for(char v : array){
	        if(v == 'a' || v == 'A'){
	            count = count + 1;
	        }
	    }
	    if(count>0)
	        System.out.print("Existem "+count+" A's.");
	    else
	        System.out.print("Nenhum A.");
	}
}
