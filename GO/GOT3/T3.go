package main

import "fmt"

func main() {
	var l Livro

	l.init("The jungle book", PDF)

	fmt.Println(l.getPreco())
}

type Livro struct {
	nomeLivro string
	preco     float32
	tipo      TipoLivro
}

func (l *Livro) init(nomeLivro string, tipo TipoLivro) {
	l.nomeLivro = nomeLivro
	l.tipo = tipo

	switch l.tipo {
	case EPUB:
		l.preco = 20
	case PDF:
		l.preco = 40
	case FISICO:
		l.preco = 80
	default:
		l.preco = 0
	}
}

type TipoLivro int8

const (
	EPUB = iota
	PDF
	FISICO
)

func (l *Livro) getPreco() float32 {
	return l.preco
}

func (l *Livro) getTipo() TipoLivro {
	return l.tipo
}
