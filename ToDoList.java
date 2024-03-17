import java.util.LinkedList;
import java.util.ListIterator;

public class ToDoList {
    LinkedList<Tugas> tugas = new LinkedList<>();
    ListIterator<Tugas> tugasIterator = tugas.listIterator();
    
    public void inputTugas(Tugas input) {
        tugas.addFirst(input);
    }
    
    public void hapusTugasTerakhir() {
        tugas.removeLast();
    }

    public void hapusTugasPertama() {
        tugas.removeFirst();
    }

    public void hapusTugasMatkul(String mataKuliah) {
        ListIterator<Tugas> tugasIterator = tugas.listIterator();
        while (tugasIterator.hasNext()) {
            Tugas tugasDiHapus = tugasIterator.next();
            if (tugasDiHapus.getMataKuliah().equals(mataKuliah)) {
                tugasIterator.remove();
            }
        }
    }

    public void hapusTugasNama(String namaTugas) {
        ListIterator<Tugas> tugasIterator = tugas.listIterator();
        while (tugasIterator.hasNext()) {
            Tugas tugasDiHapus = tugasIterator.next();
            if (tugasDiHapus.getTugas().equals(namaTugas)) {
                tugasIterator.remove();
            }
        }
    }

    public void cetakDariAwal() {
        tugasIterator = tugas.listIterator();
        while (tugasIterator.hasNext()) {
            System.out.println(tugasIterator.next());
        }
    }

    public void cetakDariAkhir() {
        tugasIterator = tugas.listIterator(tugas.size());
        while (tugasIterator.hasPrevious()) {
            System.out.println(tugasIterator.previous());
        }
    }
}
