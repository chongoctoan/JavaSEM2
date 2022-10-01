package session6;

public class Main {
    public static void main(String[] args){
      try {
          int x = 10;
          int y = 0;
          if (y == 0){
              throw new NullPointerException();
          }
          System.out.println(x + ":" + y + "=");
          int z = x / y;
          System.out.println(z);
      }catch (ArithmeticException ae) {
          //ngoại lệ toán học
          System.out.println("Tính toán sai rồi xem lại đi");
      }catch (NullPointerException n){
          System.out.println("Null..");
      }catch (Exception e){
          System.out.println("Lỗi rồi xem lại đi");
      }finally {
          //lúc nào cx chạy qua đây
      }
    }
}
