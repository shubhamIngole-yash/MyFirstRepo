package ArrayAssignment;

public class VowelConsoneantTogether {
	
	 public static void main(String[] args) {
		    char a[]= {'y','a','s','h','t','e','c'};
		    System.out.print("vowels are ");
		    for(int i=0;i<a.length;i++)
		    {
		        if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u')
		        {
		            System.out.println(a[i]+" ");
		        }
		    }
		    System.out.println("consonants are ");
		    for(int i=0;i<a.length;i++)
		    {
		        if(a[i]!='a' && a[i]!='e' && a[i]!='i' && a[i]!='o' && a[i]!='u')
		        {
		            System.out.print(a[i]+" ");
		        }
		    }
		}

}
