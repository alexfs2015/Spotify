package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.spotify.music.json.CustomFeature;

/* renamed from: rnd reason: default package */
public interface rnd {
    ObjectMapper a();

    rnd a(Include include);

    rnd a(Feature feature, boolean z);

    rnd a(DeserializationFeature deserializationFeature, boolean z);

    rnd a(MapperFeature mapperFeature, boolean z);

    rnd a(SerializationFeature serializationFeature, boolean z);

    rnd a(CustomFeature customFeature);
}
