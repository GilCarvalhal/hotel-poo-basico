import models.Camareira;
import models.Cliente;
import models.Gerente;
import models.Recepcionista;

public class App {

  public static void main(String[] args) {
    System.out.println("Hotel Java");

    Cliente cliente1 = new Cliente("Manoel", "71912345678", "12345678901");

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
  }
}