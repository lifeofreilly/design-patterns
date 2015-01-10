package com.gmail.lifeofreilly.state;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class GumballMonitorTest {

    @Rule
    public TestRule watcher = new TestWatcher() {
        protected void starting(Description description) {
            System.out.println("Starting test: " + description.getMethodName());
        }
    };

    @Test
    public void gumballMonitorTestDrive() throws Exception {
        GumballMachine gumballMachine = new GumballMachine("San Jose", 10);
        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
        gumballMonitor.report();
    }

}