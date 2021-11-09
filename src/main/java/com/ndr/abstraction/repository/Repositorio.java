package com.ndr.abstraction.repository;

public abstract class Repositorio<T> {
  public abstract T Obter(Integer id);
  public abstract void SalvarOuAtualizar(T entidade);
  public abstract void Excluir(Integer id);
}
