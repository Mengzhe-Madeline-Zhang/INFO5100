package partA;

import java.util.*;

public class Mreview implements Comparable<Mreview>
{
  // instance variables
  private String title;   // title of the movie
  private ArrayList<Integer> ratings = new ArrayList<>(); // list of ratings stored in a Store object

  
 // Constructors
 Mreview(){
	 
 }
 
 Mreview(String ttl){
	 this.title=ttl;
 }
 
 Mreview(String ttl, int firstRating){
	 this.title=ttl;
	 firstRating=0;
 }
 
 // Methods
 public void addRating(int r) {
	
	this.ratings.add(r);
} 
 
public double aveRating() {
	double sum=0;
	double ave=0;
	for (Integer rating: ratings) {
		sum+=rating;
	}
	ave=sum/ratings.size();
	return ave;
	
}

 @Override
public int compareTo(Mreview mre) {
	
	return this.getTitle().compareTo(mre.getTitle());
}

 @Override
public boolean equals(Object obj) {
	if(obj==this.getTitle()) {
		return true;
	}
	
	 return false;
	
}

public String getTitle() {
	return this.title;
}

public int numRatings() {

	return ratings.size();
	
}
 
public String toString() {
	return "Movie title: "+this.getTitle()+ " has an average rating: " +this.aveRating();
}
 public static void main(String[] args)
 {
   Mreview kb = new Mreview("Kill Bill");
  
   kb.addRating(3);
   kb.addRating(4);
   kb.addRating(3);
   
   System.out.println(kb);
 }
}

/****
 * Console Result
 * Movie title: Kill Bill has an average rating: 3.3333333333333335
 * ****/
