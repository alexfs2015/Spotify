package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.google.common.hash.HashCode;
import java.util.Locale;

public class HashCodeDeserializer extends FromStringDeserializer<HashCode> {
    private static final long serialVersionUID = 1;
    public static final HashCodeDeserializer std = new HashCodeDeserializer();

    public HashCodeDeserializer() {
        super(HashCode.class);
    }

    /* access modifiers changed from: protected */
    public HashCode _deserialize(String str, DeserializationContext deserializationContext) {
        return HashCode.a(str.toLowerCase(Locale.ENGLISH));
    }
}
