# Agenda Telefônica - Java
---

### Como Utilizar

#### 1. Inicializando sua Agenda

Inicialize sua agenda ao chamar uma variavel do tipo `Agenda`. O construtor dessa classe chama automaticamente a função `consultarAgenda()`, que tem uma interface de texto amigável para o usuário.

#### 2. Operando sua Agenda

Para operar sua agenda, é necessário apenas responder aos comandos de texto. Os comandos são:

- 1 para listar os contatos;
- 2 para adicionar contato;
- 3 para editar um contato;
- Qualquer outro número para sair;

##### 2.1 Listando Contatos

Pressione 1 na consulta e seus contatos serão listados na seguinte formatação:

``` text
SUA AGENDA:
 - CONTATO (id: 1):
    Nome: John Doe
    Número: 512637129
    Email: jhnde@gmail.com
 - CONTATO (id: 2):
    Nome: Bruce Wayne
    Número: 819299102
    Email: 
 - CONTATO (id: 3):
    Nome: Yuri do SBT
    Número: 40028922
    Email: ps2@sony.com
 - CONTATO (id: 4):
    Nome: Cristiano Ronaldo Junior da Gama
    Número: 77126312312
    Email: luvadepedreiro02@live.com

```

##### 2.2 Adicionando Contato

Cada contato da agenda possuí as seguintes variáveis:

``` java
public class Contato {
    private int id;
    private String nome;
    private String numero;
    private String email;
}
```

Basta responder ao prompt de comando com 2 e suas perguntas e você adicionará um contato a sua agenda.

A formatação do prompt é a seguinte:

```text
Digite o nome do contato: 
John Doe (seu input)
Digite o número do contato: 
8291929319 (seu input)
Digite o email do contato (opcional): 
jhnde@gmail.com (seu input)
```

*_Nome e telefone são campos obrigatórios, mas é possível deixar o campo `email` em branco._

##### 2.3 Editando Contato

Ao pressionar 3 no menu de consulta, o modo de edição é aberto, sendo inicialmente necessário passar o id do contato a ser editado.

```text
Digite o id do contato que deseja editar: 
1 (seu input)
```

*_É possível verificar o id listando seus contatos_

Se o id for válido, é necessário seguir respondendo o prompt, deixando vazios os campos em que não se faz necessária uma mudança.

``` text
Digite o nome do contato (ou deixe em branco para continuar com John Doe): 
Jonathan Doe
Digite o número do contato (ou deixe em branco para continuar com 'jhnde@gmail.com'): 
johnnydoe@gmail.com
Digite o email do contato (ou deixe em branco para continuar com '8291929319'): 
+555 983 1231
```

---

Aluno: Caio Lemos<br>Ciência da Computação - UFAL<br>Maceió - AL

[Link desse repo](https://github.com/caioagralemos/Curso-Git-Oxetech/)