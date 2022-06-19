import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class clsframe extends JFrame implements ActionListener
{
	private Container konten = new Container();
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	private JPanel panel4 = new JPanel();
	private JPanel panel5 = new JPanel();
	private JPanel panel6 = new JPanel();
	
	private JLabel lblJdl = new JLabel("DAFTAR PESANAN");
	private JLabel lblNoMeja = new JLabel("No.Meja");
	private JLabel lblMakanan = new JLabel("Makanan");
	private JLabel lblMinuman = new JLabel("Minuman");
	private JLabel lblNmPemesan = new JLabel("Nama Pemesan");
	private JLabel lblSifat = new JLabel("Sifat");
	private JLabel lblCaraByr = new JLabel("Cara Pembayaran");
	
	private JTextField txtNoMeja = new JTextField();
	private JTextField txtNmPemesan = new JTextField();
	
	private ButtonGroup rdSifat = new ButtonGroup();
	private JRadioButton rdDitempat = new JRadioButton("Makan di Tempat",true);
	private JRadioButton rdDelivery = new JRadioButton("Delivery");
	private JRadioButton rdPulang = new JRadioButton("Bawa Pulang");
	
	private JComboBox cmbMakanan;
	private String Mkn [] = {"Bakso","Nasi Goreng","Sate Ayam","Soto Ayam","Siomay"};
	
	private JComboBox cmbMinuman;
	private String Mnmn [] = {"Air Mineral","Es Teh Manis","Es Jeruk Manis","Cappucino Cincau","Thai Tea"};
	
	private JComboBox cmbCaraByr;
	private String Byr [] = {"Cash","Transfer","Kredit"};
	
	private JButton btnTampil = new JButton("TAMPIL");
	
	clsframe()
	{
		super("UAS PBO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(100,200);
		setResizable(true);
		setSize(550,250);
		
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel1.add(lblJdl);
		
		//note : 5,1 adalah baris dan kolom.. Baris adalah sususan dalam bentuk vertical(kebawah), sedangkan kolom susunan horizontal(menyamping).
		//jadi 5,1 adalah 5 baris dalam 1 kolom yaitu 5 elemen kebawah dalam 1 kolom
		panel2.setLayout(new GridLayout(5,1));
		panel2.add(lblNoMeja);
		panel2.add(lblMakanan);
		panel2.add(lblNmPemesan);
		panel2.add(lblSifat);
		panel2.add(lblCaraByr);
		
		cmbMakanan = new JComboBox(Mkn);
		cmbMakanan.setMaximumRowCount(6);
		
		cmbMinuman = new JComboBox(Mnmn);
		cmbMinuman.setMaximumRowCount(6);
		
		cmbCaraByr = new JComboBox(Byr);
		cmbCaraByr.setMaximumRowCount(3);
		
		panel3.setLayout(new GridLayout(5,1));
		panel3.add(txtNoMeja);
		panel3.add(panel5);
		panel3.add(txtNmPemesan);
		panel3.add(panel4);
		panel3.add(cmbCaraByr);
		
		panel4.setLayout(new GridLayout(1,3));
		panel4.add(rdDitempat);
		panel4.add(rdDelivery);
		panel4.add(rdPulang);
		
		rdSifat.add(rdDitempat);
		rdSifat.add(rdDelivery);
		rdSifat.add(rdPulang);
		
		panel5.setLayout(new GridLayout(1,1));
		panel5.add(cmbMakanan);
		panel5.add(new JLabel());
		panel5.add(lblMinuman);
		panel5.add(cmbMinuman);
		
		
		panel6.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel6.add(btnTampil);
		
		konten = getContentPane();
		konten.setLayout(new BorderLayout());
		konten.add(panel1,BorderLayout.NORTH);
		konten.add(panel2,BorderLayout.WEST);
		konten.add(panel3,BorderLayout.CENTER);
		konten.add(panel6,BorderLayout.SOUTH);
		
		btnTampil.addActionListener(this);
		show();
	}
	public void actionPerformed(ActionEvent r)
	{
		if (r.getSource() == btnTampil)
		{
			String tampil = "";
			tampil+="D A T A  P E S A N A N" + "\n\n";
			tampil+="Nomor Meja         : " + txtNoMeja.getText()+"\n";
			tampil+="Makanan               : " + cmbMakanan.getSelectedItem()+"\n";
			tampil+="Minuman               : " + cmbMinuman.getSelectedItem()+"\n";
			tampil+="Nama Pemesan    : " + txtNmPemesan.getText()+"\n";
			if (rdDitempat.isSelected())
			{
				tampil+="Sifat Pesanan       : " + rdDitempat.getText() + "\n";
			}
			else if (rdDelivery.isSelected())
			{
				tampil+="Sifat Pesanan       : " + rdDelivery.getText() + "\n";
			}
			else if (rdPulang.isSelected())
			{
				tampil+="Sifat Pesanan       : " + rdPulang.getText() + "\n";
			}
			else
			{
				tampil+="BELUM DIPILIH\n\n";
			}
			
			tampil+="Cara Pembayaran : " + cmbCaraByr.getSelectedItem()+"\n";
			JOptionPane.showMessageDialog(null,tampil,"DATA PESANAN",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
public class uasPBO_AriJanuari_1911500154
{
	public static void main (String[] args)
	{
		new clsframe();
	}
}