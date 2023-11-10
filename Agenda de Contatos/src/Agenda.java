import java.util.Objects;
import java.util.Scanner;

public class Agenda {
    public int ids;
    public Scanner input = new Scanner(System.in);
    public Contato[] contatos = new Contato[1000];
    public Agenda () {
        this.ids = 0;
        this.consultarAgenda();
    }

    public void raiseIds() {
        this.ids++;
    }

    private void adicionarContato() {
        int id = this.ids;

        System.out.println("Digite o nome do contato: ");
        String nome = input.nextLine();
        while (Objects.equals(nome, "") || Objects.equals(nome, " ")) {
            System.out.println("Nome inválido\nDigite o nome do contato: ");
            nome = input.nextLine();
        }

        System.out.println("Digite o número do contato: ");
        String numero = input.nextLine().strip();
        while (Objects.equals(numero, "")) {
            System.out.println("Número inválido\nDigite o número do contato: ");
            numero = input.nextLine();
        }

        System.out.println("Digite o email do contato (opcional): ");
        String email = input.nextLine().strip();
        if (email.isEmpty()) {
            email = null;
        }

        contatos[ids] = new Contato(id, nome, numero, email);
        raiseIds();
    }

    private void listarContatos() {
        System.out.println("SUA AGENDA:");
        for (int i = 0; i < ids; i++) {
            System.out.println(" - CONTATO (id: " + (contatos[i].getId() + 1) + "):");
            System.out.println("    Nome: " + contatos[i].getNome());
            System.out.println("    Número: " + contatos[i].getNumero());
            if(contatos[i].getEmail() != null) {
                System.out.println("    Email: " + contatos[i].getEmail());
            }
        }
    }

    private void editarContato(int id) {
        if (id > 0 && id <= this.ids) {
            int num = id - 1;

            System.out.println("Digite o nome do contato (ou deixe em branco para continuar com " + contatos[num].getNome() + "): ");
            input.nextLine();
            String name = input.nextLine();
            if (!name.isEmpty()) {
                contatos[num].setNome(name);
            }

            System.out.println("Digite o número do contato (ou deixe em branco para continuar com '" + contatos[num].getNumero() + "'): ");
            String numero = input.nextLine();
            if (!numero.isEmpty()) {
                contatos[num].setNumero(numero);
            }

            if (contatos[num].getEmail() == null) {
                System.out.println("Digite o email do contato (opcional): ");
                String email = input.nextLine().strip();
                if (email.isEmpty()) {
                    email = null;
                } else {
                    contatos[num].setEmail(email);
                }
            } else {
                System.out.println("Digite o email do contato (ou deixe em branco para continuar com '" + contatos[num].getEmail() + "'): ");
                String email = input.nextLine().strip();
                if (!numero.isEmpty()) {
                    contatos[num].setEmail(email);
                }
            }

        } else {
            System.out.println("ID inválido!");
        }
    }


//    public void excluirContato(int id) {
//        if (id > 0 && id <= this.ids) {
//            this.contatos[id-1] = null;
//        } else {
//            System.out.println("Id inválido! Não foi possível excluir");
//        }
//    }

    public void consultarAgenda() {
        System.out.println("BEM-VINDO(A) À SUA AGENDA:");
        String entrada;
        while (true) {
            System.out.println("Escolha sua consulta:\n   - 1 para listar seus contatos\n   - 2 para adicionar contato\n   - 3 para editar contato\n   - qualquer outra tecla para sair");
            entrada = input.nextLine().strip();
            if (!entrada.equals("1") && !entrada.equals("2") && !entrada.equals("3") && !entrada.equals("4")) {
                break;
            } else {
                switch (entrada) {
                    case "1" -> this.listarContatos();
                    case "2" -> this.adicionarContato();
                    case "3" -> {
                        System.out.println("Digite o id do contato que deseja editar: ");
                        int id = input.nextInt();
                        this.editarContato(id);
                    }
//                    case "4" -> {
//                        System.out.println("Digite o id do contato que deseja excluir: ");
//                        int id = input.nextInt();
//                        this.excluirContato(id);
//                    }
                }
            }
        }
    }

}
