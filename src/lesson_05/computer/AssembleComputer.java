package lesson_05.computer;

import java.util.ArrayList;
import java.util.List;

public class AssembleComputer {
    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.printInfo();
    }

    private static class Computer {
        List<ComputerParts> computerParts = new ArrayList<>();

        Computer() {
            computerParts.add(new ComputerCase("Cool", "BigTower"));
            computerParts.add(new MainBoard("Foxxconn", "x64", "mATX", 4,
                    new Cpu("Intel", "x64", "i5", "CPU-slot", 8, 1024),
                    4, new Hdd("Seagate", "FireCuda", "SSD", 3096)));

        }

        public void printInfo() {

        }
    }
}
