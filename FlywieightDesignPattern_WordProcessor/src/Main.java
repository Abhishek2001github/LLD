public class Main {
    public static void main(String[] args) {

       String document="HelloWorld";
       for(char c:document.toCharArray()){
           if(c!=' '){
               CharacterFlyweight characterFlyweight=CharacterFactory.getcharacter(c);
               characterFlyweight.display(14,"blue");
           }

       }

    }
}
/*
this pattern use when we have tp used some common property across the application
 like in word same char share similar prop but at diff location
        ------------Application-------
Word Processors (MS Word, Google Docs): Optimize memory usage for large documents.
Web Browsers (Rendering Engine): Share font glyphs across multiple tabs.
Game Engines (2D & 3D Graphics): Reuse assets like trees, enemies, bullets, etc*/
