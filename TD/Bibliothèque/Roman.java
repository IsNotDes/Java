public class Roman extends Livre {
    public {
        
        prixLitt = pl;
    }    

    public String toString() {
        switch (prixLitt) {
            case AUCUN : 
                return(super.toString())
                break;
            case GONCOURT : 
                return(super.toString()+" prix Goncourt");
                break;
            case MEDICIS :
                return(super.toString()+" prix Medicis");
            case INTERALLIE :
                return(super.toString()+" prix Interallie");
                break;
        }
    }
}
