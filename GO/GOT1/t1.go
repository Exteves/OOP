package main

import "fmt"

func main() {
	var c Churrasco

	//SETANDO OS ATRIBUTOS DA STRUCT E PRINTANDO O RETORNO DA FUNC

	fmt.Println(c.verificarConsumo(Pessoa{
		"Renan",
		22,
		false,
		true,
	}))
}

//CRIANDO A CLASSE PESSOA - NO CASO DO GO O TIPO STRUCT PESSOA

type Pessoa struct {
	Nome              string
	idade             int
	vegetariana, sexo bool
}

//CRIANDO A CLASSE CHURRASCO

type Churrasco struct {
	qtdCarne float32
}

//CRIANDO O MÉTODO DA CLASSE CHURRASCO E PASSANDO A STRUCT PESSOA COMO PARAMETRO

func (c Churrasco) verificarConsumo(p Pessoa) float32 {
	if (p.idade < 3) || (p.vegetariana) {
		c.qtdCarne = 0
	} else {
		if (p.idade > 3) && (p.idade < 13) {
			c.qtdCarne = 1
		} else {
			c.qtdCarne = 2
		}
	}
	return c.qtdCarne
}
