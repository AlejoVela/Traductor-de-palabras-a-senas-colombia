package Modelo;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Procesos {
    
    public ArrayList<Letra> listaLetras;
    JLabel label;
    int ancho = 900, alto = 200;
    //construcor de la clase Procesos
    public Procesos(){
        iniciarAbecedario();
        
  
    }
    
    
    public void iniciarAbecedario(){
        //se inicializa la lista de letras
        listaLetras = new ArrayList<Letra>();
        //se crean las lestras 
        Letra A = new Letra("A","/Vista/Abecedario/A.jpg");
        Letra B = new Letra("B","/Vista/Abecedario/B.jpg");
        Letra C = new Letra("C","/Vista/Abecedario/C.jpg");
        Letra D = new Letra("D","/Vista/Abecedario/D.jpg");
        Letra E = new Letra("E","/Vista/Abecedario/E.jpg");
        Letra F = new Letra("F","/Vista/Abecedario/F.jpg");
        Letra G = new Letra("G","/Vista/Abecedario/G.jpg");
        Letra H = new Letra("H","/Vista/Abecedario/H.jpg");
        Letra I = new Letra("I","/Vista/Abecedario/I.jpg");
        Letra J = new Letra("J","/Vista/Abecedario/J.jpg");
        Letra K = new Letra("K","/Vista/Abecedario/K.jpg");
        Letra L = new Letra("L","/Vista/Abecedario/L.jpg");
        Letra M = new Letra("M","/Vista/Abecedario/M.jpg");
        Letra N = new Letra("N","/Vista/Abecedario/N.jpg");
        Letra Ñ = new Letra("Ñ","/Vista/Abecedario/Ñ.jpg");
        Letra O = new Letra("O","/Vista/Abecedario/O.jpg");
        Letra P = new Letra("P","/Vista/Abecedario/P.jpg");
        Letra Q = new Letra("Q","/Vista/Abecedario/Q.jpg");
        Letra R = new Letra("R","/Vista/Abecedario/R.jpg");
        Letra S = new Letra("S","/Vista/Abecedario/S.jpg");
        Letra T = new Letra("T","/Vista/Abecedario/T.jpg");
        Letra U = new Letra("U","/Vista/Abecedario/U.jpg");
        Letra V = new Letra("V","/Vista/Abecedario/V.jpg");
        Letra W = new Letra("W","/Vista/Abecedario/W.jpg");
        Letra X = new Letra("X","/Vista/Abecedario/X.jpg");
        Letra Y = new Letra("Y","/Vista/Abecedario/Y.jpg");
        Letra Z = new Letra("Z","/Vista/Abecedario/Z.jpg");
        
        //SE PASAN LAS LETRAS A LA LISTA
        listaLetras.add(A);
        listaLetras.add(B);
        listaLetras.add(C);
        listaLetras.add(D);
        listaLetras.add(E);
        listaLetras.add(F);
        listaLetras.add(G);
        listaLetras.add(H);
        listaLetras.add(I);
        listaLetras.add(J);
        listaLetras.add(K);
        listaLetras.add(L);
        listaLetras.add(M);
        listaLetras.add(N);
        listaLetras.add(Ñ);
        listaLetras.add(O);
        listaLetras.add(P);
        listaLetras.add(Q);
        listaLetras.add(R);
        listaLetras.add(S);
        listaLetras.add(T);
        listaLetras.add(U);
        listaLetras.add(V);
        listaLetras.add(W);
        listaLetras.add(X);
        listaLetras.add(Y);
        listaLetras.add(Z);
    }
    
    
    public JLabel crearPanel(String direccion, int x, int y){
       //se crea un label
        label = new JLabel();
        //los primeros dos parametros del metodo "setBounds" controla la localizacion del
        //label en X y Y. los siguientes parametros son width y heigh (ancho y alto, controlan el tamaño del label)
        label.setBounds(x, y, 80, 80);
        //se crea una imageIcon a la que se le envia la direccion donde esta guardada la imagen de la seña
        ImageIcon imgIcon = new ImageIcon(getClass().getResource(direccion));
        //se crea la imagen principal con un objeto image
        //esta imagen usara los tamaños  de jframa ancho = 80, largo = 80
        //y esclara la imagen para que tome el tamaño del jlabel
        Image imgEscalada = imgIcon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        //por ultimo se le envia esta imagen escalada a la clase icon
        //para que la agregue al jframe
        Icon iconoEscalado = new ImageIcon(imgEscalada);
       
        //se le envia la imagen al label
        label.setIcon(iconoEscalado);
        //añade profundidad al borde
        label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));      

        return label;    
    }
    
    public void traducirPalabra(String m){
        int cont = 0;
        int x = 50;
        int y = 50;
        //crea un vector para guardar las letras
        String[] palabra = new String[m.length()];
        
        //recorre ese vector y va guardando las letras
        for (int i = 0; i < m.length(); i++) {
            //se comprueba si el caracter que recibio es diferente de un espacio vacio " "
            //si lo es, seguira con el proceso
            if(!(""+m.charAt(i)).equals(" ")){
                //se usa "toUpperCase" para convertir la lestras a mayusculas u se le suma un ""
                //para convertir el char en string
                palabra[i] = (""+m.charAt(i)).toUpperCase();    
                System.out.println(palabra[i]);
            }
            
        }
            
        JFrame ventana = new JFrame("Traduccion");

        for (int i = 0; i < palabra.length; i++) {
            cont++;
            for (int j = 0; j < listaLetras.size(); j++) {
                //usamos equalsIgnoreCase para comparar las letras
                //del vector palabra con las letras guardadas en la lista
                //sin importar si son mayusculas o minusculas,  aunque con el metodos
                //upperCase usado antes, todas las estras deberian ser minusculas
                if(palabra[i].equalsIgnoreCase(listaLetras.get(j).getLetra())){
                    ventana.add(crearPanel(listaLetras.get(j).getiLetra(), x, y));
                    x += 100;
                }
            }
            //hace que haya un salto de linea
            if(cont==8){
                //reinicia el contador
                cont = 0;
                //reinicia x para que inicia en al posicion de la primera imagen
                x = 50;
                //le suma 100px a y para que inicie una fila abajo de la original
                y += 100;
                //va sumandole al alto de la ventana para que quepan las imagenes
                alto += 120;
            }
        }
        
        
        ventana.add(new JLabel());
      
        iniciar(ventana);
        ventana.setVisible(true);
    } 

    public void iniciar(JFrame f){
        //se envia el tamaño de la venta
        f.setSize(ancho, alto);        
        //ubica la la venta por defecto en el centro de la pantalla
        f.setLocationRelativeTo(null);
        //impide que se pueda modificar el tamaño de la ventana cuando esta ya ha sido creada
        f.setResizable(false);
        //envia un titulo a la ventana 
        f.setTitle("Traducido");
        f.setBackground(Color.DARK_GRAY);

    }    
    
}


