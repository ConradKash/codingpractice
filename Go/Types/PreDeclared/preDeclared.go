package main

import "fmt"

func main() {
	var x bool
	fmt.Printf("Hello, %t! \n", x)
	x = true
	fmt.Printf("Hello, %t! \n", x)

	y := 10
	fmt.Printf("Hello, %d! \n", y)

	y *= 2
	fmt.Printf("New value is %d \n", y)

	z := 10.5
	fmt.Printf("Hello, %f! \n", z)

	var (
		age   int    = 10
		name  string = "Conrad"
		adult bool   = true
		pi           = 3.14159
	)
	pi *= 5 / 2

	fmt.Printf("Hello my name is %s and my age is %d. \n Am an adult %t. The new pi is %f \n", name, age, adult, pi)

	fmt.Printf(" \n \nExplicit type conversion \n")

	var a int = 10
	var b float64 = float64(a)
	c := 23.6 + b
	var e = 23.6
	d := int(e) + a
	f := `Hello`
	g := rune(a)
	fmt.Printf("Type of g: %T \n", g)
	fmt.Printf("Type of a: %T \n", a)
	fmt.Printf("Type of b: %T \n", b)
	fmt.Printf("Type of c: %T \n", c)
	fmt.Printf("Type of d: %T \n", d)
	fmt.Printf("Type of e: %T \n", e)
	fmt.Printf("Type of f: %T \n", f)
	fmt.Printf("Value of a and b is %d and %f \n", a, b)
	fmt.Printf("Value of c is %f \n", c)
	fmt.Printf("Value of d is %d \n ", d)
}
