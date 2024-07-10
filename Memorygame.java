import java.awt.*;
import java.awt.event.*;
import javax.swing.event.MouseInputAdapter;

public class Memorygame extends Frame
{
    Panel p1;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18,bt19,bt20,bt21,bt22,bt23,bt24,bt25,bt26,bt27,bt28,bt29,bt30,bt31,bt32,bt33,bt34,bt35,bt36;
    Button reset,newgame;
    TextField t1,t2;
    public Label l1,l2,l3;
    int play=1;

    Memorygame(){
        l1=new Label("Score");
        l2=new Label("");
        l3=new Label("");
        add(l1);
        add(l2);
        add(l3);
        l1.setBounds(600,150,100,30);
        l2.setBounds(600,200,100,30);
        l3.setBounds(600,250,100,30);

        //Puzzel btn

        bt1=new Button(""); 
        bt2=new Button("");
        bt3=new Button("");
        bt4=new Button("");
        bt5=new Button("");
        bt6=new Button("");
        bt7=new Button("");
        bt8=new Button("");
        bt9=new Button("");
        bt10=new Button("");
        bt11=new Button("");
        bt12=new Button("");
        bt13=new Button("");
        bt14=new Button("");
        bt15=new Button("");
        bt16=new Button("");
        bt17=new Button("");
        bt18=new Button("");
        bt19=new Button("");
        bt20=new Button("");
        bt21=new Button("");
        bt22=new Button("");
        bt23=new Button("");
        bt24=new Button("");
        bt25=new Button("");
        bt26=new Button("");
        bt27=new Button("");
        bt28=new Button("");
        bt29=new Button("");
        bt30=new Button("");
        bt31=new Button("");
        bt32=new Button("");
        bt33=new Button("");
        bt34=new Button("");
        bt35=new Button("");
        bt36=new Button("");

        //Special btn

        reset=new Button("Reset");
        newgame=new Button("Close");
        p1=new Panel();
        p1.setLayout(new GridLayout(6,6));
        p1.add(bt1);
        p1.add(bt2);
        p1.add(bt3);
        p1.add(bt4);
        p1.add(bt5);
        p1.add(bt6);
        p1.add(bt7);
        p1.add(bt8);
        p1.add(bt9);
        p1.add(bt10);
        p1.add(bt11);
        p1.add(bt12);
        p1.add(bt13);
        p1.add(bt14);
        p1.add(bt15);
        p1.add(bt16);
        p1.add(bt17);
        p1.add(bt18);
        p1.add(bt19);
        p1.add(bt20);
        p1.add(bt21);
        p1.add(bt22);
        p1.add(bt23);
        p1.add(bt24);
        p1.add(bt25);
        p1.add(bt26);
        p1.add(bt27);
        p1.add(bt28);
        p1.add(bt29);
        p1.add(bt30);
        p1.add(bt31);
        p1.add(bt32);
        p1.add(bt33);
        p1.add(bt34);
        p1.add(bt35);
        p1.add(bt36);

        p1.setSize(500,500);
        p1.setLocation(30,80);
        setLayout(null);
        add(p1);
        add(reset);
        add(newgame);
	reset.setBounds(550,500,100,40);
	newgame.setBounds(700,500,100,40);

    bt1.addMouseListener(new Event());
    bt2.addMouseListener(new Event());
    bt3.addMouseListener(new Event());
    bt4.addMouseListener(new Event());
    bt5.addMouseListener(new Event());
    bt6.addMouseListener(new Event());
    bt7.addMouseListener(new Event());
    bt8.addMouseListener(new Event());
    bt9.addMouseListener(new Event());
    bt10.addMouseListener(new Event());
    bt11.addMouseListener(new Event());
    bt12.addMouseListener(new Event());
    bt13.addMouseListener(new Event());
    bt14.addMouseListener(new Event());
    bt15.addMouseListener(new Event());
    bt16.addMouseListener(new Event());
    bt17.addMouseListener(new Event());
    bt18.addMouseListener(new Event());
    bt19.addMouseListener(new Event());
    bt20.addMouseListener(new Event());
    bt21.addMouseListener(new Event());
    bt22.addMouseListener(new Event());
    bt23.addMouseListener(new Event());
    bt24.addMouseListener(new Event());
    bt25.addMouseListener(new Event());
    bt26.addMouseListener(new Event());
    bt27.addMouseListener(new Event());
    bt28.addMouseListener(new Event());
    bt29.addMouseListener(new Event());
    bt30.addMouseListener(new Event());
    bt31.addMouseListener(new Event());
    bt32.addMouseListener(new Event());
    bt33.addMouseListener(new Event());
    bt34.addMouseListener(new Event());
    bt35.addMouseListener(new Event());
    bt36.addMouseListener(new Event());

    reset.addMouseListener(new ResetAndNewGame());
    newgame.addMouseListener(new ResetAndNewGame());

    }

    class Event extends MouseAdapter{
        public void check(String s){
            if(s==bt1.getLabel() && s==bt2.getLabel()){
                if(s=="1"){
                    l2.setText("1 point");
                }
                if(s=="2"){
                    l3.setText("");
                }
            }

        }

        public void mouseClicked(MouseEvent me){
            Button btn=(Button)me.getComponent();
            if(play==1)
            {
                btn.setLabel("1");
                l2.setText("");
                l3.setText("");
                play=0;
                check("1");
            
            if(play==2){
                btn.setLabel("3");
                play=0;
                check("3");
            }
        }
            else{
                btn.setLabel("2");
                play=1;
                check("2");
            }
            btn.setEnabled(true);

        }
    }

    class ResetAndNewGame extends MouseAdapter
    {
        public void mouseClicked(MouseEvent me)
        {
            Button btn=(Button)me.getComponent();
            if(btn==reset)
            {
                bt1.setEnabled(true);
                bt1.setLabel("");
                bt2.setEnabled(true);
                bt2.setLabel("");
                bt3.setEnabled(true);
                bt3.setLabel("");
                bt4.setEnabled(true);
                bt4.setLabel("");
                bt5.setEnabled(true);
                bt5.setLabel("");
                bt6.setEnabled(true);
                bt6.setLabel("");
                bt7.setEnabled(true);
                bt7.setLabel("");
                bt8.setEnabled(true);
                bt8.setLabel("");
                bt9.setEnabled(true);
                bt9.setLabel("");
                bt10.setEnabled(true);
                bt10.setLabel("");
                bt11.setEnabled(true);
                bt11.setLabel("");
                bt12.setEnabled(true);
                bt12.setLabel("");
                bt13.setEnabled(true);
                bt13.setLabel("");
                bt14.setEnabled(true);
                bt14.setLabel("");
                bt15.setEnabled(true);
                bt15.setLabel("");
                bt16.setEnabled(true);
                bt16.setLabel("");
                bt17.setEnabled(true);
                bt17.setLabel("");
                bt18.setEnabled(true);
                bt18.setLabel("");
                bt19.setEnabled(true);
                bt19.setLabel("");
                bt20.setEnabled(true);
                bt20.setLabel("");
                bt21.setEnabled(true);
                bt21.setLabel("");
                bt22.setEnabled(true);
                bt22.setLabel("");
                bt23.setEnabled(true);
                bt23.setLabel("");
                bt24.setEnabled(true);
                bt24.setLabel("");
                bt25.setEnabled(true);
                bt25.setLabel("");
                bt26.setEnabled(true);
                bt26.setLabel("");
                bt27.setEnabled(true);
                bt27.setLabel("");
                bt28.setEnabled(true);
                bt28.setLabel("");
                bt29.setEnabled(true);
                bt29.setLabel("");
                bt30.setEnabled(true);
                bt30.setLabel("");
                bt31.setEnabled(true);
                bt31.setLabel("");
                bt32.setEnabled(true);
                bt32.setLabel("");
                bt33.setEnabled(true);
                bt33.setLabel("");
                bt34.setEnabled(true);
                bt34.setLabel("");
                bt35.setEnabled(true);
                bt35.setLabel("");
                bt36.setEnabled(true);
                bt36.setLabel("");
                l2.setText("");
                l3.setText("");

            }
            else{
                dispose();
            }
        }
    }


    public static void main(String args[])
    {
        Memorygame n=new Memorygame();
        n.setVisible(true);
        n.setSize(900,700);
        n.setBackground(new Color(139,139,0));
        n.setTitle("Memory Game");
        
    }
}