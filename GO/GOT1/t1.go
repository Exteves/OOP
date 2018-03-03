package main

import "fmt"

func main() {
	p := Pessoa{
		"Renan",
		22,
		false,
		true,
	}
	c := Churrasco{2}

	c.verificarConsumo()
}

type Pessoa struct{
	Nome string
	idade int
	vegetariana, sexo bool
}

type Churrasco struct{
	qtdCarne float32	
}

func (c *Churrasco) verificarConsumo(p *Pessoa){
	fmt.Println(p.Nome)
	c.qtdCarne = 2
	fmt.Println(c.qtdCarne)
}