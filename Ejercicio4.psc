Algoritmo Ejercicio4
	Definir matriz Como Entero
	Definir numeroMayor Como Entero
	Definir numeroMenor Como Entero
	Dimension matriz(20)
	Para i<-1  Hasta 20 Con Paso 1 Hacer
		Escribir 'Ingrese la edad de la persona No. ' i
		Leer matriz(i) 
	Fin Para
	numeroMayor = matriz(1)
	Para i <- 1 Hasta 20 Con Paso 1 Hacer
		si numeroMayor < matriz(i) 
			numeroMayor = matriz(i)
		FinSi
	Fin Para
	numeroMenor = matriz(1)
	Para i <- 1 Hasta 20 Con Paso 1 Hacer
		si numeroMenor > matriz(i) 
			numeroMenor = matriz(i)
		FinSi
	Fin Para	
	Escribir 'La edad mayor que se ingreso es: ' numeroMayor
	Escribir 'La edad menor que se ingreso es: ' numeroMenor
FinAlgoritmo
