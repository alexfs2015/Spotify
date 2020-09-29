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

/* renamed from: lnj reason: default package */
public final class lnj {
    final Context a;
    final rdc b;
    final sih c = ViewUris.aM;
    final ToastieManager d;
    private final a e;
    private final jsz f;
    private final fss g;

    /* renamed from: lnj$a */
    public interface a {
        void a(uyx uyx);

        void a(uyx uyx, Optional<List<String>> optional);

        void a(uyx uyx, List<String> list);
    }

    public lnj(Context context, rdc rdc, jsz jsz, ToastieManager toastieManager, fss fss, a aVar) {
        this.a = context;
        this.b = rdc;
        this.f = jsz;
        this.d = toastieManager;
        this.g = fss;
        this.e = aVar;
    }

    public final void a(uyx uyx) {
        String str;
        String title = uyx.getTitle();
        if (fax.a(title)) {
            str = this.a.getString(R.string.toast_added_to_generic_playlist);
        } else {
            str = this.a.getString(R.string.toast_added_to_playlist, new Object[]{title});
        }
        this.f.a(SpotifyIconV2.ADD_TO_PLAYLIST, str, R.string.toast_added_to_playlist, 0);
    }

    public final void a() {
        this.f.a((int) R.string.error_general_title, 0, new Object[0]);
    }

    public final void b() {
        this.f.a((int) R.string.toast_playlist_size_limit_exceeded, 1, new Object[0]);
    }

    /* access modifiers changed from: 0000 */
    public void a(uyx uyx, List<String> list, Optional<List<String>> optional, int i, int i2, int i3, int i4) {
        fsr b2 = this.g.a(this.a.getString(i), this.a.getString(i2)).a(this.a.getString(i3), new $$Lambda$lnj$RjcA5X2NcyaJDHilMsKxU6F5OU(this, uyx, optional)).b(this.a.getString(i4), new $$Lambda$lnj$_dftgKmxPGI0FvVHUlc0bzhLh1E(this, uyx, list));
        b2.f = new $$Lambda$lnj$zDDdRi5nbVHhhPYtMOvTRd6kmoY(this, uyx);
        b2.g = new $$Lambda$lnj$T268HxSiK4XfJWtsaYOgqFFDqI(this, uyx);
        b2.h = new fsw() {
            public final void a() {
                lnj.this.b.a(PageIdentifiers.PLAYLIST_ADDTOPLAYLIST_DUPLICATEDIALOG.mPageIdentifier, lnj.this.c.toString());
            }

            public final void b() {
                lnj.this.b.Z_();
            }
        };
        b2.a().a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uyx uyx, Optional optional, DialogInterface dialogInterface, int i) {
        this.e.a(uyx, optional);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uyx uyx, List list, DialogInterface dialogInterface, int i) {
        this.e.a(uyx, list);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(uyx uyx, DialogInterface dialogInterface) {
        this.e.a(uyx);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uyx uyx, DialogInterface dialogInterface) {
        this.e.a(uyx);
    }
}
