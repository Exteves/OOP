package main

import (
	"fmt"
)

func main() {

	var menu int

	p1 := Ipi{Produto{"Samsung", 800, 0, 0}}
	p2 := Icms{Produto{"Lenovo", 600, 0, 0}}
	p3 := Ipi{Produto{"Dell", 2000, 0, 0}}
	p4 := Icms{Produto{"Sony", 3000, 0, 0}}

	fmt.Println("\n Você pode fazer até 4 consultar\n")
	fmt.Println("ESCOLHA O TIPO DE PRODUTO QUE DESEJA VISUALIZAR \n\n")
	fmt.Println("1 - Celular:  ")
	fmt.Println("2 - Tablet:  ")
	fmt.Println("3 - Notebook:  ")
	fmt.Println("4 - TV LEd:  ")

	for i := 0; i < 4; i++ {

		fmt.Scan(&menu)
		if menu == 1 {

			p1.mostrarProduto()
			CalcularImpostos(p1)

		} else if menu == 2 {

			p2.mostrarProduto()
			CalcularImpostos(p2)

		} else if menu == 3 {

			p3.mostrarProduto()
			CalcularImpostos(p3)

		} else if menu == 4 {

			p4.mostrarProduto()
			CalcularImpostos(p4)

		} else {

			fmt.Println("Opção inválida")

		}

	}

	fmt.Println("\n *****  SEU LIMITE DE CONSULTA ESGOTOU  *****")
}

type Impostos interface {
	CalcularImpostos() string
}

func CalcularImpostos(p Impostos) {
	fmt.Println(p.CalcularImpostos())
}

type Produto struct {
	nome         string
	preco        float32
	imposto      float32
	valorLiquido float32
}

func (p Produto) getPreco() float32 {
	return p.preco

}

func (p Produto) getNome() string {
	return p.nome

}

func (p Produto) mostrarProduto() {

	fmt.Println("=================================================================================")
	fmt.Println("Metodo Mostrar Produto:")
	fmt.Println("Nome:", p.getNome(), "\nPreco:", p.getPreco())
}

type Ipi struct {
	Produto
}

func (p Ipi) CalcularImpostos() string {

	p.imposto = p.getPreco() * 0.04

	p.valorLiquido = p.getPreco() - p.imposto

	return fmt.Sprintf("Metodo Calcular Imposto \nICMS: %0.2f  \nValor Liquido: %0.2f", p.imposto, p.valorLiquido)
}

type Icms struct {
	Produto
}

func (p Icms) CalcularImpostos() string {

	p.imposto = p.getPreco() * 0.05

	p.valorLiquido = p.getPreco() - p.imposto

	return fmt.Sprintf("Metodo Calcular Imposto \nIPI: %0.2f  \nValor Liquido: %0.2f", p.imposto, p.valorLiquido)
}
