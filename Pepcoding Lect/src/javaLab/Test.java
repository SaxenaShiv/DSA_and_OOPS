package javaLab;

import java.awt.event.*; import java.io.FileReader; import java.io.FileWriter; import java.io.IOException; 
 
import javax.swing.Action; import javax.swing.AbstractAction; import javax.swing.JFileChooser; import javax.swing.JFrame; import javax.swing.JMenu; import javax.swing.JMenuBar; import javax.swing.JScrollPane; import javax.swing.JTextArea; import javax.swing.filechooser.FileFilter; import javax.swing.filechooser.FileNameExtensionFilter; 
 
class Editor extends JFrame{     private JTextArea textArea = new JTextArea(20, 60);     private JFileChooser fc = new JFileChooser(); 
     
    public Editor() { 
        JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
         
        FileFilter txtFilter = new FileNameExtensionFilter("Plain text", "txt");         fc.setFileFilter(txtFilter); 
         
        add(scrollPane); 
        JMenuBar menuBar = new JMenuBar();         setJMenuBar(menuBar);         JMenu file = new JMenu("File");         menuBar.add(file); 
         
        file.add(Open);         file.add(Save);         file.add(Exit); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        pack();         setLocationRelativeTo(null);         setVisible(true); 
    } 
    Action Open = new AbstractAction("Open File") { 
  @Override   public void actionPerformed(ActionEvent e) {    if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {     openFile(fc.getSelectedFile().getAbsolutePath()); 
   } 
    
  } 
    }; 
    Action Save = new AbstractAction("Save File") { 
        @Override         public void actionPerformed(ActionEvent e) { 
            saveFile(); 
        } 
    }; 
    Action Exit = new AbstractAction("Quit") { 
        @Override 
        public void actionPerformed(ActionEvent e) { 
            System.exit(0); 
        } 
    }; 
     
    /**
     * @param fileName
     */
    /**
     * @param fileName
     */
    public void openFile(String fileName) {         FileReader fr = null; 
        try { 
            fr = new FileReader(fileName);             textArea.read(fr, null); 
            fr.close();             setTitle(fileName); 
             
        } catch (IOException e) { 
        	
            e.printStackTrace(); 
        } 
    } 
     
    public void saveFile() { 
        if (fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {             FileWriter fw = null; 
            try { 
                fw = new FileWriter(fc.getSelectedFile().getAbsolutePath() + ".txt");                 textArea.write(fw); 
                fw.close(); 
            } catch (IOException e) { 
                e.printStackTrace(); 
            } 
        } 
    } 
     
    public static void main(String[] args) {         new Editor();     
    } 
} 
