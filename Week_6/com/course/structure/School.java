package com.course.structure;

import java.util.*;
import java.io.*;

public class School extends Building
{
	int classes;
	String grade_level;
	public School(int d, int f, int c, String gr)
	{
		setdim(d);
		setfloors(f);
		classes = c;
		grade_level = gr;
	}
	public void show()
	{
		System.out.println("The school has: "+classes+" classes "+grade_level+" grades "+getdim()+" sq. ft "+getfloors()+" floors");
	}
}