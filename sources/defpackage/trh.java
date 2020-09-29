package defpackage;

import android.view.ViewGroup;
import android.widget.SeekBar;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: trh reason: default package */
public final class trh implements trg {
    com.spotify.mobile.android.util.ui.Lifecycle.a a;
    boolean b;
    boolean c;
    private final fqn d;
    private final trf e;
    private final vco f;
    private final vcs g;
    private ViewGroup h;
    private SeekBar i;
    private wzi<Integer> j;
    private trk k;

    /* renamed from: trh$a */
    class a extends c {
        private a() {
        }

        /* synthetic */ a(trh trh, byte b) {
            this();
        }

        public final void a() {
            trh trh = trh.this;
            trh.b = trh.c;
            trh.this.b();
        }

        public final void aN_() {
            trh.this.a.b(this);
        }

        public final void c() {
            if (trh.this.b) {
                trh trh = trh.this;
                trh.b = false;
                trh.a();
            }
        }
    }

    public trh(com.spotify.mobile.android.util.ui.Lifecycle.a aVar, fqn fqn, trf trf, vco vco, vcs vcs) {
        this.a = (com.spotify.mobile.android.util.ui.Lifecycle.a) fbp.a(aVar);
        this.d = (fqn) fbp.a(fqn);
        this.e = (trf) fbp.a(trf);
        this.f = (vco) fbp.a(vco);
        this.g = (vcs) fbp.a(vcs);
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

    /* access modifiers changed from: private */
    public void a(boolean z) {
        ((trk) fbp.a(this.k)).a(z);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        if (!this.c) {
            this.c = true;
            ((trk) fbp.a(this.k)).a((ViewGroup) fbp.a(this.h), (SeekBar) fbp.a(this.i), this.j);
        }
    }

    public final void a(ViewGroup viewGroup, SeekBar seekBar, wzi<Integer> wzi, trk trk) {
        this.h = (ViewGroup) fbp.a(viewGroup);
        this.i = (SeekBar) fbp.a(seekBar);
        this.j = wzi;
        this.k = (trk) fbp.a(trk);
        this.a.a(new a(this, 0));
        this.f.a((defpackage.vcz.a<T>) new $$Lambda$trh$6FPsZMb_f_hM7aHEDviPJhrRNVQ<T>(this));
        this.g.a((defpackage.vcz.a<T>) new $$Lambda$trh$Uo0Ma6wRtV0y_hOdQy1f28qTg<T>(this));
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        if (this.c) {
            this.c = false;
            ((trk) fbp.a(this.k)).a((ViewGroup) fbp.a(this.h));
        }
    }
}
