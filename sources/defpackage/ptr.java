package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: ptr reason: default package */
public abstract class ptr {
    public static final SpotifyIconV2 e = SpotifyIconV2.PLAY;
    public static final SpotifyIconV2 f = SpotifyIconV2.PAUSE;
    /* access modifiers changed from: private */
    public final ufq a;
    /* access modifiers changed from: private */
    public final Player b;
    private Button c;
    private final ViewGroup d;
    final Context g;
    final int h;
    final int i;
    final SpotifyIconV2 j;
    final SpotifyIconV2 k;
    public final pto l;
    final OnClickListener m = new OnClickListener() {
        public final void onClick(View view) {
            ptr ptr = ptr.this;
            if (!ptr.a(ptr.n)) {
                ptr ptr2 = ptr.this;
                ptr2.a(ptr2.a);
            } else if (ptr.this.o) {
                ptr.this.b.resume();
            } else {
                ptr.this.b.pause();
            }
        }
    };
    /* access modifiers changed from: private */
    public String n;
    /* access modifiers changed from: private */
    public boolean o;

    /* access modifiers changed from: protected */
    public abstract void a(ufq ufq);

    /* access modifiers changed from: protected */
    public abstract boolean a(String str);

    public ptr(Context context, sih sih, ViewGroup viewGroup, int i2, int i3, SpotifyIconV2 spotifyIconV2, SpotifyIconV2 spotifyIconV22, Player player) {
        fay.a(sih);
        this.g = (Context) fay.a(context);
        this.h = i2;
        this.i = i3;
        this.a = (ufq) ggw.a(ufq.class);
        this.b = (Player) fay.a(player);
        this.d = viewGroup;
        this.j = spotifyIconV2;
        this.k = spotifyIconV22;
        this.l = new pto() {
            public final boolean a(PlayerState playerState, PlayerState playerState2) {
                return b(playerState, playerState2) || c(playerState, playerState2);
            }

            public final void a(PlayerState playerState) {
                ptr.this.o = playerState.isPaused();
                ptr.this.n = playerState.entityUri();
                ptr.this.e();
            }
        };
    }

    /* access modifiers changed from: protected */
    public void a() {
        this.c.setOnClickListener(this.m);
    }

    /* access modifiers changed from: protected */
    public Button b() {
        return jqd.a(this.g, this.d, this.j, this.h);
    }

    /* access modifiers changed from: protected */
    public final void e() {
        if (this.c != null) {
            if (!a(this.n) || this.o) {
                d();
            } else {
                c();
            }
            if (this.c.getVisibility() != 0) {
                gac.a((View) this.c, 125);
            }
            if (this.c.getParent() != null) {
                this.c.getParent().requestLayout();
            }
        }
    }

    public final View a(boolean z) {
        if (this.c == null || z) {
            this.c = b();
            e();
            if (this.n == null) {
                this.c.setVisibility(4);
            }
            a();
        }
        return this.c;
    }

    /* access modifiers changed from: protected */
    public void c() {
        jqd.a(this.g, this.c, this.k, this.i);
    }

    /* access modifiers changed from: protected */
    public void d() {
        jqd.a(this.g, this.c, this.j, this.h);
    }
}
