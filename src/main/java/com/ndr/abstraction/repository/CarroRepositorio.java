package com.ndr.abstraction.repository;

import com.ndr.abstraction.domain.*;

public class CarroRepositorio extends Repositorio<IEntidade> {
  @Override
  public IEntidade Obter(Integer id) {
    return null;
  }

  @Override
  public void SalvarOuAtualizar(IEntidade entidade) {

  }

  @Override
  public void Excluir(Integer id) {

  }

  void TornarObsoleto(Carro carro) {

  }

  void JaExiste(Carro carro) {

  }
}
