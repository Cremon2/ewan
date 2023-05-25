package mp5;
// prepared by Group 3
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.*;

public class Try4 {

  public static void main(String[] args){
            
    JFrame frame = new JFrame ("GRADING SYSTEM");
               
        JPanel panel = new JPanel ();
        panel.setLayout(null);          
        JLabel label1 = new JLabel("Eclaro Academy");
        JLabel title = new JLabel ("GRADING SYSTEM");      
        JLabel fullname = new JLabel ("FullName: ");
        JTextField fn = new JTextField();
        String placeholder = "Firstname/Middlename/Lastname";  
        fn.setText(placeholder); 
        JLabel section = new JLabel ("Program: ");
        JTextField s = new JTextField( );
        String placeholders = " ";
        s.setText(placeholders);
        JLabel Q1 = new JLabel ("Quiz No.1:");
        JTextField f1 = new JTextField( );
        JLabel Q2 = new JLabel ("Quiz No.2:");
        JTextField f2 = new JTextField();
        JLabel Q3 = new JLabel ("Quiz No.3:");
        JTextField f3 = new JTextField();
        JLabel PE = new JLabel ("Prelim Exam:");
        JTextField f4 = new JTextField();
        JLabel ME = new JLabel ("Midterm Exam:");
        JTextField f5 = new JTextField();
        JLabel FE = new JLabel ("Final Exam:");
        JTextField f6 = new JTextField();
        JLabel AQ = new JLabel ("Average Quiz:");
        JTextField f7 = new JTextField();
        JLabel FG = new JLabel ("Final Grade:");
        JTextField f8 = new JTextField();
        JLabel TG = new JLabel ("Transmuted Grade:");
        JTextField f9 = new JTextField();
        JLabel R = new JLabel ("Remarks:");
        JTextField f10 = new JTextField();
        JButton print = new JButton(" Print ");
        JButton compute = new JButton("Compute");
        JButton clear = new JButton("Clear");
        JButton exit = new JButton("Exit");

        label1.setBounds(360, 30, 335, 40);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        label1.setForeground(Color.black);           
        title.setBounds(360, 70, 335, 25);
        title.setFont(new Font("Times New Roman", Font.BOLD, 18));
        title.setForeground(Color.black);
        Q1.setBounds(100, 250, 100, 20);
        Q1.setFont(new Font("Arial", Font.BOLD, 18));
        Q1.setForeground(Color.black);
        f1.setBounds(200, 250, 100, 25);
        fullname.setBounds(100, 150, 100, 20);
        fullname.setFont(new Font("Arial", Font.BOLD, 18));
        fullname.setForeground(Color.black);
        fn.setBounds(190, 150, 200, 25);
        section.setBounds(400, 150, 200, 20);
        section.setFont(new Font("Arial", Font.BOLD, 18));
        section.setForeground(Color.black);
        s.setBounds(500, 150, 150, 25);                                   
        Q2.setBounds(100, 290, 100, 20);
        Q2.setFont(new Font("Arial", Font.BOLD, 18));
        Q2.setForeground(Color.black);
        f2.setBounds (200, 290, 100, 25);
        Q3.setBounds(100, 330, 100, 20);
        Q3.setFont(new Font("Arial", Font.BOLD, 18));
        Q3.setForeground(Color.black);
        f3.setBounds (200, 330, 100, 25);
        PE.setBounds(600, 250, 120, 20);
        PE.setFont(new Font("Arial", Font.BOLD, 18));
        PE.setForeground(Color.black);
        f4.setBounds (735, 250, 100, 25);
        ME.setBounds(600, 290, 140, 20);
        ME.setFont(new Font("Arial", Font.BOLD, 18));
        ME.setForeground(Color.black);
        f5.setBounds (735, 290, 100, 25);
        FE.setBounds(600, 330, 130, 20);
        FE.setFont(new Font("Arial", Font.BOLD, 18));
        FE.setForeground(Color.black);
        f6.setBounds (735, 330, 100, 25);
        AQ.setBounds(100, 370, 135, 20);
        AQ.setFont(new Font("Arial", Font.BOLD, 18));
        AQ.setForeground(Color.black);
        f7.setBounds (240, 370, 100, 25);
        FG.setBounds(100, 420, 135, 20);
        FG.setFont(new Font("Arial", Font.BOLD, 18));
        FG.setForeground(Color.black);
        f8.setBounds (240, 420, 100, 25);
        TG.setBounds(550, 420, 170, 20);
        TG.setFont(new Font("Arial", Font.BOLD, 18));
        TG.setForeground(Color.black);
        f9.setBounds (735, 420, 100, 25);
        R.setBounds(320, 450, 100, 20);
        R.setFont(new Font("Arial", Font.BOLD, 18));
        R.setForeground(Color.black);
        f10.setBounds (410, 450, 200, 25);                
        print.setBounds(180, 520, 120, 25);
        print.setFont(new Font("Arial", Font.BOLD, 18));                
        compute.setBounds(330, 520, 120, 25);
        compute.setFont(new Font("Arial", Font.BOLD, 18));
        clear.setBounds(470, 520, 100, 25);
        clear.setFont(new Font("Arial", Font.BOLD, 18));
        exit.setBounds(600, 520, 100, 25);
        exit.setFont(new Font("Arial", Font.BOLD, 18));

          
                
          frame.setVisible(true);     
          frame.setSize(900,650);
          frame.setLocationRelativeTo(null);
          frame.add(panel);    
          panel.setBorder(BorderFactory.createMatteBorder (5, 5, 5, 5, Color.gray));              
          panel.setBackground(Color.white);           
          panel.add(label1);
          panel.add(title);
          panel.add(fullname);
          panel.add(section);
          panel.add(fn);
          panel.add(s);
          panel.add(Q1);
          panel.add(Q2);
          panel.add(Q3);
          panel.add(PE);
          panel.add(ME);
          panel.add(FE);
          panel.add(AQ);
          panel.add(FG);
          panel.add(TG);
          panel.add(R);
          panel.add(print);
          panel.add(compute);
          panel.add(clear);
          panel.add(exit);
          panel.add(f1);
          panel.add(f2);
          panel.add(f3);
          panel.add(f4);
          panel.add(f5);
          panel.add(f6);
          panel.add(f7);
          panel.add(f8);
          panel.add(f9);
          panel.add(f10);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                print.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        PrinterJob job = PrinterJob.getPrinterJob();
                        job.setPrintable(new Printable() {
                            public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
                                if (page > 0) {
                                    return NO_SUCH_PAGE;
                                }

                                Graphics2D g2d = (Graphics2D) g;
                                g2d.translate(pf.getImageableX(), pf.getImageableY());
                                frame.printAll(g2d);

							return PAGE_EXISTS;
                            }
                        });
                        boolean ok = job.printDialog();
                        if (ok) {
                            try {
                                job.print();
                            } catch (PrinterException ex) {
                            }
                        }
                    }
                });
                
          
                compute.addActionListener((ActionEvent ex) -> {                  
                   String snum1 = f1.getText();
                   int num1 = Integer.parseInt(snum1);
                   String snum2 = f2.getText();
                   int num2 = Integer.parseInt(snum2);
                   String snum3 = f3.getText();
                   int num3 = Integer.parseInt(snum3);
                   int sum = ((num1 + num2 + num3) / 3);
                   String ssum = String.valueOf(sum);
                   f7.setText(ssum);
                   
                   String snum4 = f4.getText();
                   int num4 = Integer.parseInt(snum4);
                   String snum5 = f5.getText();
                   int num5 = Integer.parseInt(snum5);
                   String snum6 = f6.getText();
                   int num6 = Integer.parseInt(snum6);
                   
                   int fg = (int) ((0.1*num4) + (0.2*num5) + (0.4*num6) + (0.3*sum));
                   String sfg = String.valueOf(fg);
                   f8.setText(sfg);
                   
                   if (fg <= 74) {
                       f9.setText("5.0");
                       f10.setText("Failed");
                   }
                   else if (fg >= 75 && fg <= 80) {
                       f9.setText("3.0");
                       f10.setText("Passed");
                   }
                   else if (fg >= 81 && fg <= 84) {
                       f9.setText("2.75");
                       f10.setText("High Passed");
                   }
                   else if (fg >= 85 && fg <= 88) {
                       f9.setText("2.5");
                       f10.setText("Satisfactory");
                   }
                   else if (fg >= 89 && fg <= 91) {
                       f9.setText("2.0");
                       f10.setText("Very Satisfactory");
                   }
                   else if (fg >= 92 && fg <= 95) {
                       f9.setText("1.75");
                       f10.setText("Good");
                   }
                   else if (fg >= 96 && fg <= 99) {
                       f9.setText("1.5");
                       f10.setText("Very Good");
                   }
                   else if (fg == 100) {
                       f9.setText("1.0");
                       f10.setText("Excellent");
                   } 
                   panel.add(print);
               });
                   
          clear.addActionListener((ActionEvent ex) -> {
                    fn.setText(null);
                    s.setText(null);
                    f1.setText(null);
                    f2.setText(null);
                    f3.setText(null);
                    f4.setText(null);
                    f5.setText(null);
                    f6.setText(null);
                    f7.setText(null);
                    f8.setText(null);
                    f9.setText(null);
                    f10.setText(null);
          });           
           exit.addActionListener((ActionEvent ex) -> {
                System.exit(0);
          });      
          fn.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (fn.getText().equals(placeholder)) {
                        fn.setText("");
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (fn.getText().isEmpty()) {
                        fn.setText(placeholder);
                    }
                }
          });
          s.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (s.getText().equals(placeholders)) {
                        s.setText("");
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (s.getText().isEmpty()) {
                        s.setText(placeholders);
                    }
                }
          });
  }     
}