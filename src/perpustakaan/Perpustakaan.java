package perpustakaan;

import javax.swing.JFrame;

/**
 *
 * @author Chandra
 */
public class Perpustakaan {
    
    public static HalamanUtamaUI halamanUtamaUI;
    public static DialogUI dialogUI;
    public static FormPencarian formPencarian;
    public static PencarianController pencarianController;
    public static BukuProvider bukuProvider;
    
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
