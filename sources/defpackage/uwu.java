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

/* renamed from: uwu reason: default package */
public final class uwu {
    private final RxResolver a;
    private final ObjectMapper b;
    private final uws c;

    public uwu(RxResolver rxResolver, rwl rwl, uws uws) {
        this.a = rxResolver;
        this.b = rwl.b();
        this.c = uws;
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

    public final xii<String> a() {
        xii c2 = ScalarSynchronousObservable.d(this.c.a).c((xiy<? super T, Boolean>) $$Lambda$uwu$eYpXNlHJiEnEBEnBGoaYXcLRpyk.INSTANCE);
        uws uws = this.c;
        RxResolver rxResolver = this.a;
        ObjectMapper objectMapper = this.b;
        new jtp();
        xii e = wit.a((ObservableSource<T>) rxResolver.resolve(new Request(Request.GET, new Builder().encodedPath("hm://listening-screen-suggestions/v1/suggest").appendQueryParameter("timezone", TimeZone.getDefault().getDisplayName()).build().toString())), BackpressureStrategy.BUFFER).e((xiy<? super T, ? extends R>) new $$Lambda$uwu$ejEXbwcuIWpuQbuNN5LoSIAyhDc<Object,Object>(objectMapper));
        uws.getClass();
        return xii.a(c2, e.b((xis<? super T>) new $$Lambda$PxhBsU4LJOdsBOLyFCjzj5vO9YM<Object>(uws))).c();
    }
}
