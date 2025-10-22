import java.awt.*;
import java.awt.RenderingHints.Key;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.*;
import java.io.IOException;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class App implements ActionListener{

    public static void main(String[] args) throws Exception {
        Frame frame = new Frame();
        frame.setTitle("無題");
        frame.setSize(720,480);
        Button btn = new Button("削除");
        btn.setPreferredSize(new Dimension(100, 100));
        btn.setVisible(true);
        GridBagLayout gnt = new GridBagLayout(); 
        GridBagConstraints cont = new GridBagConstraints();
        frame.setLayout(gnt);
        cont.gridx = 0;
        cont.gridy = 0;
        cont.gridheight = 1;
        cont.gridwidth = 1;
        cont.insets = new Insets(0, 0, 0, 0);
        gnt.setConstraints(btn, cont);
        frame.add(btn);
        TextArea text = new TextArea();
        text.setPreferredSize(new Dimension(100, 100));
        text.setVisible(true);
        cont.gridx = 1;
        cont.gridy = 0;
        cont.gridheight =1;
        cont.gridwidth = 1;
        gnt.setConstraints(text, cont);
        frame.add(text);
        frame.setVisible(true);
        Label label = new Label();
        label.setText("無題");
        label.setPreferredSize(new Dimension(100,100));
        label.setVisible(true);
        cont.gridx =1;
        cont.gridy =-1;
        cont.gridheight =-3;
        cont.gridwidth = -4;
        gnt.setConstraints(label,cont);
        frame.add(label);


        
        Button btn3 = new Button("表示");
        btn3.setPreferredSize(new Dimension(100,100));
        btn3.setVisible(true);
         cont.gridx = 2;
        cont.gridy = 0;
        cont.gridheight = 1;
        cont.gridwidth = 1;
        gnt.setConstraints(btn3, cont);
        frame.add(btn3);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

                Clipboard crip = Toolkit.getDefaultToolkit().getSystemClipboard();
                StringSelection select = new StringSelection("");
                try {
                   label.setText((String) crip.getData(DataFlavor.stringFlavor));
                } catch (UnsupportedFlavorException e1) {
                    e1.printStackTrace();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
               
            }
        });
        

        

        Button btn2 = new Button("コピー");
        btn2.setPreferredSize(new Dimension(100,100));
        cont.gridx = 3;
        cont.gridy = 0;
        cont.gridheight = 1;
        cont.gridwidth = 1;
        gnt.setConstraints(btn2, cont);
        btn2.setVisible(true);
        frame.add(btn2);
        
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

                Clipboard crip = Toolkit.getDefaultToolkit().getSystemClipboard();
                StringSelection select = new StringSelection(text.getText());
                crip.setContents(select, null);

            }
        });
        

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            btn.resize(100,50);
            frame.setVisible(false);
            }
        });
        Button btn4 = new Button("移動");
        btn4.setPreferredSize(new Dimension(100,100));
        btn4.setVisible(true);
         cont.gridx = 4;
        cont.gridy = 0;
        cont.gridheight = 1;
        cont.gridwidth = 1;
        gnt.setConstraints(btn4, cont);
        frame.add(btn4);
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                
                try {
                    Robot robot = new Robot();
                    robot.mouseMove(500, 1000);
                    robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
                    robot.keyPress(KeyEvent.VK_CONTROL);
                    robot.keyPress(KeyEvent.VK_V);
                    robot.keyRelease(KeyEvent.VK_V);
                    robot.keyRelease(KeyEvent.VK_CONTROL);
                    robot.keyPress(KeyEvent.VK_ENTER);
                    robot.keyRelease(KeyEvent.VK_ENTER);
                } catch (AWTException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                
               
            }
        });

        


        frame.setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {

        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
  

}

        

