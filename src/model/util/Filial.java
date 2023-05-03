package model.util;
import java.util.ArrayList;
import java.util.List;

public class Filial {
	private String endereco;
	private int cnpj;
	private List<Patrimonio> patrimonio = new ArrayList<>();
	public Filial(String endereco, int cnpj, List<Patrimonio> patrimonio) {
		super();
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.patrimonio = patrimonio;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public List<Patrimonio> getPatrimonio() {
		return patrimonio;
	}
	public void setPatrimonio(List<Patrimonio> patrimonio) {
		this.patrimonio = patrimonio;
	}
	@Override
	public String toString() {
		return "Filial [endereco=" + endereco + ", cnpj=" + cnpj + "]";
	}
	
	
}
