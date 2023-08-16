using System.Linq;
using System;
using System.IO;

class Result
{
    public static List<int> compareTriplets(List<int> a, List<int> b)
    {
        int alice = 0;
        int bob = 0;
        List<int> total = new List<int>() {0,0};
        for (int i = 0; i < a.Count; i++)
        {
           
            if (a[i] > b[i])
            {
                alice++;
                total[0]= total[0]+1;
            }
            else if (a[i] < b[i])
            {
                bob++;
                total[1] = total[1] + 1;
            }
        }
        return total;
    }
}

class Solution
{
    public static void Main(string[] args)
    {
        Console.WriteLine("digite a lista 1 (alice) de 3 números separados por espaço:");
        List<int> a = Console.ReadLine().TrimEnd().Split(' ').ToList().Select(aTemp => Convert.ToInt32(aTemp)).ToList();

        Console.WriteLine("digite a lista 2 (bob) de 3 números separados por espaço:");

        List<int> b = Console.ReadLine().TrimEnd().Split(' ').ToList().Select(bTemp => Convert.ToInt32(bTemp)).ToList();

        List<int> result = Result.compareTriplets(a, b);
        Console.WriteLine(String.Join(" ", result));

    }
}