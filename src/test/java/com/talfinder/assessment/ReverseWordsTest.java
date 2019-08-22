package com.talfinder.assessment;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ReverseWordsTest {
    String input;
    String expected;

    public ReverseWordsTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {"Ram works for Google", "Google for works Ram"},
                {"Shubham", "Shubham"},
                {"", null},
                {"TalFinder is a platform for educating the talent entering the market, providing state of the art recruitment tools, workflows and an ecosystem where people from the industry can mentor and nurture talent", "talent nurture and mentor can industry the from people where ecosystem an and workflows tools, recruitment art the of state providing market, the entering talent the educating for platform a is TalFinder"},
                {"Hello123 iam here#4U", "here#4U iam Hello123"}
        });
    }

    @Test
    public void testReverseWords() {
        Assert.assertEquals("Input:" + input, expected, ReverseWords.reverseWords(input));
    }
}

