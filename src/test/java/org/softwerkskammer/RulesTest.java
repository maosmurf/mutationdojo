package org.softwerkskammer;

import org.junit.Before;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.softwerkskammer.Rules.ALIVE;
import static org.softwerkskammer.Rules.DEAD;

public class RulesTest {

    private Rules rules;

    @Before
    public void init() {
        this.rules = new Rules();
    }

    @org.junit.Test
    public void diesOfLonliness() {
        assertThat(this.rules.next(ALIVE, 1), is(DEAD));
    }

    @org.junit.Test
    public void twoSurvives() {
        assertThat(this.rules.next(ALIVE, 2), is(ALIVE));
    }

    // todo will mutation find 3?

    @org.junit.Test
    public void diesOfOverpopulation() {
        assertThat(this.rules.next(ALIVE, 4), is(DEAD));
    }

    @org.junit.Test
    public void deadWithThreeWillResurrect() {
        assertThat(this.rules.next(DEAD, 3), is(ALIVE));
    }

    @org.junit.Test
    public void deadWithFourWillResurrect() {
        assertThat(this.rules.next(DEAD, 4), is(DEAD));
    }

}
