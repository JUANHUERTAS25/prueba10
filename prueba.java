import java.io.IOException;

public class prueba
{
    public static void main(String[] args) {
        System.out.println("Hola");
        try 
        {
            Runtime.getRuntime().exec
            ("cmd /c start cmd.exe /K \" cd C:\\Archivos de programa\\Git && start git && cd .. && cd pruebaaaa && git status\"");
            
        } 
        
        
        catch (IOException ioe) 
        {
            System.out.println (ioe);
        }
    
    }
}