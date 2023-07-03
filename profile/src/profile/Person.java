package profile;

class Person {
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	static int number = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
		Person.number++;
	}
	
	// インスタンスメソッド
	double bmi(double height, double weight) {
		double result = Math.round(weight / Math.sqrt(height)*10)/10;
		return result;
	}
	
	void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + bmi(this.height, this.weight) + "です");
	}
}