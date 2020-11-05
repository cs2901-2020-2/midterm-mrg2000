package cs.lab;

public class PieChart extends Observer {
    public PieChart(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        String message = "Pie chart: " + this.subject.graphicString();
        logger.info(message);
    }
}