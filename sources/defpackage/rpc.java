package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.functions.Predicate;

/* renamed from: rpc reason: default package */
public final class rpc implements FlowableTransformer<PlayerState, PlayerState> {
    private static final b<Object, Long> a = b.b("freetier.precuration.dialog1");
    private final SpSharedPreferences<Object> b;
    private final jtz c;

    public rpc(SpSharedPreferences<Object> spSharedPreferences, jtz jtz) {
        this.b = spSharedPreferences;
        this.c = jtz;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(PlayerState playerState) {
        if (this.c.a() < this.b.a(a, 1800000) + 1800000) {
            return false;
        }
        this.b.a().a(a, this.c.a()).a();
        return true;
    }

    public final /* synthetic */ xfk apply(Flowable flowable) {
        return flowable.a((Predicate<? super T>) new $$Lambda$rpc$maG_06nagyxaDHhfyap1TI0CW7o<Object>(this));
    }
}
