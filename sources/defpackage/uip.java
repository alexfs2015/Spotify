package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.playlist.models.Show.MediaType;

/* renamed from: uip reason: default package */
public final class uip implements uhe {
    private final uin a;
    private final Context b;
    private final jor<ufx> c;
    private final uez d;
    private final ufg e;
    private final ufm f;
    private final uey g;
    private final uex h;
    private final sso i;
    private final ufk j;

    public uip(uin uin, Context context, jor<ufx> jor, uez uez, ufg ufg, ufm ufm, uey uey, uex uex, sso sso, ufk ufk) {
        this.a = uin;
        this.b = context;
        this.c = jor;
        this.d = uez;
        this.e = ufg;
        this.f = ufm;
        this.g = uey;
        this.h = uex;
        this.i = sso;
        this.j = ufk;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vkv vkv, String str, int i2, View view) {
        this.g.onDownloadClick(vkv, str, i2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vkv vkv, vkv[] vkvArr, String str, int i2, View view) {
        e(vkv, vkvArr, str, i2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(vkv vkv, vkv[] vkvArr, String str, int i2, View view) {
        this.f.onEpisodeShareClick(vkv, vkvArr, str, i2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(vkv vkv, vkv[] vkvArr, String str, int i2, View view) {
        e(vkv, vkvArr, str, i2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(vkv vkv, vkv[] vkvArr, String str, int i2, View view) {
        this.e.a(vkv, vkvArr, str, i2);
    }

    private void e(vkv vkv, vkv[] vkvArr, String str, int i2) {
        if (vkv.w() == MediaType.AUDIO) {
            this.d.a(vkv, vkvArr, str, i2);
        } else {
            jok.a(this.b, this.c, ufx.a(vkv, str, i2), this.i);
        }
    }

    public final void a() {
        jzb.a(this.b, this.a.d(), true);
    }

    public final void a(Integer num, int i2) {
        ufk.a(this.a, num, i2);
    }

    public final void a(String str) {
        ((TextView) fbp.a(this.a.i())).setText(str);
    }

    public final void a(vkv vkv, String str, int i2) {
    }

    public final void a(vkv vkv, vkv[] vkvArr, String str, int i2) {
        View m = this.a.m();
        $$Lambda$uip$mZQHMPdrd9z28Ob1qb3Gz3NINyU r1 = new $$Lambda$uip$mZQHMPdrd9z28Ob1qb3Gz3NINyU(this, vkv, vkvArr, str, i2);
        m.setOnClickListener(r1);
    }

    public final void a(vli vli, boolean z) {
        ufk ufk = this.j;
        uin uin = this.a;
        uin.k().setEnabled(z);
        boolean z2 = vli instanceof b;
        boolean z3 = vli instanceof h;
        boolean z4 = vli instanceof a;
        if (z2 || z3 || z4) {
            ImageView imageView = (ImageView) fbp.a(uin.k());
            if (z2) {
                uin.d(true);
            } else if (z3) {
                uin.d(true);
            } else {
                uin.d(false);
            }
            imageView.setContentDescription(ufk.a.getString(R.string.content_description_downloaded));
            Context context = ufk.a;
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.DOWNLOADED, context.getResources().getDimension(R.dimen.quickactions_episode_entity_row_primary_action_height));
            spotifyIconDrawable.a(fr.b(context, (int) R.color.cat_accessory_green));
            imageView.setImageDrawable(spotifyIconDrawable);
            return;
        }
        uin.d(false);
        ImageView imageView2 = (ImageView) fbp.a(uin.k());
        imageView2.setContentDescription(ufk.a.getString(R.string.content_description_download));
        Context context2 = ufk.a;
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context2, SpotifyIconV2.DOWNLOAD, context2.getResources().getDimension(R.dimen.quickactions_episode_entity_row_primary_action_height));
        spotifyIconDrawable2.a(fr.b(context2, (int) R.color.glue_button_text));
        imageView2.setImageDrawable(spotifyIconDrawable2);
    }

    public final void a(boolean z) {
        this.a.a(z);
    }

    public final void b() {
        jzb.a(this.b, this.a.d(), false);
    }

    public final void b(String str) {
        this.a.a(str);
    }

    public final void b(vkv vkv, String str, int i2) {
    }

    public final void b(vkv vkv, vkv[] vkvArr, String str, int i2) {
        ImageView j2 = this.a.j();
        j2.setVisibility(0);
        $$Lambda$uip$GgQCTcxMpeWGeuayTFWuOFoa0A4 r2 = new $$Lambda$uip$GgQCTcxMpeWGeuayTFWuOFoa0A4(this, vkv, vkvArr, str, i2);
        j2.setOnClickListener(r2);
    }

    public final void b(boolean z) {
        ufk ufk = this.j;
        ImageView j2 = this.a.j();
        j2.setScaleType(ScaleType.FIT_CENTER);
        if (z) {
            j2.setContentDescription(ufk.a.getString(R.string.content_description_pause_button));
            Context context = ufk.a;
            ColorStateList b2 = fr.b(context, (int) R.color.btn_play_pause_dark);
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.PAUSE, (float) vfj.b(10.0f, context.getResources()));
            spotifyIconDrawable.a(b2);
            j2.setImageDrawable(uir.a(context, spotifyIconDrawable));
            return;
        }
        j2.setContentDescription(ufk.a.getString(R.string.content_description_play_button));
        Context context2 = ufk.a;
        ColorStateList b3 = fr.b(context2, (int) R.color.btn_play_pause_dark);
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context2, SpotifyIconV2.PLAY, (float) vfj.b(10.0f, context2.getResources()));
        spotifyIconDrawable2.a(b3);
        j2.setImageDrawable(uir.a(context2, spotifyIconDrawable2));
    }

    public final void c() {
        this.a.d().setVisibility(4);
    }

    public final void c(String str) {
        this.j.b(this.a, str);
    }

    public final void c(vkv vkv, String str, int i2) {
        this.a.a(jqq.a(this.b, this.c, ufx.a(vkv, str, i2), this.i));
    }

    public final void c(vkv vkv, vkv[] vkvArr, String str, int i2) {
        Optional o = this.a.o();
        if (o.b()) {
            ImageView imageView = (ImageView) o.c();
            Context context = this.b;
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.SHARE_ANDROID, context.getResources().getDimension(R.dimen.quickactions_episode_entity_row_primary_action_height));
            spotifyIconDrawable.a(fr.b(context, (int) R.color.glue_button_text));
            imageView.setImageDrawable(spotifyIconDrawable);
            imageView.setVisibility(0);
            $$Lambda$uip$toV6f2EQkQ6kOGeDi5iIyy1ktg r2 = new $$Lambda$uip$toV6f2EQkQ6kOGeDi5iIyy1ktg(this, vkv, vkvArr, str, i2);
            imageView.setOnClickListener(r2);
        }
    }

    public final void c(boolean z) {
        this.a.c(!z);
    }

    public final void d() {
        Optional n = this.a.n();
        if (n.b()) {
            ((ImageView) n.c()).setVisibility(8);
        }
    }

    public final void d(String str) {
        ufk.a(this.a, str);
    }

    public final void d(vkv vkv, String str, int i2) {
        this.a.k().setOnClickListener(new $$Lambda$uip$lyoDjFs8RiQPIWK_oC_bxM6yA(this, vkv, str, i2));
    }

    public final void d(vkv vkv, vkv[] vkvArr, String str, int i2) {
        TextView l = this.a.l();
        $$Lambda$uip$NsBwf4T6ekDINeIdgmvLpf_wMQ0 r1 = new $$Lambda$uip$NsBwf4T6ekDINeIdgmvLpf_wMQ0(this, vkv, vkvArr, str, i2);
        l.setOnClickListener(r1);
    }

    public final void d(boolean z) {
        this.a.c(z);
    }

    public final void e(String str) {
        if (this.a.d().getVisibility() != 0) {
            this.a.d().setVisibility(0);
        }
        this.a.b(str);
    }
}
