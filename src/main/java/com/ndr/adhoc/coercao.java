package com.ndr.adhoc;

public class coercao {
  void metodo1(float param1) {

  }

  long metodo2() {
    long inteiro = 2;
    metodo1(inteiro);
    return inteiro;
  }
}