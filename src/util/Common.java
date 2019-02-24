package util;

public class Common {

	public static class Utility {
		public static <T> void Print(T message) {
			System.out.println(message);
		}
		
		public static <T> boolean isNotNull(T obj) {
			return (obj != null);
		}
	}

}
