package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: ust reason: default package */
public final class ust implements a {
    private final Player a;
    private final url b;
    private final urs c;
    private final urt d;
    private final usv e;
    private int f;
    private boolean g;
    private usu h;

    public ust(Player player, url url, urs urs, urt urt, usv usv) {
        this.a = player;
        this.b = url;
        this.d = urt;
        this.c = urs;
        this.e = usv;
    }

    public final void a(int i, boolean z) {
        this.g = z;
        if (!this.g) {
            this.e.i();
            this.a.seekTo((long) i);
        }
        this.h.c(i / 1000);
    }

    public final void a() {
        this.h.c(this.f / 1000);
        this.g = false;
    }

    public final void a(usu usu) {
        this.h = (usu) fay.a(usu);
        this.h.a((a) this);
        this.b.a((a<T>) new $$Lambda$ust$sy_qgbEk_1uI4loo09yzGV9zGcs<T>(this));
        this.c.a((a<T>) new $$Lambda$ust$NU5iB9LdccdF9BKq_hbnymfIw<T>(this));
        this.d.a((a<T>) new $$Lambda$ust$OwYDdaBTTZBHjLbuhbyDCvQh3MA<T>(this));
    }

    /* access modifiers changed from: private */
    public void a(PlayerState playerState) {
        boolean isEmpty = playerState.restrictions().disallowSeekingReasons().isEmpty();
        if (this.g && !isEmpty) {
            this.h.a();
        }
        this.h.a(isEmpty);
        this.h.b(!usx.a(playerState.track()));
    }

    /* access modifiers changed from: private */
    public void a(long j) {
        this.h.b((int) j);
    }

    /* access modifiers changed from: private */
    public void a(Long l) {
        if (!this.g) {
            this.f = l.intValue();
            this.h.a(l.intValue());
            this.h.c(l.intValue() / 1000);
        }
    }
}
