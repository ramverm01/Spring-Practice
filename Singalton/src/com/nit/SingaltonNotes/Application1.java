package com.nit.SingaltonNotes;

/*             Singleton
---------

Singleton is a design pattern that ensures only one object of a class
is created in the heap memory throughout the application's lifetime.

   Rule Of Singleton Class:-
   Step - 1 ->
    private static reference variable that stores reference of the singleton object
    for example :-
    private static Application1 ref = null;
    
   Step - 2 ->
   	private Constructor :- 
   	   Stop the other class to create an object using new keyword 
   	      for example :-
   	      private Application1()
   	      {
   	      }
   	      
   Step - 3 ->
      Create a static method with return type class name 
          for example :-
          
           public static Application1 getObject()
           {
           }
   Step - 4 ->
      then inside the static method where we check the has been already created 
      If ref is null, the object has not been created yet.
	  A new Application1 object is created.
      The object's reference is stored in the static variable ref.
         for example :- 
           if(ref==null)
			{
				ref = new Application1();
			}
      
   Step - 5 ->
         Return the Singleton class
        	for example :- 
        	return ref;
        	
        	
   Step - 6 -> 
         Call the static method in the main method 
         getObject() is a static method so we can call by using className
            for example :-
               Application1 obj1 = Application1.getObject();
               
  Step - 7 -> 
         check the object exist or not 
         if(ref == null)
         this condition check the singleton object is exist or not.
         
  Step - 8 -> 
         Create the singleton object 
         ref = new Application1();
         jvm create an object which is stored in heap area      
         Method Area
         ------------------------
         ref
          │
          ▼
         1000x
         ------------------------
         Heap
         ------------------------
         1000x
         Application1 Object
         ------------------------   
         
  Step - 9 -> 
         return singleton object 
         for example :-
             return ref;
             
  Step - 10 ->
         Again call getObject static method
         again check the condition 
         if(ref == null)
         then condition false then no create object
         
  Step - 11 ->
  		verify by using hashcode 
  		for example :-
  		System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        
        
        
        
    1. Presentation Layer :-
       Controllers
	   Servlets
	   Request
       REST Controllers
       JSP
        Specially we use singleton here.
        
    2. Business Layer :- 
       service classes 
       business classes 
       
    3. Persistance layer :- 
       DAO 
       Reposetry class 
	   
 */



public class Application1
{
    private static Application1 ref = null;

    private Application1()
    {
        System.out.println("Constructor is Executed...");
    }

    public static Application1 getObject()
    {
        if(ref == null)
        {
            ref = new Application1();
        }

        return ref;
    }
}
