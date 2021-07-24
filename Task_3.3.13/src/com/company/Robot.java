package com.company;

public class Robot {
  private int x;
  private int y;
  private Direction d;

  public Robot (int X, int Y, Direction D) {
    this.x = X;
    this.y = Y;
    this.d = D;
  }

  public Direction getDirection() {
    return this.d;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public void turnLeft() {
    switch (this.d) {
      case UP:
        this.d = Direction.LEFT;
        break;
      case DOWN:
        this.d = Direction.RIGHT;
        break;
      case LEFT:
        this.d = Direction.DOWN;
        break;
      case RIGHT:
        this.d = Direction.UP;
        break;
    }
  }

  public void turnRight() {
    switch (this.d) {
      case UP:
        this.d = Direction.RIGHT;
        break;
      case DOWN:
        this.d = Direction.LEFT;
        break;
      case LEFT:
        this.d = Direction.UP;
        break;
      case RIGHT:
        this.d = Direction.DOWN;
        break;
    }
  }

  public void stepForward() {
    switch (this.d) {
      case UP:
        this.y++;
        break;
      case DOWN:
        this.y--;
        break;
      case RIGHT:
        this.x++;
        break;
      case LEFT:
        this.x--;
        break;
    }
  }

public static void moveRobot(Robot robot, int toX, int toY) {
    for (int i = 0; i < 4; i++){
        for (int j = robot.getX(); j < toX; j++) {
            if (robot.getDirection().equals(Direction.RIGHT)) {
              robot.stepForward();
            }
        }
        for (int j = robot.getX(); j > toX; j--) {
            if (robot.getDirection().equals(Direction.LEFT)) {
                robot.stepForward();
            }
        }
        for (int j = robot.getY(); j < toY; j++) {
            if (robot.getDirection().equals(Direction.UP)) {
                robot.stepForward();
            }
        }
        for (int j = robot.getY(); j > toY; j--) {
            if (robot.getDirection().equals(Direction.DOWN)) {
                robot.stepForward();
            }
        }
        robot.turnRight();
    }
}

}

