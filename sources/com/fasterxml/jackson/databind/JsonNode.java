package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.JsonSerializable.Base;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Map.Entry;

public abstract class JsonNode extends Base implements TreeNode, Iterable<JsonNode> {
    protected JsonNode() {
    }

    public int asInt() {
        return asInt(0);
    }

    public int asInt(int i) {
        return i;
    }

    public abstract String asText();

    public BigInteger bigIntegerValue() {
        return BigInteger.ZERO;
    }

    public byte[] binaryValue() {
        return null;
    }

    public BigDecimal decimalValue() {
        return BigDecimal.ZERO;
    }

    public double doubleValue() {
        return 0.0d;
    }

    public Iterator<JsonNode> elements() {
        return ClassUtil.emptyIterator();
    }

    public abstract boolean equals(Object obj);

    public Iterator<Entry<String, JsonNode>> fields() {
        return ClassUtil.emptyIterator();
    }

    public abstract JsonNode findValue(String str);

    public abstract JsonNode get(int i);

    public JsonNode get(String str) {
        return null;
    }

    public abstract JsonNodeType getNodeType();

    public boolean has(String str) {
        return get(str) != null;
    }

    public int intValue() {
        return 0;
    }

    public boolean isArray() {
        return false;
    }

    public final boolean isBinary() {
        return getNodeType() == JsonNodeType.BINARY;
    }

    public final boolean isNumber() {
        return getNodeType() == JsonNodeType.NUMBER;
    }

    public boolean isObject() {
        return false;
    }

    public final boolean isPojo() {
        return getNodeType() == JsonNodeType.POJO;
    }

    public final Iterator<JsonNode> iterator() {
        return elements();
    }

    public long longValue() {
        return 0;
    }

    public Number numberValue() {
        return null;
    }

    public abstract JsonNode path(String str);

    public int size() {
        return 0;
    }

    public String textValue() {
        return null;
    }

    public abstract String toString();
}
