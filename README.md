# 📌 Design Patterns – Ejercicios Resueltos  

Este repositorio contiene la implementación y justificación de **patrones de diseño**:  
- Creacionales 🏗️  
- Estructurales 🧩  
- Comportamentales 📢  

## 📖 Ejemplo de Diagrama  

```mermaid
classDiagram
    Observer <|-- User
    Subject <|-- NotificationService
    Subject : +addObserver()
    Subject : +removeObserver()
    Subject : +notifyObservers()
    Observer : +update(message)
