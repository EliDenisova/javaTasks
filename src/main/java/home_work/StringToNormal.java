package home_work;

public class StringToNormal {
    public static void main(String[] args) {

        stringToNormal("Добрый день Как дела Все хорошо");
    }

    static void stringToNormal(String str) {
        System.out.println(str);
        str = str.trim()
                .replaceAll("\\s+", " ")
                .replaceAll("\\s([А-ЯЁ])", ". $1") + ".";
        System.out.println(str);
    }
}
