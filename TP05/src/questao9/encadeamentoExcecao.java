package questao9;

import javax.swing;

public class encadeamentoExcecao {
	
	public static void main(String[] args) {
		
		try {
			someMethod();
		}
		catch(Exception e) {
			e.printStackTrace(System.out);
			
		}
	}
	
	public static void someMethod() throws Exception {
		
		try {
			someMethod2();
			
		}
		catch(Exception e ) {
			
			throw e;
		}
	}
	
	public static void someMethod2() throws Exception{
		
		throw new Exception();
		}

}
