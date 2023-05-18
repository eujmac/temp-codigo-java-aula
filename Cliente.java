
import java.rmi.Naming;
import javax.swing.JOptionPane;

public class Cliente {
	
	public static void main( String[] args ) {
		try {
			Mensagem_IF obj = (Mensagem_IF) Naming.lookup("rmi://127.0.0.1/servidormsg");
			while(true){
				String m = JOptionPane.showInputDialog("Digite uma para um servidor:");
				obj.setMensagem(m);
				
				JOptionPane.showMessageDialog(null, obj.getMensagem());
			}
		
            //System.out.println("Recebido:" + obj.getMensagem());
			//obj.setMensagem("Bom dia!");
		} catch (Exception e ) {
			e.printStackTrace();
		}
	}    
}