package management.test;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller();

        while (true) {

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

            switch (num) {
                case 1:
                    System.out.println();
                    System.out.println(" ========== 메뉴 > 1. 발주 상품 등록 ========== ");
                    System.out.print(" 등록하실 상품의 이름을 입력해주세요 : ");
                    String productName = sc.nextLine();
                    System.out.print(" 등록하실 상품의 코드를 입력해주세요 : ");
                    String productCode = sc.nextLine();
                    System.out.print(" 등록하실 상품의 가격을 입력해주세요 : ");
                    int price = sc.nextInt();
                    System.out.print(" 등록하실 상품의 개수를 입력해주세요 : ");
                    int productNumber = sc.nextInt();
                    System.out.print(" 등록하실 상품이 냉동 식품인지 아닌지 입력해주세요 (true / false) : ");
                    boolean isFreeze = sc.nextBoolean();

                    System.out.println();
                    controller.addProduct(productName, productCode, price, productNumber, isFreeze);
                    break;
                case 2:
                    System.out.println();
                    System.out.println(" ========== 메뉴 > 2. 발주 상품 조회 ========== ");
                    System.out.print(" 등록한 상품의 코드를 입력해주세요 : ");
                    String productCode2 = sc.nextLine();

                    System.out.println();
                    controller.getProduct(productCode2);
                    break;
                case 3:
                    System.out.println();
                    System.out.println(" ========== 메뉴 > 3. 발주 상품 수정 ========== ");
                    System.out.print(" 수정할 상품의 코드를 입력해주세요 : ");
                    String productCode9 = sc.nextLine();
                    // 상품 코드를 적어서 맞아서 일치하면
                    // 또 수정을 원하는 번호를 매기기 (이름, 코드, 가격, 개수, 냉동여부)
                    // 번호 선택 입력 받기
                    // 수정 원하는 이름 입력 받기
                    // 수정 완료
                    while (true) {
                        System.out.println();
                        System.out.println(" ========== 메뉴 > 3. 발주 상품 수정 ========== ");
                        System.out.println(" 1. 상품 이름 ");
                        System.out.println(" 2. 상품 코드 ");
                        System.out.println(" 3. 상품 가격 ");
                        System.out.println(" 4. 상품 개수 ");
                        System.out.println(" 5. 상품 냉동 여부 ");
                        System.out.println(" 0. 뒤로가기 ");
                        System.out.println(" ============================================== ");
                        System.out.print(" 수정을 원하시는 메뉴를 입력해주세요 : ");

                        int num2 = sc.nextInt();
                        sc.nextLine();

                        switch (num2) {
                            case 1:
                                System.out.println();
                                System.out.println(" ========== 메뉴 > 3. 발주 상품 수정 ========== ");
                                System.out.print(" 수정할 상품의 코드를 입력해주세요 : ");
                                String productCode3 = sc.nextLine();
                                System.out.print(" 새로운 상품의 이름을 입력해주세요 : ");
                                String productName1 = sc.nextLine();

                                System.out.println();
                                controller.setProductName(productCode9, productCode3, productName1);
                                break;
                            case 2:
                                System.out.println();
                                System.out.println(" ========== 메뉴 > 3. 발주 상품 수정 ========== ");
                                System.out.print(" 수정할 상품의 코드를 입력해주세요 : ");
                                String productCode4 = sc.nextLine();
                                System.out.print(" 새로운 상품의 코드를 입력해주세요 : ");
                                String productCode5 = sc.nextLine();

                                System.out.println();
                                controller.setProductCode(productCode9, productCode4, productCode5);
                                break;
                            case 3:
                                System.out.println();
                                System.out.println(" ========== 메뉴 > 3. 발주 상품 수정 ========== ");
                                System.out.print(" 수정할 상품의 코드를 입력해주세요 : ");
                                String productCode6 = sc.nextLine();
                                System.out.print(" 새로운 상품의 가격을 입력해주세요 : ");
                                int price1 = sc.nextInt();

                                System.out.println();
                                controller.setPrice(productCode9, productCode6, price1);
                                break;
                            case 4:
                                System.out.println();
                                System.out.println(" ========== 메뉴 > 3. 발주 상품 수정 ========== ");
                                System.out.print(" 수정할 상품의 코드를 입력해주세요 : ");
                                String productCode7 = sc.nextLine();
                                System.out.print(" 새로운 상품의 개수를 입력해주세요 : ");
                                int productNumber1 = sc.nextInt();

                                System.out.println();
                                controller.setProductNumber(productCode9, productCode7, productNumber1);
                                break;
                            case 5:
                                System.out.println();
                                System.out.println(" ========== 메뉴 > 3. 발주 상품 수정 ========== ");
                                System.out.print(" 수정할 상품의 코드를 입력해주세요 : ");
                                String productCode8 = sc.nextLine();
                                System.out.print(" 새로운 상품의 냉동 여부를 입력해주세요 (true / false) : ");
                                boolean isFreeze2 = sc.nextBoolean();

                                System.out.println();
                                controller.setFreeze(isFreeze2, productCode8, productCode9);
                                break;
                            case 0:
                                System.out.println();
                                System.out.println(" ---------- 발주 상품 수정 취소 ---------- ");
                                break;
                            default:
                                System.out.println();
                                System.out.println(" 잘못된 입력입니다. ");

                        } break;
                    }
                    break;

                case 4:
                    System.out.println();
                    System.out.println(" ========== 메뉴 > 4. 발주 상품 삭제 ========== ");
                    System.out.print(" 삭제할 상품의 코드를 입력해주세요 : ");
                    String productCode10 = sc.nextLine();

                    System.out.println();
                    controller.deleteProduct(productCode10);
                    break;
                case 5:
                    System.out.println();
                    System.out.println(" ========== 메뉴 > 5. 발주 상품 전체 조회 ========== ");

                    controller.getAllProduct();
                    System.out.println();
                    break;
                case 0:
                    System.out.println();
                    System.out.println(" ========== 시스템 종료 ========== ");
                    return;
                default:
                    System.out.println(" 잘못된 입력입니다. ");

            }


        }
    }
}
