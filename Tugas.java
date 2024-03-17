public class Tugas {
    String mataKuliah;
    String tugas;
    String deadline;

    public Tugas(String mataKuliah, String tugas, String deadline) {
        this.mataKuliah = mataKuliah;
        this.tugas = tugas;
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Mata Kuliah = " + mataKuliah + ", tugas = " + tugas + ", deadline = " + deadline;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public String getTugas() {
        return tugas;
    }
}