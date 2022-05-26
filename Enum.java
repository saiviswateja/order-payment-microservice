 class Parent {
    public Parent(String s) {
        System.out.println("A");
    }
    Parent() {

    }
}


class Enum {
    public static void main(String[] args) {
        int i = 200;
        int n = 80;
        int count = 0;
        while(i>=n) {
            count++;
            i = i-2;
            n = n+1;
        }
        System.out.println(count);
    }
}
