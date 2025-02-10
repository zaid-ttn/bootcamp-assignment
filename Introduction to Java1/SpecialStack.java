class StackTest{
	private int[]data;
	private int top;
	public StackTest(int size){
		data=new int[size];
		top=-1;
		}
	public void push(int x){
		if(top==data.length-1){
			System.out.println("Overflow");
			return;
		}
		data[++top]=x;
		System.out.println("Pushed in Stack "+x);
	}
	public int pop(){
		if(top==-1){
			System.out.println("Underflow");
			return -1;
		}
		return data[top--];
	}
	public boolean emptyStack() {
        	return top == -1;
    	}

    	public boolean fullStack() {
        	return top == data.length - 1;
    	}
	public void printStack(){
		for (int i = 0; i <=top; i++) {
                        System.out.println(data[i]);
                }
	}

}
public class SpecialStack{
	public static void main(String[]args){
		StackTest sp=new StackTest(10);
		sp.push(20);
		sp.push(30);
		sp.push(100);
		int result;
		System.out.println("Elements in stack:");
        	sp.printStack();
		if(sp.fullStack()){
			System.out.println("Stack is full");
		}else{
			System.out.println("Not Full");
		}
		while (!sp.emptyStack()) {
            		result = sp.pop();
            		System.out.println("Popping elements in loop "+result);
        	}
		System.out.println("After Popping util it is empty");
		if(sp.emptyStack()){
			System.out.println("Stack is Empty");
		}
	}
}
