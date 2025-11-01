# 🚦 Ejemplo de Implementación de Rate Limit en Spring Boot

Este proyecto muestra cómo implementar un **Rate Limiting** (limitación de peticiones) en una API construida con **Spring Boot**, para evitar el abuso de endpoints y mejorar la estabilidad del sistema.

---

## 🧠 ¿Qué es el Rate Limiting?

El **Rate Limiting** es una técnica que restringe la cantidad de solicitudes que un cliente puede hacer a un servidor dentro de un intervalo de tiempo determinado.
Por ejemplo: *máximo 10 requests por minuto por usuario*.

Esto ayuda a:

* Evitar ataques de denegación de servicio (DoS)
* Proteger recursos costosos o sensibles
* Controlar el uso de APIs públicas o internas
* Mejorar la calidad del servicio

