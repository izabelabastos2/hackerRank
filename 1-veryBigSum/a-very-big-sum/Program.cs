using System.Linq;
using System;
using System.Reflection.Metadata.Ecma335;

class Result
{

    public static long simpleArraySum(List<int> ar)
    {
        long total = 0;
        for (int i = 0; i < ar.Count; i++)
        {
            total += Convert.ToInt64(ar[i]);
        }
        Console.WriteLine(total);
        return total;
    }
    
}

class Solution
{
    public static void Main(string[] args)
    {
        Console.WriteLine("digite o tamanho do vetor:");
        int lenght = Convert.ToInt32(Console.ReadLine().Trim());

        Console.WriteLine("digite o vetor:");

        List<int> ar = Console.ReadLine().TrimEnd().Split(' ').ToList().Select(arTemp => Convert.ToInt32(arTemp)).ToList();

        long result = Result.simpleArraySum(ar);


    }
}