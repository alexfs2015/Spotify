package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: qcn reason: default package */
public abstract class qcn {
    public static final SpotifyIconV2 e = SpotifyIconV2.PLAY;
    public static final SpotifyIconV2 f = SpotifyIconV2.PAUSE;
    /* access modifiers changed from: private */
    public final ure a;
    /* access modifiers changed from: private */
    public final Player b;
    private View c;
    private gmu d;
    final Context g;
    final int h;
    final int i;
    final SpotifyIconV2 j;
    final SpotifyIconV2 k;
    public final qck l;
    final OnClickListener m = new OnClickListener() {
        public final void onClick(View view) {
            qcn qcn = qcn.this;
            if (!qcn.a(qcn.p)) {
                qcn qcn2 = qcn.this;
                qcn2.a(qcn2.a);
            } else if (qcn.this.q) {
                qcn.this.b.resume();
            } else {
                qcn.this.b.pause();
            }
        }
    };
    private Button n;
    private final ViewGroup o;
    /* access modifiers changed from: private */
    public String p;
    /* access modifiers changed from: private */
    public boolean q;

    public qcn(Context context, sso sso, ViewGroup viewGroup, int i2, int i3, SpotifyIconV2 spotifyIconV2, SpotifyIconV2 spotifyIconV22, Player player, ure ure, boolean z) {
        fbp.a(sso);
        this.g = (Context) fbp.a(context);
        this.h = i2;
        this.i = i3;
        this.a = ure;
        this.b = (Player) fbp.a(player);
        this.o = viewGroup;
        this.j = spotifyIconV2;
        this.k = spotifyIconV22;
        this.l = new qck() {
            public final void a(PlayerState playerState) {
                qcn.this.q = playerState.isPaused();
                qcn.this.p = playerState.entityUri();
                qcn.this.e();
            }

            public final boolean a(PlayerState playerState, PlayerState playerState2) {
                return b(playerState, playerState2) || c(playerState, playerState2);
            }
        };
        if (z) {
            this.d = new gmv().a(context);
            this.d.a(false);
        }
    }

    public final View a(boolean z) {
        if (this.c == null || z) {
            this.c = b();
            if (this.d == null) {
                this.n = (Button) this.c;
            }
            e();
            if (this.p == null) {
                this.c.setVisibility(4);
            }
            a();
        }
        return this.c;
    }

    /* access modifiers changed from: protected */
    public void a() {
        gmu gmu = this.d;
        if (gmu != null) {
            gmu.a(this.m);
            return;
        }
        Button button = this.n;
        if (button != null) {
            button.setOnClickListener(this.m);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(ure ure);

    /* access modifiers changed from: protected */
    public abstract boolean a(String str);

    /* access modifiers changed from: protected */
    public View b() {
        gmu gmu = this.d;
        return gmu != null ? gmu.a() : jso.a(this.g, this.o, this.j, this.h);
    }

    /* access modifiers changed from: protected */
    public void c() {
        gmu gmu = this.d;
        if (gmu != null) {
            gmu.b(false);
            return;
        }
        Button button = this.n;
        if (button != null) {
            jso.a(this.g, button, this.k, this.i);
        }
    }

    /* access modifiers changed from: protected */
    public void d() {
        gmu gmu = this.d;
        if (gmu != null) {
            gmu.a(false);
            return;
        }
        Button button = this.n;
        if (button != null) {
            jso.a(this.g, button, this.j, this.h);
        }
    }

    /* access modifiers changed from: protected */
    public final void e() {
        if (this.c != null) {
            if (!a(this.p) || this.q) {
                d();
            } else {
                c();
            }
            if (this.c.getVisibility() != 0) {
                gaw.a(this.c, 125);
            }
            if (this.c.getParent() != null) {
                this.c.getParent().requestLayout();
            }
        }
    }
}
