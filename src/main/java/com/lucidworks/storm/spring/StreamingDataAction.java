package com.lucidworks.storm.spring;


import org.apache.storm.task.OutputCollector;
import org.apache.storm.tuple.Tuple;

/**
 * Interface to a POJO that implements some action on streaming data in a Storm topology.
 */
public interface StreamingDataAction {
  SpringBolt.ExecuteResult execute(Tuple input, OutputCollector collector);
}
