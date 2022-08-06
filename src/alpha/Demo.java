package alpha;
import  org.apache.logging.log4j.*;

public class Demo {
	private static Logger log=LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
log.debug("I am debugging1");
log.info("object is present1");

log.error("object is not present1");
log.fatal("this is fatal1");
	}

}
