package me.cherrue;

import me.cherrue.config.BaseConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {
    @Autowired
    CherrueProperties cherrueProperties;
    @Autowired
    String hello;
    private Logger logger = LoggerFactory.getLogger(SampleRunner.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.debug("======================");
        logger.debug(cherrueProperties.getName());
        logger.debug(hello);
        logger.debug("======================");
    }

    private void printProgramArguments(ApplicationArguments args) {
        logger.debug("foo : " + args.containsOption("foo"));
        logger.debug("bar : " + args.containsOption("bar"));
    }
}
