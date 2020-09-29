package defpackage;

import android.view.ViewGroup;
import android.widget.SeekBar;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: tgp reason: default package */
public final class tgp implements tgo {
    com.spotify.mobile.android.util.ui.Lifecycle.a a;
    boolean b;
    boolean c;
    private final fpt d;
    private final tgn e;
    private final urj f;
    private final urn g;
    private ViewGroup h;
    private SeekBar i;
    private wlc<Integer> j;
    private tgs k;

    /* renamed from: tgp$a */
    class a extends c {
        private a() {
        }

        /* synthetic */ a(tgp tgp, byte b) {
            this();
        }

        public final void c() {
            if (tgp.this.b) {
                tgp tgp = tgp.this;
                tgp.b = false;
                tgp.a();
            }
        }

        public final void a() {
            tgp tgp = tgp.this;
            tgp.b = tgp.c;
            tgp.this.b();
        }

        public final void aP_() {
            tgp.this.a.b(this);
        }
    }

    public tgp(com.spotify.mobile.android.util.ui.Lifecycle.a aVar, fpt fpt, tgn tgn, urj urj, urn urn) {
        this.a = (com.spotify.mobile.android.util.ui.Lifecycle.a) fay.a(aVar);
        this.d = (fpt) fay.a(fpt);
        this.e = (tgn) fay.a(tgn);
        this.f = (urj) fay.a(urj);
        this.g = (urn) fay.a(urn);
    }

    public final void a(ViewGroup viewGroup, SeekBar seekBar, wlc<Integer> wlc, tgs tgs) {
        this.h = (ViewGroup) fay.a(viewGroup);
        this.i = (SeekBar) fay.a(seekBar);
        this.j = wlc;
        this.k = (tgs) fay.a(tgs);
        this.a.a(new a(this, 0));
        this.f.a((defpackage.uru.a<T>) new $$Lambda$tgp$AW7ndf_tsyMMg4aUBLBPHw3RiPI<T>(this));
        this.g.a((defpackage.uru.a<T>) new $$Lambda$tgp$U6Z93SlG9zjSPhEY2tJlDGdiZig<T>(this));
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        ((tgs) fay.a(this.k)).a(z);
    }

    /* access modifiers changed from: private */
    public void a(PlayerTrack playerTrack) {
        boolean a2 = this.e.a(this.d, playerTrack);
        this.b = false;
        if (!a2) {
            b();
        } else {
            a();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        if (!this.c) {
            this.c = true;
            ((tgs) fay.a(this.k)).a((ViewGroup) fay.a(this.h), (SeekBar) fay.a(this.i), this.j);
        }
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        if (this.c) {
            this.c = false;
            ((tgs) fay.a(this.k)).a((ViewGroup) fay.a(this.h));
        }
    }
}
