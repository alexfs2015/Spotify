package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;

/* renamed from: ojc reason: default package */
public final class ojc {
    private final hxx a;
    private final RxResolver b;

    public ojc(hxx hxx, RxResolver rxResolver) {
        this.a = hxx;
        this.b = rxResolver;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(String str, SessionState sessionState) {
        Request request = new Request(Request.PUT, String.format("hm://identity/v1/user/%s/display_name", new Object[]{gck.a(sessionState.currentUser(), fbi.c)}));
        request.setBody(str.getBytes(fbi.c));
        return this.b.resolve(request);
    }

    public final Observable<Response> a(String str) {
        return this.a.a.a(0).d((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$ojc$gGTCBFkoQi14BhQm634K4qwQEKQ<Object,Object>(this, str));
    }
}
