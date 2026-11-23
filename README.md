# 🕸️ J_GRAFOS v1.0 beta - Editor Visual y Analizador de Teoría de Grafos

Aplicación de escritorio en pantalla completa desarrollada en **Java (Swing/AWT)** para diseñar, guardar y analizar grafos de forma interactiva. Permite dibujar nodos y aristas directamente con el mouse, alternar entre asignación manual o automática de pesos, generar matrices para grafos dirigidos y no dirigidos, y ejecutar algoritmos clásicos de optimización y caminos mínimos.

---

## ✨ Características Principales

* **Lienzo Interactivo con Controles de Mouse:**
  * **Creación de Nodos:** Doble clic izquierdo sobre cualquier punto del área de trabajo.
  * **Creación de Aristas:** Arrastrar el cursor manteniendo presionado el clic derecho desde un nodo origen hacia un nodo destino.
  * **Dirección y Propiedades:** Menú contextual con clic derecho sobre los nodos para alternar entre **Grafo Dirigido** y **Grafo No Dirigido** o consultar su matriz de costos.
  * **Gestión de Pesos:** Modo configurable desde el menú *Opciones* para asignar pesos de forma **manual** o **automática**.
* **Generación de Matrices:**
  * Generación de **Matriz para Grafo Dirigido** (`MostrarMatriz`).
  * Generación de **Matriz para Grafo No Dirigido** (`MostrarMatrizGND`).
* **Algoritmos de Grafos Integrados (Menú *Herramientas*):**
  * **Dijkstra (`VentanaD`):** Cálculo de la ruta más corta desde un nodo origen.
  * **Floyd (`VentanaF`):** Cálculo de caminos mínimos entre todos los pares de nodos.
  * **Prim (`AlgoritmoPrim`):** Obtención del Árbol de Expansión Mínima (MST).
* **Persistencia y Gestión de Proyectos (Menú *Archivo*):**
  * **Nuevo:** Limpia el lienzo actual para iniciar un grafo desde cero.
  * **Guardar / Abrir:** Almacenamiento y carga de grafos creados previamente.
  * **Exportar como imagen:** Guarda una captura visual del grafo diseñado.

---

## 🛠️ Tecnologías Utilizadas

* **Lenguaje:** Java
* **Interfaz Gráfica:** Java Swing & AWT (`JFrame`, `JPanel`, `JMenuBar`, `Toolkit`, `Graphics`)
* **Arquitectura de Paquetes:** Separación entre interfaz/ventanas (`Ventana`) y lógica/estructuras de grafos (`Grafos`).

---

## 🚀 Instalación y Ejecución

### Requisitos previos
* **Java Development Kit (JDK)** instalado (JDK 8 o superior).
* **Git** para clonar el repositorio.

### Pasos para ejecutar

1. **Clona el repositorio:**
   ```bash
   git clone [https://github.com/marcovazpro-coder/Teoria-de-Grafos.git](https://github.com/marcovazpro-coder/Teoria-de-Grafos.git)
