package com.company;

public class RobotConnectionManagerClass implements RobotConnectionManager {

    @Override
    public RobotConnection getConnection() {
        return new RobotConnectionClass();
    }
}
