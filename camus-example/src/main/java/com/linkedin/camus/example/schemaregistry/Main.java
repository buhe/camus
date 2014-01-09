package com.linkedin.camus.example.schemaregistry;/**
 * User: harebu
 * Date: 1/9/14
 * Time: 11:24 AM
 */

import com.linkedin.camus.etl.kafka.CamusJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private final static Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        CamusJob.main(new String[]{"-p","camus.properties"});
    }
}
