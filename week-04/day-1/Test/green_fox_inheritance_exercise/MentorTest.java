package green_fox_inheritance_exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MentorTest {

    @Test
    void mentorIntroduceInitial() {
        Mentor sanyi = new Mentor();
        sanyi.specificIntroduce();
        assertEquals("Hi, I'm Jane Doe, a 30 years old female intermediate mentor.", sanyi.introduce());
    }

    @Test
    void mentorIntroduceGiven() {
        Mentor sanyi = new Mentor("Sanyi", 18, "male", "senior");
        sanyi.specificIntroduce();
        assertEquals("Hi, I'm Sanyi, a 18 years old male senior mentor.", sanyi.introduce());
    }
}