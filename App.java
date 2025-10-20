import java.awt.*;
import java.awt.event.*;
public class App extends Frame implements ActionListener {

    public static void main(String[] args) throws Exception {
        Frame frame = new Frame();
        frame.setTitle("無題");
        frame.setSize(720,480);
        Button btn = new Button("削除");
        btn.setPreferredSize(new Dimension(100, 50));
        btn.setVisible(true);
        GridBagLayout gnt = new GridBagLayout(); 
        GridBagConstraints cont = new GridBagConstraints();
        frame.setLayout(gnt);
        cont.gridx = 0;
        cont.gridy = 2;
        cont.gridheight = 1;
        cont.gridwidth = 1;
        cont.insets = new Insets(0, 0, 0, 0);
        gnt.setConstraints(btn, cont);
        frame.add(btn);
        TextArea text = new TextArea();
        text.setPreferredSize(new Dimension(100, 100));
        text.setVisible(true);
        cont.gridx = 1;
        cont.gridy = 2;
        cont.gridheight =1;
        cont.gridwidth = 1;
        gnt.setConstraints(text, cont);
        frame.add(text);
        frame.setVisible(true);
        Label label = new Label();
        label.setText("無題");
        label.setPreferredSize(new Dimension(100,100));
        label.setVisible(true);
        cont.gridx =0;
        cont.gridy =1;
        cont.gridheight =-3;
        cont.gridwidth = -4;
        gnt.setConstraints(label,cont);
        frame.add(label);
        

        Button btn2 = new Button("表示");
        btn2.setPreferredSize(new Dimension(100,100));
        btn2.setVisible(true);
        cont.gridx = 2;
        cont.gridy = 2;
        cont.gridheight = -4;
        cont.gridwidth = 0;
        gnt.setConstraints(btn2, cont);
        btn2.setVisible(true);
        frame.add(btn2);
        
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                label.setText(text.getText());

            }
        });
        frame.setVisible(true);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            btn.resize(100,50);
            frame.setVisible(false);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}