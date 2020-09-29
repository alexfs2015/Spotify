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

/* renamed from: kwp reason: default package */
public final class kwp {
    public final Player a;
    public final SerialDisposable b = new SerialDisposable();
    private final uxc c;
    private final udr d;

    public kwp(uxc uxc, udr udr, Player player) {
        this.c = uxc;
        this.d = udr;
        this.a = player;
    }

    public final void a(String str) {
        if (str != null) {
            PlayOptions build = new Builder().build();
            PlayOrigin playOrigin = new PlayOrigin(this.d.a(), "", ViewUris.S.toString(), null, this.d.a(), null);
            this.b.a(this.c.a(str, a.t().a(), build, playOrigin, Collections.emptyMap()).a((Action) $$Lambda$kwp$xN_S9pv4CKAbVIwnKPyBVJFyAYE.INSTANCE, (Consumer<? super Throwable>) $$Lambda$kwp$uOPlzr3KBvRWXnhhJ6xa9RA0vmc.INSTANCE));
        }
    }
}
