package projeto.oxetech.git.github;

import java.util.Scanner;

public class CalculandoMedia {
	 static Scanner scanner = new Scanner(System.in);
	
	private String nome;
	private int valor1;
	private int valor2;
	private int valor3;
	
	public CalculandoMedia(String nome, int valor1, int valor2, int valor3) {
		this.nome = nome;
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void  setNome(String nome) {
		this.nome = nome;
	}
	
	public int getValor1() {
		return valor1;
	}
	
	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}
	
	public int getValor2() {
		return valor2;
	}
	
	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}
	
	public int getValor3() {
		return valor3;
	}
	
	public void setValor3(int valor3) {
		this.valor3 = valor3;
	}
	
	public String toString() {
		String espaco = "         ";
		return nome + espaco + valor1 + espaco + valor2 + espaco + valor3;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Qual e o nome do primeiro aluno: ");
		String aluno1 = scanner.next();
		
		System.out.println("Qual e a nota:");
		int nota1Aluno1 = scanner.nextInt();
		
		System.out.println("Qual e a nota:");
		int nota2Aluno1 = scanner.nextInt();
		
		System.out.println("Qual e a nota:");
		int nota3Aluno1 = scanner.nextInt();
		
		System.out.println("Qual e o nome do segundo aluno: ");
		String aluno2 = scanner.next();
		
		System.out.println("Qual e a nota:");
		int nota1Aluno2 = scanner.nextInt();
		
		System.out.println("Qual e a nota:");
		int nota2Aluno2 = scanner.nextInt();
		
		System.out.println("Qual e a nota:");
		int nota3Aluno2 = scanner.nextInt();
		
		System.out.println("Qual e o nome do terceiro aluno: ");
		String aluno3 = scanner.next();
		
		System.out.println("Qual e a nota:");
		int nota1Aluno3 = scanner.nextInt();
		
		System.out.println("Qual e a nota:");
		int nota2Aluno3 = scanner.nextInt();
		
		System.out.println("Qual e a nota:");
		int nota3Aluno3 = scanner.nextInt();
		
		System.out.println("Qual e o nome do quarto aluno: ");
		String aluno4 = scanner.next();
		
		System.out.println("Qual e a nota:");
		int nota1Aluno4 = scanner.nextInt();
		
		System.out.println("Qual e a nota:");
		int nota2Aluno4 = scanner.nextInt();
		
		System.out.println("Qual e a nota:");
		int nota3Aluno4 = scanner.nextInt();
		
		System.out.println("Qual e o nome do quinto aluno: ");
		String aluno5 = scanner.next();
		
		System.out.println("Qual e a nota:");
		int nota1Aluno5 = scanner.nextInt();
		
		System.out.println("Qual e a nota:");
		int nota2Aluno5 = scanner.nextInt();
		
		System.out.println("Qual e a nota:");
		int nota3Aluno5 = scanner.nextInt();
		
		CalculandoMedia[] array = new CalculandoMedia[5];
		array[0] = new CalculandoMedia(aluno1, nota1Aluno1, nota2Aluno1, nota3Aluno1);
		array[1] = new CalculandoMedia(aluno2, nota1Aluno2, nota2Aluno2, nota3Aluno2);
		array[2] = new CalculandoMedia(aluno3, nota1Aluno3, nota2Aluno3, nota3Aluno3);
		array[3] = new CalculandoMedia(aluno4, nota1Aluno4, nota2Aluno4, nota3Aluno4);
		array[4] = new CalculandoMedia(aluno5, nota1Aluno5, nota2Aluno5, nota3Aluno5);
		
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|   nome   |                   matérias                   |");
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|          |    matemática   |   portugus   |   física   |");
		System.out.println("|---------------------------------------------------------|");
		
		for(CalculandoMedia CalculandoMedia : array) {
			System.out.println(CalculandoMedia);
			System.out.println("|---------------------------------------------------------|");
		}
		
		int media1 = (nota1Aluno1 + nota2Aluno1 + nota3Aluno1)/3;
		int media2 = (nota1Aluno2 + nota2Aluno2 + nota3Aluno2)/3;
		int media3 = (nota1Aluno3 + nota2Aluno3 + nota3Aluno3)/3;
		int media4 = (nota1Aluno4 + nota2Aluno4 + nota3Aluno4)/3;
		int media5 = (nota1Aluno5 + nota1Aluno5 + nota1Aluno5)/3;
		
		System.out.println("\n\n Medias dos alunos\n");
		
		System.out.printf(" Essa foi a media de %s :%d%n ", aluno1, media1);
		System.out.printf("Essa foi a media de %s :%d%n ", aluno2, media2);
		System.out.printf("Essa foi a media de %s :%d%n ", aluno3, media3);
		System.out.printf("Essa foi a media de %s :%d%n ", aluno4, media4);
		System.out.printf("Essa foi a media de %s :%d%n ", aluno5, media5);
		
	}

}