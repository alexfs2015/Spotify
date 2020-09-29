package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.spotify.music.json.CustomFeature;

/* renamed from: rwj reason: default package */
public interface rwj {
    ObjectMapper a();

    rwj a(Include include);

    rwj a(Feature feature, boolean z);

    rwj a(DeserializationFeature deserializationFeature, boolean z);

    rwj a(MapperFeature mapperFeature, boolean z);

    rwj a(SerializationFeature serializationFeature, boolean z);

    rwj a(CustomFeature customFeature);
}
