public class Hw4 {
    // 1. Write a function that prints "Hello World" n times recursively.
    static void printHello(int n) {
        if(n==0){
            System.out.println("Done");
        } else {
            System.out.println("Hello World");
            printHello(n -1);
        }
    }

    // 2. Write a function that returns the sum of all numbers between n1 and n2 that are multiples of 7 using recursion.
    static int sumOfSeven(int n1, int n2) {
        if(n1 == n2 ){
            return n1;
        } else {
            if(n1 %7 == 0) {
                return n1 + sumOfSeven(n1 + 1, n2);
                } else {
                return sumOfSeven(n1 + 1, n2);
            }
        }
    }

    // 3. Write a function that implements the binary search algorithm recursively
    static int searchBinaryRecur(int[] a, int s, int e, int x) {
        if (e >= s && e <= a.length) {
            int m = s + (e - 1) / 2;
            if (a[m] == x) {
                return a[m];
            } else {
                if (a[m] > x) {
                    return searchBinaryRecur(a, s, m - 1, x);
                } else if (a[m] < x) {
                    return searchBinaryRecur(a, m + 1, e, x);
                }
            }
        }
        return -1;
    }

    // sorts array
    static void sortArray(int[] a, int size) {
        int outer, inner, temp;
        for(outer = size-1; outer > 0; outer--) {
            for(inner = 0; inner < outer; inner++) {
                if(a[inner] > a[inner + 1]) {
                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // 1
        printHello(5);

        //2
        System.out.println();
        System.out.println(sumOfSeven(7,21));

        //3
        System.out.println();
        int [] array = {2,1,5,17,10,25};
        int size = array.length;
        sortArray(array,size);
        System.out.println(searchBinaryRecur(array,0, size, 17));
    }
}
