package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import java.io.Serializable;

public class MinimalPrettyPrinter implements PrettyPrinter, Serializable {
    private static final long serialVersionUID = 1;
    protected String _rootValueSeparator;
    protected Separators _separators;

    public MinimalPrettyPrinter() {
        this(DEFAULT_ROOT_VALUE_SEPARATOR.toString());
    }

    public MinimalPrettyPrinter(String str) {
        this._rootValueSeparator = str;
        this._separators = DEFAULT_SEPARATORS;
    }

    public void beforeArrayValues(JsonGenerator jsonGenerator) {
    }

    public void beforeObjectEntries(JsonGenerator jsonGenerator) {
    }

    public void writeArrayValueSeparator(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw(this._separators.getArrayValueSeparator());
    }

    public void writeEndArray(JsonGenerator jsonGenerator, int i) {
        jsonGenerator.writeRaw(']');
    }

    public void writeEndObject(JsonGenerator jsonGenerator, int i) {
        jsonGenerator.writeRaw('}');
    }

    public void writeObjectEntrySeparator(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw(this._separators.getObjectEntrySeparator());
    }

    public void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw(this._separators.getObjectFieldValueSeparator());
    }

    public void writeRootValueSeparator(JsonGenerator jsonGenerator) {
        String str = this._rootValueSeparator;
        if (str != null) {
            jsonGenerator.writeRaw(str);
        }
    }

    public void writeStartArray(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw('[');
    }

    public void writeStartObject(JsonGenerator jsonGenerator) {
        jsonGenerator.writeRaw('{');
    }
}
