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
package document.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Document extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Document\",\"namespace\":\"document.avro\",\"fields\":[{\"name\":\"documentId\",\"type\":\"string\"},{\"name\":\"title\",\"type\":\"string\"},{\"name\":\"date\",\"type\":\"string\"},{\"name\":\"description\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence documentId;
  @Deprecated public java.lang.CharSequence title;
  @Deprecated public java.lang.CharSequence date;
  @Deprecated public java.lang.CharSequence description;

  /**
   * @author Michele Sparamonti (michele.sparamonti@eng.it) 
   */
  public Document() {}

  /**
   * All-args constructor.
   */
  public Document(java.lang.CharSequence documentId, java.lang.CharSequence title, java.lang.CharSequence date, java.lang.CharSequence description) {
    this.documentId = documentId;
    this.title = title;
    this.date = date;
    this.description = description;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return documentId;
    case 1: return title;
    case 2: return date;
    case 3: return description;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: documentId = (java.lang.CharSequence)value$; break;
    case 1: title = (java.lang.CharSequence)value$; break;
    case 2: date = (java.lang.CharSequence)value$; break;
    case 3: description = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
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
   * Gets the value of the 'description' field.
   */
  public java.lang.CharSequence getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(java.lang.CharSequence value) {
    this.description = value;
  }

  /** Creates a new Document RecordBuilder */
  public static document.avro.Document.Builder newBuilder() {
    return new document.avro.Document.Builder();
  }
  
  /** Creates a new Document RecordBuilder by copying an existing Builder */
  public static document.avro.Document.Builder newBuilder(document.avro.Document.Builder other) {
    return new document.avro.Document.Builder(other);
  }
  
  /** Creates a new Document RecordBuilder by copying an existing Document instance */
  public static document.avro.Document.Builder newBuilder(document.avro.Document other) {
    return new document.avro.Document.Builder(other);
  }
  
  /**
   * RecordBuilder for Document instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Document>
    implements org.apache.avro.data.RecordBuilder<Document> {

    private java.lang.CharSequence documentId;
    private java.lang.CharSequence title;
    private java.lang.CharSequence date;
    private java.lang.CharSequence description;

    /** Creates a new Builder */
    private Builder() {
      super(document.avro.Document.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(document.avro.Document.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.documentId)) {
        this.documentId = data().deepCopy(fields()[0].schema(), other.documentId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.title)) {
        this.title = data().deepCopy(fields()[1].schema(), other.title);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.date)) {
        this.date = data().deepCopy(fields()[2].schema(), other.date);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.description)) {
        this.description = data().deepCopy(fields()[3].schema(), other.description);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Document instance */
    private Builder(document.avro.Document other) {
            super(document.avro.Document.SCHEMA$);
      if (isValidValue(fields()[0], other.documentId)) {
        this.documentId = data().deepCopy(fields()[0].schema(), other.documentId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.title)) {
        this.title = data().deepCopy(fields()[1].schema(), other.title);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.date)) {
        this.date = data().deepCopy(fields()[2].schema(), other.date);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.description)) {
        this.description = data().deepCopy(fields()[3].schema(), other.description);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'documentId' field */
    public java.lang.CharSequence getDocumentId() {
      return documentId;
    }
    
    /** Sets the value of the 'documentId' field */
    public document.avro.Document.Builder setDocumentId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.documentId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'documentId' field has been set */
    public boolean hasDocumentId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'documentId' field */
    public document.avro.Document.Builder clearDocumentId() {
      documentId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'title' field */
    public java.lang.CharSequence getTitle() {
      return title;
    }
    
    /** Sets the value of the 'title' field */
    public document.avro.Document.Builder setTitle(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.title = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'title' field has been set */
    public boolean hasTitle() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'title' field */
    public document.avro.Document.Builder clearTitle() {
      title = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'date' field */
    public java.lang.CharSequence getDate() {
      return date;
    }
    
    /** Sets the value of the 'date' field */
    public document.avro.Document.Builder setDate(java.lang.CharSequence value) {
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
    public document.avro.Document.Builder clearDate() {
      date = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'description' field */
    public java.lang.CharSequence getDescription() {
      return description;
    }
    
    /** Sets the value of the 'description' field */
    public document.avro.Document.Builder setDescription(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.description = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'description' field has been set */
    public boolean hasDescription() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'description' field */
    public document.avro.Document.Builder clearDescription() {
      description = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Document build() {
      try {
        Document record = new Document();
        record.documentId = fieldSetFlags()[0] ? this.documentId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.title = fieldSetFlags()[1] ? this.title : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.date = fieldSetFlags()[2] ? this.date : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.description = fieldSetFlags()[3] ? this.description : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
