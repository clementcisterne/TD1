
 /** Class KeyGenerator

     KeyGenerator(KeyGeneratorSpi keyGenSpi, Provider provider, String algorithm) : Creates a KeyGenerator object.


     SecretKey   generateKey()   : Generates a secret key.
     String      getAlgorithm()  : Returns the algorithm name of this KeyGenerator object.
     Provider    getProvider()   : Returns the provider of this KeyGenerator object.

     static KeyGenerator    getInstance(String algorithm, [String provider])   : Returns a KeyGenerator object that generates secret keys for the specified algorithm.
     static KeyGenerator    getInstance(String algorithm, [Provider provider]) : //
     static KeyGenerator 	getInstance(String algorithm, String provider)     : //


     void   init(int keysize)                                        : Initializes this key generator for a certain keysize.
     void   init(SecureRandom random)                                : Initializes this key generator.
     void   init(AlgorithmParameterSpec params)                      : Initializes this key generator with the specified parameter set.
     void   init(int keysize, SecureRandom random)                   : Initializes this key generator for a certain keysize, using a user-provided source of randomness.
     void   init(AlgorithmParameterSpec params, SecureRandom random) : Initializes this key generator with the specified parameter set and a user-provided source of randomness.
 **/

 /** Class Cipher

     static int   DECRYPT_MODE  /Constant used to initialize cipher to decryption mode.
     static int   ENCRYPT_MODE  /Constant used to initialize cipher to encryption mode.
     static int   PRIVATE_KEY   /Constant used to indicate the to-be-unwrapped key is a "private key".
     static int   PUBLIC_KEY    /Constant used to indicate the to-be-unwrapped key is a "public key".
     static int   SECRET_KEY    /Constant used to indicate the to-be-unwrapped key is a "secret key".
     static int   UNWRAP_MODE   /Constant used to initialize cipher to key-unwrapping mode.
     static int   WRAP_MODE     /Constant used to initialize cipher to key-wrapping mode.

     protected 	Cipher(CipherSpi cipherSpi, Provider provider, String transformation) : Creates a Cipher object.


     static Cipher 	getInstance(String transformation)                      : Returns a Cipher object that implements the specified transformation.
     static Cipher 	getInstance(String transformation, Provider provider)   : Returns a Cipher object that implements the specified transformation.
     static Cipher 	getInstance(String transformation, String provider)     : Returns a Cipher object that implements the specified transformation.


     byte[] doFinal()                                                                              : Finishes a multiple-part encryption or decryption operation, depending on how this cipher was initialized.
     byte[] doFinal(byte[] input)                                                                  : Encrypts or decrypts data in a single-part operation, or finishes a multiple-part operation.
     int    doFinal(byte[] output, int outputOffset)                                               : Finishes a multiple-part encryption or decryption operation, depending on how this cipher was initialized.
     byte[] doFinal(byte[] input, int inputOffset, int inputLen)                                   : Encrypts or decrypts data in a single-part operation, or finishes a multiple-part operation.
     int    doFinal(byte[] input, int inputOffset, int inputLen, byte[] output)                    : Encrypts or decrypts data in a single-part operation, or finishes a multiple-part operation.
     int    doFinal(byte[] input, int inputOffset, int inputLen, byte[] output, int outputOffset)  : Encrypts or decrypts data in a single-part operation, or finishes a multiple-part operation.
     int    doFinal(ByteBuffer input, ByteBuffer output)                                           : Encrypts or decrypts data in a single-part operation, or finishes a multiple-part operation.


     void 	init(int opmode, Certificate certificate)                                       : Initializes this cipher with the public key from the given certificate.
     void   init(int opmode, Certificate certificate, SecureRandom random)                  : Initializes this cipher with the public key from the given certificate and a source of randomness.
     void   init(int opmode, Key key)                                                       : Initializes this cipher with a key.
     void 	init(int opmode, Key key, AlgorithmParameters params)                           : Initializes this cipher with a key and a set of algorithm parameters.
     void 	init(int opmode, Key key, AlgorithmParameterSpec params)                        : Initializes this cipher with a key and a set of algorithm parameters.
     void   init(int opmode, Key key, AlgorithmParameterSpec params, SecureRandom random)   : Initializes this cipher with a key, a set of algorithm parameters, and a source of randomness.
     void   init(int opmode, Key key, AlgorithmParameters params, SecureRandom random)      : Initializes this cipher with a key, a set of algorithm parameters, and a source of randomness.
     void   init(int opmode, Key key, SecureRandom random)                                  : Initializes this cipher with a key and a source of randomness.

     int 	getBlockSize() : Returns the block size (in bytes).

  */

public class reseaux1 {





}
