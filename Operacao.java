package tarefa1;

public class Operacao {
	public Operacao() {
		super();
	}
	
	public void ConcUmPow() {
		String cadeia = "";
		double TempoInicial = System.nanoTime();
		for(int i=0; i<=1000; i++) {
			cadeia = cadeia+ "a";
		}
		double TempoFinal = System.nanoTime();
		double TempoTotal = (TempoFinal - TempoInicial) / Math.pow(10, 9);
		System.out.println("a operação 1000 sem buffer durou "+TempoTotal+" segundos");
	}
	
	public void ConcUmPowBuff() {
		StringBuffer cadeia = new StringBuffer();
		double TempoInicial = System.nanoTime();
		for(int i=0; i<=1000; i++) {
			cadeia.append("a");
		}
		double TempoFinal = System.nanoTime();
		double TempoTotal = (TempoFinal - TempoInicial) / Math.pow(10, 9);
		System.out.println("a operação 1000 com buffer durou "+TempoTotal+" segundos");
	}
	
	public void ConcDezPow() {
		String cadeia = "";
		double TempoInicial = System.nanoTime();
		for(int i=0; i<=10000; i++) {
			cadeia = cadeia+ "a";
		}
		double TempoFinal = System.nanoTime();
		double TempoTotal = (TempoFinal - TempoInicial) / Math.pow(10, 9);
		System.out.println("a operação 10000 sem buffer durou "+TempoTotal+" segundos");
	}
	
	public void ConcDezPowBuff() {
		StringBuffer cadeia = new StringBuffer();
		double TempoInicial = System.nanoTime();
		for(int i=0; i<=10000; i++) {
			cadeia.append("a");
		}
		double TempoFinal = System.nanoTime();
		double TempoTotal = (TempoFinal - TempoInicial) / Math.pow(10, 9);
		System.out.println("a operação 10000 com buffer durou "+TempoTotal+" segundos");
	}
	
	public void ConcCemPow() {
		String cadeia = "";
		double TempoInicial = System.nanoTime();
		for(int i=0; i<=100000; i++) {
			cadeia = cadeia+ "a";
		}
		double TempoFinal = System.nanoTime();
		double TempoTotal = (TempoFinal - TempoInicial) / Math.pow(10, 9);
		System.out.println("a operação 100000 sem buffer durou "+TempoTotal+" segundos");
	}
	
	public void ConcCemPowBuff() {
		StringBuffer cadeia = new StringBuffer();
		double TempoInicial = System.nanoTime();
		for(int i=0; i<=100000; i++) {
			cadeia.append("a");
		}
		double TempoFinal = System.nanoTime();
		double TempoTotal = (TempoFinal - TempoInicial) / Math.pow(10, 9);
		System.out.println("a operação 100000 com buffer durou "+TempoTotal+" segundos");
	}
}
/*1000
 *10000
 *100000
 **/
 