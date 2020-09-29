package defpackage;

import android.content.Context;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import com.spotify.mobile.android.service.media.browser.RootListType;
import java.util.List;
import java.util.Set;

/* renamed from: lov reason: default package */
final class lov extends rtf {
    private final lpa b;
    private final xag c = new xag();

    public final boolean a() {
        return true;
    }

    public lov(String str, String str2, Context context, hne hne, hop hop, rtj rtj, run run, Set<Long> set, lpa lpa) {
        super(str, str2, context, hne, hop, rtj, run, set, RootListType.AUTOMOTIVE);
        this.b = lpa;
    }

    public final void a(String str, wun<List<MediaItem>> wun) {
        this.c.a(this.b.a(str).a(wun, (wun<Throwable>) new $$Lambda$lov$RBEOT9ceNExlG_d_AcGCBtHZKoY<Throwable>(wun)));
    }

    public final void b() {
        super.b();
        this.c.a();
    }
}
