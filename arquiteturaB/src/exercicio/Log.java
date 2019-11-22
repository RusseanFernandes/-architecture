package exercicio;

import java.util.ArrayList;
import java.util.Collection;

public class log {
	private Collection<String> textos;

	//public log(Collection<String> texto) {
    //	super();
	//	this.textos = texto;
	//}

	public Collection<String> getTexto() {
		return textos;
	}

	public void setTexto(Collection<String> texto) {
		this.textos = texto;
	}
	
	public static void main(String[] args) {
		Log log = new Log();
		log.setTextos(new ArrayList<String>());
		
		log.getTexto.add("Log1");	
		log.getTextos.add("Log2");
		log.gettextos.add("Log3");
		
		Log log2 = new Log();
		log.setTextos(new ArrayList<String>());
		
		log.getTexto.add("Log1");	
		log.getTextos.add("Log2");
		log.gettextos.add("Log3");
		}	
	
	
	}
	
}
