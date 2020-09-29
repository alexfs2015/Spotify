package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: qcm reason: default package */
public abstract class qcm extends qcn {
    public static final SpotifyIconV2 c = SpotifyIconV2.PLAY;
    public static final SpotifyIconV2 d = SpotifyIconV2.PAUSE;
    public fzn a;
    public final boolean b;
    private final int n;
    private final int o;

    public qcm(Context context, sso sso, ViewGroup viewGroup, int i, int i2, SpotifyIconV2 spotifyIconV2, SpotifyIconV2 spotifyIconV22, SpotifyIconV2 spotifyIconV23, SpotifyIconV2 spotifyIconV24, int i3, int i4, boolean z, Player player, ure ure, boolean z2) {
        boolean z3 = z;
        super(context, sso, viewGroup, i, i2, z3 ? (SpotifyIconV2) fbp.a(spotifyIconV23) : spotifyIconV2, z3 ? (SpotifyIconV2) fbp.a(spotifyIconV24) : spotifyIconV22, player, ure, z2 && !z3);
        this.n = i3;
        this.o = i4;
        this.b = z3;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (!this.b) {
            super.a();
        }
    }

    /* access modifiers changed from: protected */
    public final View b() {
        if (!this.b) {
            return super.b();
        }
        fbp.a(this.a);
        return ToolbarMenuHelper.a(this.a, this.n, this.o, this.j, this.m);
    }

    /* access modifiers changed from: protected */
    public final void c() {
        if (this.b) {
            Button button = (Button) a(false);
            button.setText(this.i);
            button.setCompoundDrawablesWithIntrinsicBounds(new SpotifyIconDrawable(this.g, this.k, (float) vfj.b(24.0f, button.getResources())), null, null, null);
            return;
        }
        super.c();
    }

    /* access modifiers changed from: protected */
    public final void d() {
        if (this.b) {
            Button button = (Button) a(false);
            button.setText(this.h);
            button.setCompoundDrawablesWithIntrinsicBounds(new SpotifyIconDrawable(this.g, this.j, (float) vfj.b(24.0f, button.getResources())), null, null, null);
            return;
        }
        super.d();
    }
}
