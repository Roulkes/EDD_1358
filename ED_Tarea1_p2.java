//Tenorio Castilla Carlos Yael
/*Fecha de entrega: 24 de agosto de 2022
Propósito: 
Hacer un programa que lea el archivo "presenciaredes.csv".
Que muestre en pantalla la diferencia de seguidores en Twitter entre el mes de 
    enero y junio.
Que permita calcular la diferencia de visualizaciones de Youtube entre los 
    meses seleccionados por teclado (enero a junio).
Que calcule el promedio de crecimiento de Twitter y Facebook entre los meses de
    enero a junio.
 */
package tareaRedes;

/**
 * @author Tenorio Castilla Carlos Yael (Torrente)
 */
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;
//import javax.swing.table.DefaultTableModel;

public class ED_Tarea1_p2 extends JFrame implements ActionListener {

    private JLabel label1, titulo, archi;
    private JTextArea area1;
    private JScrollPane scroll1, scroll2;
    private JMenuBar menuB, menuB2;
    private JMenu menuS1, menuS2, menuS3, menus4;
    private JMenuItem menuI1, menuI2, menuI3, menuI4, menuI5;
    private JSeparator dividendo;
    private JFileChooser archivos;
    private JTable excel;
    private JButton boton1, boton2, boton3;
    String filas[][] = {{"", "", "", "", "", ""}, {"", "", "", "", "", ""}};
    String columnas[] = {"","","","","",""};
    private FileNameExtensionFilter filtro;
    String NombreI = "", texto = "";

    public ED_Tarea1_p2() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(48, 48, 48));
        ED_Tarea1 VentanaPrincipal = new ED_Tarea1();
        NombreI = VentanaPrincipal.Nombre;
        setTitle("Bienvenida/o " + NombreI);

        //Separador
        dividendo = new JSeparator();
        //Menú
        menuB = new JMenuBar();
        menuS1 = new JMenu("Menu");

        //Opciones del menú
        menuI1 = new JMenuItem("Información");
        menuI1.addActionListener(this);

        menuS2 = new JMenu("Fondo");

        menuI2 = new JMenuItem("Modo Claro");
        menuI2.addActionListener(this);

        menuI3 = new JMenuItem("Modo Oscuro");
        menuI3.addActionListener(this);

        menuI4 = new JMenuItem("Créditos");
        menuI4.addActionListener(this);

        //Menu2
        menuS3 = new JMenu("Tareas");

        //Opciones del menú 2
        menuI5 = new JMenuItem("Con .csv");
        menuI5.addActionListener(this);

        //Agregar todo el menú
        menuS1.add(menuI1);
        menuS1.addSeparator();
        menuS1.add(menuS2);
        menuS2.add(menuI2);
        menuS2.add(dividendo);
        menuS2.add(menuI3);
        menuS1.addSeparator();
        menuS1.add(menuI4);

        menuS3.add(menuI5);

        menuB.add(menuS1);
        menuB.add(menuS3);
        setJMenuBar(menuB);
        //Fin del Menú

        ImageIcon URB = new ImageIcon("C:\\Users\\yael_\\OneDrive\\Documentos"
                + "\\NetBeansProjects\\Tarea1_Ejercicio_Redes_Sociales\\src\\"
                + "main\\java\\tareaRedes\\URBENIAG.png");
        label1 = new JLabel(URB);
        label1.setBounds(4, 4, 976, 60);//Derecha, Abajo, Ancho, Alto
        add(label1);

        titulo = new JLabel("Urbenia | Información");
        titulo.setBounds(300, 70, 399, 30);
        titulo.setFont(new Font("OCR A Extended", 0, 31));
        titulo.setForeground(new Color(255, 255, 255));
        add(titulo);

        archi = new JLabel("Ruta actual: ");
        archi.setBounds(5, 110, 750, 20);
        archi.setFont(new Font("OCR A Extended", 0, 14));
        archi.setForeground(new Color(255, 255, 255));
        archi.setVisible(false);
        add(archi);

        boton1 = new JButton("Escojer archivo...");
        boton1.setBounds(780, 110, 180, 20);
        boton1.setFont(new Font("OCR A Extended", 0, 14));
        boton1.setForeground(new Color(255, 255, 255));
        boton1.setBackground(new Color(60, 60, 60));
        boton1.setVisible(false);
        add(boton1);
        boton1.addActionListener(this);

        area1 = new JTextArea();
        area1.setEditable(false);
        area1.setText("La secretaría del Máximo Senado de la República y "
                + "el Gobierno de la Magnífica República"
                + "\nde Urbenia te da una calurosa bienvenia a esta "
                + "aplicación dónde podrás ir observado el "
                + "\ndesarrollo de aplicaciones por Java de Carlos Yael "
                + "y que en el futuro servirá como medio"
                + "\npara fortalecer nuestra comunidad en crecimiento."
                + "\n"
                + "\n"
                + "\nNo te olvides visitar nuestra página web en: "
                + "nacionalurbenia.byethost6.com!");
        area1.setFont(new Font("OCR A Extended", 0, 18));
        area1.setForeground(new Color(255, 255, 255));
        area1.setBackground(new Color(60, 60, 60));
        scroll1 = new JScrollPane(area1);
        scroll1.setBounds(5, 110, 975, 402);
        add(scroll1);

        excel = new JTable(filas, columnas);
        area1.setEditable(false);
        scroll2 = new JScrollPane(excel);
        scroll2.setBounds(5, 140, 975, 372);
        scroll2.setVisible(false);
        add(scroll2);

        boton2 = new JButton("Cerrar Sesión");
        boton2.setBounds(710, 515, 166, 20);
        boton2.setFont(new Font("OCR A Extended", 0, 16));
        boton2.setForeground(new Color(0, 0, 0));
        boton2.setBackground(new Color(0, 255, 0));
        add(boton2);
        boton2.addActionListener(this);

        boton3 = new JButton("Salir");
        boton3.setBounds(880, 515, 100, 20);
        boton3.setFont(new Font("OCR A Extended", 0, 16));
        boton3.setForeground(new Color(0, 0, 0));
        boton3.setBackground(new Color(255, 0, 0));
        add(boton3);
        boton3.addActionListener(this);
    }

    public static void main(String[] args) {
        ED_Tarea1_p2 inicio1 = new ED_Tarea1_p2();
        inicio1.setBounds(0, 0, 1000, 600);
        inicio1.setVisible(true);
        inicio1.setLocationRelativeTo(null);
        inicio1.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent d) {

        //Inicio de menús
        if (d.getSource() == menuI1) {
            titulo.setText("Urbenia | Información");
            boton1.setVisible(false);
            archi.setVisible(false);
            scroll1.setVisible(true);
            scroll2.setVisible(false);
            area1.setText("La secretaría del Máximo Senado de la República y "
                    + "el Gobierno de la Magnífica República"
                    + "\nde Urbenia te da una calurosa bienvenia a esta "
                    + "aplicación dónde podrás ir observado el "
                    + "\ndesarrollo de aplicaciones por Java de Carlos Yael "
                    + "y que en el futuro servirá como medio"
                    + "\npara fortalecer nuestra comunidad en crecimiento."
                    + "\n"
                    + "\n"
                    + "\nNo te olvides visitar nuestra página web en: "
                    + "nacionalurbenia.byethost6.com!");
        }

        //menuI2 y menuI3 - Modifican el color del fondo
        Container fondo = this.getContentPane();
        if (d.getSource() == menuI2) {
            fondo.setBackground(new Color(255, 255, 255));
            titulo.setForeground(new Color(0, 0, 0));
            archi.setForeground(new Color(0, 0, 0));
            boton1.setForeground(new Color(0, 0, 0));
            boton1.setBackground(new Color(255, 255, 255));
            area1.setForeground(new Color(0, 0, 0));
            area1.setBackground(new Color(255, 255, 255));
        }

        if (d.getSource() == menuI3) {
            fondo.setBackground(new Color(48, 48, 48));
            titulo.setForeground(new Color(255, 255, 255));
            archi.setForeground(new Color(255, 255, 255));
            boton1.setForeground(Color.WHITE);
            boton1.setBackground(new Color(60, 60, 60));
            area1.setForeground(new Color(255, 255, 255));
            area1.setBackground(new Color(60, 60, 60));

        }

        if (d.getSource() == menuI4) {
            titulo.setText("Urbenia | Créditos");
            scroll1.setVisible(true);
            archi.setVisible(false);
            scroll2.setVisible(false);
            area1.setText("- Creado por:"
                    + "\n - Carlos Yael Tenorio Castilla"
                    + " para la materia de POO y posteriormente "
                    + "\n   Estructura de Datos."
                    + "\n\n- Idea original por:"
                    + "\n - Carlos Yael Tenorio Castilla"
                    + "\n\n- Diseño de Interfaz por:"
                    + "\n - Torrente Laekenois"
                    + "\n\n- Diseño de botones por:"
                    + "\n - Torrente Laekenois"
                    + "\n\n- Programación por:"
                    + "\n - Carlos Yael Tenorio Castilla (Torrente)"
                    + "\n\n- Elaborado desde:"
                    + "\n - 17 de agosto de 2022"
                    + "\n\n- Terminado el:"
                    + "\n - (No se va a terminar)"
                    + "\n\n- Creditos adicionales a:"
                    + "\n\n - James Gosling"
                    + " por crear Java."
                    + "\n\n - Sun Microsystems"
                    + " por crear el IDE 'NetBeans'."
                    + "\n\n - Bill Gates y Paull Allen"
                    + " por crear Windows."
                    + "\n\n - Richard Sapper"
                    + " por crear ThinkPad.");

            boton1.setVisible(false);
        }

        if (d.getSource() == menuI5) {
            titulo.setText("Urbenia | Con .csv");
            archi.setVisible(true);
            scroll1.setVisible(false);
            scroll2.setVisible(true);
            boton1.setVisible(true);
        }
        //Fin parte de menús

        //Parte de Botones
        if (d.getSource() == boton1) {

            //Buscador de archivo
            File fichero;
            archivos = new JFileChooser();
            archivos.showOpenDialog(null);
            archivos.setFileSelectionMode(JFileChooser.FILES_ONLY);
            filtro = new FileNameExtensionFilter("Archivos .csv", "csv");
            archivos.setFileFilter(filtro);
            fichero = archivos.getSelectedFile();

            //Muestra la ruta del archivo
            archi.setText("Ruta actual: " + archivos.getCurrentDirectory());

            try {
                Scanner slector;
                slector = new Scanner(fichero);
                String line = slector.nextLine();
                String[] columnas = line.split(",");

            } catch (FileNotFoundException e) {

            }
            //Lee el archivo.
            /*for (int columna = 0; columna < 16 - 1; columna++) {
                columnas = +
            }
            for (int externo = 0; externo < 5 - 1; externo++) {
                for (int interno = 0; interno < 5 - 1; interno++) {
                    columna[externo][interno] = SúperGenerador.nextInt(20);
                }
            }*/
 /*try {
                if (fichero != null) {
                    FileReader mostrar = new FileReader(fichero);
                    BufferedReader leer = new BufferedReader(mostrar);
                    for (int externo = 0; externo < 5 - 1; externo++) {
                        for (int interno = 0; interno < 5 - 1; interno++) {
                            columna[externo][interno] = leer.read();
                        }
                    }
                }
            } catch (IOException e) {

            }*/

        }
        if (d.getSource() == boton2) {
            ED_Tarea1 inicio1 = new ED_Tarea1();
            inicio1.setBounds(0, 0, 300, 300);
            inicio1.setVisible(true);
            inicio1.setLocationRelativeTo(null);
            inicio1.setResizable(false);
            this.setVisible(false);
        }

        if (d.getSource() == boton3) {
            System.exit(0);
        }
    }
}