
package agenda.telefonica;



public class AgendaTelefonica {

   
    public static void main(String[] args) {
        ventana inicio = new ventana();        
        inicio.setTitle("Agenda telefonica");
        inicio.setBounds(300, 300, 700, 300);
         inicio.setResizable(false);
          inicio.insertarPanel();
          inicio.insertarBotones();
          inicio.insertarTexto();
          inicio.insertarEtiquetas();
          
    }
    
}