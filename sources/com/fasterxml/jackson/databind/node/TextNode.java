package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class TextNode extends ValueNode {
    static final TextNode EMPTY_STRING_NODE = new TextNode("");
    protected final String _value;

    public TextNode(String str) {
        this._value = str;
    }

    protected static void appendQuoted(StringBuilder sb, String str) {
        sb.append('\"');
        CharTypes.appendQuoted(sb, str);
        sb.append('\"');
    }

    public static TextNode valueOf(String str) {
        if (str == null) {
            return null;
        }
        return str.length() == 0 ? EMPTY_STRING_NODE : new TextNode(str);
    }

    public int asInt(int i) {
        return NumberInput.parseAsInt(this._value, i);
    }

    public String asText() {
        return this._value;
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_STRING;
    }

    public byte[] binaryValue() {
        return getBinaryValue(Base64Variants.getDefaultVariant());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof TextNode)) {
            return ((TextNode) obj)._value.equals(this._value);
        }
        return false;
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) {
        String trim = this._value.trim();
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder(((trim.length() * 3) << 2) + 4);
        try {
            base64Variant.decode(trim, byteArrayBuilder);
            return byteArrayBuilder.toByteArray();
        } catch (IllegalArgumentException e) {
            throw InvalidFormatException.from(null, String.format("Cannot access contents of TextNode as binary due to broken Base64 encoding: %s", new Object[]{e.getMessage()}), trim, byte[].class);
        }
    }

    public JsonNodeType getNodeType() {
        return JsonNodeType.STRING;
    }

    public int hashCode() {
        return this._value.hashCode();
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        String str = this._value;
        if (str == null) {
            jsonGenerator.writeNull();
        } else {
            jsonGenerator.writeString(str);
        }
    }

    public String textValue() {
        return this._value;
    }

    public String toString() {
        int length = this._value.length();
        StringBuilder sb = new StringBuilder(length + 2 + (length >> 4));
        appendQuoted(sb, this._value);
        return sb.toString();
    }
}
