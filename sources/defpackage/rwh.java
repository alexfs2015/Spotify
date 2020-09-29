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

/* renamed from: rwh reason: default package */
final class rwh implements rwn {
    private final ConcurrentHashMap<rwk, ObjectMapper> a = new ConcurrentHashMap<>();

    rwh() {
    }

    public final ObjectMapper a(rwk rwk) {
        if (!this.a.containsKey(rwk)) {
            ObjectMapper objectMapper = new ObjectMapper();
            for (Entry entry : rwk.a.entrySet()) {
                objectMapper.configure((SerializationFeature) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
            }
            for (Entry entry2 : rwk.b.entrySet()) {
                objectMapper.configure((DeserializationFeature) entry2.getKey(), ((Boolean) entry2.getValue()).booleanValue());
            }
            for (Entry entry3 : rwk.c.entrySet()) {
                objectMapper.configure((MapperFeature) entry3.getKey(), ((Boolean) entry3.getValue()).booleanValue());
            }
            for (Entry entry4 : rwk.d.entrySet()) {
                objectMapper.configure((Feature) entry4.getKey(), ((Boolean) entry4.getValue()).booleanValue());
            }
            for (Entry entry5 : rwk.e.entrySet()) {
                objectMapper.configure((JsonParser.Feature) entry5.getKey(), ((Boolean) entry5.getValue()).booleanValue());
            }
            for (CustomFeature a2 : rwk.f) {
                a2.a(objectMapper);
            }
            objectMapper.setSerializationInclusion(rwk.g).addMixIn(Bundle.class, a.class);
            this.a.putIfAbsent(rwk, objectMapper);
        }
        return (ObjectMapper) this.a.get(rwk);
    }
}
