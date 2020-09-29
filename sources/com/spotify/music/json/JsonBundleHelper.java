package com.spotify.music.json;

import android.os.Bundle;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.moat.analytics.mobile.MoatAdEvent;
import com.spotify.mobile.android.util.Assertion;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public final class JsonBundleHelper {

    static class BundleDeserializer extends JsonDeserializer<Bundle> {
        BundleDeserializer() {
        }

        public /* synthetic */ Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            T t;
            Bundle bundle = new Bundle();
            Iterator fields = ((JsonNode) jsonParser.readValueAsTree()).fields();
            ObjectCodec codec = jsonParser.getCodec();
            while (fields.hasNext()) {
                Entry entry = (Entry) fields.next();
                if (!((JsonNode) entry.getValue()).has(MoatAdEvent.EVENT_TYPE)) {
                    t = (Serializable) codec.treeToValue(((JsonNode) entry.getValue()).get("value"), Object.class);
                } else {
                    t = ((b) codec.treeToValue((TreeNode) entry.getValue(), b.class)).a;
                }
                bundle.putSerializable((String) entry.getKey(), t);
            }
            return bundle;
        }
    }

    static class BundleSerializer extends JsonSerializer<Bundle> {
        BundleSerializer() {
        }

        public /* synthetic */ void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            Bundle bundle = (Bundle) obj;
            HashMap hashMap = new HashMap();
            for (String str : bundle.keySet()) {
                Object obj2 = bundle.get(str);
                if (obj2 == null || (obj2 instanceof Serializable)) {
                    hashMap.put(str, b.a((Serializable) obj2));
                } else {
                    StringBuilder sb = new StringBuilder("value for key '");
                    sb.append(str);
                    sb.append("' is not Serializable");
                    Assertion.a(sb.toString());
                }
            }
            serializerProvider.defaultSerializeValue(hashMap, jsonGenerator);
        }
    }

    @JsonDeserialize(as = Map.class, using = BundleDeserializer.class)
    @JsonSerialize(as = Map.class, using = BundleSerializer.class)
    public interface a {
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static final class b<T extends Serializable> {
        @JsonInclude(Include.ALWAYS)
        @JsonProperty("value")
        @JsonTypeInfo(include = As.EXTERNAL_PROPERTY, property = "type", use = Id.CLASS)
        final T a;

        @JsonCreator
        b(@JsonTypeInfo(include = As.EXTERNAL_PROPERTY, property = "type", use = Id.CLASS) @JsonProperty("value") T t) {
            this.a = t;
        }

        static <T extends Serializable> b<T> a(T t) {
            return new b<>(t);
        }
    }

    static {
        new rnf().a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }
}
