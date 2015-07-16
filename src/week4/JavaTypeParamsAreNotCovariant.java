package week4;

import java.util.ArrayList;
import java.util.List;

public class JavaTypeParamsAreNotCovariant {
	
	public static void main(String[] args) {
		
		/*	Compile Error

			List<NonEmpty> a = new ArrayList<NonEmpty>();
			List<IntSet> b = a;		// cannot convert from List<NonEmpty> to List<IntSet> (Generic containers are not Not Covariant)
			b.set(0, new Empty());
			NonEmpty s = a.get(0);
		*/
		
		// Runtime Error
		/*
		NonEmpty[] a = new NonEmpty[] {new NonEmpty()};
		IntSet[] b = a;
		b[0] = new Empty();			// ArrayStoreException
		NonEmpty s = a[0];
		*/
		
		String[] sArr = new String[] {"Hello"};
		Object[] oArr = sArr;
		oArr[0] = 10;
		
//		List<String> sList = new ArrayList<>();
//		List<Object> oList = sList;	//	Type mismatch: cannot convert from List<String> to List<Object>
//		oList.add(10);
	
	}
	
	static class IntSet{}
	
	static class NonEmpty extends IntSet{}
	
	static class Empty extends IntSet{}
}
