package view;

import java.util.Scanner ;public class Main {


    public Main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1:Show list Product");
        System.out.println("2:Create Product:");
        System.out.println("3:Sort Product:");
        int choiceMenu = scanner.nextInt();
        switch (choiceMenu){
            case 1:
                new ProductView().viewProduct();
                break;
            case 2:
                System.out.println("cri");
                break;
            case  3:
                new ProductView().sortProduct();
                break;
        }

    }

    public static void main(String[] args) {
        new Main();


    }

}