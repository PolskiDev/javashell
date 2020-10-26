/*
        Copyright (C) 1999 Terry Jones

	Software library developed by Gabriel Margarido
        (October 25th 2020)
	
        Registered under GNU General Public License (version 3.0)

	You are free to use, copy, modify and distribute
	this software library the way you want.

	Software library name: Java Shell

	Developed with: Java Language (version 8)
*/

/*                  IMPORTANT MODIFICATION
    You must import a module to execute succesfully the methods inside
    this class file. Copy the text below and paste it at the imports area.
    
    COPY AND PASTE THIS TEXT:
    import java.io.IOException;
*/
package javados; //CHANGE THE PACKAGE NAME TO YOUR PACKAGE NAME!!!
import java.io.IOException;

/**
 *
 * @author Gabriel Margarido
 */
public class JavaShell {
    static final Runtime FUNCRUNTIME = Runtime.getRuntime();
    static Process processRuntime;

        /**
         *
         * 
         * @param winCmd
         * @throws IOException
         */
    //                  MICROSOFT WINDOWS
    public static void winRuntime(String winCmd) throws IOException {
        //main instruction
        processRuntime = FUNCRUNTIME.exec("cmd /c "+winCmd);
    }
    
    //                  APPLE MAC OS X
    public static void appleRuntime(String appleCmd) throws IOException {
        //main instruction
        processRuntime = FUNCRUNTIME.exec(appleCmd);
    }
    
    //                  GNU/LINUX OPERATING SYSTEM
    public static void gnuRuntime(String gnuCmd) throws IOException {
        //main instruction
        processRuntime = FUNCRUNTIME.exec(gnuCmd);
    }
}
