class CowFactory implements AnimalFactory {
    public Animal createAnimal() {
        return new Cow();
    }
}