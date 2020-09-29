package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

public abstract class JsonGeneratorImpl extends GeneratorBase {
    protected static final int[] sOutputEscapes = CharTypes.get7BitOutputEscapes();
    protected boolean _cfgUnqNames;
    protected CharacterEscapes _characterEscapes;
    protected final IOContext _ioContext;
    protected int _maximumNonEscapedChar;
    protected int[] _outputEscapes = sOutputEscapes;
    protected SerializableString _rootValueSeparator = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;

    public JsonGeneratorImpl(IOContext iOContext, int i, ObjectCodec objectCodec) {
        super(i, objectCodec);
        this._ioContext = iOContext;
        if (Feature.ESCAPE_NON_ASCII.enabledIn(i)) {
            this._maximumNonEscapedChar = 127;
        }
        this._cfgUnqNames = !Feature.QUOTE_FIELD_NAMES.enabledIn(i);
    }

    public void _checkStdFeatureChanges(int i, int i2) {
        super._checkStdFeatureChanges(i, i2);
        this._cfgUnqNames = !Feature.QUOTE_FIELD_NAMES.enabledIn(i);
    }

    /* access modifiers changed from: protected */
    public void _reportCantWriteValueExpectName(String str) {
        _reportError(String.format("Can not %s, expecting field name (context: %s)", new Object[]{str, this._writeContext.typeDesc()}));
    }

    /* access modifiers changed from: protected */
    public void _verifyPrettyValueWrite(String str, int i) {
        if (i != 0) {
            if (i == 1) {
                this._cfgPrettyPrinter.writeArrayValueSeparator(this);
            } else if (i == 2) {
                this._cfgPrettyPrinter.writeObjectFieldValueSeparator(this);
            } else if (i == 3) {
                this._cfgPrettyPrinter.writeRootValueSeparator(this);
            } else if (i != 5) {
                _throwInternal();
            } else {
                _reportCantWriteValueExpectName(str);
            }
        } else if (this._writeContext.inArray()) {
            this._cfgPrettyPrinter.beforeArrayValues(this);
        } else if (this._writeContext.inObject()) {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
    }

    public JsonGenerator disable(Feature feature) {
        super.disable(feature);
        if (feature == Feature.QUOTE_FIELD_NAMES) {
            this._cfgUnqNames = true;
        }
        return this;
    }

    public JsonGenerator setCharacterEscapes(CharacterEscapes characterEscapes) {
        this._characterEscapes = characterEscapes;
        if (characterEscapes == null) {
            this._outputEscapes = sOutputEscapes;
        } else {
            this._outputEscapes = characterEscapes.getEscapeCodesForAscii();
        }
        return this;
    }

    public JsonGenerator setHighestNonEscapedChar(int i) {
        if (i < 0) {
            i = 0;
        }
        this._maximumNonEscapedChar = i;
        return this;
    }

    public JsonGenerator setRootValueSeparator(SerializableString serializableString) {
        this._rootValueSeparator = serializableString;
        return this;
    }

    public final void writeStringField(String str, String str2) {
        writeFieldName(str);
        writeString(str2);
    }
}
