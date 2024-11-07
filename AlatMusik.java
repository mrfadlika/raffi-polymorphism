abstract class MusicalInstrument{
    protected String name;

    public MusicalInstrument(String name){
        this.name = name;
    }

    abstract void play();
}

class Piano extends MusicalInstrument{
    public Piano(){
        super("Piano");
    }

    @Override
    void play() {
        System.out.println("Piano sedang dimainkan: ting ting ting!");
    }
}

class Biola extends MusicalInstrument{
    public Biola(){
        super("Biola");
    }

    @Override
    void play() {
        System.out.println("Biola sedang dimainkan: nyrek nyrek!");
    }
}

class Gitar extends MusicalInstrument{
    public Gitar(){
        super("Gitar");
    }

    @Override
    void play() {
        System.out.println("Gitar sedang dimainkan: jreng jreng jreng");
    }
}

class Drum extends MusicalInstrument{
    public Drum(){
        super("Drum");
    }

    @Override
    void play() {
        System.out.println("Drum sedang dimainkan: dung dung tak");
    }
}

class Saxophone extends MusicalInstrument{
    public Saxophone(){
        super("Saxophone");
    }

    @Override
    void play() {
        System.out.println("Saxophone sedang dimainkan: nguing nguing!");
    }
}

class Trumpet extends MusicalInstrument{
    public Trumpet(){
        super("Trumpet");
    }

    @Override
    void play() {
        System.out.println("Trumpet sedang dimainkan: tetet tetet");
    }
}

public class AlatMusik {
    public static void main(String[] args) {
        MusicalInstrument[] instruments = new MusicalInstrument[]{
                new Piano(),
                new Biola(),
                new Gitar(),
                new Drum(),
                new Saxophone(),
                new Trumpet()
        };

        for (MusicalInstrument instrument : instruments) {
            System.out.println("Memainkan " + instrument.name + ":");
            instrument.play();
            System.out.println();
        }
    }
}