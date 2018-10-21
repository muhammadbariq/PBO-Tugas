/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan43.gajipegawai;

/**
 *
 * @author
 * Nama                 : Muhammad Bariq A
 * Kelas                : PBO3
 * NIM                  : 10117107
 * Deskripsi Program    : Program ini berisi program untuk menampilkan total gaji
 *                        karyawan PT.KAKATU
 */
public class PBO310117107Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("### Data Gaji Karyawan PT.KAKATU ###");
        System.out.println("------------------------------------");
        GajiPegawai pegawai = new GajiPegawai();
        pegawai.setNama("Rizki Adam Kurniawan");
        pegawai.setAlamat("Jalan Semar dlm 4 No 72/66");
        pegawai.setUangTransport(250000);
        pegawai.setUangTunjangan(300000);
        pegawai.setGajiPokok(4500000);
        pegawai.setTotalGaji(pegawai.totalGaji(pegawai.getUangTunjangan()
                ,pegawai.getUangTransport(),pegawai.getGajiPokok()));
        pegawai.tampilData(pegawai.getNama(),pegawai.getAlamat(),
                pegawai.getUangTunjangan(),pegawai.getUangTransport()
                ,pegawai.getGajiPokok(),pegawai.getTotalGaji());
    }
}
    

