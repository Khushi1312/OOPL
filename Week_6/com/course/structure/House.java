package com.course.structure;

import java.util.*;
import java.io.*;

public class House extends Building
{
	public int bed, baths;
	public House(int d, int f, int b1, int b2)
	{
		setdim(d);
		setfloors(f);
		bed = b1;
		baths = b2;
	}
	public int getbeds()
	{
		return bed;
	}
	public int getbaths()
	{
		return baths;
	}
	public void show()
	{
		System.out.println("Details of the house are: "+bed+"BHK "+baths+" bathrooms "+getdim()+" sq ft "+getfloors()+" floors");
	}
}