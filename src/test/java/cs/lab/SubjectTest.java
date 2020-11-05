package cs.lab;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class SubjectTest {

    @Test
    public void testCase0() {
        Subject subject = new Subject();
        Map<String, Integer> data = subject.getData();
        Integer value = data.get("A");
        Integer expectedValue = 40;
        Assert.assertEquals(expectedValue, value);
        value = data.get("B"); expectedValue = 25;
        Assert.assertEquals(expectedValue, value);
        value = data.get("C"); expectedValue = 15;
        Assert.assertEquals(expectedValue, value);
        value = data.get("D"); expectedValue = 20;
        Assert.assertEquals(expectedValue, value);
    }

    @Test
    public void testCase1() {
        Subject subject = new Subject();
        BarChart barChart = new BarChart(subject);
        PieChart pieChart = new PieChart(subject);
        subject.setData("A", 25);
        Map<String, Integer> data = subject.getData();
        Integer value = data.get("A");
        Integer expectedValue = 25;
        Assert.assertEquals(value, expectedValue);
    }
}