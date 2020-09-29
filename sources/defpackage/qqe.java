package defpackage;

import com.spotify.music.R;
import io.reactivex.disposables.CompositeDisposable;

/* renamed from: qqe reason: default package */
public final class qqe {
    final qpx a;
    final hop b;
    final hne c;
    final qpl d;
    boolean e;
    private final CompositeDisposable f = new CompositeDisposable();

    qqe(hop hop, hne hne, qpx qpx, qpl qpl) {
        this.a = qpx;
        this.a.c = this;
        this.b = hop;
        this.c = hne;
        this.d = qpl;
    }

    public final void a() {
        this.c.f().a(R.string.media_service_voice_search_failed);
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        this.f.bf_();
        this.a.a();
    }
}
