package stacksandqueues.roundtrip;

public class CircularTour {
    public static int findStartingPoint(PetrolPump[] pumps) {
        int start = 0, end = 1;
        int currPetrol = pumps[start].petrol - pumps[start].distance;

        while (start != end || currPetrol < 0) {
            while (currPetrol < 0 && start != end) {
                currPetrol -= pumps[start].petrol - pumps[start].distance;
                start = (start + 1) % pumps.length;
                if (start == 0) return -1;
            }
            currPetrol += pumps[end].petrol - pumps[end].distance;
            end = (end + 1) % pumps.length;
        }

        return start;
    }
}
