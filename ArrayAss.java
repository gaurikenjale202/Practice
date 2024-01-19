import java.util.*;
class ArrayAss{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of chapters: ");
        int chpt = sc.nextInt();
		System.out.println("Enter a start date: ");
		int strt = sc.nextInt();
		System.out.println("Enter the end date: ");
		int last = sc.nextInt();

		int count = missedChapters(chpt,strt,last);
		System.out.println(count);
         
     }
     public static void missedChapters(int chpt,int strt,int last)
     {
     	int [] chapters = new int[last+1];
     	int [] missedChapt = new int[(last-strt)+1];
     	int mcindx=0;
     	int chapter=0;
     	for(int i=0;i<chapters.length;i++)
     	{
     		chapters[i]=chapter++;
     		if(chapter==chpt){
     			chapter=0;
     		}
     	} 
     	for(int i=strt;i<=last;i++)
     	{
     		missedChapt[mcindx]= chapters[i];
     	}
     	int count = uniqueElements(missedChapt);
     	return count;
     	     }
     	     public static int uniqueElements(int[] arr)
     	     {
     	     	int count = 0;
     	     	for(int i=0;i<arr.length;i++)

     	     	{
     	     		int j=0;
     	     		for(;j<arr.length;j++){
     	     			if(arr[i]==arr[j])
     	     				break;
     	     		}
     	     		if(i==j)
     	     			count++;

     	     	}
     	     	return count;
     	     }




	

	}
