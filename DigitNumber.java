import java.util.*;
class DigitNumber{
	
	//sort array
	static void sortDigits(int[] a,int n) {  
		int temp = 0;  
      		for(int i=0; i < n; i++){  
                 	for(int j=1; j < (n-i); j++){  
                          if(a[j-1] > a[j]){  
                                    a[j-1]=a[j-1]+a[j];
			a[j]=a[j-1]-a[j];
			a[j-1]=a[j-1]-a[j];
                      	}
                      }  
                }  
           }

	//read digits
	static void readDigits(int a[],int num){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter "+num+" digits:");
			for(int i=0;i<num;i++){
				a[i]=sc.nextInt();
		}
	}

	//Form Largest number
	static int formLargeNum(int a[],int num){
		int lar=0;
		for(int i=num-1;i>=0;i--){
			lar=(lar*10)+a[i];
		}
		return lar;
	}

	//Form Smallest number
	static int formSmallNum(int a[],int num){	
		int small=0;
		for(int i=0; i < num; i++){
			if(a[0]==0){
				for(int j=1; j < num; j++)
					if(a[j]!=0){
						a[0]=a[j];
						a[j]=0;
						break;
					}
			}
			small=(small*10)+a[i];
		}
		return small;
	}

	//main function
	public static void main(String args[]){
		DigitNumber obj=new DigitNumber();
		int i;int num=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of digits:");
		int n=scan.nextInt();
		int arr[]=new int[100];
		readDigits(arr,n);
		sortDigits(arr,n);
		System.out.println("LARGEST NUMBER FORMED="+formLargeNum(arr,n));
		System.out.println("SMALLEST NUMBER FORMED="+formSmallNum(arr,n));
		 
	}
}
		