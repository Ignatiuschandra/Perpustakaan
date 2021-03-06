package perpustakaan;

import javax.swing.JFrame;

/**
 *
 * @author Chandra
 */
public class Perpustakaan {
    
    public static HalamanUtamaUI halamanUtamaUI;
    public static DialogUI dialogUI;
    public static FormPeminjaman formPeminjaman;
    public static FormPencarian formPencarian;
    public static PencarianController pencarianController;
    public static PeminjamanController peminjamanController;
    public static BukuProvider bukuProvider;
    public static BukuDipinjam bukuDipinjam;
    public static Peminjaman peminjaman;
    public static PeminjamanManager peminjamanManager;
    
    public static void main(String[] args) {
        Perpustakaan.halamanUtamaUI = new HalamanUtamaUI();
        
        Perpustakaan.halamanUtamaUI.pack();
        Perpustakaan.halamanUtamaUI.setLocationRelativeTo(null);
        
        //exit ketika aplication exit
        Perpustakaan.halamanUtamaUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //tampilkan
        Perpustakaan.halamanUtamaUI.setVisible(true);
    }
    
}
