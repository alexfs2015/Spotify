package defpackage;

import android.content.Context;
import com.spotify.music.features.home.common.viewbinder.DefaultHomeHeaderView;

/* renamed from: ney reason: default package */
public final class ney implements vua<DefaultHomeHeaderView> {
    private final wlc<Context> a;

    private ney(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static ney a(wlc<Context> wlc) {
        return new ney(wlc);
    }

    public final /* synthetic */ Object get() {
        return new DefaultHomeHeaderView((Context) this.a.get());
    }
}
