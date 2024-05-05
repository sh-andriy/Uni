package lab5;

public class main1 {
}
//bananas 5 kyu:
//import java.util.*;
//
//public class Dinglemouse {
//
//    static Set<String> bananas(final String s) {
//        Set<String> results = new HashSet<>();
//        findBananas(s, 0, "banana", 0, "", results);
//        return results;
//    }
//
//    static void findBananas(String s, int si, String target, int ti, String current, Set<String> results) {
//        if (ti == target.length()) {
//            while (si < s.length()) {
//                current += "-";
//                si++;
//            }
//            results.add(current);
//            return;
//        }
//        if (si == s.length()) {
//            return;
//        }
//
//        if (s.charAt(si) == target.charAt(ti)) {
//            findBananas(s, si + 1, target, ti + 1, current + s.charAt(si), results);
//        }
//        findBananas(s, si + 1, target, ti, current + "-", results);
//    }
//
//    public static void main(String[] args) {
//        Set<String> results = bananas("bbananana");
//        for (String result : results) {
//            System.out.println(result);
//        }
//    }
//}



//Task
//Allocate customers to hotel rooms based on their arrival and departure days. Each customer wants their own room, so two customers can stay in the same room only if the departure day of the first customer is earlier than the arrival day of the second customer. The number of rooms used should be minimized.
//
//Input
//A list of n customers, 1 <= n <= 1000. Each customer is represented by (arrival_day, departure_day), which are positive integers satisfying arrival_day <= departure_day.
//
//        Output
//A list of size n, where element i indicates the room that customer i was allocated. Rooms are numbered 1,2, ..., k for some 1 <= k <= n. Any allocation that minimizes the number of rooms k is a valid solution.
//
//        Example:
//Suppose customers is [(1,5), (2,4), (6,8), (7,7)].
//Clearly customers 1 and 2 cannot get the same room. Customer 3 can use the some room as either of them, because they both leave before customer 3 arrives. Then customer 4 can be given the other room.
//So any of [1,2,1,2], [1,2,2,1], [2,1,2,1], [2,1,1,2] is a valid solution.
//
//NOTE: The list of customers is not necessarily ordered by arrival_time.

//import java.util.Arrays;
//import java.util.PriorityQueue;
//
//public class AllocatingHotelRooms {
//    public static int[] allocateRooms(int[][] customers) {
//        Arrays.sort(customers, (a, b) -> a[0] - b[0]);
//
//        PriorityQueue<int[]> availableRooms = new PriorityQueue<>((a, b) -> a[1] - b[1]);
//        int[] roomAllocations = new int[customers.length];
//        int roomCount = 0;
//
//        for (int i = 0; i < customers.length; i++) {
//            int arrival = customers[i][0];
//            int departure = customers[i][1];
//
//            if (!availableRooms.isEmpty() && availableRooms.peek()[1] < arrival) {
//                int[] room = availableRooms.poll();
//                room[1] = departure;
//                roomAllocations[i] = room[0];
//            } else {
//                roomCount++;
//                roomAllocations[i] = roomCount;
//            }
//
//            availableRooms.add(new int[]{roomAllocations[i], departure});
//        }
//
//        return roomAllocations;
//    }
//}


//Given an array of integers, find the one that appears an odd number of times.
//
//There will always be only one integer that appears an odd number of times.
//
//Examples
//[7] should return 7, because it occurs 1 time (which is odd).
//        [0] should return 0, because it occurs 1 time (which is odd).
//        [1,1,2] should return 2, because it occurs 1 time (which is odd).
//        [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
//        [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).

//public class FindOdd {
//    public static int findIt(int[] a) {
//        int xor = 0;
//        for (int num : a) {
//            xor ^= num;
//        }
//        return xor;
//    }
//}


//Implement a function that receives two IPv4 addresses, and returns the number of addresses between them (including the first one, excluding the last one).
//
//All inputs will be valid IPv4 addresses in the form of strings. The last address will always be greater than the first one.
//
//Examples
//* With input "10.0.0.0", "10.0.0.50"  => return   50
//* With input "10.0.0.0", "10.0.1.0"   => return  256
//* With input "20.0.0.10", "20.0.1.0"  => return  246

//public class CountIPAddresses {
//    public static long ipsBetween(String start, String end) {
//        //ip адресу from string to long integers
//        long startNum = ipToLong(start);
//        long endNum = ipToLong(end);
//
//        return endNum - startNum;
//    }
//
//    private static long ipToLong(String ip) {
//        String[] parts = ip.split("\\.");
//        return (Long.parseLong(parts[0]) << 24) +
//               (Long.parseLong(parts[1]) << 16) +
//               (Long.parseLong(parts[2]) << 8) +
//                Long.parseLong(parts[3]);
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Number of IPs between 10.0.0.0 and 10.0.0.50: " + ipsBetween("10.0.0.0", "10.0.0.50"));
//        System.out.println("Number of IPs between 10.0.0.0 and 10.0.1.0: " + ipsBetween("10.0.0.0", "10.0.1.0"));
//        System.out.println("Number of IPs between 20.0.0.10 and 20.0.1.0: " + ipsBetween("20.0.0.10", "20.0.1.0"));
//    }
//}