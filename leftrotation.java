public class leftrotation 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
				int temp = a[0];
				int i;
				for (i=0; i<a.length-1; i++)
				{
					a[i]=a[i+1];
				}
				a[i] = temp;
				for (i =0; i<a.length; i++)
				{
					System.out.println(a[i]);
				}
			}
	}