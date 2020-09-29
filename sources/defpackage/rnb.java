package defpackage;

import android.os.Bundle;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.spotify.music.json.CustomFeature;
import com.spotify.music.json.JsonBundleHelper.a;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: rnb reason: default package */
final class rnb implements rnh {
    private final ConcurrentHashMap<rne, ObjectMapper> a = new ConcurrentHashMap<>();

    rnb() {
    }

    public final ObjectMapper a(rne rne) {
        if (!this.a.containsKey(rne)) {
            ObjectMapper objectMapper = new ObjectMapper();
            for (Entry entry : rne.a.entrySet()) {
                objectMapper.configure((SerializationFeature) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
            }
            for (Entry entry2 : rne.b.entrySet()) {
                objectMapper.configure((DeserializationFeature) entry2.getKey(), ((Boolean) entry2.getValue()).booleanValue());
            }
            for (Entry entry3 : rne.c.entrySet()) {
                objectMapper.configure((MapperFeature) entry3.getKey(), ((Boolean) entry3.getValue()).booleanValue());
            }
            for (Entry entry4 : rne.d.entrySet()) {
                objectMapper.configure((Feature) entry4.getKey(), ((Boolean) entry4.getValue()).booleanValue());
            }
            for (Entry entry5 : rne.e.entrySet()) {
                objectMapper.configure((JsonParser.Feature) entry5.getKey(), ((Boolean) entry5.getValue()).booleanValue());
            }
            for (CustomFeature a2 : rne.f) {
                a2.a(objectMapper);
            }
            objectMapper.setSerializationInclusion(rne.g).addMixIn(Bundle.class, a.class);
            this.a.putIfAbsent(rne, objectMapper);
        }
        return (ObjectMapper) this.a.get(rne);
    }
}
