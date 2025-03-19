public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String asprak;

    public Mahasiswa(String nim, String nama, String jenisKelamin, String asprak) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.asprak = asprak;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setAsprak(String asprak) { this.asprak = asprak; }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public String getAsprak() { return this.asprak; }
}
