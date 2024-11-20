import java.util.Arrays;
import java.util.Objects;

class _340212 {
    
    static int[] wrongTime;
    static long count;
    static long max;
    
    public int solution(int[] diffs, int[] times, long limit) {
        
        wrongTime = new int[diffs.length];
        wrongTime[0] = times[0];

        for(int i = 1; i < diffs.length; i++) {
            wrongTime[i] = times[i-1] + times[i];
        }

        int minDiff = Arrays.stream(diffs).min().orElse(0);
        int maxDiff = Arrays.stream(diffs).max().orElse(0);

        int skill = (minDiff + maxDiff)/ 2;
        if(skill == 1) return skill;

        while(minDiff < maxDiff) {
            count  = 0;
            for(int i = 0; i < diffs.length; i++) {
                if(diffs[i] > skill) {
                    count += (long) wrongTime[i] * (diffs[i] - skill) + times[i];
                } else {
                    count += times[i];
                }
                if (count > limit) {
                    break;
                }
            }

            if(count > limit) {
                minDiff = skill+1;
            } else {
                maxDiff = skill;
            }
            skill = (minDiff + maxDiff)/2;
        }
        
        return skill;
    }
}
