package src.Questions;
public class MakeBeautifulString {
    
    public static void main(String[] args) {
        System.out.println("Running..");
    }


    public static int makeBeautiful(String str) {
            int n = str.length();
            
            char[] b1 = new char[n];
            char[] b2 = new char[n];
            int count1=0;
            int count2= 0;

            char[] inputArr = str.toCharArray();
            char[] inputArr2 = str.toCharArray();
            
            //loop for create possible combination
            for(int i=0;i<n;i++)
            {
                if((i+1)%2==0)
                {
                    b1[i] = '1';
                    b2[i] = '0';
                }
                else
                {
                    b1[i]  = '0';
                    b2[i] = '1';
                }
            }


    //loop for count 
        for(int i=0;i<n;i++)
        {
            if(inputArr[i]!=b1[i])
            {
                inputArr[i] = b1[i];
                count1++; 
            }
            if(inputArr2[i]!=b2[i])
            {
                inputArr2[i] = b2[i];
                count2++;
            }
        }

        return (count1>count2?count2:count1);
            
    }
}
