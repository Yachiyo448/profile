package profile;

class Person {
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// インスタンスメソッド
	double bmi(double height, double weight) {
		double result = weight / Math.sqrt(height);
		return result;
	}
	
	void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + bmi(this.height, this.weight) + "です");
	}
}