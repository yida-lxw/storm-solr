package com.lucidworks.storm.example.twitter;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class TwitterDataProvider
  extends java.lang.Object  implements
    com.lucidworks.storm.spring.StreamingDataProvider,    groovy.lang.GroovyObject {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public static  org.apache.log4j.Logger getLog() { return (org.apache.log4j.Logger)null;}
public static  void setLog(org.apache.log4j.Logger value) { }
public  java.util.concurrent.LinkedBlockingQueue<twitter4j.Status> getQueue() { return (java.util.concurrent.LinkedBlockingQueue<twitter4j.Status>)null;}
public  void setQueue(java.util.concurrent.LinkedBlockingQueue<twitter4j.Status> value) { }
public  java.lang.String[] getKeywords() { return (java.lang.String[])null;}
public  void setKeywords(java.lang.String... keywords) { }
@java.lang.Override() public  void open(java.util.Map stormConf) { }
@java.lang.Override() public  boolean next(com.lucidworks.storm.spring.NamedValues record)throws java.lang.Exception { return false;}
}
