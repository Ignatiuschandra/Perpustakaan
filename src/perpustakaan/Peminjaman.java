package perpustakaan;

import java.util.ArrayList;

/**
 *
 * @author Chandra
 */
public class Peminjaman {

    private ArrayList<BukuDipinjam> daftarBuku;

    public Peminjaman() {
        this.daftarBuku = new ArrayList<>();
    }

    public void add(BukuDipinjam bukuDipinjam) {
        this.daftarBuku.add(bukuDipinjam);
    }

    public ArrayList<BukuDipinjam> getBukuDipinjam() {
        return this.daftarBuku;
    }
}
