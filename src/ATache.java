/**
 *
 *  — créer un gestionnaire du groupe de tâches (un objet de la classe Executor ou ExecutorService 1) ;
 *  — créer une instance pour chaque tâche á exécuter en implémentant l’interface Runnable ;
 *  — rendre pour l’exécution chacune des tâches en appelant la méthode execute() du gestionnaire du groupe de tâches.
 *
 *
 *
 */


class ATache implements Runnable // implementation de l’interface Runnable
{
    int nom; // nom de la tache
    int index; // index de la boucle d’affichage

    /** constructeur
     * @param ident le nom de la tache, entier >= 1
     */
    public ATache (int ident){
        this.nom = ident;
        this.index = 1;
    }

    /** C’est cette fonction qui est appelee quand la tache est executee par un
     ExecutorService. */

    public void run () {

        System.out.println(" debut tache T"+this.nom);

        /** Completez ici en ajoutant une boucle qui affiche la valeur de l’index (allant de 1 Ã˘a 30) et le nom de la tache avec dans la boucle un Thread.sleep(100) */

        System.out.println(" fin tache T"+this.nom);
    }
}