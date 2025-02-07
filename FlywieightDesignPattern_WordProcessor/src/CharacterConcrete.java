public class CharacterConcrete implements CharacterFlyweight{
    private final char Character;

    public CharacterConcrete(char character) {
        this.Character = character;
    }

    @Override
    public void display(int fontsize, String color) {    //sharing common thing
        System.out.println("Character:"+Character+" "+"fontsize:"+fontsize+" "+"color:"+color+" ");
    }
}
