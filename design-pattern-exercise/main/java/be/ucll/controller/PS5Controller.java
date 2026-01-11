package be.ucll.controller;

import java.util.HashMap;
import java.util.Map;

public class PS5Controller {
    private Map<String, Command> buttonMappings;

    public PS5Controller() {
        this.buttonMappings = new HashMap<>();
    }

    // Method to assign commands to buttons (enables runtime remapping)
    public void setButtonCommand(String button, Command command) {
        buttonMappings.put(button, command);
    }

    public void setCrossButton(Command command) {
        buttonMappings.put("CROSS", command);
    }

    public void setTriangleButton(Command command) {
        buttonMappings.put("TRIANGLE", command);
    }

    public void setSquareButton(Command command) {
        buttonMappings.put("SQUARE", command);
    }

    public void setCircleButton(Command command) {
        buttonMappings.put("CIRCLE", command);
    }

    // Invoker methods - these handle button presses 
    public void pressCrossButton() {
        executeCommand("CROSS");
    }

    public void pressTriangleButton() {
        executeCommand("TRIANGLE");
    }

    public void pressSquareButton() {
        executeCommand("SQUARE");
    }

    public void pressCircleButton() {
        executeCommand("CIRCLE");
    }

    // Alternative button press methods (for Client compatibility)
    public void pressCross() {
        executeCommand("CROSS");
    }

    public void pressTriangle() {
        executeCommand("TRIANGLE");
    }

    public void pressSquare() {
        executeCommand("SQUARE");
    }

    public void pressCircle() {
        executeCommand("CIRCLE");
    }

    // Helper method to execute the command mapped to a button
    private void executeCommand(String button) {
        Command command = buttonMappings.get(button);
        if (command != null) {
            command.execute();
        } else {
            System.out.println(button + " button pressed but no action assigned!");
        }
    }

}
