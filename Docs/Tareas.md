
# Aplicación para la gestión de riesgos de seguridad personales asociados a dispositivos IoT

(título centrado en la idea de los riesgos personales para diferenciarlo lo máximo posible de otro TFG)




# BASE DEL PROYECTO

- Listado de elementos (dispositivos, aplicaciones)

    - Usamos una base de datos o fichero de prueba con varias categorías de dispositivos y aplicaciones y varios ejemplos de cada una. Cada dispositivo tendrá los atributos típicos (nombre, etc) y una puntuación de riesgo. No pondría puntuación de seguridad y sostenibilidad para separar de forma más clara de otro TFG.

    - Funcionalidad que permita ver el listado y si acaso buscar



- Perfil personal
    - Necesitaríamos bd local para hacer esto
    - Definimos un perfil y podemos gestionar elementos asociados (dispositivos/aplicaciones); ver, añadir, eliminar


- Riesgos
    - Evaluar el nivel de riesgo a partir de nuestro perfil
    - Mostrar al usuario el riesgo y los motivos
    - Ante cambios en el perfil volver a lanzar la evaluación


- Controles
    - Mostrar acciones que puede realizar para reducir el riesgo
    - Será establecer controles o mejorarlos
    - Ej. Un control puede ser que tengamos un antivirus
    - Tendremos una lista de controles activos



------

Creo que es otro punto básico de la app. Para tener una app local y una parte de servidor.

- API
    - Catálogo de dispositivos, con info asociada y nivel de riesgo.
    - Catálogo de vulnerabilidades posibles (relacionando dispositivos con las vulnerabilidades que tienen).
    - Catálogo de controles de seguridad posibles (relacionando qué vulnerabilidad o vulnerabilidades mitigan)


---

Haría esto lo primero si ya tenemos la API, porque es sencillo y lógico.

- Actualizaciones de riesgo (servidor)
    - Si partimos de que tenemos una API, al iniciar la app nos conectaremos y bajaremos los datos, de modo que si hay una nueva vulnerabilidad que nos afecte, tendremos esos nuevos datos para rehacer el análisis de riesgos.
    

----
Esto es fácil de hacer y luce

- Buscador de dispositivos
    - Buscador de dispositivos antes de comprarlos para que indique riesgos asociados y alternativas.
    - Esto sería otra "pestaña" de la app.
    - También podríamos usar esto mismo para que en los dispositivos de nuestro perfil nos aparezca un "recomiendame algo mejor"

-------

Esto es vistoso y no debería ser muy complejo
- Cuestionario inicial
    - Tomar la información del perfil de una forma amigable, con un cuestionario que te pregunte edad, etc. dispositivos, aplicaciones.


----

Tareas que implican complicar el tema de análisis de riesgos añadiendo más elementos a la ecuación

- Perfil de casa
    - La idea es pasar la app de "riesgos personales" a "riesgos del hogar"
    - Sería tener en nuestro perfil todos los dispositivos y apps de la casa y luego tener distintos perfiles de personas que conviven y usan esos dispositivos, pero tienen distinto riesgo.


- Conciencia del tipo de persona
    - Meter en el perfil el concepto de persona mayor, niño, etc.
    - Meter en elementos aquellos específicos que hayamos dejado fuera (alarma anti caídas, etc.)
    - Ampliar el análisis de riesgos para que tenga en cuenta estos datos (una persona mayor tiene más riesgo de phising)

----

Esto puede ser complejo, aparte del proceso para hacerlo, porque luego hay que mapearlas a nuestra estructura de categorías

- Cargar apps automáticamente
    - Que se conecte a tu movil a las apps que tienes instaladas para no meterlas a mano.


----

Esto tiene su trabajo pero es muy interesante. Creo que aportaría mucho a la aplicación esa dimensión de "denuncia" social

- Los usuarios mandan incidencias al servidor
    - Una especie de inteligencia social, es simplemente tener una comunicación usuario -> servidor.
    - Los usuarios pueden indicar un riesgo asociado a un dispositivo o app y se sube al servidor.
    - No hay ninguna decisión por parte del servidor sino que usuario únicamente verá que cierto dispositivo o app ha sido reportada por x usuarios. Al igual que la app de tráfico que indica que x usuarios han visto un control de policía.
    - Esto para no meterlo junto con el nivel de riesgo actual, podríamos ponerlo como en otra "pestaña" con un concepto de "riesgo social" o "alerta social" o algo así, y ahí se muestra una lista de tus dispositivos y apps que tienen alertas asociadas y el número.
    
