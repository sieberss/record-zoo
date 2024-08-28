import java.util.Map;

public record Zoo(Map<Integer, Animal> animals) {

    public int getTotalFoodRequirement(){
        int sum = 0;
        for (Animal animal : animals.values()) {
            sum += animal.species().foodAmount();
        }
        return sum;
    }
}
