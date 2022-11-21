# Задание

1. Найти полное собрание сочинений какого-нибудь автора в текстовом виде

2. Прочитать файл в строку

```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

...

public static String read(final String fileName) {
	String str = null;
	
	try {
		str = new String(Files.readAllBytes(Paths.get(fileName)));
	} catch (IOException e) {
		throw new RuntimeException(e);
	}
	
	return str;
}
```

3. Подсчитать количество вхождений в текст всех слов, которые в нем встречаются

4. Вывести:
	- Количество слов
	- Первые 100 наиболее встречающихся слов

5. Задание выполняется в паре, работая с общим GIT репозиторием,
	периодически отправляя изменения (оценка вклада в решение задачи будет происходить по статистике репозитория)

# Сравнение строк

Для сравнения (`>`, `<`, `=`) двух строк удобно использовать метод _compareToIgnoreCase_ класса _String_

```
String.compareToIgnoreCase

Следующие 2 строки находятся в лексикографическом порядке:
"автобус"
"автомобиль"

"автобус".compareToIgnoreCase("автомобиль")
< 0 (1-е слово предшествует ("меньше") 2-му)

"автомобиль".compareToIgnoreCase("АВТОМОБИЛЬ")
= 0 (совпадают (без учета регистра))

"автомобиль".compareToIgnoreCase("автобус")
> 0 (1-е слово следует ("больше") за 2-м )
```
