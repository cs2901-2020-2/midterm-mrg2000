package cs.lab;

public class BarChart extends Observer {
    public BarChart(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        String message = "Bar chart: " + this.subject.graphicString();
        logger.info(message);
    }
}