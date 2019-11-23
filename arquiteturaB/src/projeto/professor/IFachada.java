package projeto.professor;

public interface IFachada {
	public Hotel cadastrarHotel(String nome, String endereco, EnumClasseHotel classeHotel) ;
	public Quarto cadastrarQuarto(Integer numero, Integer limHospedes, Boolean ehFumante, Double valor, String descricao,
			EnumTipoQuarto tipoQuarto) ;
}
