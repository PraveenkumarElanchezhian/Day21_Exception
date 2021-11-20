package exceptionPracticeProblem;

public class Mood_Analyzer {
	String _message;

	Mood_Analyzer() {
	}

	Mood_Analyzer(String message) {
		_message = message;
	}

	String Mood_Analyzer() {

		if (_message == "I am in Sad Mood") {
			return "Sad";
		} else {
			return "Happy";
		}
	}

	String Mood_Analyzer(String message) {

		if (message == "I am in Sad Mood") {
			return "Sad";
		} else {
			return "Happy";
		}
	}

	public static void main(String[] args) {

	}

}
