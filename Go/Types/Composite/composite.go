package main

import "fmt"

func main() {
	fmt.Printf("We are looking at composite types. \n")
	// Arrays
	fmt.Printf("Arrays: \n \n")
	var array1 [2]int
	array1[0] = 1
	array1[1] = 2
	var array2 = [...]int{1, 2, 3, 4, 5}
	array3 := [...]string{"Kakuru", "Conrad"}
	array4 := [2]string{1: "Kakuru", 0: "Conrad"}
	var array5 [2]float64 = [...]float64{1.1, 2.2}

	fmt.Printf("Array 1: %v \n", array1)
	fmt.Printf("Array 2: %v \n", array2)
	fmt.Printf("Array 3: %v \n", array3)
	fmt.Printf("Array 4: %v \n", array4)
	fmt.Printf("Array 5: %v \n", array5)

	fmt.Printf("\n Array types: \n")

	fmt.Printf("Array1 type: %T \n", array1)
	fmt.Printf("Array2 type: %T \n", array2)
	fmt.Printf("Array3 type: %T \n", array3)
	fmt.Printf("Array4 type: %T \n", array4)
	fmt.Printf("Array5 type: %T \n", array5)

	fmt.Printf("\n Array lengths: \n")

	fmt.Printf("Array1 length: %v \n", len(array1))
	fmt.Printf("Array2 length: %v \n", len(array2))
	fmt.Printf("Array3 length: %v \n", len(array3))
	fmt.Printf("Array4 length: %v \n", len(array4))
	fmt.Printf("Array5 length: %v \n", len(array5))

	fmt.Printf("%f ", array5[1])

	// Slices

}
