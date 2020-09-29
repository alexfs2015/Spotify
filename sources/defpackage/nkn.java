package defpackage;

import android.content.Context;
import com.spotify.music.features.home.common.viewbinder.DefaultHomeHeaderView;

/* renamed from: nkn reason: default package */
public final class nkn implements wig<DefaultHomeHeaderView> {
    private final wzi<Context> a;

    private nkn(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static nkn a(wzi<Context> wzi) {
        return new nkn(wzi);
    }

    public final /* synthetic */ Object get() {
        return new DefaultHomeHeaderView((Context) this.a.get());
    }
}
