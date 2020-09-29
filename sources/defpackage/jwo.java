package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import com.spotify.mobile.android.util.loader.SettingsState;
import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.internal.functions.Functions;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Locale;

/* renamed from: jwo reason: default package */
public final class jwo {
    public static final a<Boolean> a = new a<>("offline_mode");
    public static final a<Boolean> b = new a<>("play_explicit_content");
    public static final a<Boolean> c = new a<>("private_session");
    public static final a<Boolean> d = new a<>("download_over_3g");
    public static final a<Integer> e = new a<>("download_quality");
    public static final a<Integer> f = new a<>("stream_quality");
    public static final a<Boolean> g = new a<>("gapless");
    public static final a<Boolean> h = new a<>("automix");
    public static final a<Boolean> i = new a<>("normalize");
    public static final a<Integer> j = new a<>("loudness_environment");
    public static final a<Boolean> k = new a<>("crossfade");
    public static final a<Integer> l = new a<>("crossfade_time_seconds");
    public static final a<Boolean> m = new a<>("show_unavailable_tracks");
    public final Observable<SettingsState> n;
    private final FireAndForgetResolver o;

    /* renamed from: jwo$a */
    public static class a<T> {
        final String a;

        public a(String str) {
            this.a = str;
        }
    }

    static {
        new a("access_point");
        new a("local_devices_only");
        new a("webgate_url");
    }

    public jwo(RxResolver rxResolver, ObjectMapper objectMapper, FireAndForgetResolver fireAndForgetResolver, Scheduler scheduler) {
        this.n = rxResolver.resolve(new Request(Request.SUB, "sp://settings/v1/values")).a((ObservableTransformer<? super T, ? extends R>) JacksonResponseParser.forClass(SettingsState.class, objectMapper, scheduler)).a(Functions.a()).a(1).a();
        this.o = fireAndForgetResolver;
    }

    public final <T> void a(a<T> aVar, T t) {
        this.o.resolve(new Request(Request.PUT, String.format(Locale.US, "sp://settings/v1/values/%s", new Object[]{aVar.a}), Collections.emptyMap(), String.valueOf(t).getBytes(Charset.defaultCharset())));
    }
}
