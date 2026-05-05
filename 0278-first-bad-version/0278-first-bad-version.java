public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s = 1;
        int e = n;

        while (s <=e) {
            int mid = s + (e - s) / 2;

            if (isBadVersion(mid)) {
                e = mid-1;       
            } else {
                s = mid + 1;    // discard left part
            }
        }

        return s; // or e (both same here)
    }
}