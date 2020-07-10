/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package velibstreaming.avro.record.stream;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class AvroStationStats extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3009984780859883083L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroStationStats\",\"namespace\":\"velibstreaming.avro.record.stream\",\"fields\":[{\"name\":\"numberOfMechanicalBikesReturned\",\"type\":\"int\"},{\"name\":\"numberOfElectricBikesReturned\",\"type\":\"int\"},{\"name\":\"numberOfMechanicalBikesRented\",\"type\":\"int\"},{\"name\":\"numberOfElectricBikesRented\",\"type\":\"int\"},{\"name\":\"lastNumberOfMechanicalBikes\",\"type\":\"int\"},{\"name\":\"lastNumberOfElectricBikes\",\"type\":\"int\"},{\"name\":\"lastLoadTimestamp\",\"type\":\"long\",\"logicalType\":\"local-timestamp-millis\"},{\"name\":\"periodStart\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"local-timestamp-millis\"},{\"name\":\"periodEnd\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"local-timestamp-millis\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AvroStationStats> ENCODER =
      new BinaryMessageEncoder<AvroStationStats>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AvroStationStats> DECODER =
      new BinaryMessageDecoder<AvroStationStats>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<AvroStationStats> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<AvroStationStats> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<AvroStationStats> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AvroStationStats>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this AvroStationStats to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a AvroStationStats from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a AvroStationStats instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static AvroStationStats fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int numberOfMechanicalBikesReturned;
  @Deprecated public int numberOfElectricBikesReturned;
  @Deprecated public int numberOfMechanicalBikesRented;
  @Deprecated public int numberOfElectricBikesRented;
  @Deprecated public int lastNumberOfMechanicalBikes;
  @Deprecated public int lastNumberOfElectricBikes;
  @Deprecated public long lastLoadTimestamp;
  @Deprecated public java.lang.Long periodStart;
  @Deprecated public java.lang.Long periodEnd;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AvroStationStats() {}

  /**
   * All-args constructor.
   * @param numberOfMechanicalBikesReturned The new value for numberOfMechanicalBikesReturned
   * @param numberOfElectricBikesReturned The new value for numberOfElectricBikesReturned
   * @param numberOfMechanicalBikesRented The new value for numberOfMechanicalBikesRented
   * @param numberOfElectricBikesRented The new value for numberOfElectricBikesRented
   * @param lastNumberOfMechanicalBikes The new value for lastNumberOfMechanicalBikes
   * @param lastNumberOfElectricBikes The new value for lastNumberOfElectricBikes
   * @param lastLoadTimestamp The new value for lastLoadTimestamp
   * @param periodStart The new value for periodStart
   * @param periodEnd The new value for periodEnd
   */
  public AvroStationStats(java.lang.Integer numberOfMechanicalBikesReturned, java.lang.Integer numberOfElectricBikesReturned, java.lang.Integer numberOfMechanicalBikesRented, java.lang.Integer numberOfElectricBikesRented, java.lang.Integer lastNumberOfMechanicalBikes, java.lang.Integer lastNumberOfElectricBikes, java.lang.Long lastLoadTimestamp, java.lang.Long periodStart, java.lang.Long periodEnd) {
    this.numberOfMechanicalBikesReturned = numberOfMechanicalBikesReturned;
    this.numberOfElectricBikesReturned = numberOfElectricBikesReturned;
    this.numberOfMechanicalBikesRented = numberOfMechanicalBikesRented;
    this.numberOfElectricBikesRented = numberOfElectricBikesRented;
    this.lastNumberOfMechanicalBikes = lastNumberOfMechanicalBikes;
    this.lastNumberOfElectricBikes = lastNumberOfElectricBikes;
    this.lastLoadTimestamp = lastLoadTimestamp;
    this.periodStart = periodStart;
    this.periodEnd = periodEnd;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return numberOfMechanicalBikesReturned;
    case 1: return numberOfElectricBikesReturned;
    case 2: return numberOfMechanicalBikesRented;
    case 3: return numberOfElectricBikesRented;
    case 4: return lastNumberOfMechanicalBikes;
    case 5: return lastNumberOfElectricBikes;
    case 6: return lastLoadTimestamp;
    case 7: return periodStart;
    case 8: return periodEnd;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: numberOfMechanicalBikesReturned = (java.lang.Integer)value$; break;
    case 1: numberOfElectricBikesReturned = (java.lang.Integer)value$; break;
    case 2: numberOfMechanicalBikesRented = (java.lang.Integer)value$; break;
    case 3: numberOfElectricBikesRented = (java.lang.Integer)value$; break;
    case 4: lastNumberOfMechanicalBikes = (java.lang.Integer)value$; break;
    case 5: lastNumberOfElectricBikes = (java.lang.Integer)value$; break;
    case 6: lastLoadTimestamp = (java.lang.Long)value$; break;
    case 7: periodStart = (java.lang.Long)value$; break;
    case 8: periodEnd = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'numberOfMechanicalBikesReturned' field.
   * @return The value of the 'numberOfMechanicalBikesReturned' field.
   */
  public int getNumberOfMechanicalBikesReturned() {
    return numberOfMechanicalBikesReturned;
  }


  /**
   * Sets the value of the 'numberOfMechanicalBikesReturned' field.
   * @param value the value to set.
   */
  public void setNumberOfMechanicalBikesReturned(int value) {
    this.numberOfMechanicalBikesReturned = value;
  }

  /**
   * Gets the value of the 'numberOfElectricBikesReturned' field.
   * @return The value of the 'numberOfElectricBikesReturned' field.
   */
  public int getNumberOfElectricBikesReturned() {
    return numberOfElectricBikesReturned;
  }


  /**
   * Sets the value of the 'numberOfElectricBikesReturned' field.
   * @param value the value to set.
   */
  public void setNumberOfElectricBikesReturned(int value) {
    this.numberOfElectricBikesReturned = value;
  }

  /**
   * Gets the value of the 'numberOfMechanicalBikesRented' field.
   * @return The value of the 'numberOfMechanicalBikesRented' field.
   */
  public int getNumberOfMechanicalBikesRented() {
    return numberOfMechanicalBikesRented;
  }


  /**
   * Sets the value of the 'numberOfMechanicalBikesRented' field.
   * @param value the value to set.
   */
  public void setNumberOfMechanicalBikesRented(int value) {
    this.numberOfMechanicalBikesRented = value;
  }

  /**
   * Gets the value of the 'numberOfElectricBikesRented' field.
   * @return The value of the 'numberOfElectricBikesRented' field.
   */
  public int getNumberOfElectricBikesRented() {
    return numberOfElectricBikesRented;
  }


  /**
   * Sets the value of the 'numberOfElectricBikesRented' field.
   * @param value the value to set.
   */
  public void setNumberOfElectricBikesRented(int value) {
    this.numberOfElectricBikesRented = value;
  }

  /**
   * Gets the value of the 'lastNumberOfMechanicalBikes' field.
   * @return The value of the 'lastNumberOfMechanicalBikes' field.
   */
  public int getLastNumberOfMechanicalBikes() {
    return lastNumberOfMechanicalBikes;
  }


  /**
   * Sets the value of the 'lastNumberOfMechanicalBikes' field.
   * @param value the value to set.
   */
  public void setLastNumberOfMechanicalBikes(int value) {
    this.lastNumberOfMechanicalBikes = value;
  }

  /**
   * Gets the value of the 'lastNumberOfElectricBikes' field.
   * @return The value of the 'lastNumberOfElectricBikes' field.
   */
  public int getLastNumberOfElectricBikes() {
    return lastNumberOfElectricBikes;
  }


  /**
   * Sets the value of the 'lastNumberOfElectricBikes' field.
   * @param value the value to set.
   */
  public void setLastNumberOfElectricBikes(int value) {
    this.lastNumberOfElectricBikes = value;
  }

  /**
   * Gets the value of the 'lastLoadTimestamp' field.
   * @return The value of the 'lastLoadTimestamp' field.
   */
  public long getLastLoadTimestamp() {
    return lastLoadTimestamp;
  }


  /**
   * Sets the value of the 'lastLoadTimestamp' field.
   * @param value the value to set.
   */
  public void setLastLoadTimestamp(long value) {
    this.lastLoadTimestamp = value;
  }

  /**
   * Gets the value of the 'periodStart' field.
   * @return The value of the 'periodStart' field.
   */
  public java.lang.Long getPeriodStart() {
    return periodStart;
  }


  /**
   * Sets the value of the 'periodStart' field.
   * @param value the value to set.
   */
  public void setPeriodStart(java.lang.Long value) {
    this.periodStart = value;
  }

  /**
   * Gets the value of the 'periodEnd' field.
   * @return The value of the 'periodEnd' field.
   */
  public java.lang.Long getPeriodEnd() {
    return periodEnd;
  }


  /**
   * Sets the value of the 'periodEnd' field.
   * @param value the value to set.
   */
  public void setPeriodEnd(java.lang.Long value) {
    this.periodEnd = value;
  }

  /**
   * Creates a new AvroStationStats RecordBuilder.
   * @return A new AvroStationStats RecordBuilder
   */
  public static velibstreaming.avro.record.stream.AvroStationStats.Builder newBuilder() {
    return new velibstreaming.avro.record.stream.AvroStationStats.Builder();
  }

  /**
   * Creates a new AvroStationStats RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AvroStationStats RecordBuilder
   */
  public static velibstreaming.avro.record.stream.AvroStationStats.Builder newBuilder(velibstreaming.avro.record.stream.AvroStationStats.Builder other) {
    if (other == null) {
      return new velibstreaming.avro.record.stream.AvroStationStats.Builder();
    } else {
      return new velibstreaming.avro.record.stream.AvroStationStats.Builder(other);
    }
  }

  /**
   * Creates a new AvroStationStats RecordBuilder by copying an existing AvroStationStats instance.
   * @param other The existing instance to copy.
   * @return A new AvroStationStats RecordBuilder
   */
  public static velibstreaming.avro.record.stream.AvroStationStats.Builder newBuilder(velibstreaming.avro.record.stream.AvroStationStats other) {
    if (other == null) {
      return new velibstreaming.avro.record.stream.AvroStationStats.Builder();
    } else {
      return new velibstreaming.avro.record.stream.AvroStationStats.Builder(other);
    }
  }

  /**
   * RecordBuilder for AvroStationStats instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvroStationStats>
    implements org.apache.avro.data.RecordBuilder<AvroStationStats> {

    private int numberOfMechanicalBikesReturned;
    private int numberOfElectricBikesReturned;
    private int numberOfMechanicalBikesRented;
    private int numberOfElectricBikesRented;
    private int lastNumberOfMechanicalBikes;
    private int lastNumberOfElectricBikes;
    private long lastLoadTimestamp;
    private java.lang.Long periodStart;
    private java.lang.Long periodEnd;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(velibstreaming.avro.record.stream.AvroStationStats.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.numberOfMechanicalBikesReturned)) {
        this.numberOfMechanicalBikesReturned = data().deepCopy(fields()[0].schema(), other.numberOfMechanicalBikesReturned);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.numberOfElectricBikesReturned)) {
        this.numberOfElectricBikesReturned = data().deepCopy(fields()[1].schema(), other.numberOfElectricBikesReturned);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.numberOfMechanicalBikesRented)) {
        this.numberOfMechanicalBikesRented = data().deepCopy(fields()[2].schema(), other.numberOfMechanicalBikesRented);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.numberOfElectricBikesRented)) {
        this.numberOfElectricBikesRented = data().deepCopy(fields()[3].schema(), other.numberOfElectricBikesRented);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.lastNumberOfMechanicalBikes)) {
        this.lastNumberOfMechanicalBikes = data().deepCopy(fields()[4].schema(), other.lastNumberOfMechanicalBikes);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.lastNumberOfElectricBikes)) {
        this.lastNumberOfElectricBikes = data().deepCopy(fields()[5].schema(), other.lastNumberOfElectricBikes);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.lastLoadTimestamp)) {
        this.lastLoadTimestamp = data().deepCopy(fields()[6].schema(), other.lastLoadTimestamp);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.periodStart)) {
        this.periodStart = data().deepCopy(fields()[7].schema(), other.periodStart);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.periodEnd)) {
        this.periodEnd = data().deepCopy(fields()[8].schema(), other.periodEnd);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
    }

    /**
     * Creates a Builder by copying an existing AvroStationStats instance
     * @param other The existing instance to copy.
     */
    private Builder(velibstreaming.avro.record.stream.AvroStationStats other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.numberOfMechanicalBikesReturned)) {
        this.numberOfMechanicalBikesReturned = data().deepCopy(fields()[0].schema(), other.numberOfMechanicalBikesReturned);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.numberOfElectricBikesReturned)) {
        this.numberOfElectricBikesReturned = data().deepCopy(fields()[1].schema(), other.numberOfElectricBikesReturned);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.numberOfMechanicalBikesRented)) {
        this.numberOfMechanicalBikesRented = data().deepCopy(fields()[2].schema(), other.numberOfMechanicalBikesRented);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.numberOfElectricBikesRented)) {
        this.numberOfElectricBikesRented = data().deepCopy(fields()[3].schema(), other.numberOfElectricBikesRented);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.lastNumberOfMechanicalBikes)) {
        this.lastNumberOfMechanicalBikes = data().deepCopy(fields()[4].schema(), other.lastNumberOfMechanicalBikes);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.lastNumberOfElectricBikes)) {
        this.lastNumberOfElectricBikes = data().deepCopy(fields()[5].schema(), other.lastNumberOfElectricBikes);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.lastLoadTimestamp)) {
        this.lastLoadTimestamp = data().deepCopy(fields()[6].schema(), other.lastLoadTimestamp);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.periodStart)) {
        this.periodStart = data().deepCopy(fields()[7].schema(), other.periodStart);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.periodEnd)) {
        this.periodEnd = data().deepCopy(fields()[8].schema(), other.periodEnd);
        fieldSetFlags()[8] = true;
      }
    }

    /**
      * Gets the value of the 'numberOfMechanicalBikesReturned' field.
      * @return The value.
      */
    public int getNumberOfMechanicalBikesReturned() {
      return numberOfMechanicalBikesReturned;
    }


    /**
      * Sets the value of the 'numberOfMechanicalBikesReturned' field.
      * @param value The value of 'numberOfMechanicalBikesReturned'.
      * @return This builder.
      */
    public velibstreaming.avro.record.stream.AvroStationStats.Builder setNumberOfMechanicalBikesReturned(int value) {
      validate(fields()[0], value);
      this.numberOfMechanicalBikesReturned = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'numberOfMechanicalBikesReturned' field has been set.
      * @return True if the 'numberOfMechanicalBikesReturned' field has been set, false otherwise.
      */
    public boolean hasNumberOfMechanicalBikesReturned() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'numberOfMechanicalBikesReturned' field.
      * @return This builder.
      */
    public velibstreaming.avro.record.stream.AvroStationStats.Builder clearNumberOfMechanicalBikesReturned() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'numberOfElectricBikesReturned' field.
      * @return The value.
      */
    public int getNumberOfElectricBikesReturned() {
      return numberOfElectricBikesReturned;
    }


    /**
      * Sets the value of the 'numberOfElectricBikesReturned' field.
      * @param value The value of 'numberOfElectricBikesReturned'.
      * @return This builder.
      */
    public velibstreaming.avro.record.stream.AvroStationStats.Builder setNumberOfElectricBikesReturned(int value) {
      validate(fields()[1], value);
      this.numberOfElectricBikesReturned = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'numberOfElectricBikesReturned' field has been set.
      * @return True if the 'numberOfElectricBikesReturned' field has been set, false otherwise.
      */
    public boolean hasNumberOfElectricBikesReturned() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'numberOfElectricBikesReturned' field.
      * @return This builder.
      */
    public velibstreaming.avro.record.stream.AvroStationStats.Builder clearNumberOfElectricBikesReturned() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'numberOfMechanicalBikesRented' field.
      * @return The value.
      */
    public int getNumberOfMechanicalBikesRented() {
      return numberOfMechanicalBikesRented;
    }


    /**
      * Sets the value of the 'numberOfMechanicalBikesRented' field.
      * @param value The value of 'numberOfMechanicalBikesRented'.
      * @return This builder.
      */
    public velibstreaming.avro.record.stream.AvroStationStats.Builder setNumberOfMechanicalBikesRented(int value) {
      validate(fields()[2], value);
      this.numberOfMechanicalBikesRented = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'numberOfMechanicalBikesRented' field has been set.
      * @return True if the 'numberOfMechanicalBikesRented' field has been set, false otherwise.
      */
    public boolean hasNumberOfMechanicalBikesRented() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'numberOfMechanicalBikesRented' field.
      * @return This builder.
      */
    public velibstreaming.avro.record.stream.AvroStationStats.Builder clearNumberOfMechanicalBikesRented() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'numberOfElectricBikesRented' field.
      * @return The value.
      */
    public int getNumberOfElectricBikesRented() {
      return numberOfElectricBikesRented;
    }


    /**
      * Sets the value of the 'numberOfElectricBikesRented' field.
      * @param value The value of 'numberOfElectricBikesRented'.
      * @return This builder.
      */
    public velibstreaming.avro.record.stream.AvroStationStats.Builder setNumberOfElectricBikesRented(int value) {
      validate(fields()[3], value);
      this.numberOfElectricBikesRented = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'numberOfElectricBikesRented' field has been set.
      * @return True if the 'numberOfElectricBikesRented' field has been set, false otherwise.
      */
    public boolean hasNumberOfElectricBikesRented() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'numberOfElectricBikesRented' field.
      * @return This builder.
      */
    public velibstreaming.avro.record.stream.AvroStationStats.Builder clearNumberOfElectricBikesRented() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastNumberOfMechanicalBikes' field.
      * @return The value.
      */
    public int getLastNumberOfMechanicalBikes() {
      return lastNumberOfMechanicalBikes;
    }


    /**
      * Sets the value of the 'lastNumberOfMechanicalBikes' field.
      * @param value The value of 'lastNumberOfMechanicalBikes'.
      * @return This builder.
      */
    public velibstreaming.avro.record.stream.AvroStationStats.Builder setLastNumberOfMechanicalBikes(int value) {
      validate(fields()[4], value);
      this.lastNumberOfMechanicalBikes = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'lastNumberOfMechanicalBikes' field has been set.
      * @return True if the 'lastNumberOfMechanicalBikes' field has been set, false otherwise.
      */
    public boolean hasLastNumberOfMechanicalBikes() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'lastNumberOfMechanicalBikes' field.
      * @return This builder.
      */
    public velibstreaming.avro.record.stream.AvroStationStats.Builder clearLastNumberOfMechanicalBikes() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastNumberOfElectricBikes' field.
      * @return The value.
      */
    public int getLastNumberOfElectricBikes() {
      return lastNumberOfElectricBikes;
    }


    /**
      * Sets the value of the 'lastNumberOfElectricBikes' field.
      * @param value The value of 'lastNumberOfElectricBikes'.
      * @return This builder.
      */
    public velibstreaming.avro.record.stream.AvroStationStats.Builder setLastNumberOfElectricBikes(int value) {
      validate(fields()[5], value);
      this.lastNumberOfElectricBikes = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'lastNumberOfElectricBikes' field has been set.
      * @return True if the 'lastNumberOfElectricBikes' field has been set, false otherwise.
      */
    public boolean hasLastNumberOfElectricBikes() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'lastNumberOfElectricBikes' field.
      * @return This builder.
      */
    public velibstreaming.avro.record.stream.AvroStationStats.Builder clearLastNumberOfElectricBikes() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastLoadTimestamp' field.
      * @return The value.
      */
    public long getLastLoadTimestamp() {
      return lastLoadTimestamp;
    }


    /**
      * Sets the value of the 'lastLoadTimestamp' field.
      * @param value The value of 'lastLoadTimestamp'.
      * @return This builder.
      */
    public velibstreaming.avro.record.stream.AvroStationStats.Builder setLastLoadTimestamp(long value) {
      validate(fields()[6], value);
      this.lastLoadTimestamp = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'lastLoadTimestamp' field has been set.
      * @return True if the 'lastLoadTimestamp' field has been set, false otherwise.
      */
    public boolean hasLastLoadTimestamp() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'lastLoadTimestamp' field.
      * @return This builder.
      */
    public velibstreaming.avro.record.stream.AvroStationStats.Builder clearLastLoadTimestamp() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'periodStart' field.
      * @return The value.
      */
    public java.lang.Long getPeriodStart() {
      return periodStart;
    }


    /**
      * Sets the value of the 'periodStart' field.
      * @param value The value of 'periodStart'.
      * @return This builder.
      */
    public velibstreaming.avro.record.stream.AvroStationStats.Builder setPeriodStart(java.lang.Long value) {
      validate(fields()[7], value);
      this.periodStart = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'periodStart' field has been set.
      * @return True if the 'periodStart' field has been set, false otherwise.
      */
    public boolean hasPeriodStart() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'periodStart' field.
      * @return This builder.
      */
    public velibstreaming.avro.record.stream.AvroStationStats.Builder clearPeriodStart() {
      periodStart = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'periodEnd' field.
      * @return The value.
      */
    public java.lang.Long getPeriodEnd() {
      return periodEnd;
    }


    /**
      * Sets the value of the 'periodEnd' field.
      * @param value The value of 'periodEnd'.
      * @return This builder.
      */
    public velibstreaming.avro.record.stream.AvroStationStats.Builder setPeriodEnd(java.lang.Long value) {
      validate(fields()[8], value);
      this.periodEnd = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'periodEnd' field has been set.
      * @return True if the 'periodEnd' field has been set, false otherwise.
      */
    public boolean hasPeriodEnd() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'periodEnd' field.
      * @return This builder.
      */
    public velibstreaming.avro.record.stream.AvroStationStats.Builder clearPeriodEnd() {
      periodEnd = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AvroStationStats build() {
      try {
        AvroStationStats record = new AvroStationStats();
        record.numberOfMechanicalBikesReturned = fieldSetFlags()[0] ? this.numberOfMechanicalBikesReturned : (java.lang.Integer) defaultValue(fields()[0]);
        record.numberOfElectricBikesReturned = fieldSetFlags()[1] ? this.numberOfElectricBikesReturned : (java.lang.Integer) defaultValue(fields()[1]);
        record.numberOfMechanicalBikesRented = fieldSetFlags()[2] ? this.numberOfMechanicalBikesRented : (java.lang.Integer) defaultValue(fields()[2]);
        record.numberOfElectricBikesRented = fieldSetFlags()[3] ? this.numberOfElectricBikesRented : (java.lang.Integer) defaultValue(fields()[3]);
        record.lastNumberOfMechanicalBikes = fieldSetFlags()[4] ? this.lastNumberOfMechanicalBikes : (java.lang.Integer) defaultValue(fields()[4]);
        record.lastNumberOfElectricBikes = fieldSetFlags()[5] ? this.lastNumberOfElectricBikes : (java.lang.Integer) defaultValue(fields()[5]);
        record.lastLoadTimestamp = fieldSetFlags()[6] ? this.lastLoadTimestamp : (java.lang.Long) defaultValue(fields()[6]);
        record.periodStart = fieldSetFlags()[7] ? this.periodStart : (java.lang.Long) defaultValue(fields()[7]);
        record.periodEnd = fieldSetFlags()[8] ? this.periodEnd : (java.lang.Long) defaultValue(fields()[8]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AvroStationStats>
    WRITER$ = (org.apache.avro.io.DatumWriter<AvroStationStats>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AvroStationStats>
    READER$ = (org.apache.avro.io.DatumReader<AvroStationStats>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.numberOfMechanicalBikesReturned);

    out.writeInt(this.numberOfElectricBikesReturned);

    out.writeInt(this.numberOfMechanicalBikesRented);

    out.writeInt(this.numberOfElectricBikesRented);

    out.writeInt(this.lastNumberOfMechanicalBikes);

    out.writeInt(this.lastNumberOfElectricBikes);

    out.writeLong(this.lastLoadTimestamp);

    if (this.periodStart == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.periodStart);
    }

    if (this.periodEnd == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.periodEnd);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.numberOfMechanicalBikesReturned = in.readInt();

      this.numberOfElectricBikesReturned = in.readInt();

      this.numberOfMechanicalBikesRented = in.readInt();

      this.numberOfElectricBikesRented = in.readInt();

      this.lastNumberOfMechanicalBikes = in.readInt();

      this.lastNumberOfElectricBikes = in.readInt();

      this.lastLoadTimestamp = in.readLong();

      if (in.readIndex() != 1) {
        in.readNull();
        this.periodStart = null;
      } else {
        this.periodStart = in.readLong();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.periodEnd = null;
      } else {
        this.periodEnd = in.readLong();
      }

    } else {
      for (int i = 0; i < 9; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.numberOfMechanicalBikesReturned = in.readInt();
          break;

        case 1:
          this.numberOfElectricBikesReturned = in.readInt();
          break;

        case 2:
          this.numberOfMechanicalBikesRented = in.readInt();
          break;

        case 3:
          this.numberOfElectricBikesRented = in.readInt();
          break;

        case 4:
          this.lastNumberOfMechanicalBikes = in.readInt();
          break;

        case 5:
          this.lastNumberOfElectricBikes = in.readInt();
          break;

        case 6:
          this.lastLoadTimestamp = in.readLong();
          break;

        case 7:
          if (in.readIndex() != 1) {
            in.readNull();
            this.periodStart = null;
          } else {
            this.periodStart = in.readLong();
          }
          break;

        case 8:
          if (in.readIndex() != 1) {
            in.readNull();
            this.periodEnd = null;
          } else {
            this.periodEnd = in.readLong();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









