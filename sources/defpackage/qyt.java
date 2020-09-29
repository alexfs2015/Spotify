package defpackage;

import com.spotify.music.R;
import io.reactivex.disposables.CompositeDisposable;

/* renamed from: qyt reason: default package */
public final class qyt {
    final qym a;
    final hqr b;
    final hpt c;
    final qyb d;
    boolean e;
    private final CompositeDisposable f = new CompositeDisposable();

    qyt(hqr hqr, hpt hpt, qym qym, qyb qyb) {
        this.a = qym;
        this.a.c = this;
        this.b = hqr;
        this.c = hpt;
        this.d = qyb;
    }

    public final void a() {
        this.c.f().a(R.string.media_service_voice_search_failed);
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        this.f.bd_();
        this.a.a();
    }
}
