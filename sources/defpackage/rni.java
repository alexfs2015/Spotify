package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.spotify.music.json.CustomFeature;

/* renamed from: rni reason: default package */
final class rni implements rnd {
    private final rne a = new rne();
    private final rnh b;

    rni(rnh rnh) {
        this.b = rnh;
    }

    public final rnd a(SerializationFeature serializationFeature, boolean z) {
        this.a.a.put(serializationFeature, Boolean.valueOf(z));
        return this;
    }

    public final rnd a(DeserializationFeature deserializationFeature, boolean z) {
        this.a.b.put(deserializationFeature, Boolean.valueOf(z));
        return this;
    }

    public final rnd a(MapperFeature mapperFeature, boolean z) {
        this.a.c.put(mapperFeature, Boolean.valueOf(z));
        return this;
    }

    public final rnd a(Feature feature, boolean z) {
        this.a.e.put(feature, Boolean.valueOf(false));
        return this;
    }

    public final rnd a(CustomFeature customFeature) {
        this.a.f.add(customFeature);
        return this;
    }

    public final rnd a(Include include) {
        this.a.g = include;
        return this;
    }

    public final ObjectMapper a() {
        return this.b.a(this.a);
    }
}
