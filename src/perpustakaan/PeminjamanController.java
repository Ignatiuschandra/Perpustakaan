package perpustakaan;

import java.util.ArrayList;

/**
 *
 * @author Chandra
 */
public class PeminjamanController {
    
    public void showFormPeminjaman(){
        Perpustakaan.formPeminjaman = new FormPeminjaman();
        Perpustakaan.formPeminjaman.tampilkan();
    }
    
    public void cariBuku(String judul){
        Perpustakaan.bukuProvider = new BukuProvider();
        
        try{
            ArrayList<Buku> listBuku = Perpustakaan.bukuProvider.selectBuku(judul);
            Perpustakaan.formPeminjaman.displayBuku(listBuku);
        }catch(Exception ex){
            Perpustakaan.dialogUI = new DialogUI();
            Perpustakaan.dialogUI.tampilkan("Koneksi Error ");
        }
    }
    
    public void pinjam(BukuDipinjam[] bukuDipinjam){
        
    }
}
