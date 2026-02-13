package com.java.oops.interfaces;

public class Test {

	public static void main(String[] args) {

		Lenovo l = new Lenovo();

		l.cut();
		l.copy();
		l.paste();
		l.security();
		Laptop.capture();

		Acer c = new Acer();

		c.cut();
		c.copy();
		c.paste();
		c.security();

		HP h = new HP();

		h.copy();
		h.cut();
		h.paste();
		h.security();

		Laptop lt = new Lenovo();
		lt.cut();
		lt.copy();
		lt.paste();
		lt.security();
		Laptop.capture();
	}

}
