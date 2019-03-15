import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import javax.ejb.Schedule;
import javax.inject.Inject;
import javax.jms.*;

@JMSDestinationDefinitions({
        @JMSDestinationDefinition(
                name = "java:/jms/queue/exempel",
                className = "javax.jms.Queue",
                interfaceName = "javax.jms.Queue",
                destinationName = "exempel")
})
public class ExempelProducer {
    private static final String EXEMPELEVENT = "Det här kan man skicka i event: ";

    private static final Logger LOG = LoggerFactory.getLogger(ExempelProducer.class);

    private int counter = 0;

    @Inject
    @JMSConnectionFactory("java:/jms/lokal-mq")
    private JMSContext context;

    @Resource(mappedName = "java:/jms/queue/exempel")
    private Queue queue;

    @Schedule(minute = "*/1", hour = "*")
    public void skickaNyttDokumentId() {
        counter++;
        String meddelande = EXEMPELEVENT + counter;
        context.createProducer().send(queue, meddelande);
        LOG.info("EVENT SKICKAT: {}", meddelande);
    }

}
