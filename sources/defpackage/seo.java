package defpackage;

import com.spotify.mobile.android.flags.RolloutFlag;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: seo reason: default package */
public final class seo {
    private final Observable<fqn> a;

    seo(hgy hgy) {
        this.a = hgy.a().j();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(fqn fqn) {
        return Boolean.valueOf(fqn.a(sen.a) == RolloutFlag.ENABLED);
    }

    public final Observable<Boolean> a() {
        return this.a.c((Function<? super T, ? extends R>) $$Lambda$seo$Tap0Gmb5W_gbufQRfz_9uhOS_2w.INSTANCE);
    }
}
