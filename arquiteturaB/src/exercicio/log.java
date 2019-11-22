package exercicio;

import java.util.Collection;

public class log {

	private Collection<String> textos;

	public log(Collection<String> texto) {
		super();
		this.textos = texto;
	}

	public Collection<String> getTexto() {
		return textos;
	}

	public void setTexto(Collection<String> texto) {
		this.textos = texto;
	}
	

}
