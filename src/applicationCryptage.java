import java.security.*;
import javax.crypto.*;
import java.util.Scanner;

/**
 *  String string = new String(byte[] bytes, Charset charset);
 * */
public class applicationCryptage {

    /** Type de cryptage */
    private String algorithm;

    /** Le message à crytper */
    private String messageACrypter;

    /** Le message crypté */
    private String messageCrypte;

    /** Génerateur de cle */
    private KeyGenerator keyGenerator;

    /** Cle de cryptage */
    private SecretKey key;

    /** Cipher */
    private Cipher cipher;

    private applicationCryptage(String algorithm, String message) {
        this.algorithm = algorithm;
        this.messageACrypter = message;
    }



    /**
     *  Crypter une chaine de caractère entré en paramètre
     *  @ param message String
     *  @ return messageCrypte String
     * */
    public String encrypt(String message) {

        try
        {
            System.out.println("\nCryptage : ");
            System.out.println("les message est : "+message);

            // Genere la clé
            this.keyGenerator = KeyGenerator.getInstance(this.algorithm);
            this.keyGenerator.init(56); // On spécifie la longueur de la cle
            this.key = this.keyGenerator.generateKey();
            System.out.println("clé : "+this.key);

            // Gestion cipher
            this.cipher = Cipher.getInstance(this.algorithm);
            this.cipher.init(Cipher.ENCRYPT_MODE,this.key);
            System.out.println("cipher : "+this.cipher);

            // Crypte la chaine
            this.messageCrypte = new String(this.cipher.doFinal(message.getBytes()));
            System.out.println("Crypter la chaîne : ok");
            System.out.println(this.messageCrypte);

            return this.messageCrypte;

        } catch (Exception e)
        {
         return null;
        }
    }

    /**
     *  Decrypte le message entré en paramètre
     *  @param message String
     *  @return messageDecrypte String
    * */
    public String decrypt(String message) {
        try
        {
            System.out.println("\nDécryptage : ");
            System.out.println("les message est : "+message);

            // On récupère la cle
            System.out.println("clé : "+this.key);

            this.cipher = Cipher.getInstance(this.algorithm);
            this.cipher.init(Cipher.DECRYPT_MODE,this.key);
            System.out.println("cipher : "+this.cipher);

            String messageDecrypte = new String(this.cipher.doFinal(message.getBytes()));
            System.out.println("Message décrypté : "+messageDecrypte);

            if (messageDecrypte == this.messageACrypter) {
                System.out.println("Décryptage : "+messageDecrypte);

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

        test1.decrypt(test1.encrypt(messageACrypter));

    }

}
