package models;

import interfaces.IRecepcionista;

public class Recepcionista extends Pessoa implements IRecepcionista {

  public Recepcionista(String nome, String telefone, String cpf) {
    super(nome, telefone, cpf);
  }

  @Override
  public void atenderOTelefone() {
    System.out.println("Sei muito bem atender um telefone" + "\n");
  }

  @Override
  public void falarIngles() {
    System.out.println("Sei muito bem falar inglês" + "\n");
  }
}
