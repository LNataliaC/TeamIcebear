Algoritmo Juego_Introduccion
	Definir respuesta, respuesta_2, respuesta_3 Como Caracter
	Definir moneda Como Entero
	Definir monto Como Entero
	contador=0
	acumulador=0
	Escribir "¿Desea realizar el lanzamiento de la moneda? Si/No"
	Leer respuesta
	Mientras respuesta = "Si" Hacer
		Escribir "Escriba el monto que desea apostar en esta ronda:"
		Leer monto
		moneda= azar(2) + 1
		Si moneda=1 Entonces
			respuesta_2= "Cara"
		SiNo
			respuesta_2="Sello"
		FinSi
		Escribir "Seleccione la opcion que cree que va a salir entre Cara o Sello"
		Leer respuesta_3
		
		Escribir "La moneda cayo en:", respuesta_2
		Si respuesta_2 = respuesta_3 Entonces
			Escribir "Gano el juego"
			Total_Suma=monto*2
			Escribir "La cantidad del dinero ganado es de:" Total_Suma
		SiNo
			Escribir "Perdio el juego"
			Total_Resta=Total_Suma-monto
			Escribir "La cantidad del dinero perdido es de:" Total_Resta
		FinSi
		Total_Apuesta= Total_Suma+Total_Resta
		Escribir "El valor total ganado es de:" Total_Apuesta
		Escribir "¿Desea realizar otro lanzamiento? Si/No"
		Leer respuesta 
		contador=contador+1
		acumulador= acumulador + monto
	Fin Mientras
	Escribir " La cantidad de veces que jugo fueron:" contador
	Escribir " El dinero acumulado en apuestas fue de:" acumulador
FinAlgoritmo
