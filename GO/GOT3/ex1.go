package main

import "fmt"

func main() {
	var c Candidato

	c.Init("Renan", "brasileira", "PRONA", "direita conservadora", "PRONA", 56)

	fmt.Println(c.getPartido())
}

type Candidato struct {
	nome          string
	partido       Partido
	nacionalidade string
}

type Partido struct {
	nome      string
	ideologia string
	sigla     string
	numero    int
}

func (c *Candidato) Init(nome string, nacionalidade string, partido string, ideologia string, sigla string, numero int) {
	c.nome = nome
	c.nacionalidade = nacionalidade
	c.partido.nome = partido
	c.partido.ideologia = ideologia
	c.partido.sigla = sigla
	c.partido.numero = numero

	if c.nacionalidade == "brasileira" {
		fmt.Println("Candidato brasileiro precisa pertencer a um partido")
	}
}

func (c *Candidato) getNomeCandidato() string {
	return c.nome
}

func (c *Candidato) getPartido() Partido {
	return c.partido
}

func (c *Candidato) getNacionalidade() string {
	return c.nacionalidade
}
