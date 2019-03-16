package org.softwerkskammer;

import org.junit.Assert;
import org.junit.Before;

public class RulesTest {

    private Rules rules;

    @Before
    public void init() {
        this.rules = new Rules();
    }

    @org.junit.Test
    public void diesOfLonliness() {
        boolean actual = this.rules.next(true, 0);
        Assert.assertFalse(actual);
    }

    @org.junit.Test
    public void diesOfOverpopulation() {
        boolean actual = this.rules.next(true, 4);
        Assert.assertFalse(actual);
    }
}
