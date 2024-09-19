package StudentRecordPackage;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.*;

public class FrontPage {
      JFrame frame;
     JLabel label,label2,label3,label4,label5,label6;
     JLabel label7,label8,label9,label10,label11,label12,label13,label14,label15,label16;
    JButton button,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;
    JPanel panel,panel1,panel2,panel3;
    JTextField text1,text2,text3,text4,text5,text6,text7,text8;
    JTextArea textArea1;
    String s1,s3,s4,s2,s5,s6,s7,s8;
    public static void main(String[] arg)throws Exception {
        FrontPage f = new FrontPage();
        f.go();
    }
        public void go()
        {
        frame = new JFrame();
        frame.setSize(1980,1080);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);


        label = new JLabel("Student Record Application");
        Font font  = new Font("serif",Font.BOLD,80);
        label.setFont(font);

        label.setVisible(true);
        label.setBounds(500,100,1200,500);
        frame.getContentPane().add(label);

       button  = new JButton("Press for further");
       button.setVisible(true);
       button.setBounds(850,400,200,50);
       Font f = new Font("serif",Font.BOLD,20);
       button.setFont(f);
       frame.getContentPane().add(button);
       button.addActionListener(new SecondPage());

            panel = new JPanel();
            panel.setBounds(1,1,1980,1080);
            panel.setBackground(Color.WHITE);
            panel.setVisible(true);

       button1 = new JButton("Data Insertion");
       button1.setVisible(true);
       button1.setBounds(50,500,150,30);
            panel.add(button1);

            panel1 = new JPanel();
            panel1.setVisible(true);
            panel1.setBounds(1,1,1982,1080);
            panel1.setBackground(Color.WHITE);
        button1.addActionListener(new ThirdPage());
            button2 = new JButton("privious");
            button2.setBounds(50,500,100,30);
            panel1.add(button2);
            button2.setVisible(true);
            panel.setLayout(null);
            button3 = new JButton("Exit");
            button3.setVisible(true);
            button3.setBounds(200,500,80,30);
            panel.add(button3);
            button4 = new JButton("Data Retrieve");
            button4.setVisible(true);
            button4.setBounds(280,500,150,30);
            button4.addActionListener(new FourPage());
            panel.add(button4);


            panel2 = new JPanel();
            panel2.setLayout(null);
            panel2.setVisible(true);
            panel2.setBounds(1,1,1980,1080);


            Font font1 = new Font("serif",Font.BOLD,20);
            label3 = new JLabel("Choose your Quary");
            label3.setFont(font1);
            label3.setVisible(true);
            label3.setBounds(50,100,200,40);
            panel.add(label3);

            Font font2 = new Font("serif",Font.BOLD,15);
            label4 = new JLabel();
            label4.setText("Click 'Data Insertion' button for data entry");
            label4.setFont(font2);
            label4.setVisible(true);
            label4.setBounds(50,120,300,80);
            panel.add(label4);

            Font font3 = new Font("serif",Font.BOLD,15);
            label5 = new JLabel();
            label5.setText("Click 'Data Retrieve' button for data show");
            label5.setFont(font3);
            label5.setVisible(true);
            label5.setBounds(50,140,300,80);
            panel.add(label5);

            Font font4 = new Font("serif",Font.BOLD,15);
            label6 = new JLabel();
            label6.setText("Click 'Exit' button for closing the window");
            label6.setFont(font4);
            label6.setVisible(true);
            label6.setBounds(50,160,300,80);
            panel.add(label6);




            button3.addActionListener(new ExitPage());
            panel1.setLayout(null);
            label2 = new JLabel("Exit");
            label2.setBounds(500,300,400,300);
            label2.setFont(font);
            label2.setVisible(true);

            label7 = new JLabel("Name : ");
            text1 = new JTextField(10);
            label7.setVisible(true);
            text1.setVisible(true);
            label7.setBounds(50,50,50,30);
            text1.setBounds(50,90,250,20);
            panel1.add(label7);
            panel1.add(text1);

            label8 = new JLabel("Digit Id : ");
            text2 = new JTextField(10);
            label8.setVisible(true);
            text2.setVisible(true);
            label8.setBounds(350,50,80,30);
            text2.setBounds(350,90,250,20);
            panel1.add(label8);
            panel1.add(text2);

            label9 = new JLabel("Address : ");
            text3 = new JTextField(10);
            label9.setVisible(true);
            text3.setVisible(true);
            label9.setBounds(50,140,80,30);
            text3.setBounds(50,170,550,20);
            panel1.add(label9);
            panel1.add(text3);

            label10= new JLabel("Course Details : ");
            text4 = new JTextField(10);
            label10.setVisible(true);
            text4.setVisible(true);
            label10.setBounds(50,220,100,30);
            text4.setBounds(50,250,250,20);
            panel1.add(label10);
            panel1.add(text4);

            label11= new JLabel("Session : ");
            text5 = new JTextField(10);
            label11.setVisible(true);
            text5.setVisible(true);
            label11.setBounds(50,300,100,30);
            text5.setBounds(50,330,100,20);
            panel1.add(label11);
            panel1.add(text5);

            button4 = new JButton("Exit");
            button4.setBounds(150,500,100,30);
            panel1.add(button4);
            button4.setVisible(true);
            button4.addActionListener(new ExitPage());

            button5 = new JButton("Submitt");
            button5.setBounds(250,500,100,30);
            panel1.add(button5);
            button5.setVisible(true);
            button5.addActionListener(new StringTrasmission1());



            label12= new JLabel("Phone_Number : ");
            text6 = new JTextField(10);
            label12.setVisible(true);
            text6.setVisible(true);
            label12.setBounds(350,220,100,30);
            text6.setBounds(350,250,250,20);
            panel1.add(label12);
            panel1.add(text6);

            label13= new JLabel("Date_Of_Birth : ");
            text7 = new JTextField(10);
            label13.setVisible(true);
            text7.setVisible(true);
            label13.setBounds(350,300,100,30);
            text7.setBounds(350,330,250,20);
            panel1.add(label13);
            panel1.add(text7);


            button6 = new JButton("Exit");
            button6.setBounds(150,500,100,30);
            panel2.add(button6);
            button6.setVisible(true);
            button6.addActionListener(new ExitPage());

            button7 = new JButton("privious");
            button7.setBounds(50,500,100,30);
            panel2.add(button7);
            button7.setVisible(true);
            button7.addActionListener(new SecondPage());

            button8 = new JButton("Check");
            button8.setBounds(250,500,100,30);
            panel2.add(button8);
            button8.setVisible(true);
            button8.addActionListener(new FramePage());
            button8.addActionListener(new StringTransission2());


            label14 = new JLabel("Digit Id of Student: ");
            text8 = new JTextField(10);
            label14.setVisible(true);
            text8.setVisible(true);
            label14.setBounds(50,50,120,30);
            text8.setBounds(50,90,250,20);
            panel2.add(label14);
            panel2.add(text8);

            panel3 = new JPanel();
            panel3.setBounds(400,100,500,300);
            panel3.setVisible(true);
            panel3.setLayout(null);
            panel3.setBackground(Color.WHITE);

            button9 = new JButton("Exit");
            button9.setBounds(150,250,80,20);
            panel3.add(button9);
            button9.setVisible(true);
            button9.addActionListener(new ExitPage());

            button10 = new JButton("Privious");
            button10.setBounds(60,250,90,20);
            panel3.add(button10);
            button10.setVisible(true);
            button10.addActionListener(new FourPage());


            textArea1 = new JTextArea(10,10);
            textArea1.setVisible(true);
            textArea1.requestFocus();
            textArea1.setLineWrap(true);


            JScrollPane scrollPane = new JScrollPane(textArea1);
            scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
            scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane.setVisible(true);
            scrollPane.setBounds(20,40,450,200);
            panel3.add(scrollPane);

            label15 = new JLabel("Student Data");
            label15.setVisible(true);
            label15.setBounds(1,1,80,30);
            panel3.add(label15);


        }
    class SecondPage implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {

            frame.setContentPane(panel);
            label.setVisible(false);
            button.setVisible(false);
        }
    }
    class ThirdPage implements ActionListener
    {
        public void actionPerformed(ActionEvent event1)
        {
            frame.setContentPane(panel1);

            button2.addActionListener(new SecondPage());

        }
    }

    class FourPage implements  ActionListener
    {
        public void actionPerformed(ActionEvent event4)
        {
            frame.setContentPane(panel2);
            textArea1.setText("");
        }
    }
    class ExitPage implements ActionListener{
        public void actionPerformed(ActionEvent event3)
        {
            panel.setVisible(false);
            panel1.setVisible(false);
           label2.setVisible(true);
            frame.setContentPane(label2);
             frame.dispose();



        }

    }
    class FramePage implements ActionListener
    {
        public void actionPerformed(ActionEvent event5)
        {

            frame.setContentPane(panel3);



        }

    }
    class StringTrasmission1 implements ActionListener
    {
        public void actionPerformed(ActionEvent event7)
        {
        	

           
            try
            {
            	 s1 = text1.getText();
                 s2 = text2.getText();
                 s3 = text3.getText();
                 s4 = text4.getText();
                 s5 = text5.getText();
                 s6 = text6.getText();
                 s7 = text7.getText();
                 s8 = text8.getText();
               
            	String url = "jdbc:mysql://localhost:3306/studentrecordapplication";
            	String uname  = "root";
            	String pass = "";
            	String quary = "insert into studentrecordapplication values ('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')";             
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection(url,uname,pass);
           PreparedStatement s = c.prepareStatement(quary);
             s.executeUpdate();
         
            text1.setText("");
            text2.setText("");
            text3.setText("");
            text4.setText("");
            text5.setText("");
            text6.setText("");
            text7.setText("");
            s.close();
            c.close();
            
            }
            catch(Exception q)
            {
            	q.printStackTrace();
            }


        }
    }
    class StringTransission2 implements ActionListener
    {
        public void actionPerformed(ActionEvent event8)
        {    s8 = text8.getText();
             text8.setText("");
                try
                {
             String url = "jdbc:mysql://localhost:3306/studentrecordapplication";
             String uname = "root";
             String pass = "";
             String quary = ("select * from studentrecordapplication where DigitId="+s8);
             
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection(url, uname, pass);
             Statement st = con.createStatement();
             ResultSet set = st.executeQuery(quary);
             set.next();
             
             s1 = set.getString("Name");            
             s2 = set.getString("Session"); 
             s3 =set.getString("CourseDetails"); 
             s4 = set.getString("PhoneNumber"); 
             s5 = set.getString("Address"); 
             s6 = set.getString("Dateofbirth"); 
             s7 = set.getString("DigitId"); 
             
             textArea1.append("Name of Student : "+s1);
             textArea1.append("\nSession of collage : "+s2);
             textArea1.append("\nCourseDetails : "+s3);
             textArea1.append("\nPhoneNumber : "+s4);
             textArea1.append("\nAddress : "+s5);
             textArea1.append("\nDateofbirth : "+s6);
             textArea1.append("\nDigitId : "+s7);
             
             st.close();
             con.close();
            
                }
                catch(Exception e)
                {
                	e.printStackTrace();
                	 textArea1.append("Wrong Entry");
                }
             }
             
             
                
             
        }
    }

