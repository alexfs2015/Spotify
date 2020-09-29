package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$tiw$oHm5lqDjfJdnTlMCC22VjgV2UBg reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$tiw$oHm5lqDjfJdnTlMCC22VjgV2UBg implements Predicate {
    private final /* synthetic */ String f$0;

    public /* synthetic */ $$Lambda$tiw$oHm5lqDjfJdnTlMCC22VjgV2UBg(String str) {
        this.f$0 = str;
    }

    public final boolean test(Object obj) {
        return tiw.a(this.f$0, (PlayerState) obj);
    }
}
