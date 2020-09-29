package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.Collections;

/* renamed from: kzy reason: default package */
public final class kzy {
    public final Player a;
    public final SerialDisposable b = new SerialDisposable();
    private final vje c;
    private final uqm d;

    public kzy(vje vje, uqm uqm, Player player) {
        this.c = vje;
        this.d = uqm;
        this.a = player;
    }

    public final void a(String str) {
        if (str != null) {
            PlayOptions build = new Builder().build();
            PlayOrigin playOrigin = new PlayOrigin(this.d.a(), "", ViewUris.R.toString(), null, this.d.a(), null);
            this.b.a(this.c.a(str, a.t().a(), build, playOrigin, Collections.emptyMap()).a((Action) $$Lambda$kzy$xssmEQT0b5uKp5glnBbPoQfZxGs.INSTANCE, (Consumer<? super Throwable>) $$Lambda$kzy$yb8p1Jy0y4HCY0OX2Njg7ZfkUjA.INSTANCE));
        }
    }
}
