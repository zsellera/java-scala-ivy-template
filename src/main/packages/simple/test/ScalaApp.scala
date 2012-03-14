package simple.test
import org.slf4j.LoggerFactory

object ScalaApp extends App {
	private val LOGGER = LoggerFactory.getLogger(classOf[App]);
	
	LOGGER.info("Hello world!");
}
