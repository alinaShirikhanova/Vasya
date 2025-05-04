package l_02_05_2025;

public class Homework {
}

//🛠 10 задач с решениями
//Важно: все задачи ограничиваются темами: try–catch, multi-catch, finally, throws, FileNotFoundException, ArithmeticException, NullPointerException.
//
//Задача 1. Деление и обработка деления на ноль
//Условие: Напишите метод
//
//java
//Копировать
//Редактировать
//public static void safeDivide(int a, int b)
//который в try выводит a/b, а в catch (ArithmeticException) — сообщение "На ноль делить нельзя".
//
//Решение:
//
//java
//Копировать
//Редактировать
//public static void safeDivide(int a, int b) {
//    try {
//        System.out.println(a / b);
//    } catch (ArithmeticException ex) {
//        System.out.println("На ноль делить нельзя");
//    }
//}
//Задача 2. Обработка NullPointerException
//Условие: Метод
//
//java
//Копировать
//Редактировать
//public static void printLength(String s)
//выводит длину строки s.length(). Если s==null, ловить NullPointerException и выводить "Строка отсутствует".
//
//Решение:
//
//java
//Копировать
//Редактировать
//public static void printLength(String s) {
//    try {
//        System.out.println(s.length());
//    } catch (NullPointerException ex) {
//        System.out.println("Строка отсутствует");
//    }
//}
//Задача 3. Multi-catch для двух исключений
//Условие: Переписать задачу 1 и 2 в одном методе:
//
//java
//Копировать
//Редактировать
//public static void handle(String s, int a, int b)
//— и ловить одновременно ArithmeticException | NullPointerException, выводя:
//
//для ArithmeticException — "Деление: ошибка",
//
//для NullPointerException — "Строка: ошибка".
//
//Решение:
//
//java
//Копировать
//Редактировать
//public static void handle(String s, int a, int b) {
//    try {
//        System.out.println("Длина строки: " + s.length());
//        System.out.println("Результат деления: " + (a / b));
//    } catch (ArithmeticException | NullPointerException ex) {
//        if (ex instanceof ArithmeticException) {
//            System.out.println("Деление: ошибка");
//        } else {
//            System.out.println("Строка: ошибка");
//        }
//    }
//}
//Задача 4. Чтение файла с повторной попыткой
//Условие: Метод main должен:
//
//Прочитать имя файла с консоли.
//
//В try вызвать readFile(fileName) (метод бросает FileNotFoundException).
//
//В catch вывести "Файл не найден, попробуйте снова", читать новое имя и ещё раз вызвать readFile.
//
//Решение:
//
//java
//Копировать
//Редактировать
//public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    String fileName = in.nextLine();
//    try {
//        readFile(fileName);
//    } catch (FileNotFoundException e) {
//        System.out.println("Файл не найден, попробуйте снова");
//        fileName = in.nextLine();
//        try {
//            readFile(fileName);
//        } catch (FileNotFoundException ex) {
//            System.out.println("Всё равно не нашли файл");
//        }
//    }
//}
//
//public static void readFile(String filename) throws FileNotFoundException {
//    new FileReader(filename);
//}
//Задача 5. Блок finally для закрытия ресурса
//Условие: Из задачи 4: после попыток чтения файла в любом случае вывести "Завершение работы" в блоке finally.
//
//Решение:
//
//java
//Копировать
//Редактировать
//try {
//    readFile(fileName);
//} catch (FileNotFoundException e) {
//    System.out.println("Файл не найден");
//} finally {
//    System.out.println("Завершение работы");
//}
//Задача 6. Проброс исключения в сигнатуре
//Условие: Напишите метод
//
//java
//Копировать
//Редактировать
//public static void openFile(String name)
//который внутри создаёт new FileReader(name) и не обрабатывает исключение, а объявляет throws FileNotFoundException.
//
//Решение:
//
//java
//Копировать
//Редактировать
//public static void openFile(String name) throws FileNotFoundException {
//    new FileReader(name);
//}
//Задача 7. Пропагирование NullPointerException
//Условие: Метод
//
//java
//Копировать
//Редактировать
//public static void callLength(String s)
//должен вызывать s.length() без try–catch. Что произойдёт, если передать null? (Напишите краткий комментарий.)
//
//Решение:
//
//java
//Копировать
//Редактировать
//public static void callLength(String s) {
//    // если s==null, JVM бросит NullPointerException,
//    // и, раз мы его не ловим, оно «пойдет» выше по стеку
//    System.out.println(s.length());
//}
//Задача 8. Вложенные try
//Условие: Напишите два вложенных try:
//
//Внутренний делит на ноль и ловит ArithmeticException.
//
//Внешний — читает файл и ловит FileNotFoundException.
//
//Решение:
//
//java
//Копировать
//Редактировать
//try {
//    try {
//        System.out.println(1 / 0);
//    } catch (ArithmeticException e) {
//        System.out.println("Деление на ноль во внутреннем блоке");
//    }
//
//    new FileReader("nonexistent.txt");
//} catch (FileNotFoundException e) {
//    System.out.println("Внешний catch: файл не найден");
//}
//Задача 9. Общий catch (Exception e)
//Условие: Оберните в try код:
//
//java
//Копировать
//Редактировать
//Integer x = null;
//System.out.println(x.compareTo(0));
//и в одном блоке catch (Exception e) отловите любое исключение, выведите "Ошибка выполнения".
//
//Решение:
//
//java
//Копировать
//Редактировать
//try {
//    Integer x = null;
//    System.out.println(x.compareTo(0));
//} catch (Exception e) {
//    System.out.println("Ошибка выполнения");
//}
//Задача 10. Что выведет метод с finally?
//Условие: Раскомментируйте и вставьте в класс:
//
//java
//Копировать
//Редактировать
//public static int ex(){
//    try {
//        return 7;
//    } catch (Exception e) {
//        return 9;
//    } finally {
//        return 10;
//    }
//}
//Что вернёт ex()?
//
//Решение:
//
//Метод всегда вернёт 10, потому что finally выполняется после return в try/catch и перезаписывает его.
//
//❓ 10 вопросов с развернутыми ответами
//Что такое checked и unchecked исключения?
//Ответ:
//
//Checked-исключения (наследники Exception, кроме RuntimeException) компилятор требует либо перехватить через try–catch, либо объявить в сигнатуре метода через throws. Они отражают ожидаемые проблемы (файлы, сети и т.д.).
//
//Unchecked-исключения (наследники RuntimeException) компилятор не требует обрабатывать. Они сигнализируют о логических ошибках в коде (деление на ноль, NPE и т.д.).
//
//Почему порядок блоков catch важен?
//Ответ:
//При нескольких catch компилятор и рантайм ищут первый совпадающий тип. Если сначала поставить catch(Exception), он «перехватит» все исключения, и более специфичные блоки никогда не сработают. Поэтому сначала — узкие типы (ArithmeticException), потом — широкий (Exception).
//
//Как работает throws в сигнатуре метода?
//Ответ:
//Ключевое слово throws объявляет, что метод может «пробросить» одно или несколько checked-исключений своим вызывающим. Вызывающий код обязан либо поймать эти исключения в try–catch, либо тоже объявить их через throws.
//
//Чем отличается throw от throws?
//Ответ:
//
//throw используется внутри метода, чтобы явно выбросить экземпляр исключения: throw new IllegalArgumentException("…");.
//
//throws идёт в объявлении метода и не выбрасывает исключение, а лишь декларирует, какие типы исключений метод может бросить.
//
//Что происходит, если в try есть return, но также есть блок finally?
//Ответ:
//Java сначала вычислит значение для return в try, затем выполнит блок finally, и, если в нём тоже есть return, именно он определит окончательный результат. Если в finally нет return, то метод вернёт значение из try/catch.
//
//Можно ли «поймать» Throwable?
//Ответ:
//Да, catch (Throwable t) перехватывает всё: и исключения (Exception), и ошибки (Error). Но это плохая практика: Error (OOM, StackOverflowError) сигнализирует об критических проблемах JVM, их обычно не обрабатывают.
//
//Как объединённый catch (A | B ex) компилируется?
//Ответ:
//При multi-catch компилятор генерирует два отдельных catch под капотом, но код внутри можно писать один раз. Переменная ex считается final внутри тела блока.
//
//Что за исключение бросит new FileReader("no.txt")?
//Ответ:
//FileReader при отсутствии файла бросает FileNotFoundException — это checked-исключение, поэтому конструктор требует обработки или объявления через throws.
//
//Как исключение «поднимается» по стеку вызовов?
//Ответ:
//Если метод A вызвал B, B — C; и в C возникло непойманное исключение, оно «прыгает» вверх: сначала в B (если там есть catch), потом — в A. Если не поймать нигде, JVM завершит программу и напечатает stack trace.
//
//Зачем нужен блок finally и когда он не выполнится?
//Ответ:
//
//finally гарантированно выполняется после try/catch, даже если внутри них были return или при перехвате/неперехвате исключения.
//
//Не выполнится только в двух случаях: если JVM «упадёт» (например, System.exit() в try/catch, или фатальная ошибка OutOfMemoryError до входа в finally).
//
//Эти материалы охватывают только изученные вами темы: обработка исключений (try–catch, multi-catch, finally), типы исключений (checked vs unchecked), проброс через throws, и работу с FileNotFoundException. Клиенту остаётся только выполнить проверку и при необходимости распечатать!
//
//Вы сказали:
//Перепиши теорию в следующем порядке
//В программе иногда возникают исключительные ситуации (иногда это критические ошибки, а иногда исключительные ситуации, которые мы можем обработать)
//Тут рассказать про иерархию исключений (схематично можно)
//Показать что ошибка по цепочке останавливает все методы
//
//Ошибки обрабатывать не надо, а вот исключения можно перехватывать
//(тут про блок try catch)
//ЧТо не обязательно перехватывать ошику в методе где она возникла, можно в другом который по цепочке поймает его
//Тут же расскажи про multi catch блок и про объединенный (и в каких случаях это целесообразно)
//ПРо блок finally
//Обрати внимание что Exception обычно не перехватывают
//И почему если написать первым блок который перехватывает exception это будет ошибкоц компиляции
//
//расскажи про checked uncheked exceptions
//
//

