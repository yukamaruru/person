package person;

public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person taro = new Person();
		//newはインスタンス化するという意味。
		//taroは変数名。
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="012-345-678";
		taro.address="東京";
		
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		
		taro.name="木村次郎";
		taro.age=18;
		taro.phoneNumber="123-456-789";
		taro.address="神奈川";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		
		taro.name="鈴木花子";
		taro.age=16;
		taro.phoneNumber="234-567-890";
		taro.address="千葉";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		
		taro.name="山田宥佳";
		taro.age=24;
		taro.phoneNumber="345-678-901";
		taro.address="茨城";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
	}

}
