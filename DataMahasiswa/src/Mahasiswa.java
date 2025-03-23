public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private int umur;

    public Mahasiswa(String nim, String nama, String jenisKelamin, int umur) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
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

    public void setUmur(int umur) { this.umur = umur; }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public int getUmur() {  return this.umur; }
}
