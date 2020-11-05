package cs.lab;

import java.util.logging.Logger;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
    static final Logger logger = Logger.getLogger(Observer.class.getName());
}
