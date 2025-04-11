# Project Portfolio – Adrián Cano Tejero

This repository gathers a series of practical projects developed by **Adrián Cano Tejero**, combining web development and object-oriented programming.

---

## 1. `index.html` – Personal Web Page

A simple and well-structured webpage that serves as a personal introduction.

### Content:
- Full name and brief introduction.
- City of origin and completed studies.
- Link to Instagram profile.
- Hobbies section with images:
  - Sports (football, ping pong, gym)
  - Hanging out with friends
  - Going to the cinema
- Personal image at the end.

### Technologies used:
- HTML5
- Link to custom Google Fonts (Poppins).
- Link to external CSS file (`styles.css`).
- Use of semantic tags (`h1`, `h2`, `div`, `img`, `a`).

---

## 2. `styles.css` – Stylesheet

A stylesheet that enhances the visual appearance of the personal webpage.

### Main styles applied:
- Light sky-blue background with centered text and soft colors.
- Modern typography: Poppins, imported from Google Fonts.
- Themed colors:
  - `h1` titles in blue
  - `h2` titles in red
  - `h3` titles in light green
- Rounded images with shadow.
- Customized links with hover effect.
- Responsive design for small screens (under 600px).
- `.hobby` class organizes content and images in a row with defined spacing and styles.

---

## 3. `pooJs.js` – OOP Practice in JavaScript

A modern JavaScript (ES6) project demonstrating the use of classes, inheritance, and method overriding.

### Structure:
- Base class: `Vehicle`
  - Attributes: `brand`, `model`, `year`, `speed`
  - Methods: `accelerate()`, `brake()`, `details()`
- Subclasses:
  - `Car`: adds the `doors` attribute
  - `Motorcycle`: adds the `handlebarType` attribute
- Instances of `Car` and `Motorcycle` are created, and methods are used to simulate actions and display information.

### Technologies:
- JavaScript ES6
- Classes, inheritance, overridden methods, template strings

---

## 4. `pooJava.java` – OOP Practice in Java

The Java version of the previous project with an object-oriented structure.

### Structure:
- Base class: `Vehiculo`
  - Attributes: `marca`, `modelo`, `anio`, `velocidad`
  - Methods: `acelerar()`, `frenar()`, `detalles()`
- Derived classes:
  - `Auto`: adds `puertas`
  - `Moto`: adds `tipoManillar`
- Objects of both classes are created, their speeds are modified, and their features are printed.

### Technologies:
- Java
- Object-Oriented Programming
- Use of inheritance, `super`, and method overriding (`@Override`)

---

## 5. `juego.java` – Guess the Secret Number (Console Game)

An interactive console game where the user tries to guess one of the secret numbers.

### Features:
- Predefined secret numbers stored in an array.
- 3 attempts per game.
- User input validation (numbers between 1 and 20).
- Dynamic messages with `Thread.sleep()` and "clear screen" simulation.
- At the end of the game, it informs whether the user guessed correctly and displays the secret numbers.

### Technologies:
- Java
- Console, loops, conditions, arrays, exception handling (`try-catch`)

---

## Author

**Adrián Cano Tejero**  
Córdoba, Spain  
Technical Degree in Microcomputer Systems and Networks  

---

## License

This repository is distributed under the [MIT](https://opensource.org/licenses/MIT) license.

