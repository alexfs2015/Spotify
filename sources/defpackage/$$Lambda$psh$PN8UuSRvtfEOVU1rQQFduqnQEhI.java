package defpackage;

import com.spotify.mobile.android.spotlets.user.ProfileV2VolatileModel;
import com.spotify.music.follow.FollowManager;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$psh$PN8UuSRvtfEOVU1rQQFduqnQEhI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$psh$PN8UuSRvtfEOVU1rQQFduqnQEhI implements Consumer {
    private final /* synthetic */ FollowManager f$0;

    public /* synthetic */ $$Lambda$psh$PN8UuSRvtfEOVU1rQQFduqnQEhI(FollowManager followManager) {
        this.f$0 = followManager;
    }

    public final void accept(Object obj) {
        psh.a(this.f$0, (ProfileV2VolatileModel) obj);
    }
}
