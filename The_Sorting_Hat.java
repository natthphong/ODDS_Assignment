
import java.util.Random;

import model.*;

import java.util.Arrays;

class The_Sorting_Hat {
    int[] maxStudents;
    Random random;

    The_Sorting_Hat(int N) {
        random = new Random();
        maxStudents = new int[4];
        int max = (N % 4 == 0 || N % 4 < 3) ? N / 4 : (N / 4) + 1;
        Arrays.fill(maxStudents, max);
        int n = (max * 4 < N) ? N - max * 4 : 0;
        if (n == 2) {
            int type = random.nextInt(3);
            if (type == 3) {
                maxStudents[type] += 1;
                maxStudents[type - 1] += 1;
            } else if (type == 0) {
                maxStudents[type] += 1;
                maxStudents[type + 1] += 1;
            } else {
                maxStudents[type] += 1;
                maxStudents[type + 1] += 1;
            }
        } else if (n == 1) {
            int type = random.nextInt(3);
            maxStudents[type] += 1;
        }

    }

    Hogwarts randomHouse(String name) {
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
