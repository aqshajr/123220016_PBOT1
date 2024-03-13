/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123220016tugas1;
import javax.swing.*;

/**
 *
 * @author ACER
 */

class Halaman extends JFrame{
    JLabel welcome = new JLabel("Welcome, [Mr./Mrs.] [username]");
    JLabel tentukan = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung Balok");
    JLabel panjang = new JLabel("Panjang");
    JTextField tpanjang = new JTextField(50);
    JLabel lebar = new JLabel("Lebar");
    JTextField tlebar = new JTextField(50);
    JLabel tinggi = new JLabel("Tinggi");
    JTextField ttinggi = new JTextField(50);
    JButton hitung = new JButton("Hitung");
    JButton reset = new JButton("Reset");
    JLabel hasil = new JLabel("Hasil");
    JLabel luas = new JLabel("Luas Persegi");
    JLabel keliling = new JLabel("Keliling Persegi");
    JLabel volume = new JLabel("Volume Balok");
    JLabel lp = new JLabel("Luas Permukaan Balok");
    JLabel angka1 = new JLabel("[Hasil berupa angka]");
    JLabel angka2 = new JLabel("[Hasil berupa angka]");
    JLabel angka3 = new JLabel("[Hasil berupa angka]");
    JLabel angka4 = new JLabel("[Hasil berupa angka]");

    
    Halaman(){
        setVisible(true);
        setSize(480, 470);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        add(welcome);
        welcome.setBounds(20, 15, 310, 30);
        welcome.setFont (welcome.getFont ().deriveFont (20.0f));
        
        add(tentukan);
        tentukan.setBounds(20, 40, 450, 30);
        tentukan.setFont (tentukan.getFont ().deriveFont (13.0f));
        
        add(panjang);
        panjang.setBounds(20, 80, 130, 25);
        panjang.setFont (panjang.getFont ().deriveFont (13.0f));
        add(tpanjang);
        tpanjang.setBounds(150, 85, 295, 25);
        tpanjang.setFont (tpanjang.getFont ().deriveFont (13.0f));
        
        add(lebar);
        lebar.setBounds(20, 115, 130, 25);
        lebar.setFont (lebar.getFont ().deriveFont (13.0f));
        add(tlebar);
        tlebar.setBounds(150, 120, 295, 25);
        tlebar.setFont (tlebar.getFont ().deriveFont (13.0f));
        
        add(tinggi);
        tinggi.setBounds(20, 150, 130, 25);
        tinggi.setFont (tinggi.getFont ().deriveFont (13.0f));
        add(ttinggi);
        ttinggi.setBounds(150, 155, 295, 25);
        ttinggi.setFont (ttinggi.getFont ().deriveFont (13.0f));
        
        add(hitung);
        hitung.setBounds(20, 200, 425, 30);
        hitung.setFont (hitung.getFont ().deriveFont (13.0f));
        
        add(reset);
        reset.setBounds(20, 240, 425, 30);
        reset.setFont (reset.getFont ().deriveFont (13.0f));
        
        add(hasil);
        hasil.setHorizontalAlignment(SwingConstants.CENTER);
        hasil.setBounds(20, 280, 425, 30);
        hasil.setFont (hasil.getFont ().deriveFont (13.0f));
        
        add(luas);
        luas.setBounds(20, 310, 170, 25);
        luas.setFont (luas.getFont ().deriveFont (13.0f));
        add(angka1);
        angka1.setBounds(190, 310, 295, 25);
        angka1.setFont (angka1.getFont ().deriveFont (13.0f));
        
        add(keliling);
        keliling.setBounds(20, 337, 170, 25);
        keliling.setFont (keliling.getFont ().deriveFont (13.0f));
        add(angka2);
        angka2.setBounds(190, 337, 295, 25);
        angka2.setFont (angka2.getFont ().deriveFont (13.0f));
        
        add(volume);
        volume.setBounds(20, 362, 170, 25);
        volume.setFont (volume.getFont ().deriveFont (13.0f));
        add(angka3);
        angka3.setBounds(190, 362, 295, 25);
        angka3.setFont (angka3.getFont ().deriveFont (13.0f));
        
        add(lp);
        lp.setBounds(20, 387, 170, 25);
        lp.setFont (lp.getFont ().deriveFont (13.0f));
        add(angka4);
        angka4.setBounds(190, 387, 295, 25);
        angka4.setFont (angka4.getFont ().deriveFont (13.0f));
    }
}

public class HalamanUtama {
    public static void main(String[] args){
        Halaman halaman = new Halaman();
    }
}
