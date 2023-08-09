package Java_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyClass {

		// count the number of names starting with Alphabet A in list
		// @Test
		public static void regular() {
		List<String> names=new ArrayList<>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		int count=0;
		for(int i=0;i<names.size();i++) {
			String actual=names.get(i);
			if(actual.startsWith("A")) {
				count+=1;
			}
		}
		System.out.println(count);
		}
		
		//@Test
		public static void streamFilter() {

			ArrayList<String> names=new ArrayList<>();
			names.add("Abhijeet");
			names.add("Don");
			names.add("Alekhya");
			names.add("Adam");
			names.add("Ram");
			//there is no life for intermediate operation if there is no terminal operation
			// terminal operation will execute only if intermediate operation (filter) returns true
			// we can create stream with the help of stream package.
			Long c=names.stream().filter(s->s.startsWith("A")).count();
			System.out.println(c);
			
			long d=Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->
			{
				s.startsWith("A");
				return true;
			}).count();
			System.out.println(d);
			
			//print all the names of ArrayList whose length isgreater than 4
			names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
			System.out.println("*****************************************************");
			//print only one result
			names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		}
		
	//	@Test
		public void streamMap() {
			List<String> names=new ArrayList<>();
			names.add("Man");
			names.add("Don");
			names.add("Women");
			
			// print names which have last letter as 'a' with uppercase
			Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
			.forEach(s->System.out.println(s));
			
			System.out.println("****************************************************");
			
			// print names which have first letter as 'A' with uppercase and sorted
			List<String> names1=	Arrays.asList("Azbhijeet","Don","Alekhya","Adam","Rama");
			names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase())
			.forEach(s->System.out.println(s));
			
			System.out.println("****************************************************");
			
			// Merging 2 different lists 
			Stream<String> newStream =Stream.concat(names.stream(), names1.stream());
		//	newStream.sorted().forEach(s-> System.out.println(s));
			
			System.out.println("****************************************************");
			
			// to check element of list is present or not
			boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
			System.out.println(flag);
			Assert.assertTrue(flag);
		}
		
		@Test
		public void streamCollect() {
			List<String> ls=Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
			.collect(Collectors.toList()); 
			System.out.println(ls.get(0));
			
			//print unique number from this array and sort the array
			
			List<Integer> values=Arrays.asList(3,2,2,7,5,1,9,7);
//			 values.stream().distinct().forEach(s->System.out.print(s+" "));
//			 System.out.println();
//			 values.stream().sorted().forEach(s->System.out.print(s+" "));
			List<Integer>li= values.stream().distinct().sorted().collect(Collectors.toList());
			 System.out.println(li.get(2));
		}
	}


