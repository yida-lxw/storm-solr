package com.lucidworks.storm.example.hdfs;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class HdfsDirectoryListingDataProviderTest
  extends com.lucidworks.storm.hdfs.HdfsTestBase  implements
    groovy.lang.GroovyObject {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
@org.junit.Test() public  void testDataProvider() { }
protected  int writeUtf8ResourceToHdfs(java.io.InputStream resource, org.apache.hadoop.fs.FSDataOutputStream out) { return (int)0;}
public class TestOutputCollector
  extends java.lang.Object  implements
    org.apache.storm.task.IOutputCollector,    groovy.lang.GroovyObject {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public  java.util.Map<java.lang.String, java.util.List> getEmitted() { return (java.util.Map<java.lang.String, java.util.List>)null;}
public  void setEmitted(java.util.Map<java.lang.String, java.util.List> value) { }
public  java.util.List<java.lang.Integer> emit(java.lang.String streamId, java.util.Collection<org.apache.storm.tuple.Tuple> anchors, java.util.List<java.lang.Object> tuple) { return (java.util.List<java.lang.Integer>)null;}
public  void emitDirect(int i, java.lang.String s, java.util.Collection<org.apache.storm.tuple.Tuple> collection, java.util.List<java.lang.Object> list) { }
public  void ack(org.apache.storm.tuple.Tuple tuple) { }
public  void fail(org.apache.storm.tuple.Tuple tuple) { }
@java.lang.Override() public  void resetTimeout(org.apache.storm.tuple.Tuple tuple) { }
public  void reportError(java.lang.Throwable throwable) { }
}
}
