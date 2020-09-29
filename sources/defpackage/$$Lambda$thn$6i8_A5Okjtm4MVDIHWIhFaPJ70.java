package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$thn$6-i8_A5Okjtm4MVDIHWIhFaPJ70 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$thn$6i8_A5Okjtm4MVDIHWIhFaPJ70 implements Predicate {
    public static final /* synthetic */ $$Lambda$thn$6i8_A5Okjtm4MVDIHWIhFaPJ70 INSTANCE = new $$Lambda$thn$6i8_A5Okjtm4MVDIHWIhFaPJ70();

    private /* synthetic */ $$Lambda$thn$6i8_A5Okjtm4MVDIHWIhFaPJ70() {
    }

    public final boolean test(Object obj) {
        return InterruptionUtil.isInterruptionUri(((PlayerTrack) obj).uri());
    }
}
