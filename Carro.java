/**
 *
 * @author Igor Coelho
 * @version 1.0
 *
 */

// Classe de um Objeto Real
public class Carro {
  // Propriedades do Objeto
  private int anoLancamento;
  private float valor;
  private String cor;
  private String modelo;
// Métodos de 'cadastrar' e 'recuperar' o valor de cada propriedade
  public int getAnoLancamento() {
    return anoLancamento;
  }

  public void setAnoLancamento(int anoLancamento) {
    this.anoLancamento = anoLancamento;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(float valor) {
    this.valor = valor;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  /**
   *
   * @param modelo
   * @param cor
   * @param valor
   * @param anoLancamento
   * <p>Esse método mostra para o usuário todos os dados do carro cadastrado.E recebe todos os parameters acima</p>
   */
  public void infoCarro(String modelo, String cor, float valor, int anoLancamento) {
    System.out.println
        ("O carro do modelo: " + modelo + "e da cor: " +
            cor + "tem o valor de: R$" + valor + "e foi lançado no ano de: " + anoLancamento);
  }

}
