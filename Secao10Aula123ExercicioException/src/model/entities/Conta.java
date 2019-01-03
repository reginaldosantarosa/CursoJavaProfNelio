package model.entities;

import model.exceptions.DomainException;

public class Conta {
	private Integer number;
	private Double saldo=0.0;
	private String nome;	
	private Double limiteSaque;
	
	public Conta(Integer number, double depositoInicial, String nome, Double limite) {
		if (depositoInicial<=0) {
			throw new DomainException ("Não pode criar cont valor negativo");
		}
		this.number = number;
		deposito(depositoInicial);
		this.nome = nome;
		this.limiteSaque = limite;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limit) {
		this.limiteSaque = limit;
	}
		
	public void saque(double valorSaque) {
		
		if (saldo<=0 || valorSaque>saldo) {
			throw new DomainException ("Conta sem saldo");
		}
		
		if (valorSaque > limiteSaque) {
			throw new DomainException ("Valor superior aolimite de saque!");
		}
		
		saldo-=valorSaque;
		System.out.printf("Novo Saldo: %.2f\n ", saldo);
		
	}
		
	public void deposito(double valorDeposito) {
		saldo+=valorDeposito;
		System.out.printf("Novo Saldo: %.2f\n ", saldo);
	}
}
