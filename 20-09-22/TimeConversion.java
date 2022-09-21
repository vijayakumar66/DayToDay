
public class TimeConversion {
	public static String timeConversion(String s) {
		String temp = " ";
		int hours = Integer.parseInt(s.substring(0, 2));
		String minutes = s.substring(2, 8);
		String dayPart = s.substring(8, 10);
		if (dayPart.equals("PM")) {
			if (hours == 12) {
				temp = hours + minutes;
			} else {
				hours = hours + 12;
				temp = hours + minutes;
			}
		} else {
			if (hours == 12) {
				temp = "00" + minutes;
			} else {
				temp = "0" + hours + minutes;
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		String s = "03:45:55AM";
		System.out.println(timeConversion(s));
	}

}
