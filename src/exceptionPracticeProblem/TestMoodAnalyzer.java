package exceptionPracticeProblem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMoodAnalyzer {
	@Test
	public void testMoodAnalyzer_Sad() {
		Mood_Analyzer rv = new Mood_Analyzer();
		String value = rv.Mood_Analyzer("I am in Sad Mood");
		assertEquals("Sad", value);
	}

	@Test
	public void testMoodAnalyzer_Good() {
		Mood_Analyzer rv = new Mood_Analyzer();
		assertEquals("Happy", rv.Mood_Analyzer("I am in Good Mood"));
	}

	@Test
	public void testMoodAnalyzer_Sad_Parameter() {
		Mood_Analyzer rv = new Mood_Analyzer("I am in Sad Mood");
		String value = rv.Mood_Analyzer();
		assertEquals("Sad", value);
	}

	@Test
	public void testMoodAnalyzer_Good_Parameter() {
		Mood_Analyzer rv = new Mood_Analyzer("I am in Good Mood");
		assertEquals("Happy", rv.Mood_Analyzer());
	}
}
