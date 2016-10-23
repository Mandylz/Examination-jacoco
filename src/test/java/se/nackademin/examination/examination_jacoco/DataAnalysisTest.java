package se.nackademin.examination.examination_jacoco;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import se.nackademin.examination.examination_jacoco.DataAnalysis;

public class DataAnalysisTest {
    @Test
    public void test1() {
        DataAnalysis dataAnalysis = new DataAnalysis();
        ArrayList<String> values = new ArrayList<String>();
        values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
        String result = dataAnalysis.buildFinalString(values);
        Assert.assertTrue((String)"The result should contain 'The name of the homecity is big and the participant is 30 or older' ", (boolean)result.contains("The name of the homecity is big and the participant is 30 or older"));
    }

    @Test
    public void test2NameAge() {
        DataAnalysis dataAnalysis = new DataAnalysis();
        ArrayList<String> values = new ArrayList<String>();
        values.addAll(Arrays.asList("Game", "Rafael", "Si", "M", "31", "Fortaleza"));
        String result = dataAnalysis.getResultStringNamesAndAge(values);
        Assert.assertTrue((String)"The result should contain 'The first name is greater or equals in size to the last name and the participant older than 30'", (boolean)result.contains("The first name is greater or equals in size to the last name and the participant older than 30"));
    }

    @Test
    public void test3NameAge() {
        DataAnalysis dataAnalysis = new DataAnalysis();
        ArrayList<String> values = new ArrayList<String>();
        values.addAll(Arrays.asList("Game", "Rafa", "Silva", "M", "30", "Fortaleza"));
        String result = dataAnalysis.getResultStringNamesAndAge(values);
        Assert.assertTrue((String)"The result should contain 'The first name is smaller or equals in size to the last name and the participant is 30 or younger'", (boolean)result.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));
    }

    @Test
    public void test4() {
        DataAnalysis dataAnalysis = new DataAnalysis();
        ArrayList<String> values = new ArrayList<String>();
        values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "31", "Fo"));
        String result = dataAnalysis.getResulStringHomecityAndAge(values);
        Assert.assertTrue((String)"The result should contain'The name of the homecity is small and the participant is 30 or older'", (boolean)result.contains("The name of the homecity is small and the participant is 30 or older"));
    }

    @Test
    public void test5() {
        DataAnalysis dataAnalysis = new DataAnalysis();
        ArrayList<String> values = new ArrayList<String>();
        values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "27", "fo"));
        String result = dataAnalysis.getResulStringHomecityAndAge(values);
        Assert.assertTrue((String)"The result should contain'The name of the homecity is small and the participant is younger than 30", (boolean)result.contains("The name of the homecity is small and the participant is younger than 30"));
    }

    @Test
    public void test6() {
        DataAnalysis dataAnalysis = new DataAnalysis();
        ArrayList<String> values = new ArrayList<String>();
        values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "27", "Fortaleza"));
        String result = dataAnalysis.getResulStringHomecityAndAge(values);
        Assert.assertTrue((String)"The result should contain'The name of the homecity is big and the participant is younger than 30", (boolean)result.contains("The name of the homecity is big and the participant is younger than 30"));
    }
}