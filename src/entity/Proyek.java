package entity;
// Generated Nov 22, 2024 8:57:11 AM by Hibernate Tools 4.3.1



/**
 * Proyek generated by hbm2java
 */
public class Proyek  implements java.io.Serializable {


     private Integer id;
     private String namaproyek;
     private String lokasi;
     private String tanggalmulai;
     private String tanggalselesai;

    public Proyek() {
    }

    public Proyek(String namaproyek, String lokasi, String tanggalmulai, String tanggalselesai) {
       this.namaproyek = namaproyek;
       this.lokasi = lokasi;
       this.tanggalmulai = tanggalmulai;
       this.tanggalselesai = tanggalselesai;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNamaproyek() {
        return this.namaproyek;
    }
    
    public void setNamaproyek(String namaproyek) {
        this.namaproyek = namaproyek;
    }
    public String getLokasi() {
        return this.lokasi;
    }
    
    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    public String getTanggalmulai() {
        return this.tanggalmulai;
    }
    
    public void setTanggalmulai(String tanggalmulai) {
        this.tanggalmulai = tanggalmulai;
    }
    public String getTanggalselesai() {
        return this.tanggalselesai;
    }
    
    public void setTanggalselesai(String tanggalselesai) {
        this.tanggalselesai = tanggalselesai;
    }




}


