import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JFileChooser;


public class TestHandle {
	public static void main(String[] args) {
		System.out.println("RedBlodModel Handler");
		System.out.println();
		System.out.println();
		
		RBC_model rbc_model = new RBC_model();
			
		HashMap<String,String> options = new HashMap<String,String>();
		
		String options_file = "./resources/protocols/short.txt";
		String results_file = "./resources/traces/short.txt";
		
		JFileChooser options_file_chooser = new JFileChooser();
		int returnVal = options_file_chooser.showOpenDialog(null);
		System.out.println(returnVal);
		
//		options = LoadProtocol.loadOptions(options_file);
		options = new HashMap<String,String>();
		options = LoadProtocol.loadOptions(options_file_chooser.getSelectedFile().getPath(),options);
		LoadProtocol.printOptions(options);
		
		ArrayList<String> usedoptions = new ArrayList<String>();
		
		rbc_model.setup(options,usedoptions);		
		rbc_model.setupDS(options,usedoptions);
		
		rbc_model.runall();
		
//		rbc_model.writeCsv(results_file);
		JFileChooser save_file_chooser = new JFileChooser();
		returnVal = save_file_chooser.showSaveDialog(null);
		rbc_model.writeCsv(save_file_chooser.getSelectedFile().getPath());
		
	}
}
