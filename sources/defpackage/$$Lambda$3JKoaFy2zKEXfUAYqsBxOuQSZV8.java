package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$3JKoaFy2zKEXfUAYqsBxOuQSZV8 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$3JKoaFy2zKEXfUAYqsBxOuQSZV8 implements Predicate {
    private final /* synthetic */ kqq f$0;

    public /* synthetic */ $$Lambda$3JKoaFy2zKEXfUAYqsBxOuQSZV8(kqq kqq) {
        this.f$0 = kqq;
    }

    public final boolean test(Object obj) {
        return this.f$0.apply((PlayerState) obj).booleanValue();
    }
}
