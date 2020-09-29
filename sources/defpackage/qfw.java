package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;

/* renamed from: qfw reason: default package */
public final class qfw {
    private final hvl a;
    private final RxResolver b;

    public qfw(hvl hvl, RxResolver rxResolver) {
        this.a = hvl;
        this.b = rxResolver;
    }

    public final Observable<Response> a(String str) {
        return this.a.a.a(0).d((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$qfw$RBpgShB_6WXoMGfs6NGWNU8Zy0<Object,Object>(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(String str, SessionState sessionState) {
        Request request = new Request(Request.PUT, String.format("hm://identity/v1/user/%s/display_name", new Object[]{gbm.a(sessionState.currentUser(), far.c)}));
        request.setBody(str.getBytes(far.c));
        return this.b.resolve(request);
    }
}
