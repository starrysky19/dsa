//time O(2^n) Space O(n) 


package recursion;

public class TowerOfHanoi {

        // Recursive function to solve Tower of Hanoi and print the steps
        public void towerOfHanoi(int n, int s, int d, int e) {
            // Base case: If there is only one disk, simply move it from the 's' rod to the 'd' rod
            if (n == 1) {
                System.out.println("Move disk 1 from rod " + s + " to rod " + d);
                return;
            }
            
            // Step 1: Move n-1 disks from 's' rod to 'e' rod, using 'd' as auxiliary
            towerOfHanoi(n - 1, s, e, d);
            
            // Step 2: Move the nth (largest) disk from 's' to 'd' rod
            System.out.println("Move disk " + n + " from rod " + s + " to rod " + d);
            
            // Step 3: Move n-1 disks from 'e' rod to 'd' rod, using 's' as auxiliary
            towerOfHanoi(n - 1, e, d, s);
        }
    
        public static void main(String[] args) {
            TowerOfHanoi solution = new TowerOfHanoi();
            int n = 3;  // Number of disks
            int s = 1;  // Source rod
            int d = 2;  // Destination rod
            int e = 3;  // Extra (auxiliary) rod
            
            // Call the function to solve the puzzle and print the steps
            solution.towerOfHanoi(n, s, d, e);
        }
    }

