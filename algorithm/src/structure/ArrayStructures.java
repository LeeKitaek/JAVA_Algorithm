package structure;

public class ArrayStructures {
	
	private int[] theArray = new int[50]; // 총 배열 크기
	
	private int arraySize = 10; // 자원을 삽입할 배열 크기
	
	
	// Fills the Array with random values
	
	public void generateRandomArray(){
		
		for(int i = 0; i < arraySize; i++){
			
			// 10에서 19까지의 무작위 값 비열에 삽입
			
			theArray[i] = (int)(Math.random()*10)+10;
			
		}
		
	}
	
	public int[] getTheArray(){
		
		return theArray;
		
	}
	
	public int getArraySize(){
		
		return arraySize;
		
	}
	
	public void printArray(){
		// 배열 출력
		
		System.out.println("----------");
		
		for(int i = 0; i < arraySize; i++){
			
			System.out.print("| " + i + " | ");
			
			System.out.println(theArray[i] + " |");
			
			System.out.println("----------");
			
		}
		
	}
	
	
	
	public int getValueAtIndex(int index){
		// 해당 인덱스 값 반환
		
		if(index < arraySize) return theArray[index];
		
		return 0;
		
	}
	
	public boolean doesArrayContainThisValue(int searchValue){
		// 배열에 해당 자원 존재 유무 반환
		
		boolean valueInArray = false;
		
		for(int i = 0; i < arraySize; i++){
			
			if(theArray[i] == searchValue){
				
				valueInArray = true;
				
			}
			
		}
		
		return valueInArray;
		
	}
	
	public void deleteIndex(int index){
		
		if(index < arraySize){
			
			// 배열의 상위 Index 값으로 덮어쓰는 방식으로 삭제

			for(int i = index; i < (arraySize - 1); i++){
				
				theArray[i] = theArray[i+1];
		
			}
			
			arraySize--;
			
		}
		
	}
	
	public void insertValue(int value){
		
		if(arraySize < 50){
			
			theArray[arraySize] = value;
			
			arraySize++;
			
		}
		
	}
	
	public String linearSearchForValue(int value){
		
		boolean valueInArray = false;
		
		String indexsWithValue = "";
			
		System.out.print("The Value was Found in the Following Indexes: ");
		
		for(int i = 0; i < arraySize; i++){
			
			if(theArray[i] == value) {
				valueInArray = true;
				
				System.out.print(i + " ");
				
				indexsWithValue+= i + " ";
			}
			
		}
		
		if(!valueInArray){
			indexsWithValue = "None";
			
			System.out.print(indexsWithValue);
		}
			
		System.out.println();
		
		return indexsWithValue;
			
	}
	
	public void bubbleSort(){
		
		for(int i = arraySize - 1; i > 1; i--){
			
			for(int j = 0; j < i; j++){
				
				if(theArray[j] > theArray[j + 1]){
					
					swapValues(j, j+1);
					
				}
				
			}
			
		}
		
	}
		
	public void swapValues(int indexOne, int indexTwo){
		
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
		
	}
	
	public static void main(String[] args){
		
		ArrayStructures newArray = new ArrayStructures();
		
		newArray.generateRandomArray();
		
		newArray.printArray();
		
		System.out.println(newArray.getValueAtIndex(3));
		
		System.out.println(newArray.doesArrayContainThisValue(18));
		
		newArray.deleteIndex(4);
		
		newArray.printArray();
		
		newArray.insertValue(55);
		
		newArray.printArray();
		
		newArray.linearSearchForValue(17);
	}

}