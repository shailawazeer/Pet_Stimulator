public class AchievementManager {
    public static void checkAchievements(Pet pet) {
        if (pet.getHappiness() == 100) {
            System.out.println("Achievement unlocked: Maximum Happiness!");
        }
        if (pet.getHunger() == 0 && pet.getEnergy() == 100) {
            System.out.println("Achievement unlocked: Perfect Care!");
        }
        if (pet.getHunger() > 80 && pet.getHappiness() < 20) {
            System.out.println("Warning: Your pet is severely neglected!");
        }
    }
}
