public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
        int FullArraySum = 0;
		int ArraySum = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			FullArraySum += i;
			ArraySum += array[i];
		}
		FullArraySum += array.length;
        return FullArraySum - ArraySum;
    }

    public static int secondMaxValue(int [] array) {
        int Max, SecondMax;
		if (array[0] >= array[1])
		{
			Max = array[0];
			SecondMax = array[1];
		}
		else
		{
			Max = array[1];
			SecondMax = array[0];
		}
		for (int i = 2; i < array.length; i++)
		{
			if (array[i] > Max)
			{
				SecondMax = Max;
				Max = array[i];
			}
			else if (array[i] > SecondMax)
			{
				SecondMax = array[i];
			}
		}
		return SecondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
		boolean IsSpecificElementContained;
		boolean AreSameElementsContained = true;
		
		for (int i = 0; i < array1.length; i++)
		{
			IsSpecificElementContained = false;
			for (int j = 0; j < array2.length; j++)
			{
				if (array1[i] == array2[j])
				{
					IsSpecificElementContained = true;
				}
			}
			
			if (!IsSpecificElementContained)
			{
				AreSameElementsContained = false;
			}
		}
		
		return AreSameElementsContained;
    }

    public static boolean isSorted(int [] array) {
        boolean IsIncreasing = false;
		boolean IsDecreasing = false;
		
		
		for (int i = 1; i < array.length; i++)
		{
			if (array[i] > array[i - 1])
			{
				IsIncreasing = true;
			}
			if (array[i] < array[i - 1])
			{
				IsDecreasing = true;
			}
		}
		
		if (IsIncreasing && IsDecreasing)
		{
			return false;
		}
		else
		{
			return true;
		}
    }

}
