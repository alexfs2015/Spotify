package defpackage;

import android.net.Uri.Builder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.music.spotlets.voice.suggestion.Suggestion;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.io.IOException;
import java.util.TimeZone;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: ulq reason: default package */
public final class ulq {
    private final RxResolver a;
    private final ObjectMapper b;
    private final ulo c;

    public ulq(RxResolver rxResolver, rnf rnf, ulo ulo) {
        this.a = rxResolver;
        this.b = rnf.b();
        this.c = ulo;
    }

    public final wud<String> a() {
        wud c2 = ScalarSynchronousObservable.d(this.c.a).c((wut<? super T, Boolean>) $$Lambda$ulq$QuntHXrYd4YMa3YC0H01sj_7ig.INSTANCE);
        ulo ulo = this.c;
        RxResolver rxResolver = this.a;
        ObjectMapper objectMapper = this.b;
        new jrf();
        wud f = vun.a((ObservableSource<T>) rxResolver.resolve(new Request(Request.GET, new Builder().encodedPath("hm://listening-screen-suggestions/v1/suggest").appendQueryParameter("timezone", TimeZone.getDefault().getDisplayName()).build().toString())), BackpressureStrategy.BUFFER).f(new $$Lambda$ulq$wkPX2lteR67IR5bTbpwQACiqUao(objectMapper));
        ulo.getClass();
        return wud.a(c2, f.b((wun<? super T>) new $$Lambda$1OgRbONairduRgiaDt2pC8RhVO4<Object>(ulo))).c();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(String str) {
        return Boolean.valueOf(str != null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(ObjectMapper objectMapper, Response response) {
        try {
            return ((Suggestion) objectMapper.readValue(response.getBodyString(), Suggestion.class)).suggestion();
        } catch (IOException e) {
            Logger.e("JSON Parsing error: %s", e.getMessage());
            return null;
        }
    }
}
