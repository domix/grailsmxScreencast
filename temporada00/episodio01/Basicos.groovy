//println 'Ciclos a la Java'

for(int i=0; i<10; i++) {
	///println "Iterando $i"
}

println 'Ciclos a la Groovy'
println 10.class.name


10.times {
	println "Iterando $it"
	//it es un parametro que implicitamente Groovy nos envia en TODOS los closures
}

//times es un metodo agregado por el GDK
//GDK son mejoras a las clases existentes de la libreria estandar

//Closures, bloques o pedazos de codigo.

def inicio = 7
termino = 10
println 'Ciclos a la Groovy con upto'
inicio.upto (termino) { valor ->
	// el operador -> sirve para separar los parametros del closure del codigo
	println "Iterando $valor"
}


5.step(10, 2) {
	println "Iterando $it con step"
}

println 'Colecciones'
//Mapas, Listas, Arreglos
println 'Rangos'

def rango = 10..20
def rangoAlbetico = 'a'..'z'

for(item in rangoAlbetico) {
	println item
}

println rango.class.name
println rangoAlbetico.class.name


//Groovy automaticamente importa los paquetes
// java.util
// java.math
// java.io
// groovy.lang
// groovy.util
def hoy = new Date()
def ayer = hoy - 1
def antier = ayer -1
def manana = hoy + 1

def rangoFechas = antier..manana

rangoFechas.each {
	println it
}

println 'Listas en Groovy'

List listaJava = new ArrayList()
listaJava.add('Uno')
listaJava.add('Dos')

println listaJava
println listaJava.class.name

def lista = ['uno', 'dos']
println lista
println lista.class.name
lista.each {
	println it
}

println 'Mapas'

Map mapaJava = new HashMap()
mapaJava.put('llave1', 'Valor1')
mapaJava.put('llave2', 'Valor2')

println mapaJava
println 'Java Way ' + mapaJava.get('llave1')
println 'Groovy Way ' + mapaJava.llave1
println 'Groovy Way ' + mapaJava['llave1']
println mapaJava.getClass().name

println 'Mapa Groovy'
def mapa = ['llave1':'valor1','llave2':'valor2','llave3':'valor3']
println mapa
println mapa.getClass().name