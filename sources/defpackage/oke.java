package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.ui.view.DownloadHeaderView.a;
import com.spotify.music.spotlets.offline.util.OffliningLogger.SourceElement;
import io.reactivex.Completable;

/* renamed from: oke reason: default package */
final class oke implements okc, okd {
    private static final int a = oke.class.hashCode();
    /* access modifiers changed from: private */
    public final ojw b;
    private final Context c;
    private final ojy d;
    private uwh e;
    private DownloadHeaderView f;

    public final void a(Bundle bundle) {
    }

    public final void b(Bundle bundle) {
    }

    public oke(ojw ojw, Context context, a aVar) {
        this.b = ojw;
        this.c = context;
        this.d = aVar.a();
    }

    public final Completable a() {
        return this.b.f;
    }

    public final void a(a aVar) {
        this.b.a(aVar);
    }

    public final void az_() {
        this.b.a((okd) this);
    }

    public final void c() {
        this.b.a((okd) null);
    }

    public final void d() {
        this.b.a.c();
    }

    public final void a(uwh uwh) {
        this.e = uwh;
        this.f = DownloadHeaderView.a(this.c, (ViewGroup) null);
        this.f.b = new a() {
            public final void a() {
                ojw a2 = oke.this.b;
                a2.e.a("spotify:internal:preferences");
                a2.b.a(a2.g.a().getUri());
            }

            public final void a(boolean z) {
                ojw a2 = oke.this.b;
                a2.d.a(z);
                String uri = a2.g.a().getUri();
                a2.b.a(uri, z);
                a2.c.a(uri, SourceElement.HEADER_TOGGLE, z);
            }
        };
        this.e.a((RecyclerView.a<H>) new jlu<H>(this.f, true), a);
        this.d.a(uwh);
        this.e.a(false, a);
    }

    public final void a(boolean z) {
        if (z) {
            this.e.a(true, a);
            return;
        }
        this.e.a(false, a);
    }

    public final void b(boolean z) {
        this.d.a(z);
    }

    public final void c(boolean z) {
        this.f.a(z);
    }

    public final void updateDownloadViewState(uzf uzf) {
        this.f.a(uzf);
    }
}
