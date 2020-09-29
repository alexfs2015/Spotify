package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.toastie.ToastieManager;
import java.util.List;

/* renamed from: lrj reason: default package */
public final class lrj {
    final Context a;
    final rma b;
    final sso c = ViewUris.aL;
    final ToastieManager d;
    private final a e;
    private final jvf f;
    private final ftm g;

    /* renamed from: lrj$a */
    public interface a {
        void a(vla vla);

        void a(vla vla, Optional<List<String>> optional);

        void a(vla vla, List<String> list);
    }

    public lrj(Context context, rma rma, jvf jvf, ToastieManager toastieManager, ftm ftm, a aVar) {
        this.a = context;
        this.b = rma;
        this.f = jvf;
        this.d = toastieManager;
        this.g = ftm;
        this.e = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vla vla, DialogInterface dialogInterface) {
        this.e.a(vla);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vla vla, Optional optional, DialogInterface dialogInterface, int i) {
        this.e.a(vla, optional);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vla vla, List list, DialogInterface dialogInterface, int i) {
        this.e.a(vla, list);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(vla vla, DialogInterface dialogInterface) {
        this.e.a(vla);
    }

    public final void a() {
        this.f.a((int) R.string.error_general_title, 0, new Object[0]);
    }

    public final void a(vla vla) {
        String str;
        String title = vla.getTitle();
        if (fbo.a(title)) {
            str = this.a.getString(R.string.toast_added_to_generic_playlist);
        } else {
            str = this.a.getString(R.string.toast_added_to_playlist, new Object[]{title});
        }
        this.f.a(SpotifyIconV2.ADD_TO_PLAYLIST, str, R.string.toast_added_to_playlist, 0);
    }

    /* access modifiers changed from: 0000 */
    public void a(vla vla, List<String> list, Optional<List<String>> optional, int i, int i2, int i3, int i4) {
        ftl b2 = this.g.a(this.a.getString(i), this.a.getString(i2)).a(this.a.getString(i3), new $$Lambda$lrj$Y2PaQLU8Z0azNoQ5SnY2TE268(this, vla, optional)).b(this.a.getString(i4), new $$Lambda$lrj$d3vgWreroER1vNvkEY3Lyj63b1w(this, vla, list));
        b2.f = new $$Lambda$lrj$SFraDkrDvZizu4i8sRzcB6rJS_o(this, vla);
        b2.g = new $$Lambda$lrj$db6r7tVKGBmyPH8is8AQD2_TItw(this, vla);
        b2.h = new ftq() {
            public final void a() {
                lrj.this.b.a(PageIdentifiers.PLAYLIST_ADDTOPLAYLIST_DUPLICATEDIALOG.mPageIdentifier, lrj.this.c.toString());
            }

            public final void b() {
                lrj.this.b.Z_();
            }
        };
        b2.a().a();
    }

    public final void b() {
        this.f.a((int) R.string.toast_playlist_size_limit_exceeded, 1, new Object[0]);
    }
}
