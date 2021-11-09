package com.ndr.domain;

import com.ndr.abstraction.domain.Cacamba;
import com.ndr.abstraction.domain.Carro;

public class Pickup extends Carro {
  Cacamba cacamba;

  public Pickup() {
    super.controleInterno();
  }
}
