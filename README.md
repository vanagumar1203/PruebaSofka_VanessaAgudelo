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

Contiene el algoritmo del ejercicio número 2, el cual permite registrar N cantidad de bultos, se creo una condición para realizar el registro, hasta que el usuario desee detener el ingreso o hasta que la capacidad de kilos de avión se encuentre completa.

A su vez este ejercicio muestra:
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

Contiene el constructor del objeto tipo bulto, que contiene como variables: peso, valor, dolar

peso (hace referencia al peso del bulto ingresado)

valor (este es un valor calculado que hace referencia al costo del bulto en pesos, de acuerdo a los kilos del mismo)

dolar (este es un valor calculado que hace referencia al costo del bulto en dolares, tomando como base el valor en pesos y declarando como constante un valor de dolar de 3.500)



## Ejecución
Dentro del proyecto, en la carpeta dist se encuentra el archivo ```VanessaAgudelo_Sofka.jar``` que solo requiere ser ejecutado para probar los 2 algoritmos.
___
Para conocer el código, se debe abrir el proyecto en un IDE de preferencia Netbeans. También puede ejecutarse el proyecto dentro del IDE.


## Observación

Para efectos de la prueba del segundo ejercicio,  donde el total de equipaje registrado no debe exceder la capacidad del avión (18.000 KG), en la clase ```Ejercicio2.java``` se ha creado una constante dentro de llamada ```CAPACIDAD```, que permite modificar la capacidad del avión a un número inferior, y por tanto facilitar la validación de este requisito.