package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.R;
import io.reactivex.Flowable;

/* renamed from: tag reason: default package */
public final class tag implements a<Boolean> {
    private final urr<Boolean> a;
    private tal b;

    public final /* synthetic */ void onChanged(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.b.b((int) R.drawable.player_overlay_gradient);
        } else {
            this.b.c();
        }
    }

    public tag(Flowable<Boolean> flowable, a aVar) {
        this.a = new urr<>(flowable, aVar);
    }

    public final void a(tal tal) {
        this.b = (tal) fay.a(tal);
        this.a.a((a<T>) this);
    }
}
