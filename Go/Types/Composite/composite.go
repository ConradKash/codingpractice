package main

import (
	"fmt"
	"slices"
)

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

	fmt.Printf("\n \t Slices \n \n")
	fmt.Printf("Declaring slices: \n")

	var slice1 []int
	fmt.Printf("Is slice1 nil? %v\n", slice1 == nil)
	slice1 = []int{1, 2, 3, 4, 5}
	slice2 := []int{1, 2, 3, 4, 5}
	slice3 := make([]int, 5)     // length is 5
	slice4 := make([]int, 5, 10) // length 5, capacity 10
	slice5 := []int{1, 2, 3, 4, 5}
	slice6 := slice5[2:] // slice of slice

	fmt.Printf("Slice 1: %v \n", slice1)
	fmt.Printf("Slice 2: %v \n", slice2)
	fmt.Printf("Slice 3: %v \n", slice3)
	fmt.Printf("Slice 4: %v \n", slice4)
	fmt.Printf("Slice 5: %v \n", slice5)
	fmt.Printf("Slice 6: %v \n", slice6)
	fmt.Printf("Equality of slice 5 and slice 6: %v \n", slices.Equal(slice1, slice2))

	fmt.Printf("\n Functions of slices: \n \n")
	// Append
	// append(slice, elements)
	slice1 = append(slice1, 6, 7, 8)
	var slice9 = append(slice1, append(slice5, slice6...)...)
	fmt.Printf("Slice 1 after appending: %v \n", slice1)
	fmt.Printf("Slice 9 after appending: %v length %d capacity %d\n", slice9, len(slice9), cap(slice9))

	// Copy
	// copy(destination, source)
	slice7 := make([]int, 5)
	fmt.Printf("Slice 7 before copying: %v \n", slice7)
	fmt.Printf("Slice 1 before copying: %v \n", slice1)
	copy(slice7, slice1)
	fmt.Printf("Slice 7 after copying: %v \n", slice7)

	//cap and len
	fmt.Printf("Length of slice 1: %v \n", len(slice1))
	fmt.Printf("Capacity of slice 1: %v \n", cap(slice1))

	// Clear
	slice1 = nil
	fmt.Printf("Is slice1 nil? %v\n", slice1 == nil)
	clear(slice4)
	fmt.Printf("Slice 4 after clearing: %v \n", slice4)

	//Converting arrays to slices
	fmt.Printf("\n Converting arrays to slices: \n")
	var array6 = [5]int{1, 2, 3, 4, 5}
	slice10 := array6[:]
	slice11 := array6[1:3]
	slice12 := array6[:3]
	slice13 := array6[1:]
	fmt.Printf("Slice 10: %v \n", slice10)
	fmt.Printf("Slice 11: %v \n", slice11)
	fmt.Printf("Slice 12: %v \n", slice12)
	fmt.Printf("Slice 13: %v \n", slice13)
	fmt.Printf("Type of slice 10: %T \n", slice10)

	// Converting slices to arrays
	fmt.Printf("\n Converting slices to arrays: \n")
	array7 := [5]int(slice10)
	fmt.Printf("Array 7: %v \n", array7)
	fmt.Printf("Type of array 7: %T \n", array7)

	// Strings, runes and bytes
	fmt.Printf("\n Strings, runes and bytes: \n")

	var s string = "Hello, World!"
	fmt.Printf("String s: %v \n", s)
	fmt.Printf("Length of string s: %v \n", len(s))
	fmt.Printf("Type of string s: %T \n", s)

	var b byte = s[1]
	fmt.Printf("Byte b: %v \n", b)
	fmt.Printf("Type of byte b: %T \n", b)

	var r rune = 'a'
	fmt.Printf("Rune r: %v \n", r)
	fmt.Printf("Type of rune r: %T \n", r)
	s1 := string(r)
	fmt.Printf("String s1: %v \n", s1)
	fmt.Printf("Type of string s1: %T \n", s1)

	var r1 rune = '4'
	fmt.Printf("Rune r1: %v \n", r1)
	fmt.Printf("Type of rune r1: %T \n", r1)
	i1 := int(r1)
	fmt.Printf("Int i1: %v \n", i1)
	fmt.Printf("Type of int i1: %T \n", i1)
}
