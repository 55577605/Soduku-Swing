import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.PlainDocument;


public class Shudu extends JFrame {

	private JPanel contentPane;
	private JTextField m00;
	private JTextField m01;
	private JTextField m02;
	private JTextField m10;
	private JTextField m11;
	private JTextField m12;
	private JTextField m20;
	private JTextField m21;
	private JTextField m22;
	private JTextField m03;
	private JTextField m04;
	private JTextField m05;
	private JTextField m13;
	private JTextField m14;
	private JTextField m15;
	private JTextField m23;
	private JTextField m24;
	private JTextField m25;
	private JTextField m06;
	private JTextField m07;
	private JTextField m08;
	private JTextField m16;
	private JTextField m17;
	private JTextField m18;
	private JTextField m26;
	private JTextField m27;
	private JTextField m28;
	private JTextField m30;
	private JTextField m31;
	private JTextField m32;
	private JTextField m40;
	private JTextField m41;
	private JTextField m42;
	private JTextField m50;
	private JTextField m51;
	private JTextField m52;
	private JTextField m33;
	private JTextField m34;
	private JTextField m35;
	private JTextField m43;
	private JTextField m44;
	private JTextField m45;
	private JTextField m53;
	private JTextField m54;
	private JTextField m55;
	private JTextField m36;
	private JTextField m37;
	private JTextField m38;
	private JTextField m46;
	private JTextField m47;
	private JTextField m48;
	private JTextField m56;
	private JTextField m57;
	private JTextField m58;
	private JTextField m60;
	private JTextField m61;
	private JTextField m62;
	private JTextField m70;
	private JTextField m71;
	private JTextField m72;
	private JTextField m80;
	private JTextField m81;
	private JTextField m82;
	private JTextField m63;
	private JTextField m64;
	private JTextField m65;
	private JTextField m73;
	private JTextField m74;
	private JTextField m75;
	private JTextField m83;
	private JTextField m84;
	private JTextField m85;
	private JTextField m66;
	private JTextField m67;
	private JTextField m68;
	private JTextField m76;
	private JTextField m77;
	private JTextField m78;
	private JTextField m86;
	private JTextField m87;
	private JTextField m88;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shudu frame = new Shudu();
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.pack();
					frame.setTitle("数独解题");
					frame.setSize(900, 700);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Shudu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 780);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel b0 = new JPanel();
		b0.setBorder(new LineBorder(Color.LIGHT_GRAY, 4));
		b0.setBounds(0, 0, 200, 200);
		contentPane.add(b0);
		b0.setLayout(null);
		
		m00 = new JTextField();
		m00.setHorizontalAlignment(SwingConstants.CENTER);
		m00.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m00.setBounds(6, 6, 60, 60);
		b0.add(m00);
		m00.setDocument(new NumberTextField());
		m00.setColumns(10);
		
		m01 = new JTextField();
		m01.setHorizontalAlignment(SwingConstants.CENTER);
		m01.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m01.setColumns(10);
		m01.setBounds(70, 6, 60, 60);
		m01.setDocument(new NumberTextField());
		b0.add(m01);
		
		m02 = new JTextField();
		m02.setHorizontalAlignment(SwingConstants.CENTER);
		m02.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m02.setColumns(10);
		m02.setBounds(134, 6, 60, 60);
		m02.setDocument(new NumberTextField());
		b0.add(m02);
		
		m10 = new JTextField();
		m10.setHorizontalAlignment(SwingConstants.CENTER);
		m10.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m10.setColumns(10);
		m10.setBounds(6, 70, 60, 60);
		m10.setDocument(new NumberTextField());
		b0.add(m10);
		
		m11 = new JTextField();
		m11.setHorizontalAlignment(SwingConstants.CENTER);
		m11.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m11.setColumns(10);
		m11.setBounds(70, 70, 60, 60);
		m11.setDocument(new NumberTextField());
		b0.add(m11);
		
		m12 = new JTextField();
		m12.setHorizontalAlignment(SwingConstants.CENTER);
		m12.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m12.setColumns(10);
		m12.setBounds(134, 70, 60, 60);
		m12.setDocument(new NumberTextField());
		b0.add(m12);
		
		m20 = new JTextField();
		m20.setHorizontalAlignment(SwingConstants.CENTER);
		m20.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m20.setColumns(10);
		m20.setBounds(6, 134, 60, 60);
		m20.setDocument(new NumberTextField());
		b0.add(m20);
		
		m21 = new JTextField();
		m21.setHorizontalAlignment(SwingConstants.CENTER);
		m21.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m21.setColumns(10);
		m21.setBounds(70, 134, 60, 60);
		m21.setDocument(new NumberTextField());
		b0.add(m21);
		
		m22 = new JTextField();
		m22.setHorizontalAlignment(SwingConstants.CENTER);
		m22.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m22.setColumns(10);
		m22.setBounds(134, 134, 60, 60);
		m22.setDocument(new NumberTextField());
		b0.add(m22);
		
		JPanel b1 = new JPanel();
		b1.setLayout(null);
		b1.setBorder(new LineBorder(Color.LIGHT_GRAY, 4));
		b1.setBounds(210, 0, 200, 200);
		contentPane.add(b1);
		
		m03 = new JTextField();
		m03.setHorizontalAlignment(SwingConstants.CENTER);
		m03.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m03.setColumns(10);
		m03.setBounds(6, 6, 60, 60);
		m03.setDocument(new NumberTextField());
		b1.add(m03);
		
		m04 = new JTextField();
		m04.setHorizontalAlignment(SwingConstants.CENTER);
		m04.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m04.setColumns(10);
		m04.setBounds(70, 6, 60, 60);
		m04.setDocument(new NumberTextField());
		b1.add(m04);
		
		m05 = new JTextField();
		m05.setHorizontalAlignment(SwingConstants.CENTER);
		m05.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m05.setColumns(10);
		m05.setBounds(134, 6, 60, 60);
		m05.setDocument(new NumberTextField());
		b1.add(m05);
		
		m13 = new JTextField();
		m13.setHorizontalAlignment(SwingConstants.CENTER);
		m13.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m13.setColumns(10);
		m13.setBounds(6, 70, 60, 60);
		m13.setDocument(new NumberTextField());
		b1.add(m13);
		
		m14 = new JTextField();
		m14.setHorizontalAlignment(SwingConstants.CENTER);
		m14.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m14.setColumns(10);
		m14.setBounds(70, 70, 60, 60);
		m14.setDocument(new NumberTextField());
		b1.add(m14);
		
		m15 = new JTextField();
		m15.setHorizontalAlignment(SwingConstants.CENTER);
		m15.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m15.setColumns(10);
		m15.setBounds(134, 70, 60, 60);
		m15.setDocument(new NumberTextField());
		b1.add(m15);
		
		m23 = new JTextField();
		m23.setHorizontalAlignment(SwingConstants.CENTER);
		m23.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m23.setColumns(10);
		m23.setBounds(6, 134, 60, 60);
		m23.setDocument(new NumberTextField());
		b1.add(m23);
		
		m24 = new JTextField();
		m24.setHorizontalAlignment(SwingConstants.CENTER);
		m24.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m24.setColumns(10);
		m24.setBounds(70, 134, 60, 60);
		m24.setDocument(new NumberTextField());
		b1.add(m24);
		
		m25 = new JTextField();
		m25.setHorizontalAlignment(SwingConstants.CENTER);
		m25.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m25.setColumns(10);
		m25.setBounds(134, 134, 60, 60);
		m25.setDocument(new NumberTextField());
		b1.add(m25);
		
		JPanel b2 = new JPanel();
		b2.setLayout(null);
		b2.setBorder(new LineBorder(Color.LIGHT_GRAY, 4));
		b2.setBounds(420, 0, 200, 200);
		contentPane.add(b2);
		
		m06 = new JTextField();
		m06.setHorizontalAlignment(SwingConstants.CENTER);
		m06.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m06.setColumns(10);
		m06.setBounds(6, 6, 60, 60);
		m06.setDocument(new NumberTextField());
		b2.add(m06);
		
		m07 = new JTextField();
		m07.setHorizontalAlignment(SwingConstants.CENTER);
		m07.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m07.setColumns(10);
		m07.setBounds(70, 6, 60, 60);
		m07.setDocument(new NumberTextField());
		b2.add(m07);
		
		m08 = new JTextField();
		m08.setHorizontalAlignment(SwingConstants.CENTER);
		m08.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m08.setColumns(10);
		m08.setBounds(134, 6, 60, 60);
		m08.setDocument(new NumberTextField());
		b2.add(m08);
		
		m16 = new JTextField();
		m16.setHorizontalAlignment(SwingConstants.CENTER);
		m16.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m16.setColumns(10);
		m16.setBounds(6, 70, 60, 60);
		m16.setDocument(new NumberTextField());
		b2.add(m16);
		
		m17 = new JTextField();
		m17.setHorizontalAlignment(SwingConstants.CENTER);
		m17.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m17.setColumns(10);
		m17.setBounds(70, 70, 60, 60);
		m17.setDocument(new NumberTextField());
		b2.add(m17);
		
		m18 = new JTextField();
		m18.setHorizontalAlignment(SwingConstants.CENTER);
		m18.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m18.setColumns(10);
		m18.setBounds(134, 70, 60, 60);
		m18.setDocument(new NumberTextField());
		b2.add(m18);
		
		m26 = new JTextField();
		m26.setHorizontalAlignment(SwingConstants.CENTER);
		m26.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m26.setColumns(10);
		m26.setBounds(6, 134, 60, 60);
		m26.setDocument(new NumberTextField());
		b2.add(m26);
		
		m27 = new JTextField();
		m27.setHorizontalAlignment(SwingConstants.CENTER);
		m27.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m27.setColumns(10);
		m27.setBounds(70, 134, 60, 60);
		m27.setDocument(new NumberTextField());
		b2.add(m27);
		
		m28 = new JTextField();
		m28.setHorizontalAlignment(SwingConstants.CENTER);
		m28.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m28.setColumns(10);
		m28.setBounds(134, 134, 60, 60);
		m28.setDocument(new NumberTextField());
		b2.add(m28);
		
		JPanel b3 = new JPanel();
		b3.setLayout(null);
		b3.setBorder(new LineBorder(Color.LIGHT_GRAY, 4));
		b3.setBounds(0, 210, 200, 200);
		contentPane.add(b3);
		
		m30 = new JTextField();
		m30.setHorizontalAlignment(SwingConstants.CENTER);
		m30.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m30.setColumns(10);
		m30.setBounds(6, 6, 60, 60);
		m30.setDocument(new NumberTextField());
		b3.add(m30);
		
		m31 = new JTextField();
		m31.setHorizontalAlignment(SwingConstants.CENTER);
		m31.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m31.setColumns(10);
		m31.setBounds(70, 6, 60, 60);
		m31.setDocument(new NumberTextField());
		b3.add(m31);
		
		m32 = new JTextField();
		m32.setHorizontalAlignment(SwingConstants.CENTER);
		m32.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m32.setColumns(10);
		m32.setBounds(134, 6, 60, 60);
		m32.setDocument(new NumberTextField());
		b3.add(m32);
		
		m40 = new JTextField();
		m40.setHorizontalAlignment(SwingConstants.CENTER);
		m40.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m40.setColumns(10);
		m40.setBounds(6, 70, 60, 60);
		m40.setDocument(new NumberTextField());
		b3.add(m40);
		
		m41 = new JTextField();
		m41.setHorizontalAlignment(SwingConstants.CENTER);
		m41.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m41.setColumns(10);
		m41.setBounds(70, 70, 60, 60);
		m41.setDocument(new NumberTextField());
		b3.add(m41);
		
		m42 = new JTextField();
		m42.setHorizontalAlignment(SwingConstants.CENTER);
		m42.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m42.setColumns(10);
		m42.setBounds(134, 70, 60, 60);
		m42.setDocument(new NumberTextField());
		b3.add(m42);
		
		m50 = new JTextField();
		m50.setHorizontalAlignment(SwingConstants.CENTER);
		m50.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m50.setColumns(10);
		m50.setBounds(6, 134, 60, 60);
		m50.setDocument(new NumberTextField());
		b3.add(m50);
		
		m51 = new JTextField();
		m51.setHorizontalAlignment(SwingConstants.CENTER);
		m51.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m51.setColumns(10);
		m51.setBounds(70, 134, 60, 60);
		m51.setDocument(new NumberTextField());
		b3.add(m51);
		
		m52 = new JTextField();
		m52.setHorizontalAlignment(SwingConstants.CENTER);
		m52.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m52.setColumns(10);
		m52.setBounds(134, 134, 60, 60);
		m52.setDocument(new NumberTextField());
		b3.add(m52);
		
		JPanel b4 = new JPanel();
		b4.setLayout(null);
		b4.setBorder(new LineBorder(Color.LIGHT_GRAY, 4));
		b4.setBounds(210, 210, 200, 200);
		contentPane.add(b4);
		
		m33 = new JTextField();
		m33.setHorizontalAlignment(SwingConstants.CENTER);
		m33.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m33.setColumns(10);
		m33.setBounds(6, 6, 60, 60);
		m33.setDocument(new NumberTextField());
		b4.add(m33);
		
		m34 = new JTextField();
		m34.setHorizontalAlignment(SwingConstants.CENTER);
		m34.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m34.setColumns(10);
		m34.setBounds(70, 6, 60, 60);
		m34.setDocument(new NumberTextField());
		b4.add(m34);
		
		m35 = new JTextField();
		m35.setHorizontalAlignment(SwingConstants.CENTER);
		m35.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m35.setColumns(10);
		m35.setBounds(134, 6, 60, 60);
		m35.setDocument(new NumberTextField());
		b4.add(m35);
		
		m43 = new JTextField();
		m43.setHorizontalAlignment(SwingConstants.CENTER);
		m43.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m43.setColumns(10);
		m43.setBounds(6, 70, 60, 60);
		m43.setDocument(new NumberTextField());
		b4.add(m43);
		
		m44 = new JTextField();
		m44.setHorizontalAlignment(SwingConstants.CENTER);
		m44.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m44.setColumns(10);
		m44.setBounds(70, 70, 60, 60);
		m44.setDocument(new NumberTextField());
		b4.add(m44);
		
		m45 = new JTextField();
		m45.setHorizontalAlignment(SwingConstants.CENTER);
		m45.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m45.setColumns(10);
		m45.setBounds(134, 70, 60, 60);
		m45.setDocument(new NumberTextField());
		b4.add(m45);
		
		m53 = new JTextField();
		m53.setHorizontalAlignment(SwingConstants.CENTER);
		m53.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m53.setColumns(10);
		m53.setBounds(6, 134, 60, 60);
		m53.setDocument(new NumberTextField());
		b4.add(m53);
		
		m54 = new JTextField();
		m54.setHorizontalAlignment(SwingConstants.CENTER);
		m54.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m54.setColumns(10);
		m54.setBounds(70, 134, 60, 60);
		m54.setDocument(new NumberTextField());
		b4.add(m54);
		
		m55 = new JTextField();
		m55.setHorizontalAlignment(SwingConstants.CENTER);
		m55.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m55.setColumns(10);
		m55.setBounds(134, 134, 60, 60);
		m55.setDocument(new NumberTextField());
		b4.add(m55);
		
		JPanel b5 = new JPanel();
		b5.setLayout(null);
		b5.setBorder(new LineBorder(Color.LIGHT_GRAY, 4));
		b5.setBounds(420, 210, 200, 200);
		contentPane.add(b5);
		
		m36 = new JTextField();
		m36.setHorizontalAlignment(SwingConstants.CENTER);
		m36.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m36.setColumns(10);
		m36.setBounds(6, 6, 60, 60);
		m36.setDocument(new NumberTextField());
		b5.add(m36);
		
		m37 = new JTextField();
		m37.setHorizontalAlignment(SwingConstants.CENTER);
		m37.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m37.setColumns(10);
		m37.setBounds(70, 6, 60, 60);
		m37.setDocument(new NumberTextField());
		b5.add(m37);
		
		m38 = new JTextField();
		m38.setHorizontalAlignment(SwingConstants.CENTER);
		m38.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m38.setColumns(10);
		m38.setBounds(134, 6, 60, 60);
		m38.setDocument(new NumberTextField());
		b5.add(m38);
		
		m46 = new JTextField();
		m46.setHorizontalAlignment(SwingConstants.CENTER);
		m46.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m46.setColumns(10);
		m46.setBounds(6, 70, 60, 60);
		m46.setDocument(new NumberTextField());
		b5.add(m46);
		
		m47 = new JTextField();
		m47.setHorizontalAlignment(SwingConstants.CENTER);
		m47.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m47.setColumns(10);
		m47.setBounds(70, 70, 60, 60);
		m47.setDocument(new NumberTextField());
		b5.add(m47);
		
		m48 = new JTextField();
		m48.setHorizontalAlignment(SwingConstants.CENTER);
		m48.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m48.setColumns(10);
		m48.setBounds(134, 70, 60, 60);
		m48.setDocument(new NumberTextField());
		b5.add(m48);
		
		m56 = new JTextField();
		m56.setHorizontalAlignment(SwingConstants.CENTER);
		m56.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m56.setColumns(10);
		m56.setBounds(6, 134, 60, 60);
		m56.setDocument(new NumberTextField());
		b5.add(m56);
		
		m57 = new JTextField();
		m57.setHorizontalAlignment(SwingConstants.CENTER);
		m57.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m57.setColumns(10);
		m57.setBounds(70, 134, 60, 60);
		m57.setDocument(new NumberTextField());
		b5.add(m57);
		
		m58 = new JTextField();
		m58.setHorizontalAlignment(SwingConstants.CENTER);
		m58.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m58.setColumns(10);
		m58.setBounds(134, 134, 60, 60);
		m58.setDocument(new NumberTextField());
		b5.add(m58);
		
		JPanel b6 = new JPanel();
		b6.setLayout(null);
		b6.setBorder(new LineBorder(Color.LIGHT_GRAY, 4));
		b6.setBounds(0, 420, 200, 200);
		contentPane.add(b6);
		
		m60 = new JTextField();
		m60.setHorizontalAlignment(SwingConstants.CENTER);
		m60.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m60.setColumns(10);
		m60.setBounds(6, 6, 60, 60);
		m60.setDocument(new NumberTextField());
		b6.add(m60);
		
		m61 = new JTextField();
		m61.setHorizontalAlignment(SwingConstants.CENTER);
		m61.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m61.setColumns(10);
		m61.setBounds(70, 6, 60, 60);
		m61.setDocument(new NumberTextField());
		b6.add(m61);
		
		m62 = new JTextField();
		m62.setHorizontalAlignment(SwingConstants.CENTER);
		m62.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m62.setColumns(10);
		m62.setBounds(134, 6, 60, 60);
		m62.setDocument(new NumberTextField());
		b6.add(m62);
		
		m70 = new JTextField();
		m70.setHorizontalAlignment(SwingConstants.CENTER);
		m70.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m70.setColumns(10);
		m70.setBounds(6, 70, 60, 60);
		m70.setDocument(new NumberTextField());
		b6.add(m70);
		
		m71 = new JTextField();
		m71.setHorizontalAlignment(SwingConstants.CENTER);
		m71.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m71.setColumns(10);
		m71.setBounds(70, 70, 60, 60);
		m71.setDocument(new NumberTextField());
		b6.add(m71);
		
		m72 = new JTextField();
		m72.setHorizontalAlignment(SwingConstants.CENTER);
		m72.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m72.setColumns(10);
		m72.setBounds(134, 70, 60, 60);
		m72.setDocument(new NumberTextField());
		b6.add(m72);
		
		m80 = new JTextField();
		m80.setHorizontalAlignment(SwingConstants.CENTER);
		m80.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m80.setColumns(10);
		m80.setBounds(6, 134, 60, 60);
		m80.setDocument(new NumberTextField());
		b6.add(m80);
		
		m81 = new JTextField();
		m81.setHorizontalAlignment(SwingConstants.CENTER);
		m81.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m81.setColumns(10);
		m81.setBounds(70, 134, 60, 60);
		m81.setDocument(new NumberTextField());
		b6.add(m81);
		
		m82 = new JTextField();
		m82.setHorizontalAlignment(SwingConstants.CENTER);
		m82.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m82.setColumns(10);
		m82.setBounds(134, 134, 60, 60);
		m82.setDocument(new NumberTextField());
		b6.add(m82);
		
		JPanel b7 = new JPanel();
		b7.setLayout(null);
		b7.setBorder(new LineBorder(Color.LIGHT_GRAY, 4));
		b7.setBounds(210, 420, 200, 200);
		contentPane.add(b7);
		
		m63 = new JTextField();
		m63.setHorizontalAlignment(SwingConstants.CENTER);
		m63.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m63.setColumns(10);
		m63.setBounds(6, 6, 60, 60);
		m63.setDocument(new NumberTextField());
		b7.add(m63);
		
		m64 = new JTextField();
		m64.setHorizontalAlignment(SwingConstants.CENTER);
		m64.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m64.setColumns(10);
		m64.setBounds(70, 6, 60, 60);
		m64.setDocument(new NumberTextField());
		b7.add(m64);
		
		m65 = new JTextField();
		m65.setHorizontalAlignment(SwingConstants.CENTER);
		m65.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m65.setColumns(10);
		m65.setBounds(134, 6, 60, 60);
		m65.setDocument(new NumberTextField());
		b7.add(m65);
		
		m73 = new JTextField();
		m73.setHorizontalAlignment(SwingConstants.CENTER);
		m73.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m73.setColumns(10);
		m73.setBounds(6, 70, 60, 60);
		m73.setDocument(new NumberTextField());
		b7.add(m73);
		
		m74 = new JTextField();
		m74.setHorizontalAlignment(SwingConstants.CENTER);
		m74.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m74.setColumns(10);
		m74.setBounds(70, 70, 60, 60);
		m74.setDocument(new NumberTextField());
		b7.add(m74);
		
		m75 = new JTextField();
		m75.setHorizontalAlignment(SwingConstants.CENTER);
		m75.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m75.setColumns(10);
		m75.setBounds(134, 70, 60, 60);
		m75.setDocument(new NumberTextField());
		b7.add(m75);
		
		m83 = new JTextField();
		m83.setHorizontalAlignment(SwingConstants.CENTER);
		m83.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m83.setColumns(10);
		m83.setBounds(6, 134, 60, 60);
		m83.setDocument(new NumberTextField());
		b7.add(m83);
		
		m84 = new JTextField();
		m84.setHorizontalAlignment(SwingConstants.CENTER);
		m84.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m84.setColumns(10);
		m84.setBounds(70, 134, 60, 60);
		m84.setDocument(new NumberTextField());
		b7.add(m84);
		
		m85 = new JTextField();
		m85.setHorizontalAlignment(SwingConstants.CENTER);
		m85.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m85.setColumns(10);
		m85.setBounds(134, 134, 60, 60);
		m85.setDocument(new NumberTextField());
		b7.add(m85);
		
		JPanel b8 = new JPanel();
		b8.setLayout(null);
		b8.setBorder(new LineBorder(Color.LIGHT_GRAY, 4));
		b8.setBounds(420, 420, 200, 200);
		contentPane.add(b8);
		
		m66 = new JTextField();
		m66.setHorizontalAlignment(SwingConstants.CENTER);
		m66.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m66.setColumns(10);
		m66.setBounds(6, 6, 60, 60);
		m66.setDocument(new NumberTextField());
		b8.add(m66);
		
		m67 = new JTextField();
		m67.setHorizontalAlignment(SwingConstants.CENTER);
		m67.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m67.setColumns(10);
		m67.setBounds(70, 6, 60, 60);
		m67.setDocument(new NumberTextField());
		b8.add(m67);
		
		m68 = new JTextField();
		m68.setHorizontalAlignment(SwingConstants.CENTER);
		m68.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m68.setColumns(10);
		m68.setBounds(134, 6, 60, 60);
		m68.setDocument(new NumberTextField());
		b8.add(m68);
		
		m76 = new JTextField();
		m76.setHorizontalAlignment(SwingConstants.CENTER);
		m76.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m76.setColumns(10);
		m76.setBounds(6, 70, 60, 60);
		m76.setDocument(new NumberTextField());
		b8.add(m76);
		
		m77 = new JTextField();
		m77.setHorizontalAlignment(SwingConstants.CENTER);
		m77.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m77.setColumns(10);
		m77.setBounds(70, 70, 60, 60);
		m77.setDocument(new NumberTextField());
		b8.add(m77);
		
		m78 = new JTextField();
		m78.setHorizontalAlignment(SwingConstants.CENTER);
		m78.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m78.setColumns(10);
		m78.setBounds(134, 70, 60, 60);
		m78.setDocument(new NumberTextField());
		b8.add(m78);
		
		m86 = new JTextField();
		m86.setHorizontalAlignment(SwingConstants.CENTER);
		m86.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m86.setColumns(10);
		m86.setBounds(6, 134, 60, 60);
		m86.setDocument(new NumberTextField());
		b8.add(m86);
		
		m87 = new JTextField();
		m87.setHorizontalAlignment(SwingConstants.CENTER);
		m87.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m87.setColumns(10);
		m87.setBounds(70, 134, 60, 60);
		m87.setDocument(new NumberTextField());
		b8.add(m87);
		
		m88 = new JTextField();
		m88.setHorizontalAlignment(SwingConstants.CENTER);
		m88.setFont(new Font("微软雅黑 Light", Font.BOLD, 34));
		m88.setColumns(10);
		m88.setBounds(134, 134, 60, 60);
		m88.setDocument(new NumberTextField());
		b8.add(m88);
		
		JButton button1 = new JButton("\u8BA1\u7B97");
		button1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				init();
				solver();
				 
					//开始赋值
					for(int i=0;i<9;i++){
						for(int j=0;j<9;j++){
							ms[i][j].setText(String.valueOf(source[i][j]));
							if(sourcecopy[i][j] == 0){
								ms[i][j].setForeground(Color.RED);
							}
						}
					}
				
			}
		});
		button1.setFont(new Font("微软雅黑", Font.PLAIN, 23));
		button1.setBounds(630, 233, 150, 60);
		contentPane.add(button1);
		
		JButton button = new JButton("\u91CD\u7F6E");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//把sourcecopy赋值进去
				for(int i=0;i<9;i++){
					for(int j=0;j<9;j++){
						ms[i][j].setForeground(Color.BLACK);
						if(sourcecopy[i][j] == 0){
							ms[i][j].setText("");
						}else{
							ms[i][j].setText(String.valueOf(sourcecopy[i][j]));
						}
					}
				}
			}
		});
		button.setFont(new Font("微软雅黑", Font.PLAIN, 23));
		button.setBounds(630, 132, 150, 60);
		contentPane.add(button);
		
		button_1 = new JButton("\u6E05\u9664\u6240\u6709");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<9;i++){
					for(int j=0;j<9;j++){
						ms[i][j].setForeground(Color.BLACK);
						ms[i][j].setText("");
					}
				}
			}
		});
		button_1.setFont(new Font("微软雅黑", Font.PLAIN, 23));
		button_1.setBounds(630, 335, 150, 60);
		contentPane.add(button_1);
	}
	public int[][] source;
	public int[][] sourcecopy;
	public JTextField[][] ms;
	private JButton button_1;
	
	public void init(){
		source = new int[9][9];
		sourcecopy = new int[9][9];
		source[0][0] = getValue(m00);
		source[0][1] = getValue(m01);
		source[0][2] = getValue(m02);
		source[0][3] = getValue(m03);
		source[0][4] = getValue(m04);
		source[0][5] = getValue(m05);
		source[0][6] = getValue(m06);
		source[0][7] = getValue(m07);
		source[0][8] = getValue(m08);
		
		source[1][0] = getValue(m10);
		source[1][1] = getValue(m11);
		source[1][2] = getValue(m12);
		source[1][3] = getValue(m13);
		source[1][4] = getValue(m14);
		source[1][5] = getValue(m15);
		source[1][6] = getValue(m16);
		source[1][7] = getValue(m17);
		source[1][8] = getValue(m18);
		
		source[2][0] = getValue(m20);
		source[2][1] = getValue(m21);
		source[2][2] = getValue(m22);
		source[2][3] = getValue(m23);
		source[2][4] = getValue(m24);
		source[2][5] = getValue(m25);
		source[2][6] = getValue(m26);
		source[2][7] = getValue(m27);
		source[2][8] = getValue(m28);
		
		
		source[3][0] = getValue(m30);
		source[3][1] = getValue(m31);
		source[3][2] = getValue(m32);
		source[3][3] = getValue(m33);
		source[3][4] = getValue(m34);
		source[3][5] = getValue(m35);
		source[3][6] = getValue(m36);
		source[3][7] = getValue(m37);
		source[3][8] = getValue(m38);
		
		source[4][0] = getValue(m40);
		source[4][1] = getValue(m41);
		source[4][2] = getValue(m42);
		source[4][3] = getValue(m43);
		source[4][4] = getValue(m44);
		source[4][5] = getValue(m45);
		source[4][6] = getValue(m46);
		source[4][7] = getValue(m47);
		source[4][8] = getValue(m48);
		
		source[5][0] = getValue(m50);
		source[5][1] = getValue(m51);
		source[5][2] = getValue(m52);
		source[5][3] = getValue(m53);
		source[5][4] = getValue(m54);
		source[5][5] = getValue(m55);
		source[5][6] = getValue(m56);
		source[5][7] = getValue(m57);
		source[5][8] = getValue(m58);
		
		source[6][0] = getValue(m60);
		source[6][1] = getValue(m61);
		source[6][2] = getValue(m62);
		source[6][3] = getValue(m63);
		source[6][4] = getValue(m64);
		source[6][5] = getValue(m65);
		source[6][6] = getValue(m66);
		source[6][7] = getValue(m67);
		source[6][8] = getValue(m68);
		
		source[7][0] = getValue(m70);
		source[7][1] = getValue(m71);
		source[7][2] = getValue(m72);
		source[7][3] = getValue(m73);
		source[7][4] = getValue(m74);
		source[7][5] = getValue(m75);
		source[7][6] = getValue(m76);
		source[7][7] = getValue(m77);
		source[7][8] = getValue(m78);
		
		source[8][0] = getValue(m80);
		source[8][1] = getValue(m81);
		source[8][2] = getValue(m82);
		source[8][3] = getValue(m83);
		source[8][4] = getValue(m84);
		source[8][5] = getValue(m85);
		source[8][6] = getValue(m86);
		source[8][7] = getValue(m87);
		source[8][8] = getValue(m88);
		
		for(int i=0;i<source.length;i++){
			sourcecopy[i] = Arrays.copyOf(source[i],source[i].length);
		}
		ms= new JTextField[][]{
				{m00,m01,m02,m03,m04,m05,m06,m07,m08},
				{m10,m11,m12,m13,m14,m15,m16,m17,m18},
				{m20,m21,m22,m23,m24,m25,m26,m27,m28},
				{m30,m31,m32,m33,m34,m35,m36,m37,m38},
				{m40,m41,m42,m43,m44,m45,m46,m47,m48},
				{m50,m51,m52,m53,m54,m55,m56,m57,m58},
				{m60,m61,m62,m63,m64,m65,m66,m67,m68},
				{m70,m71,m72,m73,m74,m75,m76,m77,m78},
				{m80,m81,m82,m83,m84,m85,m86,m87,m88},
		};
		
	}
	private int getValue(JTextField m){
		String t = m.getText();
		if(t!=null && !t.isEmpty()){
			return Integer.valueOf(t);
		}else return 0;
	}
	
	
	public boolean solver(){
	//开始放置数字
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(source[i][j] == 0){
					//如果还没填写数字 开始从1到9试数字
					for(int m=1;m<10;m++){
						//判断m是否已经在行列九宫内出现
						if(notexist(i,j,m)){
							//如果没用出现。设置值
							source[i][j] = m;
							if(solver()){
								return true;
							}else{
								source[i][j] = 0;
							}
						}
					}
					return false;
				}
			}
		}
		return true;
	}
	public boolean  notexist(int row,int col,int m){
		int startrow = row/3 * 3;
		int startcol = col/3 * 3;
		for(int i=0;i<9;i++){
			if(source[row][i] == m) return false;
			if(source[i][col] == m) return false;
			if(source[startrow+i/3][startcol+i%3] == m) return false;
		}
		return true;
	
	}
}


class NumberTextField extends PlainDocument {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NumberTextField() {
        super();
    }

    public void insertString(int offset, String str, AttributeSet attr)
            throws javax.swing.text.BadLocationException {
        if (str == null || getLength()>0) {
            return;
        }
        
        char[] s = str.toCharArray();
        int length = 0;
        // 过滤非数字
        for (int i = 0; i < s.length; i++) {
            if ((s[i] >= '0') && (s[i] <= '9')) {
                s[length++] = s[i];
            }
        // 插入内容
            super.insertString(offset, new String(s, 0, length), attr);
        
        }
    }
}
