using System;

class Solution
{
    static void plusMinus(int[] arr)
    {
        int n = arr.Length;
        float pos = 0;
        float neg = 0;
        float zero = 0;

        foreach (int i in arr)
        {
            if (i > 0)
            {
                pos++;
            }
            else if (i < 0)
            {
                neg++;
            }
            else
            {
                zero++;
            }
        }

        Console.WriteLine("{(pos / n):000000}");
        Console.WriteLine(neg / n);
        Console.WriteLine(zero / n);
    }

    static void Main(string[] args)
    {
        int n = Convert.ToInt32(Console.ReadLine());
        int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), arrTemp => Convert.ToInt32(arrTemp));
        plusMinus(arr);
    }
}
