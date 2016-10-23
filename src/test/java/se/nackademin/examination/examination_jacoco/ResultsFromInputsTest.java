package se.nackademin.examination.examination_jacoco;

import org.junit.Assert;
import org.junit.Test;
import se.nackademin.examination.examination_jacoco.ResultFromInputs;

public class ResultsFromInputsTest {
    @Test
    public void testAgeGettersAndSettersMethods() {
        ResultFromInputs resultsFromInputs = new ResultFromInputs();
        resultsFromInputs.setResultForAge(20);
        Assert.assertEquals((String)"The result should be 20", resultsFromInputs.getResultForAge(),20);
    }

    @Test
    public void getResultForNameLenght() {
        ResultFromInputs resultsFromInputs = new ResultFromInputs();
        resultsFromInputs.setResultForNameLenght(10);
        Assert.assertEquals((String)"The result should be 10",resultsFromInputs.getResultForNameLenght(), 10);
    }

    @Test
    public void getResultForGender() {
        ResultFromInputs resultsFromInputs = new ResultFromInputs();
        resultsFromInputs.setResultForGender('M');
        Assert.assertEquals((String)"The result should be M", (long)resultsFromInputs.getResultForGender(), 'M');
    }

    @Test
    public void getResultForHomeCity() {
        ResultFromInputs resultsFromInputs = new ResultFromInputs();
        resultsFromInputs.setResultForHomeCity(4);
        Assert.assertEquals((String)"The result should be 4", resultsFromInputs.getResultForHomeCity(), 4);
    }
}