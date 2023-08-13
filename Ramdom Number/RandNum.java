public class RandNum
{
    private int[][] array;

    public RandNum()
    {
        this.array = new int[5][5];
        int x, y;

        for(x = 0; x < 5; x++)
        {
            for(y = 0; y < 5; y++)
            {

                this.array[x][y] = (int) (Math.random()*100);
                System.out.print(array[x][y] + "\t");

            }
            System.out.print("\n");
        }
    }
    public int minimum()
    {
        int lower = 0;
        int a, b;

        for(a = 0; a < 5; a++)
        {
            for(b = 0; b < 5; b++)
            {
                if(lower > this.array[a][b])
                {
                    lower = this.array[a][b];
                }
            }
        }
        return lower;
    }
    public int maximum()
    {
        int high = minimum();
        int i, j;

        for(i = 0; i < 5; i++)
        {
            for(j = 0; j < 5; j++)
            {
                if(high < this.array[i][j])
                {
                    high = this.array[i][j];
                }
            }
        }
        return high;
    }
    public double avarage()
    {
        int count = 0;
        int c, d;

        for(c = 0; c < 5; c++)
        {
            for(d = 0; d < 5; d++)
            {
                count = this.array[c][d] + count;
            }
        }
        return count/25;
    }

}