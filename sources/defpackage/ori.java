package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.ui.view.DownloadHeaderView.a;
import com.spotify.music.spotlets.offline.util.OffliningLogger.SourceElement;
import io.reactivex.Completable;

/* renamed from: ori reason: default package */
final class ori implements org, orh {
    private static final int a = ori.class.hashCode();
    /* access modifiers changed from: private */
    public final ora b;
    private final Context c;
    private final orc d;
    private vhx e;
    private DownloadHeaderView f;

    public ori(ora ora, Context context, a aVar) {
        this.b = ora;
        this.c = context;
        this.d = aVar.a();
    }

    public final Completable a() {
        return this.b.f;
    }

    public final void a(Bundle bundle) {
    }

    public final void a(a aVar) {
        this.b.a(aVar);
    }

    public final void a(vhx vhx) {
        this.e = vhx;
        this.f = DownloadHeaderView.a(this.c, (ViewGroup) null);
        this.f.b = new a() {
            public final void a() {
                ora a2 = ori.this.b;
                a2.e.a("spotify:internal:preferences");
                a2.b.a(a2.g.a().getUri());
            }

            public final void a(boolean z) {
                ora a2 = ori.this.b;
                a2.d.a(z);
                String uri = a2.g.a().getUri();
                a2.b.a(uri, z);
                a2.c.a(uri, SourceElement.HEADER_TOGGLE, z);
            }
        };
        this.e.a((RecyclerView.a<H>) new jog<H>(this.f, true), a);
        this.d.a(vhx);
        this.e.a(false, a);
    }

    public final void a(boolean z) {
        if (z) {
            this.e.a(true, a);
            return;
        }
        this.e.a(false, a);
    }

    public final void ay_() {
        this.b.a((orh) this);
    }

    public final void b(Bundle bundle) {
    }

    public final void b(boolean z) {
        this.d.a(z);
    }

    public final void c() {
        this.b.a((orh) null);
    }

    public final void c(boolean z) {
        this.f.a(z);
    }

    public final void d() {
        this.b.a.c();
    }

    public final void updateDownloadViewState(vli vli) {
        this.f.a(vli);
    }
}
