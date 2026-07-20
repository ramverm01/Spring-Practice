package com.nit.CustomAnnotationDay_18_Task02;

public class Main {

	public static void main(String[] args) 
	{
		Class<Movie> movie = Movie.class;
		if(movie.isAnnotationPresent(MovieInfo.class))
		{
			MovieInfo annotation = movie.getAnnotation(MovieInfo.class);
			System.out.println("Movie Name :- "+annotation.nameOfMovie());;
			System.out.println("Director name :- "+annotation.directerOfMovie());
			System.out.println("release Year :- "+annotation.releaseYear());
		}
		else
		{
			System.out.println("Not annotation found");
		}
	}

}
