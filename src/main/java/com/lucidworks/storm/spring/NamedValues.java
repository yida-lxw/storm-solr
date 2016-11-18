package com.lucidworks.storm.spring;

import java.io.Serializable;
import java.util.List;
import java.util.Arrays;

import org.apache.storm.tuple.Fields;

/**
 */
public class NamedValues implements Serializable {

  private final Fields fields;
  private Object[] values;
  private String messageId;

  public NamedValues(Fields outputFields) {
    this.fields = outputFields;
    this.values = new Object[fields.size()];
  }

  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public void set(String fieldName, Object value) {
    values[fields.fieldIndex(fieldName)] = value;
  }

  public List<Object> values() {
    return Arrays.asList(values.clone());
  }

  public void resetValues() {
    for (int i = 0; i < values.length; i++) {
      values[i] = null;
    }
  }
}
