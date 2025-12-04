# herencia-vehiculos
Descripcion del proyecto

Este proyecto es una prueba sencilla para entender y practicar el concepto de herencia en clases usando como ejemplo diferentes tipos de vehiculos.
La idea principal es mostrar como una clase puede heredar atributos de otra y como estos se van acumulando a medida que avanzan los niveles de herencia.

Estructura de herencia del proyecto

El programa inicia con la clase base Vehiculos, que contiene los siguientes atributos:

marca

color

km

A partir de esta clase, se forma una cadena de herencia donde cada clase agrega un nuevo atributo ademas de los que ya recibe por herencia:

1. carro

Hereda de Vehiculos y agrega:

numllantas

2. camionArena

Hereda de carro y agrega:

pesoC

3. moto

Hereda de camionArena y agrega:

anchoV

4. cicla

Hereda de moto y agrega:

cadena

5. tren

Hereda de cicla y agrega:

gasolina

6. Carroelectrico

Hereda de tren y agrega:

bateria

Resultado final

Gracias a esta cadena de herencia, la clase Carroelectrico termina teniendo todos los atributos definidos en las clases anteriores.
Esto permite usar cualquiera de esos atributos y demuestra como la herencia puede acumular caracteristicas de manera progresiva.

El proyecto sirve para visualizar de forma simple como funciona la herencia, como se propagan los atributos y como una clase final puede contener informacion proveniente de muchas clases anteriores.


