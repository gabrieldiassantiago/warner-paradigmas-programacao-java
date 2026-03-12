/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciolista_1;

public class Salario {
    private double valorBruto;
    private double valorAtualizado;

    public Salario(double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public void calculaAtualizacao(double porcentualAumento) {
        this.valorAtualizado = this.valorBruto * (1 + (porcentualAumento / 100));
    }

    public double getValorAtualizado() {
        return this.valorAtualizado;
    }
}
