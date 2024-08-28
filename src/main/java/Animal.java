public record Animal(int id, String name, Species species, int age, Owner owner) {
    public Animal withId(int newId){
        return new Animal(newId, name, species, age, owner);
    }

}
