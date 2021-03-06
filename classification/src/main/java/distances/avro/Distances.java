/*
 * Copyright 2016 Michele Sparamonti & Spiros Koulouzis.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package distances.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Distances extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Distances\",\"namespace\":\"distances.avro\",\"fields\":[{\"name\":\"title\",\"type\":\"string\"},{\"name\":\"documentId\",\"type\":\"string\"},{\"name\":\"date\",\"type\":\"string\"},{\"name\":\"distanceArray\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence title;
  @Deprecated public java.lang.CharSequence documentId;
  @Deprecated public java.lang.CharSequence date;
  @Deprecated public java.util.List<java.lang.Double> distanceArray;

  /**
   * @author Michele Sparamonti (michele.sparamonti@eng.it)
   */
  public Distances() {}

  /**
   * All-args constructor.
   */
  public Distances(java.lang.CharSequence title, java.lang.CharSequence documentId, java.lang.CharSequence date, java.util.List<java.lang.Double> distanceArray) {
    this.title = title;
    this.documentId = documentId;
    this.date = date;
    this.distanceArray = distanceArray;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return title;
    case 1: return documentId;
    case 2: return date;
    case 3: return distanceArray;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: title = (java.lang.CharSequence)value$; break;
    case 1: documentId = (java.lang.CharSequence)value$; break;
    case 2: date = (java.lang.CharSequence)value$; break;
    case 3: distanceArray = (java.util.List<java.lang.Double>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'title' field.
   */
  public java.lang.CharSequence getTitle() {
    return title;
  }

  /**
   * Sets the value of the 'title' field.
   * @param value the value to set.
   */
  public void setTitle(java.lang.CharSequence value) {
    this.title = value;
  }

  /**
   * Gets the value of the 'documentId' field.
   */
  public java.lang.CharSequence getDocumentId() {
    return documentId;
  }

  /**
   * Sets the value of the 'documentId' field.
   * @param value the value to set.
   */
  public void setDocumentId(java.lang.CharSequence value) {
    this.documentId = value;
  }

  /**
   * Gets the value of the 'date' field.
   */
  public java.lang.CharSequence getDate() {
    return date;
  }

  /**
   * Sets the value of the 'date' field.
   * @param value the value to set.
   */
  public void setDate(java.lang.CharSequence value) {
    this.date = value;
  }

  /**
   * Gets the value of the 'distanceArray' field.
   */
  public java.util.List<java.lang.Double> getDistanceArray() {
    return distanceArray;
  }

  /**
   * Sets the value of the 'distanceArray' field.
   * @param value the value to set.
   */
  public void setDistanceArray(java.util.List<java.lang.Double> value) {
    this.distanceArray = value;
  }

  /** Creates a new Distances RecordBuilder */
  public static distances.avro.Distances.Builder newBuilder() {
    return new distances.avro.Distances.Builder();
  }
  
  /** Creates a new Distances RecordBuilder by copying an existing Builder */
  public static distances.avro.Distances.Builder newBuilder(distances.avro.Distances.Builder other) {
    return new distances.avro.Distances.Builder(other);
  }
  
  /** Creates a new Distances RecordBuilder by copying an existing Distances instance */
  public static distances.avro.Distances.Builder newBuilder(distances.avro.Distances other) {
    return new distances.avro.Distances.Builder(other);
  }
  
  /**
   * RecordBuilder for Distances instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Distances>
    implements org.apache.avro.data.RecordBuilder<Distances> {

    private java.lang.CharSequence title;
    private java.lang.CharSequence documentId;
    private java.lang.CharSequence date;
    private java.util.List<java.lang.Double> distanceArray;

    /** Creates a new Builder */
    private Builder() {
      super(distances.avro.Distances.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(distances.avro.Distances.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.title)) {
        this.title = data().deepCopy(fields()[0].schema(), other.title);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.documentId)) {
        this.documentId = data().deepCopy(fields()[1].schema(), other.documentId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.date)) {
        this.date = data().deepCopy(fields()[2].schema(), other.date);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.distanceArray)) {
        this.distanceArray = data().deepCopy(fields()[3].schema(), other.distanceArray);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Distances instance */
    private Builder(distances.avro.Distances other) {
            super(distances.avro.Distances.SCHEMA$);
      if (isValidValue(fields()[0], other.title)) {
        this.title = data().deepCopy(fields()[0].schema(), other.title);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.documentId)) {
        this.documentId = data().deepCopy(fields()[1].schema(), other.documentId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.date)) {
        this.date = data().deepCopy(fields()[2].schema(), other.date);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.distanceArray)) {
        this.distanceArray = data().deepCopy(fields()[3].schema(), other.distanceArray);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'title' field */
    public java.lang.CharSequence getTitle() {
      return title;
    }
    
    /** Sets the value of the 'title' field */
    public distances.avro.Distances.Builder setTitle(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.title = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'title' field has been set */
    public boolean hasTitle() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'title' field */
    public distances.avro.Distances.Builder clearTitle() {
      title = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'documentId' field */
    public java.lang.CharSequence getDocumentId() {
      return documentId;
    }
    
    /** Sets the value of the 'documentId' field */
    public distances.avro.Distances.Builder setDocumentId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.documentId = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'documentId' field has been set */
    public boolean hasDocumentId() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'documentId' field */
    public distances.avro.Distances.Builder clearDocumentId() {
      documentId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'date' field */
    public java.lang.CharSequence getDate() {
      return date;
    }
    
    /** Sets the value of the 'date' field */
    public distances.avro.Distances.Builder setDate(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.date = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'date' field has been set */
    public boolean hasDate() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'date' field */
    public distances.avro.Distances.Builder clearDate() {
      date = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'distanceArray' field */
    public java.util.List<java.lang.Double> getDistanceArray() {
      return distanceArray;
    }
    
    /** Sets the value of the 'distanceArray' field */
    public distances.avro.Distances.Builder setDistanceArray(java.util.List<java.lang.Double> value) {
      validate(fields()[3], value);
      this.distanceArray = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'distanceArray' field has been set */
    public boolean hasDistanceArray() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'distanceArray' field */
    public distances.avro.Distances.Builder clearDistanceArray() {
      distanceArray = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Distances build() {
      try {
        Distances record = new Distances();
        record.title = fieldSetFlags()[0] ? this.title : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.documentId = fieldSetFlags()[1] ? this.documentId : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.date = fieldSetFlags()[2] ? this.date : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.distanceArray = fieldSetFlags()[3] ? this.distanceArray : (java.util.List<java.lang.Double>) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
