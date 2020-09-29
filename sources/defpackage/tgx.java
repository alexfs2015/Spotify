package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: tgx reason: default package */
public final class tgx implements a, a {
    private final urj a;
    private final urn b;
    private boolean c;
    private thr d;

    public tgx(urj urj, urn urn) {
        this.a = urj;
        this.b = urn;
    }

    public final void a(thr thr) {
        this.d = (thr) fay.a(thr);
        this.a.a((a<T>) new $$Lambda$tgx$ydhKu1MihLwqxwyNBccmJqBovm0<T>(this));
        this.b.a((a<T>) new $$Lambda$tgx$S47db1Mi_dzrOZce4h6C5ScidxY<T>(this));
        this.d.a((a) this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.c = bool.booleanValue();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerTrack playerTrack) {
        if (this.c) {
            this.d.e();
        } else {
            this.d.e(false);
        }
    }

    public final void d() {
        if (!this.c) {
            this.d.e(false);
        } else if (this.d.d()) {
            this.d.e();
        } else {
            this.d.e(true);
        }
    }

    public final void a() {
        if (this.c) {
            this.d.e();
        } else {
            this.d.e(false);
        }
    }
}
