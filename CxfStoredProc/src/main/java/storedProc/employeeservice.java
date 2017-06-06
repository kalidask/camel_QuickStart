package storedProc;


import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


@Path("/")
public interface employeeservice {

	

	   @GET
	   @Path("employee/{id}")
	   public String getemployee(@PathParam("id") String id);

	   @GET
	   @Path("employee")
	   public String getAllemployees();

	   @PUT
	   @Path("employee/{id}")
	   public String updateemployee(@PathParam("id") String id);

	   @POST
	   @Path("employee")
	   public String createemployee(String data);

	   @DELETE
	   @Path("employee/{id}")
	   public String deleteemployee(@PathParam("id") String id);
	}

	
	

