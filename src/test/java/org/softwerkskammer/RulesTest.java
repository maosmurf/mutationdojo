package org.softwerkskammer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.softwerkskammer.Rules.ALIVE;
import static org.softwerkskammer.Rules.DEAD;

@RunWith(Parameterized.class)
public class RulesTest {

    private Rules rules;

    private boolean isAlive;
    private int livingNeighbours;
    private boolean expected;

    public RulesTest(boolean isAlive, int livingNeighbours, boolean expected) {
        this.rules = new Rules();

        this.isAlive = isAlive;
        this.livingNeighbours = livingNeighbours;
        this.expected = expected;
    }

    @Test
    public void willSurvive() {
        assertThat(this.rules.next(isAlive, livingNeighbours), is(expected));
    }

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = {
                {DEAD, 0, DEAD},
                {DEAD, 1, DEAD},
                {DEAD, 2, DEAD},
                {DEAD, 3, ALIVE},
                {DEAD, 4, DEAD},
                {DEAD, 5, DEAD},
                {DEAD, 6, DEAD},
                {DEAD, 7, DEAD},
                {DEAD, 8, DEAD},
                {ALIVE, 0, DEAD},
                {ALIVE, 1, DEAD},
                {ALIVE, 2, ALIVE},
                {ALIVE, 3, ALIVE},
                {ALIVE, 4, DEAD},
                {ALIVE, 5, DEAD},
                {ALIVE, 6, DEAD},
                {ALIVE, 7, DEAD},
                {ALIVE, 8, DEAD},
        };

        return Arrays.asList(data);
    }

}
