package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;

public class InternetDomainNameDeserializer extends FromStringDeserializer<fdy> {
    private static final long serialVersionUID = 1;
    public static final InternetDomainNameDeserializer std = new InternetDomainNameDeserializer();

    public InternetDomainNameDeserializer() {
        super(fdy.class);
    }

    /* access modifiers changed from: protected */
    public fdy _deserialize(String str, DeserializationContext deserializationContext) {
        return fdy.a(str);
    }
}
