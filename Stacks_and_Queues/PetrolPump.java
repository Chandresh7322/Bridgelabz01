class PetrolPump {
    int petrol;
    int distance;

    public PetrolPump(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }
}

class CircularTour {
    public int findStartingPoint(PetrolPump[] pumps) {
        int n = pumps.length;
        int start = 0, deficit = 0, balance = 0;

        for (int i = 0; i < n; i++) {
            balance += pumps[i].petrol - pumps[i].distance;
            if (balance < 0) {
                start = i + 1;
                deficit += balance;
                balance = 0;
            }
        }

        return (balance + deficit >= 0) ? start : -1;
    }
}
