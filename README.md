# Sistema de Gestión de Estudiantes con Árboles Binarios de Búsqueda (BST)

Este repositorio contiene la implementación de un sistema de gestión académica basado en Árboles Binarios de Búsqueda (BST), desarrollado en paralelo usando **C++** y **Java**. 

## 📌 Descripción del Proyecto
El sistema permite administrar registros de estudiantes (Cédula, Nombre y Nota) aprovechando la eficiencia de búsqueda $O(\log N)$ que proveen los BST. Las inserciones se ordenan tomando como clave de nodo la **cédula** del estudiante.

## 🛠️ Tecnologías y Reglas Técnicas Aplicadas
- **C++**: Manejo manual de memoria dinámica (punteros), validación y paso por referencia en recursividad.
- **Java**: Gestión orientada a objetos puros, referencias automáticas por el Garbage Collector.
- **Estructuras**: Colas (`std::queue` en C++, `LinkedList` en Java) utilizadas estrictamente para el recorrido por niveles (BFS - Breadth-First Search).

## 🚀 Instrucciones de Ejecución

### Para C++
1. Abre tu terminal en la carpeta del código C++.
2. Compila el código usando GCC:
   ```bash
   g++ main.cpp -o app