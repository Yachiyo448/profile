package profile3;

class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		// 名前と年をメッセージ出力
		person1.print();

		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		// 名前と年をメッセージ出力
		person2.print();

		// 合計人数をメッセージ出力
		person1.printCount();
	}
}