package management.test;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller();

        while(true) {

            System.out.println();
            System.out.println(" ========== JAVA24 편의점 발주 관리 시스템 ========== ");
            System.out.println(" 1. 발주 상품 등록 ");
            System.out.println(" 2. 발주 상품 조회 ");
            System.out.println(" 3. 발주 상품 수정 ");
            System.out.println(" 4. 발주 상품 삭제 ");
            System.out.println(" 5. 전체 발주 목록 조회 ");
            System.out.println(" 0. 프로그램 종료 ");
            System.out.println(" ==================================================== ");
            System.out.print(" 실행 원하시는 메뉴의 번호를 입력해주세요 : ");

            int num = sc.nextInt();
            sc.nextLine();  // 버퍼 비워주기 잊지말걸아~

            switch(num) {
                case 1:
                    System.out.println();
                    System.out.println(" ========== 메뉴 > 1. 발주 상품 등록 ========== ");
                    System.out.print(" 등록하실 상품의 이름을 적어주세요 : ");
                    String productName = sc.nextLine();
                    System.out.print(" 등록하실 상품의 코드를 적어주세요 : ");
                    String productCode = sc.nextLine();
                    System.out.print(" 등록하실 상품의 가격을 적어주세요 : ");
                    int price = sc.nextInt();
                    System.out.print(" 등록하실 상품의 개수를 적어주세요 : ");
                    int productNumber = sc.nextInt();
                    System.out.print(" 등록하실 상품이 냉동 식품인지 아닌지 선택해주세요 (true / false) : ");
                    boolean isFreeze = sc.nextBoolean();

                    System.out.println();
                    controller.addProduct(productName, productCode, price, productNumber,isFreeze);

                    break;
                case 2:
                    System.out.println();
                    System.out.println(" ========== 메뉴 > 2. 발주 상품 조회 ========== ");
                    System.out.print(" 등록한 상품의 코드를 적어주세요 : ");
                    String productCode2 = sc.nextLine();

                    System.out.println();
                    controller.getProduct(productCode2);

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    System.out.println();
                    System.out.println( " ========== 시스템 종료 ========== ");
                    return;
                default:


            }
        }

    }
}
