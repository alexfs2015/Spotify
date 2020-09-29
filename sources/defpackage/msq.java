package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.music.features.editplaylist.upload.Keymaster;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.io.IOException;

/* renamed from: msq reason: default package */
public final class msq {
    private final RxResolver a;
    private final rwl b;

    public msq(RxResolver rxResolver, rwl rwl) {
        this.a = rxResolver;
        this.b = rwl;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Response response) {
        int status = response.getStatus();
        if (!(200 <= status && status <= 299)) {
            return Observable.a((Throwable) new RuntimeException(response.getBodyString()));
        }
        try {
            return Observable.b(this.b.b().readValue(response.getBody(), Keymaster.class));
        } catch (IOException e) {
            return Observable.a((Throwable) e);
        }
    }

    public final Single<Keymaster> a() {
        return this.a.resolve(RequestBuilder.get("hm://keymaster/token/authenticated?client_id=6893edb8c3d943428d0c45920a05d60b&scope=ugc-image-upload&alt=json").build()).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$msq$TmlQeogilT74iTLOr7jIFninU<Object,Object>(this), false).a(0);
    }
}
