package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.Collections;

/* renamed from: iov reason: default package */
public final class iov {
    public final SerialDisposable a = new SerialDisposable();
    private final sso b = sso.a("spotify:bixbyhomestreamingcard");
    private final vje c;

    public iov(vje vje) {
        this.c = vje;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a() {
    }

    public final void a(String str) {
        PlayOptions build = new Builder().build();
        PlayOrigin playOrigin = new PlayOrigin(uqo.m.a(), "", this.b.toString(), null, uqo.m.a(), null);
        this.a.a(this.c.a(str, a.t().a(), build, playOrigin, Collections.emptyMap()).a((Action) $$Lambda$iov$BL__CRuvKXwyeMCfduNsEaQ2PA.INSTANCE, (Consumer<? super Throwable>) $$Lambda$iov$JnLDiyrX__GRDhD5svVrQbhREQ.INSTANCE));
    }
}
