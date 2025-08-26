package view;

import controller.QuickSortController;

public class Main {
    public Main()
    {
        super();
    }

    public static void main(String args[])
    {
        System.out.println("Quick Sort - Ex1");
        {
            int[] vec = { 74, 20, 74, 87, 81, 16, 25, 99, 44, 58 };
            QuickSortController bs = new QuickSortController();
            System.out.println("Antes:");
            bs.printVec(vec);
            bs.sort(vec);
            System.out.println("Depois:");
            bs.printVec(vec);
        }
        System.out.println("Quick Sort - Ex2");
        {
            int[] vec = { 44, 43, 42, 41, 40, 39, 38 };
            QuickSortController bs = new QuickSortController();
            System.out.println("Antes:");
            bs.printVec(vec);
            bs.sort(vec);
            System.out.println("Depois:");
            bs.printVec(vec);
        }
        System.out.println("Quick Sort - Ex3");
        {
            int[] vec = { 31, 32, 33, 34, 99, 98, 97, 96 };
            QuickSortController bs = new QuickSortController();
            System.out.println("Antes:");
            bs.printVec(vec);
            bs.sort(vec);
            System.out.println("Depois:");
            bs.printVec(vec);
        }
    }
}
