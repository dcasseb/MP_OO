package model.util;

public class Imovel extends Patrimonio{
	private int cep;
	private double tamanho;
	private double valor;
	public Imovel(String nome, int codigo, int cep, double tamanho, double valor) {
		super(nome, codigo);
		this.cep = cep;
		this.tamanho = tamanho;
		this.valor = valor;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Imovel [cep=" + cep + ", tamanho=" + tamanho + ", valor=" + valor + "]";
	}
}
