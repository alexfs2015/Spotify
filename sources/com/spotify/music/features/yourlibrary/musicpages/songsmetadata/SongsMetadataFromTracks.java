package com.spotify.music.features.yourlibrary.musicpages.songsmetadata;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonSerialize(as = SongsMetadataFromTracks.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class SongsMetadataFromTracks implements JacksonModel {
    public static final SongsMetadataFromTracks DEFAULT = builder().a((vli) new f()).a(0).a(false).a();

    public static class OfflineStateDeserializer extends JsonDeserializer<vli> {
        private static vli a(JsonParser jsonParser) {
            Boolean bool;
            try {
                bool = (Boolean) jsonParser.readValueAs(Boolean.class);
            } catch (JsonMappingException unused) {
                bool = Boolean.FALSE;
            }
            return bool.booleanValue() ? new defpackage.vli.a() : new f();
        }

        public /* synthetic */ Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return a(jsonParser);
        }
    }

    public static class OfflineStateSerializer extends JsonSerializer<vli> {
        public /* synthetic */ void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            vli vli = (vli) obj;
            if ((vli instanceof defpackage.vli.a) || (vli instanceof b) || (vli instanceof h)) {
                jsonGenerator.writeBoolean(true);
            } else {
                jsonGenerator.writeBoolean(false);
            }
        }
    }

    public static abstract class a {
        public abstract a a(int i);

        public abstract a a(vli vli);

        public abstract a a(boolean z);

        public abstract SongsMetadataFromTracks a();
    }

    public static a builder() {
        return new a();
    }

    @JsonCreator
    public static SongsMetadataFromTracks create(@JsonProperty("offline_state") @JsonDeserialize(using = OfflineStateDeserializer.class) vli vli, @JsonProperty("length") Integer num, @JsonProperty("is_loading") Boolean bool) {
        return builder().a((vli) fbm.a(vli, DEFAULT.offlineState())).a(((Integer) fbm.a(num, Integer.valueOf(DEFAULT.length()))).intValue()).a(((Boolean) fbm.a(bool, Boolean.valueOf(DEFAULT.isLoading()))).booleanValue()).a();
    }

    @JsonProperty("is_loading")
    public abstract boolean isLoading();

    @JsonProperty("length")
    public abstract int length();

    @JsonProperty("offline_state")
    @JsonSerialize(using = OfflineStateSerializer.class)
    public abstract vli offlineState();

    public abstract a toBuilder();
}
