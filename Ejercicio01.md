# Ejercicio01

SPRINT 1:

En este sprint se discutió acerca de las dependencias necesarias para la ejecucion del mismo y la no acumulacion de errores de versiones que esto podria conllevar, ademas se creó 3 clases indispensables para el proyecto, las cuales son Main, Quizz, Question, en las cuales en la clase Main se ejecuta la clase Quizz que es en la que se tiene la estructura del proyecto, contando con subclases como Start() la cual se encarga de mostrar el inicio del juego y las reglas, luego tenemos las subclase CargarPreguntas() la cual se encarga de ejecutar las preguntas llamando a la clase Question  y por ultimo tenemos a la clase End() la cual se encarga de mostrar los resultados finales de la partida.

Adjunto el output del sprint1:

![Untitled](Evidencia/Untitled.png)

En este sprint aun no se han considerados casos extremos de tipos de respuesta ni contadores ni errores en la digitalizacion de las respuestas.

SPRINT 2:

En este sprint se implemento lo que es un sistema de puntuacion que considera la cantidad de preguntas que se respondieron correctamente dando en la clase End() la puntuacion final de la partida, el codigo modificado es: 

![Untitled](Evidencia/Untitled%201.png)

Adicionalmente a ello se implemento logica para que se logre completar el juego cuando se completan la totalidad de las rondas, ademas de que se implemento un test para probar que el sistema de puntuacion funciona correctamente.

Adjunto el output obtenido luego de la modificacion del codigo:

![Untitled](Evidencia/Untitled%202.png)

Aun faltaria añadir sistema de puntuacion completo y verificar los casos extremos al momento de ingresar datos como respuesta

SPRINT 3:

Este sprint se enfocó en la ligera mejora de la interfaz grafica del usuario evitando los errores de escritura, visualizacion y de optimizacion, adicional a ello se le agrego al final de la partida que ademas de mostrarse la puntuacion obtenida se pueda ver la cantidad de preguntas acertadas y la cantidad de preguntas erroneas, dando asi un mejor feedback al usuario.

Adjunto output obtenido luego de los ultimos cambios:

![Untitled](Evidencia/Untitled%203.png)

En el output mostrado se puede apreciar la cantidad de preguntas contestadas, respuestas correctas e incorrectas, adicional a ello se muetra que arrojaria el sistema cuando se ingresa un numero invalido, dando asi otra oportunidad al usuario de poner un numero valido, se consideró tambien que al volver a mostrarse la pregunta la cantidad de preguntas contestadas no se altere, esto a fin de no generar conflictos en el momento del output.