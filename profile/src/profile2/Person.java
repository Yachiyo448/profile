package profile2;

class Person {
	// フィールドの定義
	public String name;
	public int age;
	public double height;
	public double weight;
	public static int count = 0;

	// コンストラクタの定義
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// 人数の値を1増やす
		Person.count++;
	}

	// BMIをメッセージ出力
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	// 名前と年をメッセージ出力
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}

	// 合計人数をメッセージ出力
	public void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
}