package exercicioPackage;

import java.util.Collection;
import java.util.Date;

import hotel.Cliente;

public class FachadaLocadora implements IFachada {

	@Override
	public Cliente cadastratCliente(String nome, String endereco, String cpf, Date dataNascimento) {
		return null;
	}

	@Override
	public Veiculo cadastrarVeiculo(String placa, String modelo, String cor) {
		return null;
	}

	@Override
	public Float locarVeiculo(Cliente cliente, Veiculo veiculo, Date inicio, Date fim) {
		return null;
	}

	@Override
	public Collection<Veiculo> listarVeiculosDisoniveis(Date inicio, Date fim) {
		return null;
	}

}
