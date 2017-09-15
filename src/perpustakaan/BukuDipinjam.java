package perpustakaan;

/**
 *
 * @author Chandra
 */
public class BukuDipinjam extends Buku {
    private int lama;

    public BukuDipinjam(String judul) {
        super(judul);
    }
    
    public void setLama(int lama){
        this.lama = lama;
    }
    
    public int getLama(){
        return this.lama;
    }
    
    public String getJudul(){
        return super.getJudul();
    }
}
