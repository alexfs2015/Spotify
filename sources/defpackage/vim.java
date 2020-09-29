package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.guava.GuavaModule;

/* renamed from: vim reason: default package */
public final class vim {
    public static ObjectMapper a(rwl rwl) {
        return rwl.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).a(Include.NON_NULL).a().registerModule(new GuavaModule());
    }
}
