package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import java.lang.ref.WeakReference;

/* renamed from: iaj reason: default package */
public final class iaj implements a {
    private final ias a;
    private final jsz b;
    private final String c;
    private final String d;
    private final WeakReference<ka> e;

    public iaj(ias ias, jsz jsz, String str, String str2, ka kaVar) {
        this.a = ias;
        this.b = jsz;
        this.c = str;
        this.d = str2;
        this.e = new WeakReference<>(kaVar);
    }

    public final void a(iao iao) {
        this.a.a("optout_marquee", iao.a(), this.c, this.d);
        if (this.e.get() != null) {
            ((ka) this.e.get()).finish();
            ((ka) this.e.get()).overridePendingTransition(0, R.anim.marquee_overlay_exit);
        }
        this.b.a(SpotifyIconV2.BAN, (int) R.string.marquee_optout_marquee_notification_text, 1);
    }
}
