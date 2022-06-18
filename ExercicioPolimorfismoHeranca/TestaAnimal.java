package ExercicioPolimorfismoHeranca;

public class TestaAnimal {

	public static void main(String[] args) {
		
		Cachorro dudu = new Cachorro();
		dudu.setNome("Dudu");
		dudu.setIdade(4);
		dudu.setEmitirSom("au au au");
		
		System.out.println(dudu.som("au au"));
		
		Cavalo lucky = new Cavalo();
		lucky.setNome("Lucky");
		lucky.setIdade(15);
		lucky.setEmitirSom("ihuul");
		
		System.out.println(lucky.som("ihuul"));
		
	}

}
