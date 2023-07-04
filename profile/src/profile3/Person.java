package profile3;

class Person {
	// フィールドの定義
	public static int count = 0;
	public String firstName;
	public String lastName;
	public int age;
	public double height, weight;

	// コンストラクタの定義
	Person(String firstName, String lastName, int age, double height, double weight) {
		// 合計人数の値を1増やす
		Person.count++;

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// メソッドの定義
	// フルネームを返す
	public String fullName() {
		return this.firstName + this.lastName;
	}

	// 名前と年をメッセージ出力
	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	// BMIをメッセージ出力
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	// 合計人数をメッセージ出力
	public void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
}