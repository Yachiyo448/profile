package profile;

class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);
		
		person1.print();
		
		// 人数の合計を出力
		int number = 1;
		System.out.println("合計" + number + "人です");
	}
}