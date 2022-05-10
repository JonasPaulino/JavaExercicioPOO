package Classes;

import java.util.ArrayList;
import java.util.List;


public class Empresa {
	String nome;
	String CNPJ;
	String Endereco;
	List<Pessoa> pessoas = new ArrayList<>();
	Estrutura  Estrutura;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	public Estrutura getEstrutura() {
		return Estrutura;
	}
	public void setEstrutura(Estrutura estrutura) {
		Estrutura = estrutura;
	}

}
