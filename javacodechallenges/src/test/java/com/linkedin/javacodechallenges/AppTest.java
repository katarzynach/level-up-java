package com.linkedin.javacodechallenges;

import static com.linkedin.javacodechallenges.App.getDate100DaysFromToday;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Locale;

public class AppTest {
    @Test
    public void checkDateIn100Days() {
        LocalDate dateIn100Days = getDate100DaysFromToday();
        assertEquals(LocalDate.of(2023, 8, 20), dateIn100Days);
    }
}
