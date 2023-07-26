package com.ra.Exercise;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        Map<Integer, String[]> countryMap = new HashMap<>();

        /**
         *       *********************MENU*************************
         *      1.	Nhập danh sách gồm n quốc gia với Key tăng 1-n (Mã – Tên – Trạng thái)
         *      2.	Hiển thị danh sách quốc gia ra màn hình
         *      3.	Hiển thị danh sách sắp xếp tăng dần theo tên
         *      4.	Thoát
         * */

        Scanner scanner = new Scanner(System.in);

        int n = 0;
        while (true) {
            System.out.println("1.Nhập danh sách gồm n quốc gia");
            System.out.println("2.Hiển thị danh sách quốc gia ra màn hình");
            System.out.println("3.Hiển thị danh sách sắp xếp tăng dần theo tên");
            System.out.println(" 4.Thoát");
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Nhập số lượng quốc gia");
                    n = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0 ;i<n;i++){
                        System.out.println("Mã Quốc gia : " + i);
                        System.out.println("Tên Quốc Gia");
                        String name = scanner.nextLine();
                        System.out.println("Trạng Thái : ");
                        String status = scanner.nextLine();
                        countryMap.put(i,new String[] {name,status});
                    }
                    break;
                case 2:
                    System.out.println("Danh Sách Các Quốc gia");
                    for (Map.Entry<Integer,String[]> entry : countryMap.entrySet()) {
                        int key = entry.getKey();
                        String[] value = entry.getValue();
                        String name = value[0];
                        String status = value[1];
                        System.out.println("Mã Quốc Gia : " + key + " Tên Quốc Gia :" + name + " Trạng Thái :" + status);
                    }
                    break;
                case 3:
                    if (countryMap.isEmpty()){
                        System.out.println("Danh Sách Quốc Gia Trống");

                    } else {
                       List<Map.Entry<Integer,String[]>> entryList = new ArrayList<>(countryMap.entrySet());
                       Collections.sort(entryList, new Comparator<Map.Entry<Integer, String[]>>() {
                           @Override
                           public int compare(Map.Entry<Integer, String[]> o1, Map.Entry<Integer, String[]> o2) {
                               return o1.getValue()[0].compareTo(o2.getValue()[0]);
                           }
                       });
                        System.out.println("Danh Sách Các Quốc gia");
                        for (Map.Entry<Integer,String[]> entry : entryList) {
                            int key = entry.getKey();
                            String[] value = entry.getValue();
                            String name = value[0];
                            String status = value[1];
                            System.out.println("Mã Quốc Gia : " + key +
                                    " Tên Quốc Gia :" + name +
                                    " Trạng Thái :" + status);
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn sai chức năng");
            }

        }

    }

    static class Country  {
        private int id;
        private String countryName;
        private boolean Condition;

        public Country() {
        }

        public Country(int id, String countryName, boolean condition) {
            this.id = id;
            this.countryName = countryName;
            Condition = condition;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

        public boolean isCondition() {
            return Condition;
        }

        public void setCondition(boolean condition) {
            Condition = condition;
        }

        @Override
        public String toString() {
            return "Country{" +
                    "id=" + id +
                    ", countryName='" + countryName + '\'' +
                    ", Condition=" + Condition +
                    '}';
        }


    }
}
