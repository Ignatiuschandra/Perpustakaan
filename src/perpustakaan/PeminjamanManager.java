package perpustakaan;

import java.util.ArrayList;

/**
 *
 * @author Chandra
 */
public class PeminjamanManager {

    public boolean save(ArrayList<BukuDipinjam> bukuDipinjam) {
        Perpustakaan.peminjaman = new Peminjaman();

        try {
            for (BukuDipinjam mauDipinjam : bukuDipinjam) {
                Perpustakaan.peminjaman.add(mauDipinjam);
            }
//            for (BukuDipinjam mauDipinjam : bukuDipinjam) {
//                System.out.println(mauDipinjam.getJudul());
//                System.out.println(mauDipinjam.getLama());
//            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
