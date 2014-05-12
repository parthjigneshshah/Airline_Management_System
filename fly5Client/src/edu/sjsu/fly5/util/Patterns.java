package edu.sjsu.fly5.util;

public class Patterns {
	public static final String STRING_PATTERN = "[A-Za-z]+";
	public static final String TIME_PATTERN = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
	public static final String INTEGER_PATTERN = "[1-9]+";

	public static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	public static final String STREET_PATTERN = "[a-zA-Z0-9]*";
	public static final String DATE_PATTERN = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)2[1-9])";
	public static final String PASSPORT_PATTERN ="[A-Za-z1-9]+";
}
