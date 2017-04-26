public class demo105{
	public static void main(String[] args) {
		fun(new MessageImpl());
	}
	public static void fun(Message msg){
		msg.print();
	}
}

interface Message{
	public void print();
}
class MessageImpl implements Message{
	public void print(){
		System.out.println("hello world!!!");
	}
}