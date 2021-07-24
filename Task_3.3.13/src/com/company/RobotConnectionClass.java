package com.company;

public class RobotConnectionClass implements RobotConnection{
    Robot robot;

    public RobotConnectionClass () {
        this.robot = new Robot(0,0,Direction.UP);
    }

    @Override
    public void moveRobotTo(int x, int y) {

    }

    @Override
    public void close() {

    }
}
