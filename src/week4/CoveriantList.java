package week4;

import java.util.ArrayList;
import java.util.List;

public class CoveriantList<T extends Object> {

	private List<T> list = new ArrayList<>();

	public void add(T o) {
		this.list.add(o);
	}

	public static void main(String[] args) {

		CoveriantList<Object> cl = new CoveriantList<>();
		cl.add(new A());

		List<Object> l = new ArrayList<>();
		l.add(new A());
		l.add("Hello World!");
		
		A a = (A) l.get(1);
		System.out.println(a);

		// List<String> ls = new ArrayList<>();
		// List<Object> l2 = ls; //Compile error
	}

	static List<A> someMethodA() {
		return new ArrayList<>();
	}

	static List<B> someMethodB() {
		return new ArrayList<>();
	}

	static class A {
	}

	static class B extends A {
	}

	static class C extends A {
	}

	static class D extends B {
	}
}
