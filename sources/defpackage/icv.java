package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import java.lang.ref.WeakReference;

/* renamed from: icv reason: default package */
public final class icv implements a {
    private final ide a;
    private final jvf b;
    private final String c;
    private final String d;
    private final WeakReference<kf> e;

    public icv(ide ide, jvf jvf, String str, String str2, kf kfVar) {
        this.a = ide;
        this.b = jvf;
        this.c = str;
        this.d = str2;
        this.e = new WeakReference<>(kfVar);
    }

    public final void a(ida ida) {
        this.a.a("optout_marquee", ida.a(), this.c, this.d);
        if (this.e.get() != null) {
            ((kf) this.e.get()).finish();
            ((kf) this.e.get()).overridePendingTransition(0, R.anim.marquee_overlay_exit);
        }
        this.b.a(SpotifyIconV2.BAN, (int) R.string.marquee_optout_marquee_notification_text, 1);
    }
}
