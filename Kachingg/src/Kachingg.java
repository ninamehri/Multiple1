
class GFG
{
    static void findMultiples(int n)
    {
        int a = 3;  // To keep track of multiples of 3
        int b = 5;  // To keep track of multiples of 5
        for (int i=1; i<=n; i++)
        {
            String s = "";

            // Found multiple of 3
            if (i==a)
            {
                a = a + 3;  // Update next multiple of 3
                s = s + "Multiple of 3. ";
            }

            // Found multiple of 5
            if (i==b)
            {
                b = b+5;  // Update next multiple of 5
                s = s + "Multiple of 5.";
            }

            if (s == "")
                System.out.println(i);
            else  System.out.println(s);
        }
    }

    public static void main (String[] args)
    {
        findMultiples(20);
    }
}
