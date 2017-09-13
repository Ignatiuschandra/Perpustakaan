package perpustakaan;

import java.util.ArrayList;

/**
 *
 * @author Chandra
 */
public class BukuProvider {
    
    ArrayList<Buku> bukuCollection = new ArrayList<>();
    ArrayList<Buku> bukuCocok = new ArrayList<>();
    
    public BukuProvider(){
        bukuCollection.add(new Buku("Doraemon"));
        bukuCollection.add(new Buku("Sherlock Holmes"));
        bukuCollection.add(new Buku("Harry Potter"));
        bukuCollection.add(new Buku("Software Engineering"));
        bukuCollection.add(new Buku("Willy & Christy"));
        bukuCollection.add(new Buku("Titanic"));
        bukuCollection.add(new Buku("Fisika Teknik"));
        bukuCollection.add(new Buku("Petualangan Doraemon"));
    }
    
    public ArrayList<Buku> selectBuku(String judul){
        for(Buku buku : bukuCollection){
            if (buku.getJudul().contains(judul)) {
                bukuCocok.add(buku);
            }
        }
        
        return bukuCocok;
    }
}
