import java.util.*;

class ModificatoVaultDoor3 {
    public static void main(String args[]) {
        ModificatoVaultDoor3 vaultDoor = new ModificatoVaultDoor3();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Metti valore da scannare: ");
        String userInput = scanner.next();
        vaultDoor.trasforma(userInput);
        // vaultDoor.contrario(userInput);
    }

    // Our security monitoring team has noticed some intrusions on some of the
    // less secure doors. Dr. Evil has asked me specifically to build a stronger
    // vault door to protect his Doomsday plans. I just *know* this door will
    // keep all of those nosy agents out of our business. Mwa ha!
    //
    // -Minion #2671
    public void trasforma(String password) {
        /*
        if (password.length() != 32) {
            return false;
        }
        */
        System.out.println("Eccomi");
        char[] buffer = new char[32];
        int i;
        for (i=0; i<8; i++) {
            buffer[i] = password.charAt(i);
        }
        for (; i<16; i++) {
            buffer[i] = password.charAt(23-i);
        }
        for (; i<32; i+=2) {
            buffer[i] = password.charAt(46-i);
        }
        for (i=31; i>=17; i-=2) {
            buffer[i] = password.charAt(i);
        }
        String s = new String(buffer);
        System.out.println(buffer);
        System.out.println("Ciao");
        //return s.equals("jU5t_a_sna_3lpm12g94c_u_4_m7ra41");
    }

    /*
    public void contrario(String password)
    {
        char[] buffer = new char[32];
        int i;
        for (i=8; i16; i--) {
            buffer[i] = password.charAt(23-i);
        }
        System.out.println(buffer);
    }
    */

    /*
    public void trasformaIndietro(String password)
    {
        char[] buffer = new char[32];
        int i, j;
        for (i = 8; i<8; i++) {
            buffer[i] = password.charAt(i);
        }
        j = i
        for(i = 16; i > 8; i--){
            buffer[j] = password.charAt(i);
            j++;
        }
        // NON HO VOGLIA NICE
    }
    */
}


/*

ABCDEFGHIJKLMNOPQRSTUVWXYZ123456

*/