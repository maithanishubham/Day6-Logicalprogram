package LogicalProgram;

public class Logicalprog {

	public static void main(String[] args) {
		
		System.out.println("Welcome to logical program");
		int n = 10, firstTerm = 0, secondTerm = 1;
		System.out.println("Fibonacci Series till " + n + " terms:");

		for (int i = 1; i <= n; ++i) {
		  System.out.print(firstTerm + ", ");

		  int nextTerm = firstTerm + secondTerm;
		  firstTerm = secondTerm;
		  secondTerm = nextTerm;


		}
	}
}
