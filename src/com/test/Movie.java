
package com.test;

/**
 * @author Pramit Karmakar
 * Created on 14/05/20
 */

public class Movie implements Comparable<Movie> {

    private int rating;
    private String name;
    private int year;

    public Movie(String nm, int rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    public int getRating() { return rating; }
    public String getName()   {  return name; }
    public int getYear()      {  return year;  }


    @Override
    public int compareTo(Movie o) {
        return o.getYear() - this.getYear()  ;
    }
}
