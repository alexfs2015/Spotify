package defpackage;

import com.google.common.base.Optional;
import com.spotify.player.model.PlayerError;
import com.spotify.player.model.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.internal.operators.observable.ObservablePublish;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: viw reason: default package */
public final class viw implements viy {
    private final viy a;
    private final Map<ho<Integer, Integer>, Flowable<PlayerState>> b = new ConcurrentHashMap();
    private final Observable<PlayerError> c = ObservablePublish.h(this.a.b()).a();

    public viw(viy viy) {
        this.a = viy;
    }

    private Optional<Flowable<PlayerState>> b(int i, int i2) {
        return Optional.c(this.b.get(ho.a(Integer.valueOf(i), Integer.valueOf(i2))));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Flowable c(int i, int i2) {
        Flowable c2 = this.a.a(i, i2).a(1).c();
        this.b.put(ho.a(Integer.valueOf(i), Integer.valueOf(i2)), c2);
        return c2;
    }

    public final Flowable<PlayerState> a() {
        return a(2, 2);
    }

    public final Flowable<PlayerState> a(int i, int i2) {
        return (Flowable) b(i, i2).a((fbu<? extends T>) new $$Lambda$viw$Yj3YcLm1HmRpnDglx85yXl4JxPA<Object>(this, i, i2));
    }

    public final Observable<PlayerError> b() {
        return this.c;
    }
}
