package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$tsf$rMZCF1vMY3U9mD7bs7nFYuTZna8 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$tsf$rMZCF1vMY3U9mD7bs7nFYuTZna8 implements Predicate {
    public static final /* synthetic */ $$Lambda$tsf$rMZCF1vMY3U9mD7bs7nFYuTZna8 INSTANCE = new $$Lambda$tsf$rMZCF1vMY3U9mD7bs7nFYuTZna8();

    private /* synthetic */ $$Lambda$tsf$rMZCF1vMY3U9mD7bs7nFYuTZna8() {
    }

    public final boolean test(Object obj) {
        return InterruptionUtil.isInterruptionUri(((PlayerTrack) obj).uri());
    }
}
