package models;

import interfaces.ICamareira;

public class Camareira extends Pessoa implements ICamareira {

  public Camareira(String nome, String telefone, String cpf) {
    super(nome, telefone, cpf);
  }

  @Override
  public void arrumarACama() {
    System.out.println("Sei muito bem arrumar uma cama" + "\n");
  }

  @Override
  public void limparQuarto() {
    System.out.println("Sei muito bem arrumar um quarto" + "\n");
  }
}
