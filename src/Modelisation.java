public class Modelisation {
    private enum Etat{Accesaccordé,Accesrefusé,alarmedéclenché,etatinit};
    private Etat etat;


    public Modelisation( ) {
        this.etat = Etat.etatinit;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }
   public void Verification(boolean carteverif , boolean codeverif){
        if (carteverif && codeverif){
            System.out.println("L'acces est accordé");
            this.etat=Etat.Accesaccordé;


        }else {
            System.out.println("L'accès est refusé");
            this.etat=Etat.Accesrefusé;
        }

        if (carteverif && !codeverif){
            System.out.println("L'alarme est déclenché");
            this.etat=Etat.alarmedéclenché;

       }


       }

    }



