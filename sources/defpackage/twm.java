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

/* renamed from: twm reason: default package */
public final class twm implements tvb {
    private final twk a;
    private final Context b;
    private final jmf<ttu> c;
    private final tsw d;
    private final ttd e;
    private final ttj f;
    private final tsv g;
    private final tsu h;
    private final sih i;
    private final tth j;

    public final void a(uys uys, String str, int i2) {
    }

    public final void b(uys uys, String str, int i2) {
    }

    public twm(twk twk, Context context, jmf<ttu> jmf, tsw tsw, ttd ttd, ttj ttj, tsv tsv, tsu tsu, sih sih, tth tth) {
        this.a = twk;
        this.b = context;
        this.c = jmf;
        this.d = tsw;
        this.e = ttd;
        this.f = ttj;
        this.g = tsv;
        this.h = tsu;
        this.i = sih;
        this.j = tth;
    }

    public final void d(String str) {
        tth.a(this.a, str);
    }

    public final void a(Integer num, int i2) {
        tth.a(this.a, num, i2);
    }

    public final void e(String str) {
        if (this.a.d().getVisibility() != 0) {
            this.a.d().setVisibility(0);
        }
        this.a.b(str);
    }

    public final void c() {
        this.a.d().setVisibility(4);
    }

    public final void a(boolean z) {
        this.a.a(z);
    }

    public final void b(boolean z) {
        tth tth = this.j;
        ImageView j2 = this.a.j();
        j2.setScaleType(ScaleType.FIT_CENTER);
        if (z) {
            j2.setContentDescription(tth.a.getString(R.string.content_description_pause_button));
            Context context = tth.a;
            ColorStateList b2 = fr.b(context, (int) R.color.btn_play_pause_dark);
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.PAUSE, (float) uts.b(10.0f, context.getResources()));
            spotifyIconDrawable.a(b2);
            j2.setImageDrawable(two.a(context, spotifyIconDrawable));
            return;
        }
        j2.setContentDescription(tth.a.getString(R.string.content_description_play_button));
        Context context2 = tth.a;
        ColorStateList b3 = fr.b(context2, (int) R.color.btn_play_pause_dark);
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context2, SpotifyIconV2.PLAY, (float) uts.b(10.0f, context2.getResources()));
        spotifyIconDrawable2.a(b3);
        j2.setImageDrawable(two.a(context2, spotifyIconDrawable2));
    }

    public final void c(boolean z) {
        this.a.c(!z);
    }

    public final void a(String str) {
        ((TextView) fay.a(this.a.i())).setText(str);
    }

    public final void b(String str) {
        this.a.a(str);
    }

    public final void d(boolean z) {
        this.a.c(z);
    }

    public final void c(String str) {
        this.j.b(this.a, str);
    }

    private void e(uys uys, uys[] uysArr, String str, int i2) {
        if (uys.w() == MediaType.AUDIO) {
            this.d.a(uys, uysArr, str, i2);
        } else {
            jly.a(this.b, this.c, ttu.a(uys, str, i2), this.i);
        }
    }

    public final void a() {
        jxb.a(this.b, this.a.d(), true);
    }

    public final void b() {
        jxb.a(this.b, this.a.d(), false);
    }

    public final void a(uzf uzf, boolean z) {
        tth tth = this.j;
        twk twk = this.a;
        twk.k().setEnabled(z);
        boolean z2 = uzf instanceof b;
        boolean z3 = uzf instanceof h;
        boolean z4 = uzf instanceof a;
        if (z2 || z3 || z4) {
            ImageView imageView = (ImageView) fay.a(twk.k());
            if (z2) {
                twk.d(true);
            } else if (z3) {
                twk.d(true);
            } else {
                twk.d(false);
            }
            imageView.setContentDescription(tth.a.getString(R.string.content_description_downloaded));
            Context context = tth.a;
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.DOWNLOADED, context.getResources().getDimension(R.dimen.quickactions_episode_entity_row_primary_action_height));
            spotifyIconDrawable.a(fr.b(context, (int) R.color.cat_accessory_green));
            imageView.setImageDrawable(spotifyIconDrawable);
            return;
        }
        twk.d(false);
        ImageView imageView2 = (ImageView) fay.a(twk.k());
        imageView2.setContentDescription(tth.a.getString(R.string.content_description_download));
        Context context2 = tth.a;
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context2, SpotifyIconV2.DOWNLOAD, context2.getResources().getDimension(R.dimen.quickactions_episode_entity_row_primary_action_height));
        spotifyIconDrawable2.a(fr.b(context2, (int) R.color.glue_button_text));
        imageView2.setImageDrawable(spotifyIconDrawable2);
    }

    public final void c(uys uys, String str, int i2) {
        this.a.a(joe.a(this.b, this.c, ttu.a(uys, str, i2), this.i));
    }

    public final void b(uys uys, uys[] uysArr, String str, int i2) {
        ImageView j2 = this.a.j();
        j2.setVisibility(0);
        $$Lambda$twm$4fyyhCkUzYIQHkcpPSesvCLriOo r2 = new $$Lambda$twm$4fyyhCkUzYIQHkcpPSesvCLriOo(this, uys, uysArr, str, i2);
        j2.setOnClickListener(r2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(uys uys, uys[] uysArr, String str, int i2, View view) {
        this.e.a(uys, uysArr, str, i2);
    }

    public final void d(uys uys, String str, int i2) {
        this.a.k().setOnClickListener(new $$Lambda$twm$hr3NVeX0wLESkKUa60vMz8MqMEk(this, uys, str, i2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uys uys, String str, int i2, View view) {
        this.g.onDownloadClick(uys, str, i2);
    }

    public final void d(uys uys, uys[] uysArr, String str, int i2) {
        TextView l = this.a.l();
        $$Lambda$twm$ZM73Vu1QcfN9t7cy7oVR54kQbc4 r1 = new $$Lambda$twm$ZM73Vu1QcfN9t7cy7oVR54kQbc4(this, uys, uysArr, str, i2);
        l.setOnClickListener(r1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(uys uys, uys[] uysArr, String str, int i2, View view) {
        e(uys, uysArr, str, i2);
    }

    public final void c(uys uys, uys[] uysArr, String str, int i2) {
        Optional o = this.a.o();
        if (o.b()) {
            ImageView imageView = (ImageView) o.c();
            Context context = this.b;
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.SHARE_ANDROID, context.getResources().getDimension(R.dimen.quickactions_episode_entity_row_primary_action_height));
            spotifyIconDrawable.a(fr.b(context, (int) R.color.glue_button_text));
            imageView.setImageDrawable(spotifyIconDrawable);
            imageView.setVisibility(0);
            $$Lambda$twm$4jrj65cqiiQGSEGv9Mo505APyE r2 = new $$Lambda$twm$4jrj65cqiiQGSEGv9Mo505APyE(this, uys, uysArr, str, i2);
            imageView.setOnClickListener(r2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(uys uys, uys[] uysArr, String str, int i2, View view) {
        this.f.onEpisodeShareClick(uys, uysArr, str, i2);
    }

    public final void a(uys uys, uys[] uysArr, String str, int i2) {
        View m = this.a.m();
        $$Lambda$twm$tmBao34g22i3QPAJIhvrfLRxrKk r1 = new $$Lambda$twm$tmBao34g22i3QPAJIhvrfLRxrKk(this, uys, uysArr, str, i2);
        m.setOnClickListener(r1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uys uys, uys[] uysArr, String str, int i2, View view) {
        e(uys, uysArr, str, i2);
    }

    public final void d() {
        Optional n = this.a.n();
        if (n.b()) {
            ((ImageView) n.c()).setVisibility(8);
        }
    }
}
