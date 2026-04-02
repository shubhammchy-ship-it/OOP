package Workshop;

public class Q6 {
	

	

		    final static class FinalClass {
		        void displayMessage() {
		            System.out.println("This is a final class.");
		        }
		    }

		
		    static class Parent {
		      
		        final void finalMethod() {
		            System.out.println("This is a final method and cannot be overridden.");
		        }

		        void normalMethod() {
		            System.out.println("This is a normal method and can be overridden.");
		        }
		    }

		   
		    static class Child extends Parent {
		       

		        
		        void normalMethod() {  
		            System.out.println("Overriding normal method in Child.");
		        }
		    }

		    
		    public static void main(String[] args) {
		        FinalClass f = new FinalClass();
		        f.displayMessage();

		        Child c = new Child();
		        c.finalMethod();   
		        c.normalMethod();  
		    }
		}


