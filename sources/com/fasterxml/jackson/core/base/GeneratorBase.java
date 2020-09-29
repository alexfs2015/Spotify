package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import java.io.InputStream;
import java.math.BigDecimal;

public abstract class GeneratorBase extends JsonGenerator {
    protected static final int DERIVED_FEATURES_MASK = ((Feature.WRITE_NUMBERS_AS_STRINGS.getMask() | Feature.ESCAPE_NON_ASCII.getMask()) | Feature.STRICT_DUPLICATE_DETECTION.getMask());
    protected boolean _cfgNumbersAsStrings;
    protected boolean _closed;
    protected int _features;
    protected ObjectCodec _objectCodec;
    protected JsonWriteContext _writeContext;

    protected GeneratorBase(int i, ObjectCodec objectCodec) {
        this._features = i;
        this._objectCodec = objectCodec;
        this._writeContext = JsonWriteContext.createRootContext(Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? DupDetector.rootDetector((JsonGenerator) this) : null);
        this._cfgNumbersAsStrings = Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
    }

    /* access modifiers changed from: protected */
    public String _asString(BigDecimal bigDecimal) {
        if (!Feature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this._features)) {
            return bigDecimal.toString();
        }
        int scale = bigDecimal.scale();
        if (scale < -9999 || scale > 9999) {
            _reportError(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", new Object[]{Integer.valueOf(scale), Integer.valueOf(9999), Integer.valueOf(9999)}));
        }
        return bigDecimal.toPlainString();
    }

    /* access modifiers changed from: protected */
    public void _checkStdFeatureChanges(int i, int i2) {
        if ((DERIVED_FEATURES_MASK & i2) != 0) {
            this._cfgNumbersAsStrings = Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
            if (Feature.ESCAPE_NON_ASCII.enabledIn(i2)) {
                if (Feature.ESCAPE_NON_ASCII.enabledIn(i)) {
                    setHighestNonEscapedChar(127);
                } else {
                    setHighestNonEscapedChar(0);
                }
            }
            if (Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i2)) {
                if (!Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i)) {
                    this._writeContext = this._writeContext.withDupDetector(null);
                } else if (this._writeContext.getDupDetector() == null) {
                    this._writeContext = this._writeContext.withDupDetector(DupDetector.rootDetector((JsonGenerator) this));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int _decodeSurrogate(int i, int i2) {
        if (i2 < 56320 || i2 > 57343) {
            StringBuilder sb = new StringBuilder("Incomplete surrogate pair: first char 0x");
            sb.append(Integer.toHexString(i));
            sb.append(", second 0x");
            sb.append(Integer.toHexString(i2));
            _reportError(sb.toString());
        }
        return ((i - 55296) << 10) + 65536 + (i2 - 56320);
    }

    /* access modifiers changed from: protected */
    public abstract void _verifyValueWrite(String str);

    public void close() {
        this._closed = true;
    }

    public JsonGenerator disable(Feature feature) {
        int mask = feature.getMask();
        this._features &= mask ^ -1;
        if ((mask & DERIVED_FEATURES_MASK) != 0) {
            if (feature == Feature.WRITE_NUMBERS_AS_STRINGS) {
                this._cfgNumbersAsStrings = false;
            } else if (feature == Feature.ESCAPE_NON_ASCII) {
                setHighestNonEscapedChar(0);
            } else if (feature == Feature.STRICT_DUPLICATE_DETECTION) {
                this._writeContext = this._writeContext.withDupDetector(null);
            }
        }
        return this;
    }

    public int getFeatureMask() {
        return this._features;
    }

    public JsonStreamContext getOutputContext() {
        return this._writeContext;
    }

    public final boolean isEnabled(Feature feature) {
        return (feature.getMask() & this._features) != 0;
    }

    public JsonGenerator overrideStdFeatures(int i, int i2) {
        int i3 = this._features;
        int i4 = (i & i2) | ((i2 ^ -1) & i3);
        int i5 = i3 ^ i4;
        if (i5 != 0) {
            this._features = i4;
            _checkStdFeatureChanges(i4, i5);
        }
        return this;
    }

    public void setCurrentValue(Object obj) {
        this._writeContext.setCurrentValue(obj);
    }

    @Deprecated
    public JsonGenerator setFeatureMask(int i) {
        int i2 = this._features ^ i;
        this._features = i;
        if (i2 != 0) {
            _checkStdFeatureChanges(i, i2);
        }
        return this;
    }

    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i) {
        _reportUnsupportedOperation();
        return 0;
    }

    public void writeFieldName(SerializableString serializableString) {
        writeFieldName(serializableString.getValue());
    }

    public void writeObject(Object obj) {
        if (obj == null) {
            writeNull();
            return;
        }
        ObjectCodec objectCodec = this._objectCodec;
        if (objectCodec != null) {
            objectCodec.writeValue(this, obj);
        } else {
            _writeSimpleObject(obj);
        }
    }

    public void writeRawValue(SerializableString serializableString) {
        _verifyValueWrite("write raw value");
        writeRaw(serializableString);
    }

    public void writeRawValue(String str) {
        _verifyValueWrite("write raw value");
        writeRaw(str);
    }

    public void writeStartObject(Object obj) {
        writeStartObject();
        JsonWriteContext jsonWriteContext = this._writeContext;
        if (!(jsonWriteContext == null || obj == null)) {
            jsonWriteContext.setCurrentValue(obj);
        }
        setCurrentValue(obj);
    }

    public void writeString(SerializableString serializableString) {
        writeString(serializableString.getValue());
    }
}
