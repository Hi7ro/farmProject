# Farm Simulation - Java Lernprojekt

Ein durchgehendes Übungsprojekt im Rahmen einer selbstgesteuerten Java/Spring-Boot-Backend-Ausbildung. Simuliert eine kleine Farm mit Tieren, die hungrig werden, gefüttert werden können und typspezifische Produkte erzeugen.

## Entstehung

Das Projekt startete ursprünglich als isolierte Übung (`BudgetRechner`) zu Grundlagenthemen wie Variablen, Datentypen und Kontrollstrukturen. Ab Tag 3 wurde stattdessen ein durchgehendes, thematisch zusammenhängendes Projekt gewählt - eine Farm-Simulation - um Konzepte nicht mehr isoliert, sondern im Kontext eines wachsenden Codebasis zu lernen.

Die Wahl fiel bewusst auf ein Szenario mit mehreren gleichartigen Entitäten (Tiere) und einem sich über Zeit verändernden Zustand (Hunger), weil sich daran typische Problemstellungen realistisch nachvollziehen lassen: Zustandsverwaltung, Datenstrukturen, später Objektorientierung und typspezifisches Verhalten.

## Aktueller Stand

Der Code hat sich schrittweise durch mehrere Entwicklungsstufen bewegt, jede bewusst als Lernschritt durchlaufen:

1. **Primitive Variablen** - je eine `int`-Variable pro Tier (`hungerCow`, `hungerChicken`, `hungerSheep`)
2. **Array** - Ablösung durch `int[] hungerLevels`, um Pass-by-Reference bei zustandsverändernden Methoden zu verstehen
3. **Erste Klasse** - `Animal` mit privaten Feldern, Konstruktor, Getter/Setter, Instanzmethoden (`increaseHunger()`, `feed()`)
4. **Collections** - `List<Animal>` statt einzelner benannter Objektvariablen, Iteration über `for-each`
5. **Vererbung** - `Animal` als `abstract class`, konkrete Unterklassen `Cow`, `Chicken`, `Sheep`
6. **Polymorphie** - typspezifische Produkte (`produce()`), aufgerufen über eine einheitliche `Animal`-Referenz, aufgelöst per dynamic dispatch

Funktional simuliert das Programm aktuell mehrere Tage/Zyklen: Der Hunger aller Tiere sinkt pro Zyklus, hungrige Tiere werden gefiltert und ausgegeben, jedes Tier zeigt sein Produkt an.

**In Arbeit:** Ablösung der `abstract`-Methode `produce()` durch ein separates `ProductProducer`-Interface, um "ist ein Tier" von "kann etwas produzieren" fachlich sauber zu trennen.

## Projektstruktur

```
farm/
├── src/
│   └── farm/
│       ├── Main.java
│       ├── Animal.java
│       ├── Cow.java
│       ├── Chicken.java
│       └── Sheep.java
├── bin/              (kompilierte Klassen, nicht versioniert)
├── .gitignore
└── README.md
```

## Ziel

Das Projekt ist als durchgehender roter Faden für die gesamte Backend-Ausbildung angelegt und soll parallel zum Lernfortschritt weiterwachsen, unter anderem um:

- **Exceptions** - eigene, fachlich sinnvolle Ausnahmen (z.B. beim Versuch, ein nicht existierendes Tier zu füttern)
- **Modern Java** - Streams/Lambdas statt klassischer Schleifen für Filter- und Aggregationslogik
- **Testing** - JUnit-Tests für die bestehende Geschäftslogik
- **Persistenz** - Umstieg von In-Memory-Objekten auf eine PostgreSQL-Datenbank via JPA/Hibernate
- **Spring Boot** - dieselbe Domäne (Tiere, Hunger, Produkte) als REST-API mit Endpoints wie `GET /animals`, `POST /animals/{id}/feed`
- **Security** - Authentifizierung/Autorisierung, sobald die API mehrbenutzerfähig wird
- **Docker/CI-CD** - containerisierte Bereitstellung inklusive automatisierter Tests

Langfristiges Ziel ist keine vollständige Produktanwendung, sondern ein Lern- und Portfolio-Projekt, das denselben fachlichen Kern über den gesamten Ausbildungsweg hinweg begleitet - von einer einzelnen `int`-Variable bis zu einer containerisierten, getesteten, gesicherten REST-API.