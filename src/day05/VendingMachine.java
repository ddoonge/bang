package day05;

public class VendingMachine {
    public String pushProductButton(int menuId) {
        String result;
        switch (menuId) {
            case 1:
                result = "콜라";
                break;
            case 2:
                result = "사이다";
                break;
            case 3:
                result = "환타";
                break;
            default:
                result = "유효하지 않음";
                break;
        }
        return result;
    }
}

