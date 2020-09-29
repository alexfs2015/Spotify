package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.R;
import io.reactivex.Flowable;

/* renamed from: tkn reason: default package */
public final class tkn implements a<Boolean> {
    private final vcw<Boolean> a;
    private tks b;

    public tkn(Flowable<Boolean> flowable, a aVar) {
        this.a = new vcw<>(flowable, aVar);
    }

    public final void a(tks tks) {
        this.b = (tks) fbp.a(tks);
        this.a.a((a<T>) this);
    }

    public final /* synthetic */ void onChanged(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.b.b((int) R.drawable.player_overlay_gradient);
        } else {
            this.b.c();
        }
    }
}
