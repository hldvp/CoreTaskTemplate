package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
    }

//    public static void moveRobot (RobotConnectionManager robotConnectionManager,int toX, int toY) {
//        boolean flag = false;
//        for (int i = 0; i < 3; i++) {
//            try {
//                RobotConnection robotConnection = robotConnectionManager.getConnection();
//                try  {
//                    robotConnection.moveRobotTo(toX, toY);
//                    flag = true;
//                    break;
//                } catch (RobotConnectionException e) {
//                    if (i < 2) {
//                        continue;
//                    }
//                } catch (Exception e) {
//                    throw e;
//                } finally {
//                    try {
//                        robotConnection.close();
//                    } catch (RobotConnectionException e) {}
//                }
//            } catch (RobotConnectionException e) {
//                if (i < 2) {
//                    continue;
//                }
//                throw e;
//            }
//        }
//        if (!flag) {
//            throw new RobotConnectionException("Три попытки подключания - неуспешны.");
//        }
//    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for (int i = 0; i < 3; i++) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                i = 2;
            } catch (RobotConnectionException e) {
                if (i == 2) {
                    throw e;
                }
            } catch (Exception e) {
                throw e;
            }
        }
    }

}
