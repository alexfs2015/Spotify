package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;

public class InternetDomainNameDeserializer extends FromStringDeserializer<feq> {
    private static final long serialVersionUID = 1;
    public static final InternetDomainNameDeserializer std = new InternetDomainNameDeserializer();

    public InternetDomainNameDeserializer() {
        super(feq.class);
    }

    /* access modifiers changed from: protected */
    public feq _deserialize(String str, DeserializationContext deserializationContext) {
        return feq.a(str);
    }
}
