package main

import "fmt"

var tarifa float32

func main() {

	var c1 ClienteRegular
	var c2 ClientePremium
	var c3 ClienteVip

	c1.nome = "marcelo"
	c1.saldo = 500
	c2.nome = "Renan"
	c2.saldo = 300
	c3.nome = "Rhuan"
	c3.saldo = 500

	c1.controleCc()
	c1.calcularTariva(c1.saldo)
	c2.controleCc()
	c2.calcularTariva(c1.saldo)
	c3.controleCc()
	c3.calcularTariva(c1.saldo)

}

type Cliente struct {
	nome  string
	saldo float32
}

func (c *Cliente) getSaldo() float32 {
	return c.saldo
}

type ClienteRegular struct {
	Cliente
}

type ClientePremium struct {
	Cliente
}
type ClienteVip struct {
	Cliente
}

func (c *Cliente) controleCc() {

	fmt.Println("=================================================================================")
	fmt.Println("Controle Conta Corrente")
	fmt.Println("Nome:", c.nome, "Saldo:", c.saldo)

}

func (c1 *ClienteRegular) calcularTariva(tarifa float32) {

	tarifa = c1.getSaldo() * 0.01

	fmt.Println("O valor da tarifa é:", tarifa)
}

func (c2 *ClientePremium) calcularTariva(tarifa float32) {

	tarifa = c2.getSaldo() * 0.02

	fmt.Println("O valor da tarifa é:", tarifa)
}

func (c3 *ClienteVip) calcularTariva(tarifa float32) {

	tarifa = c3.getSaldo() * 0.04

	fmt.Println("O valor da tarifa é:", tarifa)
}
