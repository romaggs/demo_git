# demo_git

Цей репозиторій містить приклади для перших кроків у вивченні Java.

## Встановлення JDK та середовища розробки

1. Завантажте [Temurin JDK](https://adoptium.net/) або [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) (версія 17 або новіша).
2. Встановіть улюблене IDE чи редактор (наприклад, IntelliJ IDEA Community Edition або VS Code з розширенням "Extension Pack for Java").
3. Перевірте встановлення:
   ```bash
   java -version
   javac -version
   ```

## Приклади програм

У директорії `src` містяться приклади, що демонструють базові концепції мови:

- `Main.java` — точка входу з оглядом примітивних типів, операторів `if`/`switch`, циклів `for`/`while` та викликами допоміжних класів.
- `Calculator.java` — простий калькулятор, що підтримує додавання, віднімання, множення та ділення.
- `MultiplicationTable.java` — виведення таблиці множення для заданого числа.
- `ArrayProcessor.java` — базова обробка масивів (сума, середнє, максимум).
- `Person.java` — приклад класу з полями, конструктором і методами.

## Запуск

Скомпілюйте та запустіть приклади за допомогою JDK:

```bash
javac src/*.java
java -cp src Main
```
