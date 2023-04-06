import java.util.ArrayList;

import models.Camareira;
import models.Cliente;
import models.EnumTipo;
import models.Gerente;
import models.Quarto;
import models.Recepcionista;

public class App {

  public static void main(String[] args) {
    System.out.println("Hotel Java");

    Recepcionista recepcionista1 = new Recepcionista(
      "Valéria",
      "71977778877",
      "98765432101"
    );

    recepcionista1.atenderOTelefone();
    recepcionista1.falarIngles();

    Camareira camareira1 = new Camareira("Joana", "71977887788", "12345678902");
    camareira1.arrumarACama();
    camareira1.limparQuarto();

    // Deu uma dor de barriga na Valéria
    Gerente gerente = new Gerente("Xupetinha", "71977223355", "12345678903");
    gerente.atenderOTelefone();
    gerente.falarIngles();
    gerente.arrumarACama();
    gerente.limparQuarto();

    Quarto quarto1 = new Quarto();
    quarto1.setNumero("206A");
    quarto1.setValor(100.0);
    quarto1.setTipo(EnumTipo.MASTER);

    Quarto quarto2 = new Quarto();
    quarto2.setNumero("306A");
    quarto2.setValor(200.0);
    quarto2.setTipo(EnumTipo.PRESIDENCIAL);

    System.out.println(quarto2.getTipo());
    System.out.println(quarto2.getTipo().getValor());

    Cliente cliente1 = new Cliente(
      "Manoel Zezinho",
      "71912345678",
      "12345678901",
      42
    );
    Cliente cliente2 = new Cliente(
      "Fulano De Tal",
      "71912345677",
      "12345678902",
      21
    );
    Cliente cliente3 = new Cliente(
      "Ciclano Rodrigues",
      "71912345675",
      "12345678903",
      36
    );
    Cliente cliente4 = new Cliente(
      "Beltrano Rodrigues",
      "71912345678",
      "12345678904",
      56
    );

    ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    clientes.add(cliente1);
    clientes.add(cliente2);
    clientes.add(cliente3);
    clientes.add(cliente4);

    // Retorna a quantidade de elementos presentes em uma stream
    System.out.println(clientes.stream().count());

    System.out.println(clientes.size());

    // Retorna um limite de elementos a partir do 0.
    // Obs: limit é uma função intermediária
    clientes.stream().limit(2).forEach(c -> System.out.println(c.getNome()));

    // Pula os dois primeiros (Número que está no parametro) ignorando-os e retorna somente os dois ultimos.
    // Obs: skip é uma função intermediária
    clientes.stream().skip(2).forEach(c -> System.out.println(c.getNome()));

    // Ordena pela ordem padrão e retorna
    // clientes.stream().sorted();

    // clientes.stream().sorted(comparing(Cliente::getIdade));

    // Expressão lambda para filtrar pessoas com idade maior que 25 anos.
    clientes
      .stream()
      .filter(c -> c.getIdade() > 25)
      .forEach(c -> System.out.println(c.getNome()));

    // Vai filtrar o nome do cliente pelo nome e imprimir na tela.
    System.out.println();
    clientes
      .stream()
      .filter(c -> c.getNome().contains("Rodrigues"))
      .forEach(c -> System.out.println(c.getNome()));

    // filtra todos os clientes que comecem com a letra "B".
    System.out.println();
    clientes
      .stream()
      .filter(c -> c.getNome().startsWith("B"))
      .forEach(c -> System.out.println(c.getNome()));

    System.out.println();
    // o map retorna um novo Array de alguma coisa, no caso abaixo retorna os nomes (getNome())
    clientes
      .stream()
      .map(c -> c.getNome())
      .forEach(c -> System.out.println(c.toString()));

    System.out.println();
    // Para cada cliente que tem dentro da lista, pega o nome.
    // Obs: Ambos são a mesma coisa, so muda a forma da escrita.
    clientes.stream().map(c -> c.getNome());
    clientes.stream().map(Cliente::getNome);
  }
}
