package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.features.homemix.header.playbutton.HomeMixPlayButton;
import com.squareup.picasso.Picasso;
import io.reactivex.Completable;
import java.util.Collections;
import java.util.List;

/* renamed from: nrr reason: default package */
public final class nrr implements nrq {
    private final Context b;
    private final Picasso c;
    private final nrp d;
    private RecyclerView e;
    private GlueHeaderViewV2 f;
    private HomeMixPlayButton g;
    private nro h;
    private fyh i;
    private GlueHeaderLayout j;

    public nrr(Context context, Picasso picasso, nrp nrp) {
        this.b = context;
        this.c = picasso;
        this.d = nrp;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.d.a();
    }

    public final Completable a() {
        return this.d.b;
    }

    public final List<View> a(LayoutInflater layoutInflater, ViewGroup viewGroup, fsz fsz) {
        this.j = (GlueHeaderLayout) layoutInflater.inflate(R.layout.home_mix_playlist_header, viewGroup, false);
        this.e = (RecyclerView) this.j.findViewById(R.id.recycler_view);
        this.f = (GlueHeaderViewV2) this.j.findViewById(R.id.header_view);
        this.e.a((i) new LinearLayoutManager(this.b));
        gau.a(this.b);
        this.i = fsz.b();
        this.i.a(0.0f);
        int a = gau.a(this.b.getResources()) + vgl.c(this.b, R.attr.actionBarSize);
        this.f.a(a);
        this.h = new nro(this.b, this.f);
        this.g = new HomeMixPlayButton(this.b);
        this.g.setOnClickListener(new $$Lambda$nrr$NqmaFrBVE3CgUtJMAXJPJw4aZMc(this));
        this.j.a((View) this.g, true);
        this.f.b(vfj.b(38.0f, this.b.getResources()));
        this.f.a = a + vfj.b(22.0f, this.b.getResources());
        this.f.a((fxe) this.h);
        return Collections.singletonList(this.j);
    }

    public final void a(float f2) {
        this.i.a(f2);
        if (this.f.getBackground() instanceof fxa) {
            ((fxa) this.f.getBackground()).getDrawable(1).setAlpha(Math.max((int) ((1.0f - f2) * 255.0f), 100));
            this.f.invalidate();
        }
    }

    public final void a(Bundle bundle) {
    }

    public final void a(String str) {
        fyh fyh = this.i;
        if (fyh != null) {
            fyh.a(str);
        }
    }

    public final void a(String str, int i2) {
        ImageView imageView = this.h.a;
        wgr a = this.c.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY);
        Drawable drawable = imageView.getDrawable();
        if (drawable == null) {
            drawable = gaa.e(this.b);
        }
        HomeMixPlayButton homeMixPlayButton = this.g;
        if (homeMixPlayButton != null) {
            homeMixPlayButton.a = homeMixPlayButton.a(homeMixPlayButton.getContext(), SpotifyIconV2.PLAY, i2);
            homeMixPlayButton.b = homeMixPlayButton.a(homeMixPlayButton.getContext(), SpotifyIconV2.PAUSE, i2);
            homeMixPlayButton.e();
        }
        if (this.f != null) {
            GradientDrawable gradientDrawable = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{i2, fr.c(this.b, R.color.headerEndGray)});
            gradientDrawable.setCornerRadius(0.0f);
            a.a(drawable).b(drawable).a(imageView);
            ip.a((View) this.f, (Drawable) fwz.a((Drawable) new ColorDrawable(i2), (Drawable) gradientDrawable));
        }
    }

    public final void a(a aVar) {
        this.d.a(aVar);
    }

    public final void ay_() {
        this.d.a((nrq) this);
    }

    public final void b(Bundle bundle) {
    }

    public final void c() {
        this.d.a((nrq) null);
    }

    public final void d() {
        this.d.a.c();
    }

    public final void e() {
        HomeMixPlayButton homeMixPlayButton = this.g;
        if (homeMixPlayButton != null) {
            homeMixPlayButton.c = false;
            homeMixPlayButton.e();
        }
    }

    public final void f() {
        HomeMixPlayButton homeMixPlayButton = this.g;
        if (homeMixPlayButton != null) {
            homeMixPlayButton.c = true;
            homeMixPlayButton.e();
        }
    }

    public final void g() {
        HomeMixPlayButton homeMixPlayButton = this.g;
        if (homeMixPlayButton != null) {
            homeMixPlayButton.setVisibility(8);
        }
    }

    public final void h() {
        HomeMixPlayButton homeMixPlayButton = this.g;
        if (homeMixPlayButton != null) {
            homeMixPlayButton.setVisibility(0);
        }
    }

    public final RecyclerView i() {
        return this.e;
    }

    public final /* bridge */ /* synthetic */ ViewGroup j() {
        return this.j;
    }

    public final GlueHeaderViewV2 k() {
        return this.f;
    }

    public final boolean l() {
        return false;
    }
}
