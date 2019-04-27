package eu.infoshare.pl;

import eu.infoshare.pl.model.RestResponse;
import eu.infoshare.pl.model.StateInfo;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import java.util.List;

public class App {
    public static List<StateInfo> data(){

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://services.groupkt.com/state/get/USA/all");
        Response response = target.request().get();

        RestResponse statesResponse = ((javax.ws.rs.core.Response) response).readEntity(RestResponse.class);

        return statesResponse.getResult();

    }
}
