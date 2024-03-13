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

class Login extends JFrame{
    JLabel selamat = new JLabel("Selamat Datang!");
    JLabel masuk = new JLabel("Silakan masuk untuk melanjutkan.");
    JLabel usn = new JLabel("Username");
    JTextField tusn = new JTextField(50);
    JLabel pw = new JLabel("Password");
    JTextField tpw = new JTextField(50);
    JLabel jk = new JLabel("Jenis Kelamin");
    JRadioButton rblaki = new JRadioButton("Laki-laki");
    JRadioButton rbperempuan = new JRadioButton("Perempuan");
    JButton login = new JButton("Login");
    
    Login(){
        setVisible(true);
        setSize(480, 470);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        add(selamat);
        selamat.setBounds(20, 15, 300, 30);
        selamat.setFont (selamat.getFont ().deriveFont (22.0f));
        
        add(masuk);
        masuk.setBounds(20, 40, 300, 30);
        masuk.setFont (masuk.getFont ().deriveFont (14.0f));
        
        add(usn);
        usn.setBounds(20, 75, 300, 30);
        usn.setFont (usn.getFont ().deriveFont (14.0f));
        add(tusn);
        tusn.setBounds(20, 105, 425, 25);
        
        add(pw);
        pw.setBounds(20, 140, 300, 30);
        pw.setFont (pw.getFont ().deriveFont (14.0f));
        add(tpw);
        tpw.setBounds(20, 170, 425, 25);
        
        add(jk);
        jk.setBounds(20, 205, 425, 25);
        jk.setFont (pw.getFont ().deriveFont (14.0f));
        
        ButtonGroup pilihjk = new ButtonGroup();
        pilihjk.add(rblaki);
        pilihjk.add(rbperempuan);
        add(rblaki);
        rblaki.setBounds(20, 230, 190, 25);
        rblaki.setFont (rblaki.getFont ().deriveFont (14.0f));
        add(rbperempuan);
        rbperempuan.setBounds(220, 230, 425, 25);
        rbperempuan.setFont (rbperempuan.getFont ().deriveFont (14.0f));
        
        add(login);
        login.setBounds(20, 280, 425, 25);
        login.setFont (login.getFont ().deriveFont (14.0f));
    }
}

public class LoginPage {
    public static void main(String[] args){
        Login login = new Login();
    }
}
