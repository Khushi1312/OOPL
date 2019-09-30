import java.util.Scanner;
class Mixer
{
	int arr[]=new int[100];
	int n;
	public void accept(Mixer m)
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		m.n=sc.nextInt();
		System.out.println("Enter array elements in ascending order without repitition");
		for(i=0;i<m.n;i++)
			m.arr[i]=sc.nextInt();
	}
	public Mixer mix(Mixer A)
	{
		int i=0;
		Mixer temp=new Mixer();
		temp.n=this.n+A.n;
		for(i=0;i<this.n;i++)
			temp.arr[i]=this.arr[i];
		for(int j=0;j<A.n;i++,j++)
			temp.arr[i]=A.arr[j];
		System.out.println("Mixed is:");
		display(temp);
		return temp;
	}
	public void display(Mixer m)
	{
		for(int i=0;i<m.n;i++)
			System.out.println(m.arr[i]+" ");;	
	}

}
class Q3
{
	public static void main(String args[])
	{
		Mixer m=new Mixer();
		Mixer m1=new Mixer();
		Mixer m2=new Mixer();
		m1.accept(m1);
		m2.accept(m2);
		m=m1.mix(m2);
	}
}