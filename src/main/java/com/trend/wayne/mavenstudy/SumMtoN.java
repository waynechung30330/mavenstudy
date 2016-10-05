package com.trend.wayne.mavenstudy;

import java.util.*;
import java.lang.*;

public class SumMtoN {
	public int sumMtoN (int m, int n) {
		return (m+n)*(n-m+1)/2;
	}
	
	public static void main(String[] args) {
		SumMtoN sumObject = new SumMtoN();
		int m = Integer.valueOf(args[1]);
		int n = Integer.valueOf(args[2]);
		System.out.println(sumObject.sumMtoN(m, n));	
	}
}
