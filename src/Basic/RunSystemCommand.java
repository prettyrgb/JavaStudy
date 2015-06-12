package Basic;

import java.io.IOException;
import java.util.Map;


public class RunSystemCommand {
	public static void main(String[] args)
	{
		  try { 
              ProcessBuilder proc = new ProcessBuilder("notepad.exe");
              Process p = proc.start();
      } catch (Exception e) {
              System.out.println("Error executing notepad."); 
      } 
		
		
		
		
	}
}
