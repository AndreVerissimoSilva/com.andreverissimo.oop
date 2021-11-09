package com.ndr.abstraction.domain;

import java.util.Date;

public class Piloto {
  String Nome;
  String Nacionalidade;
  Date DataNascimento;
  String Escuderia;
  Carro carro;

  public Piloto(Carro carro) {
    this.carro = carro;
  }
}
