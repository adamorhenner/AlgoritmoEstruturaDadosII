package br.edu.uni7.aed2.util;

public class TesteEnum {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		p1.setStatus(Pessoa.StatusType.Ativo);
		p1.setStatus(Pessoa.StatusType.Removido);
		p1.setStatus(Pessoa.StatusType.Bloqueado);
		
		System.out.println(p1.getStatus());
	}
}
