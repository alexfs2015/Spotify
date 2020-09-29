package defpackage;

import com.spotify.mobile.android.flags.RolloutFlag;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: jhs reason: default package */
public final class jhs {
    private final hgy a;

    jhs(hgy hgy) {
        this.a = hgy;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ RolloutFlag a(fqn fqn) {
        return (RolloutFlag) fqn.a(jgm.a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(RolloutFlag rolloutFlag) {
        return Boolean.valueOf(RolloutFlag.ENABLED == rolloutFlag);
    }

    public final Observable<jhi> a() {
        return this.a.a().j().c((Function<? super T, ? extends R>) $$Lambda$jhs$m3INbzNx2gT0RrdH2P4Dc7phM1c.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$jhs$NzC7Fhs379c1u4uQNhmSii5fM1c.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$7SAjGH4rCqWPEWolfJmq6Mbhec.INSTANCE);
    }
}
