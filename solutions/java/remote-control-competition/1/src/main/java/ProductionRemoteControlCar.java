class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    
    private int totalDistanceTravelled;
    private int numberOfVictories;

    public void drive() {
        totalDistanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return totalDistanceTravelled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return other.numberOfVictories - this.numberOfVictories;
    }
}
