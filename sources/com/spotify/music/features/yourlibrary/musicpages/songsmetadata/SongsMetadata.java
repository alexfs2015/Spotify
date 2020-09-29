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

@JsonSerialize(as = SongsMetadata.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class SongsMetadata implements JacksonModel {
    public static final SongsMetadata DEFAULT = builder().a((uzf) new f()).a(0).a(false).a();

    public static class OfflineStateDeserializer extends JsonDeserializer<uzf> {
        public /* synthetic */ Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return a(jsonParser);
        }

        private static uzf a(JsonParser jsonParser) {
            Boolean bool;
            try {
                bool = (Boolean) jsonParser.readValueAs(Boolean.class);
            } catch (JsonMappingException unused) {
                bool = Boolean.FALSE;
            }
            return bool.booleanValue() ? new defpackage.uzf.a() : new f();
        }
    }

    public static class OfflineStateSerializer extends JsonSerializer<uzf> {
        public /* synthetic */ void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            uzf uzf = (uzf) obj;
            if ((uzf instanceof defpackage.uzf.a) || (uzf instanceof b) || (uzf instanceof h)) {
                jsonGenerator.writeBoolean(true);
            } else {
                jsonGenerator.writeBoolean(false);
            }
        }
    }

    public static abstract class a {
        public abstract a a(int i);

        public abstract a a(uzf uzf);

        public abstract a a(boolean z);

        public abstract SongsMetadata a();
    }

    @JsonProperty("is_loading")
    public abstract boolean isLoading();

    @JsonProperty("length")
    public abstract int length();

    @JsonProperty("offline_state")
    @JsonSerialize(using = OfflineStateSerializer.class)
    public abstract uzf offlineState();

    public abstract a toBuilder();

    public static a builder() {
        return new a();
    }

    @JsonCreator
    public static SongsMetadata create(@JsonProperty("offline_state") @JsonDeserialize(using = OfflineStateDeserializer.class) uzf uzf, @JsonProperty("length") Integer num, @JsonProperty("is_loading") Boolean bool) {
        return builder().a((uzf) fav.a(uzf, DEFAULT.offlineState())).a(((Integer) fav.a(num, Integer.valueOf(DEFAULT.length()))).intValue()).a(((Boolean) fav.a(bool, Boolean.valueOf(DEFAULT.isLoading()))).booleanValue()).a();
    }
}
