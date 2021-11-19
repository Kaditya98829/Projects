
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

/**
 * music
 */
public class music {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
       
       Scanner scn = new Scanner(System.in); //scanner use to program wait for input in mean while interval song played
       
       
       
        File file = new File("Dj Quads - The Improv.wav");
        AudioInputStream auStream = AudioSystem.getAudioInputStream(file);

        Clip clip = AudioSystem.getClip();
        clip.open(auStream);
        System.out.println("......................Welcome To Command Media Player......................");

        System.out.println("-------------------------------Commands-----------------------------------");

        System.out.println("************************* P to Play The music ****************************");
        System.out.println("************************* S to Stop the music ****************************");
        System.out.println("************************* R to Reset the CMP *****************************");
        System.out.println("************************* C to Close the CMP *****************************");

        System.out.print("Enter Your Command and EnJoy music!=");

        String response = scn.next(); //music play in background thread so it doesnt wait for it then we use this
        
        
        switch (response) {
            case "P":
                clip.start();
                 response = scn.next();
                break;
            
             case "S":
                clip.stop();
                 response = scn.next();
            
            
             case "R":
                clip.setMicrosecondPosition(0);
                 response = scn.next();
                break;
            
        }
        switch (response) {
            case "P":
                clip.start();
                 response = scn.next();
                break;
            
             case "S":
                clip.stop();
                 response = scn.next();
            
            
             case "R":
                clip.setMicrosecondPosition(0);
                 response = scn.next();
                break;
        }


                switch (response) {
                    case "P":
                        clip.start();
                         response = scn.next();
                        break;
                    
                     case "S":
                        clip.stop();
                         response = scn.next();
                    
                    
                     case "R":
                        clip.setMicrosecondPosition(0);
                         response = scn.next();
                        break;
        
        

    }
    
}
}