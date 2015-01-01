package com.gmail.lifeofreilly.command;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import static org.junit.Assert.*;

public class SimpleRemoteControlTest {

    @Rule
    public TestRule watcher = new TestWatcher() {
        protected void starting(Description description) {
            System.out.println("Starting test: " + description.getMethodName());
        }
    };

    @Test
    public void testSimpleRemote() throws Exception {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Simple Light");
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        assertEquals(true, light.isOn());
    }

}