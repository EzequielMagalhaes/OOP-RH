class Pessoa{
	private int idade;
	private String nome;
	
	//SET e GET//
	public void setIdade(int idade) {
		if(this.idade < idade)//nao permite que a idade diminua.
			this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
}
class AnaliseContratual{
	private Pessoa p;
	 
	public void setPessoa(Pessoa p){
		this.p = p;
	}
	
	public void analisarPossivelContrato(){	
		if(p.getIdade() > 18 && p.getIdade() < 22 ){
			System.out.println("Contratar");
		}else if(p.getIdade() > 22){
			System.out.println("Contratar como funcionário");
		}else{
			System.out.println("Muito novo para o processo");
		}
	}
}

public class RH {
	public static void main(String[] args) {
		RH rh = new RH();
		rh.contratar();
	}
	
	public void contratar() {
		AnaliseContratual ac = new AnaliseContratual();
		
		Pessoa p1 = new Pessoa();
		p1.setIdade(30);
		p1.setNome("Juao Silva");
		System.out.println("Análise de " +p1.getNome()+ " com "+p1.getIdade()+" anos.");
		p1.setIdade(13);
		System.out.println("Análise de " +p1.getNome()+ " com "+p1.getIdade()+" anos.");
		ac.setPessoa(p1);
		ac.analisarPossivelContrato();
		
		Pessoa p2 = new Pessoa();
		p2.setIdade(20);
		p2.setNome("Maria Silva");
		System.out.println("Análise de " +p2.getNome()+ " com "+p2.getIdade()+" anos.");
		ac.setPessoa(p2);
		ac.analisarPossivelContrato();
	}
}
