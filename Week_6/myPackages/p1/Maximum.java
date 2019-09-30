package myPackages.p1;
import java.util.*;
public class Maximum
{
	public int max(int a,int b,int c)
	{
		int maxi=(a>b&&a>c)?a:(b>a&&b>c)?b:c;
		return maxi;
	}
	public float max(float a,float b,float c)
	{
		float maxi=(a>b&&a>c)?a:(b>a&&b>c)?b:c;
		return maxi;
	}
	public int max(int[] a,int n)
	{
		int maxi=a[0];
		for(int i=0;i<n;i++)
		{
			if(maxi<a[i])
				maxi=a[i];
		}
		return maxi;
	}
	public int max(int a[][],int n,int m)
	{
		int maxi=a[0][0];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(maxi<a[i][j])
					maxi=a[i][j];
			}
		}
		return maxi;
	}
}
