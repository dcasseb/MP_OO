package model.util;
import java.util.ArrayList;
import java.util.List;

public class Escritorio {
	private List<Filial> filiais = new ArrayList<>();

	public Escritorio(List<Filial> filiais) {
		super();
		this.filiais = filiais;
	}

	public List<Filial> getFiliais() {
		return filiais;
	}

	public void setFiliais(List<Filial> filiais) {
		this.filiais = filiais;
	}

	@Override
	public String toString() {
		return "Escritorio [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
