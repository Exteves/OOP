package main

import "fmt"

func main() {
	l := Lampada{
		duraMax:  10,
		contador: 0,
		acesa:    false,
	}
	l.setAcesa()
	fmt.Println(l.isAcesa())
}

type Lampada struct {
	acesa             bool
	duraMax, contador int
}

func (l *Lampada) isAcesa() bool {
	return l.acesa
}

func (l *Lampada) setAcesa() {
	if l.contador != l.duraMax {
		if l.acesa {
			l.acesa = false
		} else {
			l.acesa = true
		}
		l.contador++
	} else {
		l.acesa = false
	}
}
