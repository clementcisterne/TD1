import java.util.Scanner;
import java.io.InputStream;
import javax.crypto.*;
import java.security.*;

/**
 *  String string = new String(byte[] bytes, Charset charset);
 * */
public class applicationCryptage {

    /** Type de cryptage */
    private String algorithm;

    /** Le message à crytper */
    private String messageACrypter;

    /** Le message crypté */
    private byte[] messageCrypte;

    /** Génerateur de cle */
    private KeyGenerator keyGenerator;

    /** Clé de cryptage */
    private SecretKey key;

    /** Cipher */
    private Cipher cipher;

    /** Fichier à crypter */
    private InputStream fichier;

    /**
     * Constructor
     *
     *
     * */
    private applicationCryptage(String algorithm, String message) {
        this.algorithm = algorithm;
        this.messageACrypter = message;
        this.messageCrypte = null;
        this.keyGenerator = null;
        this.key = null ;
        this.cipher = null;
    }


    /**
     *  Crypte une chaine de caractère entrée en paramètre
     *  @ param message String
     *  @ return messageCrypte String
     * */
    private byte[] encrypt(String message) {
        try
        {
            System.out.println("\nCryptage\n");
            System.out.println("le message est : "+message);

            // Genere la clé
            this.keyGenerator = KeyGenerator.getInstance(this.algorithm);
            this.keyGenerator.init(56); // On spécifie la longueur de la cle
            this.key = this.keyGenerator.generateKey();

            // Gestion cipher
            this.cipher = Cipher.getInstance(this.algorithm);
            this.cipher.init(Cipher.ENCRYPT_MODE,this.key);

            // Crypte la chaine
            this.messageCrypte = this.cipher.doFinal(message.getBytes());
            System.out.println("Message crypté : "+this.messageCrypte);
            return this.messageCrypte;
        } catch (Exception e)
        {
            System.out.println(e);
            return null;
        }
    }


    /**
     *  Crypte le contenu d'un fichier dont le nom est entré en paramètre
     *  @ param fichier String
     *  @ return messageCrypte String
     * */
    private byte[] encrypt(String fichier,String path){
        /**
         * TODO
         * */
        return null;
    }

    /**
     *  Decrypte le message entré en paramètre
     *  @param message String
     *  @return messageDecrypte String
    * */
    private String decrypt(byte[] message) {
        try
        {
            System.out.println("\nDécryptage\n");
            System.out.println("le message est : "+message);

            // Gestion du cipher
            this.cipher = Cipher.getInstance(this.algorithm);
            this.cipher.init(Cipher.DECRYPT_MODE,this.key); // On récupère la cle

            String messageDecrypte = new String(this.cipher.doFinal(message));
            System.out.println("Message décrypté : "+messageDecrypte);
            System.out.println("\n\n1 : "+this.messageACrypter+" \n2 : "+messageDecrypte);

            if (this.messageACrypter == messageDecrypte) {
                return messageDecrypte;
            }
            else {return null;}
        } catch (Exception e)
        {
            System.out.println(e);
            return null;
        }


    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Entrez la chaîne de caractère à crypter :");
        String messageACrypter = input.next();

        applicationCryptage test1 = new applicationCryptage("DES",messageACrypter);

        System.out.println("\n"+test1.decrypt(test1.encrypt(messageACrypter))+"\n");

    }

}
