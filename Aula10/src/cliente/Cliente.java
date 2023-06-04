package cliente;

public class Cliente {
	String nome;
	String sobrenome;
	String endereco;
	int idade;
	int cpf;
	
	public Cliente(String nome, String sobrenome, String endereco, int idade, int cpf){
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.endereco = endereco;
		this.idade = idade;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public void visualizar() {
		System.out.println("nome: " + nome);
		System.out.println("sobrenome: " + sobrenome);
		System.out.println("endereço: " + endereco);
		System.out.println("idade: " + idade);
	}

}
