# PruebaSofka_VanessaAgudelo
Prueba técnica Training Calidad - Vanessa Agudelo Marín

# Tecnología
El ejercicio fue construido con el lenguaje de Java, utilizando Netbeans IDE 8.0.1

# Construcción del ejercicio

Se encuentran 3 clases:


```Ejercicio1.java```

Contiene el algoritmo del ejercicio número 1, para determinar el costo de un pasaje de avión de acuerdo a las especificaciones dadas (kilometros a recorrer y días de estadía)

El algoritmo fue diseñado para ejecutarse una vez.

___
```Ejercicio2.java```

Contiene el algoritmo del ejercicio número 2, el cual permite registrar N cantidad de bultos. ```Ver Observaciones```

Se creo una condición para realizar el registro, hasta que el usuario desee detener el ingreso o hasta que la capacidad de kilos de avión se encuentre completa.

A finalizar el ejercicio muestra:
```bash
- Capacidad de kilos del avión
- Total de bultos registrados
- Total de kilos registrados
- Peso promedio de los kilos
- Bulto con mayor peso
- Bulto con menor peso
- Listado de los bultos ingresados con: 
  kilos, valor en pesos y valor en dolares
```

___
```Bulto.java```

Contiene el constructor del objeto tipo bulto, que contiene como variables: ```peso, valor, dolar```

```peso``` (hace referencia al peso del bulto ingresado)

```valor``` (este es un valor calculado que hace referencia al costo del bulto en pesos, de acuerdo a los kilos del mismo)

```dolar``` (este es un valor calculado que hace referencia al costo del bulto en dolares, tomando como base el valor en pesos y declarando como ```constante``` un valor de dolar de ```3.500```)



## Ejecución
Dentro del proyecto, en la carpeta dist se encuentra el archivo ```VanessaAgudelo_Sofka.jar``` que solo requiere ser ejecutado para probar los 2 algoritmos.
___
Para conocer el código, se debe abrir el proyecto en un IDE de preferencia Netbeans. También puede ejecutarse el proyecto dentro del IDE.


## Observación

Para efectos de la prueba del segundo ejercicio,  donde el total de equipaje registrado no debe exceder la capacidad del avión (18.000 KG), en la clase ```Ejercicio2.java``` se ha creado una constante dentro de llamada ```CAPACIDAD```, que permite modificar la capacidad del avión a un número inferior, y por tanto facilitar la validación de este requisito.
___

Para cada una de las pruebas, al ingresar valores en decimales se debe tener en cuenta ingresar ```punto(.)``` y no ```coma(,)```

Ejemplo: 

- ```peso bulto``` ```10.5```

- ```kilometros trayecto``` ```100.50```
___
Debido a que la especificación del punto ```d)``` del ```Ejercicio 2``` es un poco ambigua se procede a lo siguiente:

- Se deja a decisión del usuario cuantos bultos quiere registrar o en defecto hasta que la capacidad de KG del avión se encuentre completa

- Se define el valor de ```1 DOLAR``` equivalente a ```3.500 pesos``` para sacar el valor del bulto en dólares.

- Se adjunta dentro del proyecto un excel con una tabla de ejemplo para los 15 datos de entrada solicitados, estos 15 datos pueden ser modificados de acuerdo a las condiciones del algoritmo y funciona como simulador.