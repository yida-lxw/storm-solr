package com.lucidworks.storm.example.hdfs;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class CsvParserBoltAction
  extends java.lang.Object  implements
    com.lucidworks.storm.spring.StreamingDataAction,    groovy.lang.GroovyObject {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public static  org.apache.log4j.Logger getLog() { return (org.apache.log4j.Logger)null;}
public static  void setLog(org.apache.log4j.Logger value) { }
public  com.lucidworks.storm.example.hdfs.HdfsFileSystemProvider getHdfsFileSystemProvider() { return (com.lucidworks.storm.example.hdfs.HdfsFileSystemProvider)null;}
public  void setHdfsFileSystemProvider(com.lucidworks.storm.example.hdfs.HdfsFileSystemProvider value) { }
public  com.lucidworks.storm.spring.SpringBolt.ExecuteResult execute(org.apache.storm.tuple.Tuple input, org.apache.storm.task.OutputCollector collector) { return (com.lucidworks.storm.spring.SpringBolt.ExecuteResult)null;}
public  java.lang.String getDelimiter() { return (java.lang.String)null;}
public  void setDelimiter(java.lang.String delimiter) { }
public  boolean getFirstRowIsHeader() { return false;}
public  void setFirstRowIsHeader(boolean firstRowIsHeader) { }
public  java.lang.String[] getFields() { return (java.lang.String[])null;}
public  void setFields(java.lang.String... fields) { }
}
