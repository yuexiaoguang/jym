package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.SimpleTimeZone;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Test {
	public static void main(String[] args) throws FileNotFoundException, IOException {
//		Integer.parseInt(s)
		BigDecimal one = new BigDecimal("-1");
		BigDecimal two = new BigDecimal("0.001");
		BigDecimal three = new BigDecimal("10000");
		BigDecimal four = one.subtract(two).multiply(three).divide(new BigDecimal("10")).multiply(new BigDecimal("1"));
		System.out.println(one.subtract(two));
		System.out.println(four.intValue());
		System.out.println(three.divide(BigDecimal.valueOf(10),2, BigDecimal.ROUND_UP));
		System.out.println(one.compareTo(new BigDecimal("0")));
		System.out.println(two.scale());
		BigDecimal five = new BigDecimal(two.toString());
		System.out.println(two == five);
		System.out.println(two.compareTo(five));
		System.out.println(BigDecimal.ONE.compareTo(new BigDecimal(1)));
	}
}
