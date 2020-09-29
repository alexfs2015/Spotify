package defpackage;

import com.spotify.music.R;

/* renamed from: slv reason: default package */
public final class slv implements vua<Integer> {
    private final wlc<Boolean> a;

    private slv(wlc<Boolean> wlc) {
        this.a = wlc;
    }

    public static slv a(wlc<Boolean> wlc) {
        return new slv(wlc);
    }

    public final /* synthetic */ Object get() {
        return Integer.valueOf(((Boolean) this.a.get()).booleanValue() ? R.id.fragment_container : R.id.content);
    }
}
