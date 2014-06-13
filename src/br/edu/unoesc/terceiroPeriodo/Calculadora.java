package br.edu.unoesc.terceiroPeriodo;

public class Calculadora {
	
	public double somar(double num1, double num2) {
		return num1+num2;
	}
	
	public float somar(float num1, float num2) {
		return num1+num2;
	}
	
	public double subtrair(double num1, double num2) {
		return num1-num2;
	}
	
	public float subtrair(float num1, float num2) {
		return num1-num2;
	}
	
	public double multiplicar(double num1, double num2) {
		return num1*num2;
	}
	
	public float multiplicar(float num1, float num2) {
		return num1*num2;
	}
	
	public double dividir(double num1, double num2) {
		return num1/num2;
	}
	
	public float dividir(float num1, float num2) {
		return num1/num2;
	}
	
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		System.out.println(calc.dividir(10.0, 3.0));
		System.out.println(calc.dividir(10f, 3f));
	}
}
