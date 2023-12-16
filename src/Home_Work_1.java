public class Home_Work_1 {
    /*  Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
        Реализует логический метод canBuy,  возвращающий boolean
        Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
        Отобразите строку «Я могу купить еду, это ……» и значение. */

    public static void main(String[] args) {
        boolean isEdekaOpen = false;
        boolean isReweOpen = false;

        canBuy(isEdekaOpen, isReweOpen);
    }

    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        if (isEdekaOpen == true && isReweOpen == true) {
            System.out.println("Я могу купить еду, в Edeka или Rewe");
            return true;
        } else if (isEdekaOpen == true && isReweOpen == false) {
            System.out.println("Я могу купить еду, в Edeka");
            return true;
        } else if (isEdekaOpen == false && isReweOpen == true) {
            System.out.println("Я могу купить еду, в Rewe");
            return true;
        } else {
            System.out.println("Всё закрыто!");
        }
        return false;
    }
}