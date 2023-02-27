package cv.mentex.mgserver.config;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.nio.file.Path;

// @Component
public class ReadEvent implements ApplicationListener<ApplicationReadyEvent> {
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Path path = Path.of(System.getProperty("user.dir"));
        System.out.println("Diretorio root: " + path.toString());
    }
}
