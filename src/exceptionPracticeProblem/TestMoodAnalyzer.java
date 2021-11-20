package exceptionPracticeProblem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMoodAnalyzer {
	@Test
	public void testMoodAnalyzer_Sad() {
		Mood_Analyzer rv = new Mood_Analyzer();
		String value = rv.moodAnalyzer("I am in Sad Mood");
		assertEquals("Sad", value);
	}

	@Test
	public void testMoodAnalyzer_Good() {
		Mood_Analyzer rv = new Mood_Analyzer();
		assertEquals("Happy", rv.moodAnalyzer("I am in Good Mood"));
	}
}
