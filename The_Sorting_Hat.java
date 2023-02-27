
import java.util.Random;

import model.*;


import java.util.Arrays;

class The_Sorting_Hat {
    int[] maxStudents;

    The_Sorting_Hat(int max) {
        maxStudents = new int[4];
        Arrays.fill(maxStudents, max);
    }

    Hogwarts randomHouse(String name) {
        Random random = new Random();
        int type = random.nextInt(3);
        switch (type) {
            case 0:
                if (maxStudents[0] > 0) {
                    maxStudents[0]--;
                    return new Gryffindor(name);
                }
            case 1:
                if (maxStudents[1] > 0) {
                    maxStudents[1]--;
                    return new Hufflepuff(name);
                }
            case 2:
                if (maxStudents[2] > 0) {
                    maxStudents[2]--;
                    return new Ravenclaw(name);
                }
            case 3:
                if (maxStudents[3] > 0) {
                    maxStudents[3]--;
                    return new Slytherin(name);
                }
            default:
                maxStudents[0]--;
                return new Gryffindor(name);
        }
    }
}
