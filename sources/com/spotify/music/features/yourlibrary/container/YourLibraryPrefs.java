package com.spotify.music.features.yourlibrary.container;

import android.content.Context;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;

public final class YourLibraryPrefs {
    /* access modifiers changed from: private */
    public static final b<Object, String> d = b.b("your_library_prefs");
    public final qri a;
    public final jrp b;
    public PrefsModel c;
    /* access modifiers changed from: private */
    public final rnc e;

    public static class PageIdDeserializer extends JsonDeserializer<Optional<YourLibraryPageId>> {
        public /* synthetic */ Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            String str = (String) jsonParser.readValueAs(String.class);
            if (str == null || str.equals("absent_page_id")) {
                return Optional.e();
            }
            return Optional.c(YourLibraryPageId.a(str));
        }
    }

    public static class PageIdSerializer extends JsonSerializer<Optional<YourLibraryPageId>> {
        public /* synthetic */ void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            String str;
            Optional optional = (Optional) obj;
            if (optional.b()) {
                str = ((YourLibraryPageId) optional.c()).mId;
            } else {
                str = "absent_page_id";
            }
            jsonGenerator.writeString(str);
        }
    }

    @JsonSerialize(as = PrefsModel.class)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class PrefsModel implements JacksonModel {

        public static abstract class a {
            public abstract a a(long j);

            public abstract a a(Optional<YourLibraryPageId> optional);

            public abstract PrefsModel a();
        }

        @JsonProperty("focused_page_id")
        @JsonSerialize(using = PageIdSerializer.class)
        public abstract Optional<YourLibraryPageId> focusedPageId();

        @JsonProperty("timestamp")
        public abstract long timestamp();

        public abstract a toBuilder();

        public static a builder() {
            return new a();
        }

        @JsonCreator
        public static PrefsModel create(@JsonProperty("timestamp") Long l, @JsonProperty("focused_page_id") @JsonDeserialize(using = PageIdDeserializer.class) Optional<YourLibraryPageId> optional) {
            return builder().a(((Long) fav.a(l, Long.valueOf(0))).longValue()).a((Optional) fav.a(optional, Optional.e())).a();
        }
    }

    public YourLibraryPrefs(qri qri, Context context, jrp jrp, rnf rnf, jvy jvy, qrq qrq, a aVar) {
        this.a = qri;
        this.b = jrp;
        this.e = new rnc(rnf) {
            public final rnd a(rnd rnd) {
                return rnd.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            }
        };
        final jvy jvy2 = jvy;
        final Context context2 = context;
        final qrq qrq2 = qrq;
        final jrp jrp2 = jrp;
        final a aVar2 = aVar;
        AnonymousClass2 r0 = new c() {
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0039  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void c(android.os.Bundle r4) {
                /*
                    r3 = this;
                    jvy r4 = r2
                    android.content.Context r0 = r3
                    qrq r1 = r4
                    java.lang.String r1 = r1.al()
                    com.spotify.mobile.android.util.prefs.SpSharedPreferences r4 = r4.a(r0, r1)
                    com.spotify.mobile.android.util.prefs.SpSharedPreferences$b r0 = com.spotify.music.features.yourlibrary.container.YourLibraryPrefs.d
                    r1 = 0
                    java.lang.String r4 = r4.a(r0, r1)
                    boolean r0 = defpackage.fax.a(r4)
                    if (r0 != 0) goto L_0x0036
                    com.spotify.music.features.yourlibrary.container.YourLibraryPrefs r0 = com.spotify.music.features.yourlibrary.container.YourLibraryPrefs.this     // Catch:{ IOException -> 0x0030 }
                    rnc r0 = r0.e     // Catch:{ IOException -> 0x0030 }
                    com.fasterxml.jackson.databind.ObjectMapper r0 = r0.a()     // Catch:{ IOException -> 0x0030 }
                    java.lang.Class<com.spotify.music.features.yourlibrary.container.YourLibraryPrefs$PrefsModel> r2 = com.spotify.music.features.yourlibrary.container.YourLibraryPrefs.PrefsModel.class
                    java.lang.Object r4 = r0.readValue(r4, r2)     // Catch:{ IOException -> 0x0030 }
                    com.spotify.music.features.yourlibrary.container.YourLibraryPrefs$PrefsModel r4 = (com.spotify.music.features.yourlibrary.container.YourLibraryPrefs.PrefsModel) r4     // Catch:{ IOException -> 0x0030 }
                    goto L_0x0037
                L_0x0030:
                    r4 = move-exception
                    java.lang.String r0 = "Failed reading your library prefs."
                    com.spotify.mobile.android.util.Assertion.a(r0, r4)
                L_0x0036:
                    r4 = r1
                L_0x0037:
                    if (r4 != 0) goto L_0x005e
                    com.spotify.music.features.yourlibrary.container.YourLibraryPrefs$PrefsModel$a r4 = com.spotify.music.features.yourlibrary.container.YourLibraryPrefs.PrefsModel.builder()
                    com.spotify.music.features.yourlibrary.container.YourLibraryPrefs r0 = com.spotify.music.features.yourlibrary.container.YourLibraryPrefs.this
                    jrp r0 = r0.b
                    long r0 = r0.a()
                    com.spotify.music.features.yourlibrary.container.YourLibraryPrefs$PrefsModel$a r4 = r4.a(r0)
                    com.spotify.music.features.yourlibrary.container.YourLibraryPrefs r0 = com.spotify.music.features.yourlibrary.container.YourLibraryPrefs.this
                    r0.a
                    com.spotify.music.yourlibrary.interfaces.YourLibraryPageId r0 = com.spotify.music.yourlibrary.interfaces.YourLibraryPageId.MUSIC_PLAYLISTS
                    com.google.common.base.Optional r0 = com.google.common.base.Optional.b(r0)
                    com.spotify.music.features.yourlibrary.container.YourLibraryPrefs$PrefsModel$a r4 = r4.a(r0)
                    com.spotify.music.features.yourlibrary.container.YourLibraryPrefs$PrefsModel r4 = r4.a()
                L_0x005e:
                    com.spotify.music.features.yourlibrary.container.YourLibraryPrefs r0 = com.spotify.music.features.yourlibrary.container.YourLibraryPrefs.this
                    r0.c = r4
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.yourlibrary.container.YourLibraryPrefs.AnonymousClass2.c(android.os.Bundle):void");
            }

            public final void aP_() {
                PrefsModel d2 = YourLibraryPrefs.this.c;
                if (d2 != null) {
                    String str = null;
                    try {
                        str = YourLibraryPrefs.this.e.a().writeValueAsString(d2.toBuilder().a(jrp2.a()).a());
                    } catch (JsonProcessingException e2) {
                        Assertion.a("Failed writing your library prefs.", (Throwable) e2);
                    }
                    if (str != null) {
                        jvy2.a(context2, qrq2.al()).a().a(YourLibraryPrefs.d, str).b();
                    }
                }
                aVar2.b(this);
            }
        };
        aVar.a(r0);
    }
}
