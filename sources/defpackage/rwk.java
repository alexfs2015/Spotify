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

/* renamed from: rwk reason: default package */
final class rwk {
    final Map<SerializationFeature, Boolean> a = new EnumMap(SerializationFeature.class);
    final Map<DeserializationFeature, Boolean> b = new EnumMap(DeserializationFeature.class);
    final Map<MapperFeature, Boolean> c = new EnumMap(MapperFeature.class);
    final Map<Feature, Boolean> d = new EnumMap(Feature.class);
    final Map<JsonParser.Feature, Boolean> e = new EnumMap(JsonParser.Feature.class);
    final Set<CustomFeature> f = EnumSet.noneOf(CustomFeature.class);
    Include g = Include.ALWAYS;

    rwk() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwk)) {
            return false;
        }
        rwk rwk = (rwk) obj;
        return fbn.a(this.a, rwk.a) && fbn.a(this.b, rwk.b) && fbn.a(this.c, rwk.c) && fbn.a(this.d, rwk.d) && fbn.a(this.e, rwk.e) && fbn.a(this.f, rwk.f) && fbn.a(this.g, rwk.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g});
    }
}
