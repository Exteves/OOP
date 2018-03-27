package main

import "fmt"

func main() {

	c1 := Cliente{Nome: "Marcelo", Saldo: 500, Limite: 500}
	c2 := Cliente{Nome: "Renan", Saldo: 500, Limite: 500}

	c1.checarSaldo()
	c2.checarSaldo()

	var d Doc

	d.transferir(c1, c2, 300)

	c1.checarSaldo()
	c2.checarSaldo()

}

type Cliente struct {
	Nome          string
	Saldo, Limite float32
}

func (c *Cliente) checarSaldo() float32 {

	return c.Saldo + c.Limite

}

func (c *Cliente) getNome() string {
	return c.Nome
}

func (c *Cliente) setNome(Nome string) {
	c.Nome = Nome
}

func (c *Cliente) getSaldo() float32 {
	return c.Saldo
}

func (c *Cliente) setSaldo(Saldo float32) {
	c.Saldo = Saldo
}

func (c *Cliente) getLimite() float32 {

	return c.Limite
}

func (c *Cliente) setLimite(Limite float32) {
	c.Limite = Limite
}

func (c *Cliente) depositar(Quantia float32) {
	c.setSaldo(c.getSaldo() + Quantia)

	fmt.Println("deposito realizado na conta de ", c.getNome(), " ", Quantia)

}

func (c *Cliente) sacar(val float32) {

	if c.getSaldo()+c.getLimite() >= val {

		c.setSaldo(c.getSaldo() - val)
		fmt.Println("Saque realizado na conta de ", c.getNome(), " ", val)
	} else {
		fmt.Println("Saldo insuficiente impossivel sacar")
	}

}

type Doc struct {
	Quantia       float32
	c1, c2, saldo Cliente
}

func (d *Doc) transferir(c1 Cliente, c2 Cliente, Quantia float32) {

	fmt.Println("Transferencia DOC")

	c1.sacar(Quantia)
	c2.depositar(Quantia)
	c2.getSaldo()

}
