package com.ndr;

import com.ndr.abstraction.domain.Carro;
import com.ndr.domain.Pickup;

public class Init {
  public static void main(String[] args) {
    Carro variant = new Carro();
    Carro fusca = new Carro();
    Carro passat = new Carro();

    Pickup fuscaPickup = new Pickup();

    System.out.println("Variant : " + variant);
    System.out.println("Fusca : " + fusca);
    System.out.println("Passat : " + passat);
  }
}
