package se.nackademin.examination.examination_jacoco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import se.nackademin.examination.examination_jacoco.Game;

public class GameTest {
    Game game = new Game();
    ArrayList<String> array = new ArrayList();

    @Test
    public void testMethod1() {
        Game game = new Game();
        int i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
        Assert.assertEquals((String)"The result should be 1",i,1);
    }

    @Test
    public void testRun() {
        Game game = new Game();
        this.array.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
        game.run(this.array);
    }

    @Test
    public void testGetGenderFromInput() {
        this.array.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
        Assert.assertEquals((String)"The result should be 'M'", 77, this.game.getGenderFromInputValues(this.array));
    }

    @Test
    public void testcalculateOutPutBasedOnNames() {
        this.array.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
        int result = this.game.calculateOutPutBasedOnNames("Rafa", "Silva");
        Assert.assertEquals((String)"The result should be 0", result, 0);
    }

    @Test
    public void testcalculateOutPutBasedOnNames2() {
        this.array.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
        int result = this.game.calculateOutPutBasedOnNames("Rafael", "Silva");
        Assert.assertEquals((String)"The result should be 1", result, 1);
    }

    @Test
    public void testcalculateOutPutBasedOnNames3() {
        this.array.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
        int result = this.game.calculateOutPutBasedOnNames("Rafael", "Silvaa");
        Assert.assertEquals((String)"The result should be 2", result,2);
    }

    @Test
    public void testcalculateOutPutBasedOnGender() {
        this.array.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
        int result = this.game.calculateOutPutBasedOnGender('M');
        Assert.assertEquals((String)"The result should be 0", result,0);
    }

    @Test
    public void testcalculateOutPutBasedOnGender1() {
        this.array.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
        int result = this.game.calculateOutPutBasedOnGender('F');
        Assert.assertEquals((String)"The result should be 1", result, 1);
    }

    @Test
    public void testcalculateOutPutBasedOnGender2() {
        this.array.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
        int result = this.game.calculateOutPutBasedOnGender('k');
        Assert.assertEquals((String)"The result should be 2", result, 2);
    }

    @Test
    public void calculateOutPutBasedOnAge() {
        this.array.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
        int result = this.game.calculateOutPutBasedOnAge(20);
        Assert.assertEquals((String)"The result should be 0", result,0);
    }

    @Test
    public void calculateOutPutBasedOnAge1() {
        this.array.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
        int result = this.game.calculateOutPutBasedOnAge(37);
        Assert.assertEquals((String)"The result should be 1", result, 1);
    }

    @Test
    public void calculateOutPutBasedOnHomeCity() {
        this.array.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
        int result = this.game.calculateOutPutBasedOnHomeCity("Alavania");
        Assert.assertEquals((String)"The result should be 0", result, 0);
    }

    @Test
    public void calculateOutPutBasedOnHomeCity1() {
        this.array.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
        int result = this.game.calculateOutPutBasedOnHomeCity("Bavana");
        Assert.assertEquals((String)"The result should be 1", result, 1);
    }

    @Test
    public void calculateOutPutBasedOnHomeCity2() {
        this.array.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
        int result = this.game.calculateOutPutBasedOnHomeCity("Cidney");
        Assert.assertEquals((String)"The result should be 2", result, 2);
    }

    @Test
    public void calculateOutPutBasedOnHomeCity3() {
        this.array.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
        int result = this.game.calculateOutPutBasedOnHomeCity("Darband");
        Assert.assertEquals((String)"The result should be 3", result, 3);
    }

    @Test
    public void calculateOutPutBasedOnHomeCity4() {
        this.array.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
        int result = this.game.calculateOutPutBasedOnHomeCity("Ervan");
        Assert.assertEquals((String)"The result should be 4", result, 4);
    }

    @Test
    public void calculateOutPutBasedOnHomeCity5() {
        this.array.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
        int result = this.game.calculateOutPutBasedOnHomeCity("Fortaleza");
        Assert.assertEquals((String)"The result should be 5", result, 5);
    }

    @Test
    public void calculateOutPutBasedOnHomeCity6() {
        this.array.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
        int result = this.game.calculateOutPutBasedOnHomeCity("Gorgia");
        Assert.assertEquals((String)"The result should be 6", result, 6);
    }

    @Test
    public void calculateOutPutBasedOnHomeCity7() {
        this.array.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
        int result = this.game.calculateOutPutBasedOnHomeCity("Hiroshima");
        Assert.assertEquals((String)"The result should be 7", result, 7);
    }

    @Test
    public void calculateOutPutBasedOnHomeCity8() {
        this.array.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
        int result = this.game.calculateOutPutBasedOnHomeCity("Ivan");
        Assert.assertEquals((String)"The result should be 8", result, 8);
    }

    @Test
    public void calculateOutPutBasedOnHomeCity9() {
        this.array.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
        int result = this.game.calculateOutPutBasedOnHomeCity("Jahrom");
        Assert.assertEquals((String)"The result should be 9", result, 9);
    }

    @Test
    public void calculateOutPutBasedOnHomeCity10() {
        this.array.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
        int result = this.game.calculateOutPutBasedOnHomeCity("Tehran");
        Assert.assertEquals((String)"The result should be 10", result, 10);
    }
}