package com.nit.CustomAnnotation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Class<Book> book = Book.class;
    	
    	if (book.isAnnotationPresent(BookInfo.class)) {
    		
    		BookInfo annotation = book.getAnnotation(BookInfo.class);
    		
    		System.out.println("Title : "+annotation.title());
    		System.out.println("Title : "+annotation.author());
    		System.out.println("Title : "+annotation.price());
			
		}
    	else {
    		System.out.println("Annotation Not found");
    	}
    }
}
