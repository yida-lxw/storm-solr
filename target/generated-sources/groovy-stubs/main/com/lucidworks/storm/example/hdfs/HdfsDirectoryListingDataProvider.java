package com.lucidworks.storm.example.hdfs;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class HdfsDirectoryListingDataProvider
  extends java.lang.Object  implements
    com.lucidworks.storm.spring.StreamingDataProvider,    groovy.lang.GroovyObject {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public static  org.apache.log4j.Logger getLog() { return (org.apache.log4j.Logger)null;}
public static  void setLog(org.apache.log4j.Logger value) { }
public  java.lang.String getDirPath() { return (java.lang.String)null;}
public  void setDirPath(java.lang.String value) { }
public  java.lang.String getGlobFilter() { return (java.lang.String)null;}
public  void setGlobFilter(java.lang.String value) { }
public  com.lucidworks.storm.example.hdfs.HdfsFileSystemProvider getHdfsFileSystemProvider() { return (com.lucidworks.storm.example.hdfs.HdfsFileSystemProvider)null;}
public  void setHdfsFileSystemProvider(com.lucidworks.storm.example.hdfs.HdfsFileSystemProvider value) { }
public  void open(java.util.Map stormConf) { }
public  boolean next(com.lucidworks.storm.spring.NamedValues record)throws java.lang.Exception { return false;}
}
