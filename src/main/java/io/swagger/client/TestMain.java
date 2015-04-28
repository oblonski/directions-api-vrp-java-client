package io.swagger.client;

import io.swagger.client.api.SolutionApi;
import io.swagger.client.api.VrpApi;
import io.swagger.client.model.Address;
import io.swagger.client.model.JobId;
import io.swagger.client.model.LargeResponse;
import io.swagger.client.model.Request;
import io.swagger.client.model.Service;
import io.swagger.client.model.Vehicle;
import io.swagger.client.model.VehicleType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Peter Karich
 */
public class TestMain {

    public static void main(String[] args) throws Exception {

        new TestMain().start();
    }

    private void start() throws Exception {
        ApiInvoker iv = new ApiInvoker();
        Request request = createRequest();
        VrpApi vrpApi = new VrpApi(iv);

        // enable debugging for sending and receiving requests
        // vrpApi.getInvoker().enableDebug();

        String key = "[YOUR_KEY]";
        JobId jobId = vrpApi.postVrp(key, request);

        System.out.println(jobId.getJobId());

        SolutionApi solApi = new SolutionApi(iv);
        LargeResponse rsp;

        while (true) {
            rsp = solApi.getSolution(key, jobId.getJobId());
            if (rsp.getStatus().equals(LargeResponse.StatusEnum.finished)) {
                break;
            }
            Thread.sleep(1000);
        }
        System.out.println(rsp);
        // System.out.println(rsp.getWaitingInQueue());
    }

    private Request createRequest() {
        Request request = new Request();

        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        Vehicle v = new Vehicle();
        v.setVehicleId("1");
        v.setTypeId("somecar");
        v.setStartAddress(createAddress(-1, 52.537526, 13.333969));
        vehicles.add(v);
        request.setVehicles(vehicles);

        List<VehicleType> types = new ArrayList<VehicleType>();
        VehicleType type = new VehicleType();
        type.setProfile(VehicleType.ProfileEnum.car);
        type.setTypeId("somecar");
        types.add(type);
        request.setVehicleTypes(types);

        List<Service> services = new ArrayList<Service>();

        services.add(createService(0, 52.497832, 13.292084));
        services.add(createService(1, 52.48278, 13.30307));
        services.add(createService(2, 52.507445, 13.322296));
        services.add(createService(3, 52.481108, 13.331909));
        services.add(createService(4, 52.521653, 13.358688));
        services.add(createService(5, 52.483198, 13.355942));

        request.setServices(services);
        return request;
    }

    public Address createAddress(int i, double lat, double lon) {
        Address a = new Address();
        a.setLat(lat);
        a.setLon(lon);

        if (i >= 0) {
            a.setLocationId("" + i);
        }
        return a;
    }

    public Service createService(int i, double lat, double lon) {
        Service service = new Service();
        service.setId("" + i);
        service.setType(Service.TypeEnum.service);
        service.setAddress(createAddress(i, lat, lon));
        return service;
    }
}
