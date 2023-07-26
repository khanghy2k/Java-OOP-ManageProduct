package com.ra.Exercise;


import java.util.*;


public class Ex2 {
    public static void main(String[] args) {


        /***
         * Tạo class Provider gồm:
         *      - String providerId;
         *      - String providerName;
         *      - boolean status;
         * Tạo class Computer gồm:
         *      - String computerId;
         *      - String model;
         *      - double price;
         *      - Provider provider;
         *      - boolean status;
         * Tạo đầy đủ get/set constructor và các phương thức cần thiết cho 2 class trên.
         * Viết chương trình thực hiện các yêu cầu sau:
         * =================== MENU ===================
         *      1. Quản lý nhà cung cấp
         *      2. Quản lý sản phẩm
         *      3. Thoát
         * Khi chọn chức năng 1, vào menu "Quản lý nhà cung cấp":
         * =========== Quản lý nhà cung cấp ===========
         *      1. Thêm nhà cung cấp
         *      2. Hiển thị danh sách nhà cung cấp (sắp xếp theo tên A-Z)
         *      3. Quay lại (quay về "MENU")
         * Khi chọn chức năng 2, vào menu "Quản lý sản phẩm":
         * ============= Quản lý sản phẩm =============
         *      1. Thêm sản phẩm (nhà cung cấp được chọn từ danh sách NCC đã thêm)
         *      2. Hiển thị danh sách sản phẩm theo model A-Z
         *      3. Cập nhật thông tin sản phẩm (tìm sp cập nhật theo mã)
         *      4. Xóa sản phẩm theo mã
         *      5. Quay lại (quay về "MENU")
         */
        Scanner scanner = new Scanner(System.in);
        List<providerId> providerList = new ArrayList<>();
        List<Computer> computerList = new ArrayList<>();
        while (true) {
            System.out.println("=================== MENU ===================");
            System.out.println("1. Quản lý nhà cung cấp");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát");
            System.out.println("============================================");
            System.out.print("Chọn chức năng (1/2/3): ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    manageProviders(providerList, scanner);
                    break;
                case 2:
                    manageComputers(providerList, computerList, scanner);
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Chọn sai chức năng");

            }
        }
    }

    public static void manageProviders(List<providerId> providerList, Scanner scanner) {
        while (true) {
            System.out.println("============ Quản lý nhà cung cấp ============");
            System.out.println("1. Thêm nhà cung cấp");
            System.out.println("2. Hiển thị danh sách nhà cung cấp (sắp xếp theo tên A-Z)");
            System.out.println("3. Quay lại (quay về MENU)");
            System.out.println("=============================================");
            System.out.print("Chọn chức năng (1-3): ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Nhập Mã nhà cung cấp : ");
                    String providerId = scanner.nextLine();
                    System.out.println("Nhập Tên Nhà Cung Cấp : ");
                    String providerName = scanner.nextLine();
                    System.out.println("Nhập Trạng Thái (True/False) : ");
                    boolean status = scanner.nextBoolean();
                    scanner.nextLine();
                    providerId provider = new providerId(providerId, providerName, status);
                    providerList.add(provider);
                    System.out.println("Thêm nhà cung cấp thành công.");
                    break;
                case 2:
                    if (providerList.isEmpty()) {
                        System.out.println("Danh Sách Nhà Cung Cấp Trống");
                    } else {
                        Collections.sort(providerList, new Comparator<providerId>() {
                            @Override
                            public int compare(providerId o1, providerId o2) {
                                return o1.getProviderName().compareTo(o2.getProviderName());
                            }
                        });
                        System.out.println("Danh Sách Sau Khi Sắp Xếp Theo A-Z");
                        for (providerId b : providerList
                        ) {
                            System.out.println("Mã Nhà Cung Cấp : " + b.getProviderId() + " | " +
                                    "Tên Nhà Cung Cấp : " + b.getProviderName() + " | "
                                    + "Trạng Thái : " + b.isStatus()
                            );
                        }
                    }

                    break;
                case 3:
                    return;
                default:
                    System.out.println("Chọn sai chức năng");
            }
        }

    }

    public static void manageComputers(List<providerId> providerList, List<Computer> computerList, Scanner scanner) {
        while (true) {
            System.out.println("============  Quản lý sản phẩm ============");
            System.out.println(" 1. Thêm sản phẩm (nhà cung cấp được chọn từ danh sách NCC đã thêm)");
            System.out.println(" 2. Hiển thị danh sách sản phẩm theo model A-Z");
            System.out.println(" 3. Cập nhật thông tin sản phẩm (tìm sp cập nhật theo mã)");
            System.out.println(" 4. Xóa sản phẩm theo mã");
            System.out.println(" 5.Quay Trở Lại Menu");
            System.out.println("=============================================");
            System.out.print("Chọn chức năng (1-5): ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    if (providerList.isEmpty()) {
                        System.out.println("Danh Sách Nhà Cung Cấp Trống");
                    } else {
                        System.out.println("Danh sách nhà cung cấp:");
                        for (providerId p : providerList
                        ) {
                            System.out.println(" Mã Nhà Cung Cấp " + p.getProviderId() + " | " +
                                    "Tên Nhà Cung Cấp " + p.getProviderName() + " | " +
                                    "Trạng Thái " + p.isStatus());
                        }
                        System.out.println("Chọn mã nhà cung cấp để thêm sản phẩm");
                        String _providerId = scanner.nextLine();
                        providerId selectedProvider = null;
                        for (providerId p : providerList
                        ) {
                            if (p.getProviderId().equals(_providerId)) {
                                selectedProvider = p;
                                break;
                            }
                        }
                        if (selectedProvider == null) {
                            System.out.println("Không tìm thấy nhà cung cấp với mã vừa chọn");
                        } else {
                            System.out.println("Nhập Mã Sản Phẩm : ");
                            String computerId = scanner.nextLine();
                            System.out.println("Nhập mẫu : ");
                            String model = scanner.nextLine();
                            System.out.println("Nhập giá sản phẩm: ");
                            double price = scanner.nextDouble();
                            System.out.println("Nhập Trạng Thái (True/False) : ");
                            boolean status = scanner.nextBoolean();
                            scanner.nextLine();

                            Computer computer = new Computer(computerId, model, price, selectedProvider, status);
                            computerList.add(computer);
                            System.out.println("Thêm sản phẩm mới thành công");
                        }
                    }
                    break;
                case 2:
                    if (computerList.isEmpty()) {
                        System.out.println("Danh Sách Sản Phẩm Trống");
                    } else {
                        Collections.sort(computerList, new Comparator<Computer>() {
                            @Override
                            public int compare(Computer o1, Computer o2) {
                                return o1.getModel().compareTo(o2.getModel());
                            }
                        });
                        System.out.println("Danh Sách Sau Khi Sắp Xếp");
                        for (Computer c : computerList
                        ) {
                            providerId providerId = c.getProvider();
                            System.out.println(" Mã Sản Phẩm " + c.getComputerId() + " | " + " Mẫu " + c.getModel() + " | " + " Giá " + c.getPrice() + " | " + " Nhà Cung Cấp " + providerId.getProviderName() + " | " + " Trạng Thái " + c.isStatus());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Nhập mã sản phẩm cần chỉnh sửa : ");
                    String _edit = scanner.nextLine();
                    computerList.stream().filter(x -> x.getComputerId().equals(_edit)).findFirst()
                            .ifPresent(computer -> {
                                System.out.println("Nhập mẫu : ");
                                String model = scanner.nextLine();
                                System.out.println("Nhập giá sản phẩm: ");
                                double price = scanner.nextDouble();
                                System.out.println("Nhập Trạng Thái (True/False) : ");
                                boolean status = scanner.nextBoolean();
                                scanner.nextLine();
                                Computer computerEdit = new Computer(_edit, model, price, computer.getProvider(),status);
                                int index = computerList.indexOf(computer);
                                if (index != -1 ){
                                    computerList.set(index,computerEdit);
                                    System.out.println("Chỉnh sửa thông tin thành công");
                                } else {
                                    System.out.println("Không tìm thấy mã sản phẩm " + _edit);
                                }
                            });
                    break;
                case 4:
                    if (computerList.isEmpty()) {
                        System.out.println("Danh Sách Sản Phẩm Trống");
                    } else {
                        System.out.println("Nhập Mã Sản Phẩm Cần Xóa");
                        String _delete = scanner.nextLine();
                        computerList.stream().filter(x -> x.getComputerId().equals(_delete)).findFirst()
                                .ifPresent(computer -> {
                                    System.out.println("Xóa Sản Phầm Có Mã " + _delete);
                                    computerList.remove(computer);
                                });
                        System.out.println("Xóa Thành Công");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Chọn Sai Chức Năng");

            }
        }

    }
}
