# DracmaAPI

**DracmaAPI** es una interfaz pública que permite a desarrolladores integrar sus plugins con el plugin premium [`Dracma`](https://github.com/OverMine-Studios/Dracma), sin necesidad de acceder a su código fuente ni internals.  

Permite acceder de forma segura y controlada al sistema de monedas virtuales, usuarios y descuentos globales gestionados por Dracma.

---

## 🔧 ¿Cómo funciona?

Este proyecto **no es un plugin**, sino una **librería pública** (`.jar`) que puede ser añadida como dependencia a tus plugins.  
El plugin `Dracma` es el encargado de registrar la lógica real internamente al iniciar el servidor. Esta API solo actúa como puente.

---

## 📦 Requisitos

- Tener el plugin [`Dracma`](https://github.com/OverMine-Studios/Dracma) correctamente instalado en el servidor.
- Tu plugin debe declararlo como dependencia en `plugin.yml` usando `depend: [Dracma]`.
- Requiere Java 8+ y una versión de Spigot/Paper compatible con Dracma.

---

## ⚙️ Instalación
Agrega la dependencia a tu proyecto [`jitpack`](https://jitpack.io/#RisasDev/DracmaAPI)

## 💻 Ejemplo

```java
// Obtener monedas
int coins = DracmaAPI.get().getCurrency(uuid, "coins");

// Añadir monedas
DracmaAPI.get().addCurrency(uuid, "coins", 100);

// Establecer una cantidad fija
DracmaAPI.get().setCurrency(uuid, "coins", 500);

// Consultar descuentos globales
if (DracmaAPI.get().isGlobalDiscount()) {
    int porcentaje = DracmaAPI.get().getGlobalDiscount();
    player.sendMessage("¡Descuento activo del " + porcentaje + "%!");
}
