package com.ndr.abstraction.domain;

public class Carro {
  String marca;
  String modelo;
  Integer anoModelo;
  Integer anoFabricacao;
  String cor;
  String placa;
  Pneu[] pneus;

  public Carro() {
    this.pneus = new Pneu[4];
  }

  void acelerar() {

  }

  void frear() {

  }

  void estacionar() {

  }

  protected void controleInterno(){

  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public Integer getAnoModelo() {
    return anoModelo;
  }

  public void setAnoModelo(Integer anoModelo) {
    this.anoModelo = anoModelo;
  }

  public Integer getAnoFabricacao() {
    return anoFabricacao;
  }

  public void setAnoFabricacao(Integer anoFabricacao) {
    this.anoFabricacao = anoFabricacao;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

/*
  protected void finalize() {

  }
*/
}
