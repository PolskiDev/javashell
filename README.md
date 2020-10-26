# Java Shell
A java library to run UNIX, GNU and DOS commands.  
Software library registered under GNU GPL license version 3.0  

JavaShell.winRuntime(YOUR COMMAND); - MS WINDOWS  
JavaShell.appleRuntime(YOUR COMMAND); - APPLE MAC OS X  
JavaShell.gnuRuntime(YOUR COMMAND); - GNU/LINUX  

Your command should be passed as a string, for example:  
**JavaShell.winRuntime("notepad.exe");**  

It is important to add a java native module:  
**import java.io.IOException;**  
