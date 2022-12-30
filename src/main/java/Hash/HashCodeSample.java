package Hash;

import java.util.HashMap;
import java.util.Map;

public class HashCodeSample {

	public static void main(String[] args) {
		User user = new User("wook", 28);
		User user2 = new User("wook", 30);
		User user3 = new User("wook", 27);

		System.out
			.printf("동등성 비교 : User=%s User2=%s User==user2 : %b", user, user2, (user == user2));
		System.out.printf("동일성 비교 : user.equals(user2) : %b \n", user.equals(user2));

		Map<User, Integer> map = new HashMap();
		map.put(user, 1);
		map.put(user2, 2);
		//        map.put(user3,3);
		System.out.println(map.size());
		System.out.println(map.get(user));
	}
}
