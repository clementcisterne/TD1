import java.security.*;
import javax.crypto.*;

public class applicationCryptage {

    /** Type de cryptage */
    public String algo = "DES";

    /** Le message crypté */
    public String messageCrypte;

    /** Génerateur de cle */
    public KeyGenerator key;

    /** Cipher */
    public static Cipher cipher;





    /** Crypter une chaine de caractère */
    public String traitement(String chaine)
    {
        // Genere la clé
        this.key = new KeyGenerator();
        this.cipher = new Cipher();

        // Crypte la chaine
        this.key.doFinal(chaine);

        return this.messageCrypte;
    }


}
