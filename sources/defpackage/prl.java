package defpackage;

import android.os.Bundle;
import com.spotify.music.features.quicksilver.messages.models.QuicksilverCardMessage;

/* renamed from: prl reason: default package */
public final class prl implements vua<QuicksilverCardMessage> {
    private final wlc<Bundle> a;

    private prl(wlc<Bundle> wlc) {
        this.a = wlc;
    }

    public static prl a(wlc<Bundle> wlc) {
        return new prl(wlc);
    }

    public final /* synthetic */ Object get() {
        return (QuicksilverCardMessage) vuf.a((QuicksilverCardMessage) ((Bundle) this.a.get()).getParcelable("EXTRA_MESSAGE"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
