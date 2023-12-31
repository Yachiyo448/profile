package profile_ex;

class Main {
	public static void main(String[] args) {

		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		Person person2 = new Person("山田花子", 22, 1.5, 40);

		Car car = new Car();
		Bicycle bicycle = new Bicycle();

		//ownerを設定
		car.setOwner(person1.name);
		bicycle.setOwner(person2.name);

		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());

		// 乗り物を購入
		person1.buy(car);
		person2.buy(bicycle);
	}
}