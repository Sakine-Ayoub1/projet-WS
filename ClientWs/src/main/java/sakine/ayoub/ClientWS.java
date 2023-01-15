package sakine.ayoub;

import sakine.ayoub.proxy.Releve;
import sakine.ayoub.proxy.ReleveServiceService;
import sakine.ayoub.proxy.ReleveWs;

public class ClientWS {
    public static void main(String[] args) {

        ReleveWs stub = new ReleveServiceService().getReleveWsPort();

        Releve releve= stub.myReleve();

        releve.getListOp().getList().forEach(o->{
            System.out.println(o.getDate());
            System.out.println(o.getDescription());
            System.out.println(o.getMontant());
        });
    }

    }

