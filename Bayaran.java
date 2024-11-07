class Pegawai{
    protected String nama;
    protected int gaji;

    public Pegawai(String nama, int gaji){
        this.nama = nama;
        this.gaji = gaji;
    }

    public int infoGaji() {
        return gaji;
    }
}

class ManagerPegawai extends Pegawai{
    private int tunjangan;
    public ManagerPegawai(String nama, int gaji, int tunjangan){
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    public int infoGaji() {
        return gaji;
    }

    public int infoTunjangan() {
        return tunjangan;
    }
}

class ProgrammerPegawai extends Pegawai{
    private int bonus;

    public ProgrammerPegawai(String nama, int gaji, int bonus){
        super(nama, gaji);
        this.bonus = bonus;
    }

    public int infoGaji() {
        return gaji;
    }

    public int infoTunjangan() {
        return bonus;
    }
}

public class Bayaran {
    public int hitungBayaran(Pegawai peg) {
        int uang = peg.infoGaji();

        if(peg instanceof ManagerPegawai){
            uang += ((ManagerPegawai) peg).infoTunjangan();
        } else if (peg instanceof ProgrammerPegawai) {
            uang += ((ProgrammerPegawai) peg).infoTunjangan();
        }

        return uang;
    }

    public static void main(String[] args) {
        ManagerPegawai man = new ManagerPegawai("Agus", 800, 50);
        ProgrammerPegawai prog = new ProgrammerPegawai("Budi", 600, 30);
        Bayaran hr = new Bayaran();

        System.out.println("Bayaran untuk Manager: " + hr.hitungBayaran(man));
        System.out.println("Bayaran untuk Programmer: " + hr.hitungBayaran(prog));
    }
}
