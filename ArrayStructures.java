package algo.basic.cs;

public class ArrayStructures {

private int[] theArray = new int[40];
private int arraySize = 10;

public void generateRandomArray() {
	for (int i = 0; i < arraySize; i++) {
		theArray[i] = (int) (Math.random() * 100);
	}

}

public void printArray() {
	System.out.println(".......................");
	for (int i = 0; i < arraySize; i++) {
		System.out.print("| " + i + " |");
		System.out.println(theArray[i] + " |");

		System.out.println(".......................");
	}
}

public int getValueAtIndex(int index) {
	if (index < arraySize)
		return theArray[index];
	return 0;
}

public boolean doesArraycontainThisValue(int searchValue) {
	boolean valueInarray = false;
	for (int i = 0; i < arraySize; i++) {
		if (theArray[i] == searchValue) {
			valueInarray = true;
		}
	}
	return valueInarray;
}

public void deleteIndex(int index) {
	if (index < arraySize) {
		for (int i = index; i < arraySize - 1; i++) {
			theArray[i] = theArray[i + 1];

		}
		arraySize--;
	}

}

public void insertValue(int value) {
	if (arraySize < 40) {
		theArray[arraySize] = value;
		arraySize++;

	}
}

public String linearSearchvalue(int value) {
	boolean valueInArray = false;
	String indexWithValue = "";
	System.out.println("The value was found in the following: ");
	for (int i = 0; i < arraySize; i++) {
		if (theArray[i] == value) {
			valueInArray = true;
			System.out.println(i + "");
			indexWithValue += i + "";
		}
	}
	if (!valueInArray) {
		indexWithValue = "None";
		System.out.println(indexWithValue);
	}
	System.out.println();
	return indexWithValue;
}

public static void main(String[] args) {

	ArrayStructures as = new ArrayStructures();
	as.generateRandomArray();
	as.printArray();
	System.out.println(as.getValueAtIndex(3));
	System.out.println(as.doesArraycontainThisValue(as.getValueAtIndex(3)));
	System.out.println("..................................");
	as.deleteIndex(3);
	as.insertValue(100);
	as.insertValue(100);

	as.linearSearchvalue(1500);

}

}
