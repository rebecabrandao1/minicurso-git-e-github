public class aplicacao {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "João";
        pessoa.idade = 20;
        pessoa.sexo = "Masculino";
        pessoa.cpf = "123.456.789-00";
        System.out.println("Hello World! Me chamo "+pessoa.nome+" e tenho "+pessoa.idade+" anos.");
        System.out.println("Meu sexo é "+pessoa.sexo+" e meu CPF é "+pessoa.cpf+".");

    }
}