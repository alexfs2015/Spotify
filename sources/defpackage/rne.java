package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.spotify.music.json.CustomFeature;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* renamed from: rne reason: default package */
final class rne {
    final Map<SerializationFeature, Boolean> a = new EnumMap(SerializationFeature.class);
    final Map<DeserializationFeature, Boolean> b = new EnumMap(DeserializationFeature.class);
    final Map<MapperFeature, Boolean> c = new EnumMap(MapperFeature.class);
    final Map<Feature, Boolean> d = new EnumMap(Feature.class);
    final Map<JsonParser.Feature, Boolean> e = new EnumMap(JsonParser.Feature.class);
    final Set<CustomFeature> f = EnumSet.noneOf(CustomFeature.class);
    Include g = Include.ALWAYS;

    rne() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rne)) {
            return false;
        }
        rne rne = (rne) obj;
        return faw.a(this.a, rne.a) && faw.a(this.b, rne.b) && faw.a(this.c, rne.c) && faw.a(this.d, rne.d) && faw.a(this.e, rne.e) && faw.a(this.f, rne.f) && faw.a(this.g, rne.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g});
    }
}
