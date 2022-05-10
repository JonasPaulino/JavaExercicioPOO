package Classes;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
	int codigo;
	String setor;
	List<Setor> setores = new ArrayList<>();
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public List<Setor> getSetores() {
		return setores;
	}
	public void setSetores(List<Setor> setores) {
		this.setores = setores;
	}
}
