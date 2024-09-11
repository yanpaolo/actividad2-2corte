/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACTIVIDAD2GUIJAVA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class FrmPersonas extends JFrame {
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtDireccion;
    private JTextField txtEdad;
    private JButton btnGuardar;

    public FrmPersonas() {
        setTitle("Formulario de Personas");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(10, 10, 100, 25);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(120, 10, 150, 25);
        add(txtNombre);

        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setBounds(10, 40, 100, 25);
        add(lblApellido);

        txtApellido = new JTextField();
        txtApellido.setBounds(120, 40, 150, 25);
        add(txtApellido);

        JLabel lblDireccion = new JLabel("Dirección:");
        lblDireccion.setBounds(10, 70, 100, 25);
        add(lblDireccion);

        txtDireccion = new JTextField();
        txtDireccion.setBounds(120, 70, 150, 25);
        add(txtDireccion);

        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(10, 100, 100, 25);
        add(lblEdad);

        txtEdad = new JTextField();
        txtEdad.setBounds(120, 100, 150, 25);
        add(txtEdad);

        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(100, 140, 100, 25);
        add(btnGuardar);

        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String direccion = txtDireccion.getText();
                int edad = Integer.parseInt(txtEdad.getText());

                Personas.agregarPersona(nombre, apellido, direccion, edad);

                JOptionPane.showMessageDialog(null, "Persona guardada correctamente.");
            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FrmPersonas().setVisible(true);
            }
        });
    }
}
