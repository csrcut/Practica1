import java.awt.*;
import java.awt.event.*;


public class Test extends WindowAdapter implements ActionListener{




	Frame f;
	Choice c,h,i,w,y;
	Label e,l,a,q,x,g;
	Button b,b1,b2,b3,b4;
	Panel p,p1,p2,p3;
	CardLayout myCard;	

		public Test(){
	
	myCard = new CardLayout();


	
	 p=new Panel();p.setBackground(Color.cyan);
	p1=new Panel();p1.setBackground(Color.cyan);
	p2=new Panel();p2.setBackground(Color.cyan);
        p3=new Panel ();
	
	//Preguntas y respuestas 
	x=new Label("Te gustan los Videojuegos?");
        e=new Label("Cual es tu edad ? ");
	l=new Label("Genero de Musical que mas Detestas");
        a=new Label("Tienes hijos?");
	q=new Label("Que lugar Prefieres?");
	g=new Label ("MENU");
	b=new Button("siguiente");b.setBackground(Color.yellow);
	b1=new Button("Siguiente");
	b2=new Button("Siguiente");
        b3=new Button("Alumnos");
        b4=new Button("Maestros");
	f=new Frame("Test");

	  c=new Choice();
	  h=new Choice();
	  i=new Choice();
	  w=new Choice();
	  y=new Choice();

	  c.add("15 - 20");
	  c.add("21 - 30");
          c.add("31 - 40");
          c.add("40.... y Mas");
	  h.add("Reggaeton");
	  h.add("Circuit");
          h.add("Ambos");
          h.add("Ninguno");
	  i.add("No");
	  i.add("Si");
	  w.add("Parque");
	  w.add("Cine");
          w.add("Plaza");
          y.add("Si");
	  y.add("No");




       f.setLayout(myCard);
	p.setLayout(new GridLayout(6,3));

	
	p.add(g);
        p.add(b3);
	p.add(b4);

	b3.addActionListener(this);
        b4.addActionListener(this);



       f.setLayout(myCard);
	p1.setLayout(new GridLayout(6,3));
	p1.add(e);
	p1.add(c);
	p1.add(l);
	p1.add(h);
	p1.add(b);
       b.addActionListener(this);



	f.setLayout(myCard);
	p2.setLayout(new GridLayout(6,3));
        p2.add(a); 
	p2.add(i);
	p2.add(q);
	p2.add(w);
	p2.add(b1);
	
	b1.addActionListener(this);



	f.setLayout(myCard);
	p3.setLayout(new GridLayout(6,3));

	p3.add(x);
	p3.add(y);
	p3.add(b2);

	b2.addActionListener(this);
f.addWindowListener(this);




	f.add(p, "First"); f.add(p1, "Second");f.add(p2, "Third");f.add(p3, "Fourth");
          myCard.show(f,"First"); 

                f.pack();
	f.setVisible(true);
	}
public void actionPerformed(ActionEvent e){
          myCard.next(f);
       }
//Cierra Ventanas
public void windowClosing(WindowEvent e){System.exit(0);}

public static void main(String args[]){
 Test obj=new Test();
}
    }