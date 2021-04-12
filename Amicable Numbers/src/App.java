import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String choice;
        
        
        // A=75000000 repetitions

        int A=75000000;

        System.out.println("Hello, please select number of threads");
        Scanner sc = new Scanner(System.in);
        choice = sc.next();

        // threads menu

        while (choice != "quit") {
            choice = sc.next();
            switch (choice) {
            case "1":
                System.out.println("you have selected 1 thread");
                long tStart = System.currentTimeMillis();
                ThreadCreator t0 = new ThreadCreator(1, A);
                t0.start();
                try {
                    t0.join();
                } catch (Exception e) {
                    // TODO: handle exception
                }
                long tEnd = System.currentTimeMillis();
                System.out.println("time \n " + (tEnd - tStart));
                break;
            case "2":
                System.out.println("you have selected 2 thread");
                tStart = System.currentTimeMillis();
                ThreadCreator t1 = new ThreadCreator(1, A/2);
                ThreadCreator t2 = new ThreadCreator((A/2)+1, A);
                t1.start();
                t2.start();

                try {
                    t1.join();
                    t2.join();

                } catch (Exception e) {
                    // TODO: handle exception
                }
                tEnd = System.currentTimeMillis();
                System.out.println("time \n " + (tEnd - tStart));
                break;
            case "3":
                System.out.println("you have selected 3 thread");
                tStart = System.currentTimeMillis();
                ThreadCreator t3 = new ThreadCreator(1, A/3);
                ThreadCreator t4 = new ThreadCreator((A/3)+1, 2*A/3);
                ThreadCreator t5 = new ThreadCreator((2*A/3)+1, A);
                t3.start();
                t4.start();
                t5.start();
                try {
                    t3.join();
                    t4.join();
                    t5.join();

                } catch (Exception e) {
                    // TODO: handle exception
                }
                tEnd = System.currentTimeMillis();
                System.out.println("time \n " + (tEnd - tStart));

                break;
            case "4":
                System.out.println("you have selected 4 thread");
                tStart = System.currentTimeMillis();
                ThreadCreator t6 = new ThreadCreator(1, A/4);
                ThreadCreator t7 = new ThreadCreator((A/4)+1, 2*A/4);
                ThreadCreator t8 = new ThreadCreator((2*A/4)+1, 3*A/4);
                ThreadCreator t9 = new ThreadCreator((3*A/4)+1, A);
                t6.start();
                t7.start();
                t8.start();
                t9.start();

                try {
                    t6.join();
                    t7.start();
                    t8.start();
                    t9.start();
                } catch (Exception e) {
                    // TODO: handle exception
                }
                tEnd = System.currentTimeMillis();
                System.out.println("time \n " + (tEnd - tStart));

                break;
            case "5":
                System.out.println("you have selected 5 thread");
                tStart = System.currentTimeMillis();
                ThreadCreator t10 = new ThreadCreator(1, A/5);
                ThreadCreator t11 = new ThreadCreator((A/5) +1, 2*A/5);
                ThreadCreator t12 = new ThreadCreator((2*A/5)+1, 3*A/5);
                ThreadCreator t13 = new ThreadCreator((3*A/5)+1, 4*A/5);
                ThreadCreator t14 = new ThreadCreator((4*A/5)+1, A);
                t10.start();
                t12.start();
                t12.start();
                t13.start();
                t14.start();

                try {
                    t10.join();
                    t11.join();
                    t12.join();
                    t13.join();
                    t14.join();
                } catch (Exception e) {
                    // TODO: handle exception
                }
                tEnd = System.currentTimeMillis();
                System.out.println("time \n " + (tEnd - tStart));

                break;
            case "6":
                System.out.println("you have selected 6 thread");
                tStart = System.currentTimeMillis();
                ThreadCreator t15 = new ThreadCreator(1, A/6);
                ThreadCreator t16 = new ThreadCreator((A/6)+1, 2*A/6);
                ThreadCreator t17 = new ThreadCreator((2*A/6)+1, 3*A/6);
                ThreadCreator t18 = new ThreadCreator((3*A/6)+1, 4*A/6);
                ThreadCreator t19 = new ThreadCreator((4*A/6)+1, 5*A/6);
                ThreadCreator t20 = new ThreadCreator((5*A/6), A);

                t15.start();
                t16.start();
                t17.start();
                t18.start();
                t19.start();
                t20.start();

                try {
                    t15.join();
                    t16.join();
                    t17.join();
                    t18.join();
                    t19.join();
                    t20.join();

                } catch (Exception e) {
                    // TODO: handle exception
                }

                tEnd = System.currentTimeMillis();
                System.out.println("time \n " + (tEnd - tStart));

                break;
            case "7":
                System.out.println("you have selected 7 thread");
                tStart = System.currentTimeMillis();
                ThreadCreator t21 = new ThreadCreator(1, A/7);
                ThreadCreator t22 = new ThreadCreator((A/7)+1, 2*A/7);
                ThreadCreator t23 = new ThreadCreator((2*A/7)+1, 3*A/7);
                ThreadCreator t24 = new ThreadCreator((3*A/7)+1, 4*A/7);
                ThreadCreator t25 = new ThreadCreator((4*A/7)+1, 5*A/7);
                ThreadCreator t26 = new ThreadCreator((5*A/7)+1, 6*A/7);
                ThreadCreator t27 = new ThreadCreator((6*A/7)+1, A);

                t21.start();
                t22.start();
                t23.start();
                t24.start();
                t25.start();
                t26.start();
                t27.start();

                try {
                    t21.join();
                    t22.join();
                    t23.join();
                    t24.join();
                    t25.join();
                    t26.join();
                    t27.join();

                } catch (Exception e) {
                    // TODO: handle exception
                }
                tEnd = System.currentTimeMillis();
                System.out.println("time \n " + (tEnd - tStart));
                break;
            case "8":
                System.out.println("you have selected 8 thread");
                tStart = System.currentTimeMillis();
                ThreadCreator t28 = new ThreadCreator(1, A/8);
                ThreadCreator t29 = new ThreadCreator((A/8)+1, 2*A/8);
                ThreadCreator t30 = new ThreadCreator((2*A/8)+1,3*A/8);
                ThreadCreator t31 = new ThreadCreator((3*A/8)+1, 4*A/8);
                ThreadCreator t32 = new ThreadCreator((4*A/8)+1, 5*A/8);
                ThreadCreator t33 = new ThreadCreator((5*A/8)+1, 6*A/8);
                ThreadCreator t34 = new ThreadCreator((6*A/8)+1, 7*A/8);
                ThreadCreator t35 = new ThreadCreator((7*A/8)+1, A);

                t28.start();
                t29.start();
                t30.start();
                t31.start();
                t32.start();
                t33.start();
                t34.start();
                t35.start();

                try {
                    t28.join();
                    t29.join();
                    t30.join();
                    t31.join();
                    t32.join();
                    t33.join();
                    t34.join();
                    t35.join();
                } catch (Exception e) {
                    // TODO: handle exception
                }
                tEnd = System.currentTimeMillis();
                System.out.println("time \n " + (tEnd - tStart));
                break;
            case "9":
                System.out.println("you have selected 9 thread");
                tStart = System.currentTimeMillis();
                ThreadCreator t36 = new ThreadCreator(1, A/9);
                ThreadCreator t37 = new ThreadCreator((A/9)+1, 2*A/9);
                ThreadCreator t38 = new ThreadCreator((2*A/9)+1, 3*A/9);
                ThreadCreator t39 = new ThreadCreator((3*A/9)+1, 4*A/9);
                ThreadCreator t40 = new ThreadCreator((4*A/9)+1, 5*A/9);
                ThreadCreator t41 = new ThreadCreator((5*A/9)+1, 6*A/9);
                ThreadCreator t42 = new ThreadCreator((6*A/9)+1, 7*A/9);
                ThreadCreator t43 = new ThreadCreator((7*A/9)+1, 8*A/9);
                ThreadCreator t44 = new ThreadCreator((8*A/9)+1, A);

                t36.start();
                t37.start();
                t38.start();
                t39.start();
                t40.start();
                t41.start();
                t42.start();
                t43.start();
                t44.start();
                try {
                    t36.join();
                    t37.join();
                    t38.join();
                    t39.join();
                    t40.join();
                    t41.join();
                    t42.join();
                    t43.join();
                    t44.join();

                } catch (Exception e) {
                    // TODO: handle exception
                }

                tEnd = System.currentTimeMillis();
                System.out.println("time \n " + (tEnd - tStart));
                break;

                
            case "10":
                System.out.println("you have selected 10 thread");
                tStart = System.currentTimeMillis();
                ThreadCreator t45 = new ThreadCreator(1, A/10);
                ThreadCreator t46 = new ThreadCreator((A/10)+1, 2*A/10);
                ThreadCreator t47 = new ThreadCreator((2*A/10)+1, 3*A/10);
                ThreadCreator t48 = new ThreadCreator((3*A/10)+1, 4*A/10);
                ThreadCreator t49 = new ThreadCreator((4*A/10)+1, 5*A/10);
                ThreadCreator t50 = new ThreadCreator((5*A/10)+1, 6*A/10);
                ThreadCreator t51 = new ThreadCreator((6*A/10)+1, 7*A/10);
                ThreadCreator t52 = new ThreadCreator((7*A/10)+1, 8*A/10);
                ThreadCreator t53 = new ThreadCreator((8*A/10)+1, 9*A/10);
                ThreadCreator t54 = new ThreadCreator((9*A/10)+1, A);

                t45.start();
                t46.start();
                t47.start();
                t48.start();
                t49.start();
                t50.start();
                t51.start();
                t52.start();
                t53.start();
                t54.start();
                try {
                    t45.join();
                    t46.join();
                    t47.join();
                    t48.join();
                    t49.join();
                    t50.join();
                    t51.join();
                    ;
                    t52.join();
                    t53.join();
                    t54.join();
                } catch (Exception e) {
                    // TODO: handle exception
                }
                tEnd = System.currentTimeMillis();
                System.out.println("time \n " + (tEnd - tStart));
                break;
            case "11":
                System.out.println("you have selected 11 thread");
                tStart = System.currentTimeMillis();
                ThreadCreator t55 = new ThreadCreator(1, A/11);
                ThreadCreator t56 = new ThreadCreator((A/11)+1, 2*A/11);
                ThreadCreator t57 = new ThreadCreator((2*A/11)+1, 3*A/11);
                ThreadCreator t58 = new ThreadCreator((3*A/11)+1, 4*A/11);
                ThreadCreator t59 = new ThreadCreator((4*A/11)+1, 5*A/11);
                ThreadCreator t60 = new ThreadCreator((5*A/11)+1, 6*A/11);
                ThreadCreator t61 = new ThreadCreator((6*A/11)+1, 7*A/11);
                ThreadCreator t62 = new ThreadCreator((7*A/11)+1, 8*A/11);
                ThreadCreator t63 = new ThreadCreator((8*A/11)+1, 9*A/11);
                ThreadCreator t64 = new ThreadCreator((9*A/11)+1, 10*A/11);
                ThreadCreator t65 = new ThreadCreator((10*A/11)+1, A);

                t55.start();
                t56.start();
                t57.start();
                t58.start();
                t59.start();
                t60.start();
                t61.start();
                t62.start();
                t63.start();
                t64.start();
                t65.start();

                try {
                    t55.join();
                    t56.join();
                    t57.join();
                    t58.join();
                    t59.join();
                    t60.join();
                    t61.join();
                    t62.join();
                    t63.join();
                    t64.join();
                    t65.join();

                } catch (Exception e) {
                    // TODO: handle exception
                }
                tEnd = System.currentTimeMillis();
                System.out.println("time \n " + (tEnd - tStart));

                break;
            case "12":
                System.out.println("you have selected 12 thread");
                tStart = System.currentTimeMillis();
                ThreadCreator t66 = new ThreadCreator(1, A/12);
                ThreadCreator t67 = new ThreadCreator((A/12)+1, 2*A/12);
                ThreadCreator t68 = new ThreadCreator((2*A/12)+1, 3*A/12);
                ThreadCreator t69 = new ThreadCreator((3*A/12)+1, 4*A/12);
                ThreadCreator t70 = new ThreadCreator((4*A/12)+1, 5*A/12);
                ThreadCreator t71 = new ThreadCreator((5*A/12)+1, 6*A/12);
                ThreadCreator t72 = new ThreadCreator((6*A/12)+1, 7*A/12);
                ThreadCreator t73 = new ThreadCreator((7*A/12)+1, 8*A/12);
                ThreadCreator t74 = new ThreadCreator((8*A/12)+1, 9*A/12);
                ThreadCreator t75 = new ThreadCreator((9*A/12)+1, 10*A/12);
                ThreadCreator t76 = new ThreadCreator((10*A/12)+1, 11*A/12);
                ThreadCreator t77 = new ThreadCreator((11*A/12)+1, A);

                t66.start();
                t67.start();
                t68.start();
                t69.start();
                t70.start();
                t71.start();
                t72.start();
                t73.start();
                t74.start();
                t75.start();
                t76.start();
                t77.start();

                try {

                    t66.join();
                    t67.join();
                    t68.join();
                    t69.join();
                    t70.join();
                    t71.join();
                    t72.join();
                    t73.join();
                    t74.join();
                    t75.join();
                    t76.join();
                    t77.join();
                } catch (Exception e) {
                    // TODO: handle exception
                }
                tEnd = System.currentTimeMillis();
                System.out.println("time \n " + (tEnd - tStart));
                break;

            case "quit":
                System.out.println("goodbye");
                choice = "quit";
                break;

            }

        }

    }

}
//thread creator


class ThreadCreator extends Thread {
    private int startNum;
    private int endNum;

    public ThreadCreator(int start, int end) {

        startNum = start;
        endNum = end;
    }

    @Override
    public void run() {

        int[][] res = findAmicableNumbers(startNum, endNum);

        for (int[] a : res) {
            System.out.println(Arrays.toString(a));
        }

        System.out.println("Thread " + getName() + " finished");
        // Print finished message

    }

    //method that finds amicble numbers and stores them in map for print

    public static int[][] findAmicableNumbers(int startNum, int endNum) {

        int checked = 0;
        int counter=0;

        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

        for (int i = startNum; i <= endNum; i++) {

            int u = sumOfDivisors(i);

            if (i == u) {
                continue;
            }

            int v = sumOfDivisors(u);

            if (i != checked && i == v) {
                counter+=1;
                checked = u;
                map.put(i, u);
            }
        }

        int[][] result = new int[map.size()][2];

        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            result[index][0] = entry.getKey();
            result[index][1] = entry.getValue();

            index++;
        }
        System.out.println("total"+counter);

        return result;
    }

//method that calculates the sum of the divisors

    public static int sumOfDivisors(int N) {

        int sum = 1;

        for (int i = 2; i * i <= N; i++) {

            if (N % i == 0) {

                sum += i;

                if (N / i != i) {
                    sum += N / i;
                }
            }
        }

        return sum;
    }

}

