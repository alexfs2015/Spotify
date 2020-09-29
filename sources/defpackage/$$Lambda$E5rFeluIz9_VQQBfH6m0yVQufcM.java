package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$E5rFeluIz9_VQQBfH6m0yVQufcM reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$E5rFeluIz9_VQQBfH6m0yVQufcM implements Predicate {
    private final /* synthetic */ ktz f$0;

    public /* synthetic */ $$Lambda$E5rFeluIz9_VQQBfH6m0yVQufcM(ktz ktz) {
        this.f$0 = ktz;
    }

    public final boolean test(Object obj) {
        return this.f$0.apply((PlayerState) obj).booleanValue();
    }
}
