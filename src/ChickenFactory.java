class ChickenFactory implements AnimalFactory {
    public Animal createAnimal() {
        return new Chicken();
    }
}