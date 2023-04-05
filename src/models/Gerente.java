package models;

import interfaces.ICamareira;
import interfaces.IRecepcionista;

public class Gerente extends Pessoa implements ICamareira, IRecepcionista {

  public Gerente(String nome, String telefone, String cpf) {
    super(nome, telefone, cpf);
  }

  @Override
  public void atenderOTelefone() {
    System.out.println(
      "Sei muito bem atender um telefone mais ou menos" + "\n"
    );
  }

  @Override
  public void falarIngles() {
    System.out.println("Sei muito bem falar muito bem o inglês" + "\n");
  }

  @Override
  public void arrumarACama() {
    System.out.println("Sei muito bem arrumar uma cama" + "\n");
  }

  @Override
  public void limparQuarto() {
    System.out.println("Sei arrumar um quarto mais ou menos" + "\n");
  }
}
