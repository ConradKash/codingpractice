package main

import "fmt"

func main() {

	var x = 5
	x += 1
	fmt.Println(x)
	temperature()
	
	lengthconversion()
}

func temperature() {
	fmt.Print("Enter the length in feet: ")
	var input float64
	fmt.Scanf("%f", &input)
	output := ((input-32)*5/9)
	fmt.Println(output)
}

func lengthconversion() {
	const ft = 0.3048
	var c float64
	fmt.Print("Enter the length in feet: ")
	fmt.Scanf("%f", &c)
	output := c * ft
	fmt.Println(output)
}
