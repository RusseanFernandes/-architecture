package exercicio;

import java.util.ArrayList;
import java.util.Collection;

public class LogSingleton {
	private static LogSingleton instance;
	private Collection<String> textos;

	private LogSingleton() {
	
	}

	public static LogSingleton getInstance() {
		if(instance ==null) {
			instance = new LogSingleton();
		}
		
	}
	public Collection<String> getTexto() {
		return textos;
	}

	public void setTexto(Collection<String> texto) {
		this.textos = texto;
	}
	
	public static void main(String[] args) {
		Log log = new Log();
		log.setTextos(new ArrayList<String>());
		
		log.getTextos.add("Log1");	
		log.getTextos.add("Log2");
		log.gettextos.add("Log3");
		
		Log log2 = new Log();
		log.setTextos(new ArrayList<String>());
		
		LogSingleton.getInstance();
		
		log2.getTextos.add("Log4");	
		log2.getTextos.add("Log5");
		log2.gettextos.add("Log6");
		}	
	
	
	}
	
}
