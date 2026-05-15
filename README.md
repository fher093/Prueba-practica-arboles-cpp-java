# Prueba Práctica Avanzada: Árboles en C++ y Java 

## Sistema de Gestión de Estudiantes con Árboles Binarios de Búsqueda (BST)

Este repositorio contiene la implementación de un sistema de gestión académica basado en Árboles Binarios de Búsqueda (BST), desarrollado en paralelo usando **Java**. 

## Caso Practico 

La Universidad Técnica de Ambato requiere un sistema académico para gestionar estudiantes mediante un árbol binario de búsqueda. Cada estudiante tendrá: cédula, apellidos, nombres, nota final, carrera y nivel. 

## Descripción del Proyecto
El sistema permite administrar registros de estudiantes (Cédula, Nombre y Nota) aprovechando la eficiencia de búsqueda $O(\log N)$ que proveen los BST. Las inserciones se ordenan tomando como clave de nodo la **cédula** del estudiante.  

## Objetivos del Proyecto 
-Aplicar Programación Orientada a Objetos en Java.
-Implementar Árboles Binarios de Búsqueda.
-Utilizar recursividad.
-Aplicar estructuras dinámicas.
-Implementar recorridos de árboles.
-Utilizar colas para recorrido BFS.
-Validar datos ingresados por el usuario.

## Estructura del Proyecto 
prueba-practica-arboles-cpp-java/
│
├── java/
│   ├── Estudiante.java
│   ├── Nodo.java
│   ├── ArbolBST.java
│   └── Main.java
│
├── evidencias/
│   └── capturas.png
│
└── README.md

## 🛠️ Tecnologías y Reglas Técnicas Aplicadas

- **Java**: Gestión orientada a objetos puros, referencias automáticas por el Garbage Collector.
- **Estructuras**: Colas (`LinkedList` en Java) utilizadas estrictamente para el recorrido por niveles (BFS - Breadth-First Search).



