/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.util.ArrayList;

/**
 *
 * @author Chandra
 */
public class PencarianController {
    
    public void showFormPencarian(){
        Perpustakaan.formPencarian = new FormPencarian();
        
        Perpustakaan.formPencarian.tampilkan();
    }
    
    public void cariBuku(String judul){
        Perpustakaan.bukuProvider = new BukuProvider();
        
        try{
            ArrayList<Buku> listBuku = Perpustakaan.bukuProvider.selectBuku(judul);
            Perpustakaan.formPencarian.displayBuku(listBuku);
        }catch(Exception ex){
            Perpustakaan.dialogUI = new DialogUI();
            Perpustakaan.dialogUI.tampilkan("Koneksi Error");
        }
        
    }
}
