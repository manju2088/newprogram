package program;

public class AbstractB extends AbstractA {


		public  void incompletemethod() {
			System.out.println("incomplete method of superclass");
		}
	
        public static void main(String[] args) {
        	
        	AbstractB ref=new AbstractB();
        	ref.completemethod();
        	ref.incompletemethod();
        	
        }
}
