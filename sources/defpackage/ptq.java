package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: ptq reason: default package */
public abstract class ptq extends ptr {
    public static final SpotifyIconV2 c = SpotifyIconV2.PLAY;
    public static final SpotifyIconV2 d = SpotifyIconV2.PAUSE;
    public fyt a;
    public final boolean b;
    private final int n;
    private final int o;

    public ptq(Context context, sih sih, ViewGroup viewGroup, int i, int i2, SpotifyIconV2 spotifyIconV2, SpotifyIconV2 spotifyIconV22, SpotifyIconV2 spotifyIconV23, SpotifyIconV2 spotifyIconV24, int i3, int i4, boolean z, Player player) {
        boolean z2 = z;
        super(context, sih, viewGroup, i, i2, z2 ? (SpotifyIconV2) fay.a(spotifyIconV23) : spotifyIconV2, z2 ? (SpotifyIconV2) fay.a(spotifyIconV24) : spotifyIconV22, player);
        this.n = i3;
        this.o = i4;
        this.b = z2;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (!this.b) {
            super.a();
        }
    }

    /* access modifiers changed from: protected */
    public final Button b() {
        if (!this.b) {
            return super.b();
        }
        fay.a(this.a);
        return ToolbarMenuHelper.a(this.a, this.n, this.o, this.j, this.m);
    }

    /* access modifiers changed from: protected */
    public final void c() {
        if (this.b) {
            Button button = (Button) a(false);
            button.setText(this.i);
            button.setCompoundDrawablesWithIntrinsicBounds(new SpotifyIconDrawable(this.g, this.k, (float) uts.b(24.0f, button.getResources())), null, null, null);
            return;
        }
        super.c();
    }

    /* access modifiers changed from: protected */
    public final void d() {
        if (this.b) {
            Button button = (Button) a(false);
            button.setText(this.h);
            button.setCompoundDrawablesWithIntrinsicBounds(new SpotifyIconDrawable(this.g, this.j, (float) uts.b(24.0f, button.getResources())), null, null, null);
            return;
        }
        super.d();
    }
}
