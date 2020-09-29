package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: vdy reason: default package */
public final class vdy implements a {
    private final Player a;
    private final vcq b;
    private final vcx c;
    private final vcy d;
    private final vea e;
    private int f;
    private boolean g;
    private vdz h;

    public vdy(Player player, vcq vcq, vcx vcx, vcy vcy, vea vea) {
        this.a = player;
        this.b = vcq;
        this.d = vcy;
        this.c = vcx;
        this.e = vea;
    }

    /* access modifiers changed from: private */
    public void a(long j) {
        this.h.b((int) j);
    }

    /* access modifiers changed from: private */
    public void a(PlayerState playerState) {
        boolean isEmpty = playerState.restrictions().disallowSeekingReasons().isEmpty();
        if (this.g && !isEmpty) {
            this.h.a();
        }
        this.h.a(isEmpty);
        this.h.b(!vec.a(playerState.track()));
    }

    /* access modifiers changed from: private */
    public void a(Long l) {
        if (!this.g) {
            this.f = l.intValue();
            this.h.a(l.intValue());
            this.h.c(l.intValue() / 1000);
        }
    }

    public final void a() {
        this.h.c(this.f / 1000);
        this.g = false;
    }

    public final void a(int i, boolean z) {
        this.g = z;
        if (!this.g) {
            this.e.i();
            this.a.seekTo((long) i);
        }
        this.h.c(i / 1000);
    }

    public final void a(vdz vdz) {
        this.h = (vdz) fbp.a(vdz);
        this.h.a((a) this);
        this.b.a((a<T>) new $$Lambda$vdy$lXWPMS0JBVsQ5YTczvy3cmjbkeM<T>(this));
        this.c.a((a<T>) new $$Lambda$vdy$Jh_fbzJ9Jvxe_zxUn5FkNiE4dVA<T>(this));
        this.d.a((a<T>) new $$Lambda$vdy$8VLmBFA8Sn7tfwo7fR_kHVfio6s<T>(this));
    }
}
