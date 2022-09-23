//Create a class Candidate with varialbes name, technicalExpertise, city and yearsOfExperiencce Create a list of the Candidate Create a list PuneCandidate, of those candidates who has city="Pune" and print it Create a list FresherCandidte, whose yearsOfExp=0 and print those candidates Create list of Seniors, those candidates who has highest yearOfExp Find out city of those people who are having technicalExpertise=Java Print the name of those people who has yearsOfEx = 3

package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class candidatemain {
	
	public static void main(String[] args) {
		
		List<Candidate> candidates = new ArrayList<Candidate>();
		candidates.add(new Candidate("Ramesh","Java","Pune",5));
		candidates.add(new Candidate("Raman","Java","Banglore",4));
		candidates.add(new Candidate("Soumya","C#","Pune",11));
		candidates.add(new Candidate("Raghu","Java","Chennai",3));
		candidates.add(new Candidate("Pramod","Java","Mumbai",1));
		candidates.add(new Candidate("Trisha","C#","Pune",0));
		candidates.add(new Candidate("Nandan","C++","Chennai",0));
		candidates.add(new Candidate("Jeevan","Java","Mumbai",1));
		candidates.add(new Candidate("Priya","Java","Banglore",11));
		candidates.add(new Candidate("Priyanka","C++","Chennai",4));
		
		List<Candidate> puneCandidate = new ArrayList<Candidate>();
		puneCandidate = candidates.stream().filter(c -> c.city.equalsIgnoreCase("Pune")).collect(Collectors.toList());
		System.out.println("Candidates from Pune: ");
		puneCandidate.stream().forEach(c -> {
		System.out.println("Name: "+c.name+" Tech Expertise: "+c.techExp+" City: "+c.city+" Years Of Exp: "+c.yrOfExp);
		});
		
		
		List<Candidate> freshers = new ArrayList<Candidate>();
		freshers = candidates.stream().filter(c -> c.yrOfExp == 0).collect(Collectors.toList());
		System.out.println("Freshers are: ");
		freshers.stream().forEach(c -> {
		System.out.println("Name: "+c.name+" Tech Expertise: "+c.techExp+" City: "+c.city+" Years Of Exp: "+c.yrOfExp);
		});
		
		
		List<Candidate> seniors = new ArrayList<Candidate>();
		int maxExp = candidates.stream().map(c -> c.yrOfExp).reduce(0, (a,b) -> a>b?a:b);
		System.out.println("Seniors: ");
		seniors = candidates.stream().filter(c -> c.yrOfExp == maxExp).collect(Collectors.toList());
		seniors.stream().forEach(c -> {
		System.out.println("Name: "+c.name+" Tech Expertise: "+c.techExp+" City: "+c.city+" Years Of Exp: "+c.yrOfExp);
		});

		
		//for seniors
		int maxex=0;
		for(int i=0;i<candidates.size();i++)
		{
			Candidate cd=candidates.get(i);
			if(cd.yrOfExp>maxex) 
			{
				maxex=cd.yrOfExp;
			}
			
		}
		System.out.println(maxex);
		int x=maxex;
		List<Candidate> senior = new ArrayList<Candidate>();
		System.out.println("text");
		senior = candidates.stream().filter(c -> c.yrOfExp == x).collect(Collectors.toList());
		senior.stream().forEach(c -> {
		System.out.println("Name: "+c.name+" Tech Expertise: "+c.techExp+" City: "+c.city+" Years Of Exp: "+c.yrOfExp);
		});
		
		System.out.println("Cities of people having Java tech: ");
		candidates.stream().filter(c -> c.techExp == "Java").forEach(c -> {
		System.out.println(c.city);
		});
		
		
		System.out.println("Cities of people having Java tech: ");
		candidates.stream().filter(c -> c.techExp == "Java").map(c -> c.city).distinct().forEach(city -> {
		System.out.println(city);
		});
		System.out.println("People with 3 years of experience: ");
		candidates.stream().filter(c -> c.yrOfExp == 3).forEach(c -> System.out.println(c.name));
		
		
		Candidate can=new Candidate();
		System.out.println(can.getCity());
		
	}

}
