package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.Collections;

/* renamed from: imi reason: default package */
public final class imi {
    public final SerialDisposable a = new SerialDisposable();
    private final sih b = sih.a("spotify:bixbyhomestreamingcard");
    private final uxc c;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a() {
    }

    public imi(uxc uxc) {
        this.c = uxc;
    }

    public final void a(String str) {
        PlayOptions build = new Builder().build();
        PlayOrigin playOrigin = new PlayOrigin(udt.m.a(), "", this.b.toString(), null, udt.m.a(), null);
        this.a.a(this.c.a(str, a.t().a(), build, playOrigin, Collections.emptyMap()).a((Action) $$Lambda$imi$gEUaJEzCtki2WHWhjVMbWFo3HD0.INSTANCE, (Consumer<? super Throwable>) $$Lambda$imi$p7w4bJ2V4FKyDtdtzuvJKIaYxs0.INSTANCE));
    }
}
