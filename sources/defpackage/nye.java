package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.m;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.music.R;
import com.spotify.music.features.nowplayingbar.view.carousel.CarouselView;
import com.spotify.paste.spotifyicon.SpotifyIconView;

/* renamed from: nye reason: default package */
public final class nye implements kjd<nyw, nxd> {
    public final View a;
    /* access modifiers changed from: private */
    public final FrameLayout b = ((FrameLayout) this.a.findViewById(R.id.accessory_container));
    private final SpotifyIconView c = ((SpotifyIconView) this.a.findViewById(R.id.accessory_button));
    /* access modifiers changed from: private */
    public final VideoSurfaceView d = ((VideoSurfaceView) this.a.findViewById(R.id.video_surface));
    /* access modifiers changed from: private */
    public final jzd e;
    /* access modifiers changed from: private */
    public final ImageButton f = ((ImageButton) this.a.findViewById(R.id.play_pause_button));
    private final ImageButton g = ((ImageButton) this.a.findViewById(R.id.skip_next_button));
    /* access modifiers changed from: private */
    public final CarouselView h = ((CarouselView) this.a.findViewById(R.id.tracks_carousel_view));
    /* access modifiers changed from: private */
    public final nyk i;
    /* access modifiers changed from: private */
    public final nyg j;
    /* access modifiers changed from: private */
    public final jsm<ProgressBar> k = new jsm<>((ProgressBar) this.a.findViewById(R.id.progress_bar), Optional.e());
    /* access modifiers changed from: private */
    public final kkn<Boolean> l;
    private final Resources m;

    public nye(LayoutInflater layoutInflater, ViewGroup viewGroup, kkn<Boolean> kkn, Resources resources, jzd jzd, nyg nyg) {
        this.m = resources;
        this.e = jzd;
        this.j = nyg;
        this.l = kkn;
        this.a = layoutInflater.inflate(R.layout.now_playing_bar, viewGroup, false);
        this.i = new nyk(resources);
        this.h.a((a) this.i);
    }

    public final kje<nyw> connect(kkn<nxd> kkn) {
        this.a.setOnClickListener(new $$Lambda$nye$nHJ3Oy9CWCfHVDfR6_YcXsR5Y94(kkn));
        this.i.d = new $$Lambda$nye$UJZS4nj2V1cds33PlnzTQN8_V8g(kkn);
        this.b.setOnClickListener(new $$Lambda$nye$y3IB79D8tQxHR7wKT4CG9y_Qqo(kkn));
        this.f.setOnClickListener(new $$Lambda$nye$opehGXgrgZhGn4QX5odRaJ8TY(kkn));
        this.g.setOnClickListener(new $$Lambda$nye$fHi0joFcvWckyqf76TMPBt2cU(kkn));
        CarouselView carouselView = this.h;
        $$Lambda$nye$rNhf5QxGi8foHurBM95kBu4j5lQ r1 = new $$Lambda$nye$rNhf5QxGi8foHurBM95kBu4j5lQ(kkn);
        $$Lambda$nye$a2syVIos8X96ASO0NIXzI6Xdik r2 = new $$Lambda$nye$a2syVIos8X96ASO0NIXzI6Xdik(kkn);
        carouselView.N = r1;
        carouselView.O = r2;
        carouselView.a((m) this.j);
        return new kje<nyw>() {
            public final /* synthetic */ void accept(Object obj) {
                ((nyw) obj).a(new $$Lambda$nye$1$7zbGGaD7niWBIRl715ZVw85k(this), new $$Lambda$nye$1$KiAmUxGf9Ln9CgZtscYlVkfdOvE(this));
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(a aVar) {
                nye.this.l.accept(Boolean.FALSE);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(b bVar) {
                nye.a(nye.this, bVar);
                nye.this.l.accept(Boolean.TRUE);
            }

            public final void dispose() {
                nye.this.a.setOnClickListener(null);
                nye.this.i.d = null;
                nye.this.b.setOnClickListener(null);
                nye.this.f.setOnClickListener(null);
                nye.this.k.a();
                nye.this.h.b((m) nye.this.j);
                nye.this.e.b(nye.this.d);
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Context context, a aVar) {
        this.e.b(this.d);
        this.c.setVisibility(0);
        this.d.setVisibility(8);
        this.c.setImageDrawable((Drawable) aVar.a.apply(context));
        this.c.setContentDescription(this.m.getString(aVar.b));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Context context, b bVar) {
        this.e.b(this.d);
        this.c.setVisibility(0);
        this.d.setVisibility(8);
        this.c.setImageDrawable((Drawable) bVar.a.apply(context));
        this.c.setContentDescription(this.m.getString(bVar.c));
        this.c.setActivated(bVar.b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        this.c.setVisibility(8);
        this.d.setVisibility(0);
        this.e.a(this.d);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ nyv a(nyu nyu, nza nza) {
        return new nyo(nza, nyu);
    }

    static /* synthetic */ void a(nye nye, b bVar) {
        nyn nyn = bVar.b;
        Context context = nye.b.getContext();
        nyn.a(new $$Lambda$nye$uoq6DpUTmuL8WV_V82Js2U5aY(nye, context), new $$Lambda$nye$KVUZp6pIe4tYQDo00KLU2Mx8C6Y(nye, context), new $$Lambda$nye$MAkgRPswywjAAnzeac6UyfIQqwk(nye));
        nyx nyx = bVar.c;
        ImageButton imageButton = nye.f;
        imageButton.setImageDrawable((Drawable) nyx.a().apply(imageButton.getContext()));
        nye.f.setContentDescription(nye.m.getString(nyx.b()));
        nyz nyz = bVar.d;
        ImageButton imageButton2 = nye.g;
        imageButton2.setImageDrawable(ury.f(imageButton2.getContext()));
        nye.g.setEnabled(nyz.a());
        ImageButton imageButton3 = nye.g;
        imageButton3.setVisibility(((Boolean) nyz.b().apply(imageButton3.getContext())).booleanValue() ? 0 : 8);
        nzb nzb = bVar.a;
        nyu nyu = bVar.e;
        nyk nyk = nye.i;
        ImmutableList<nyv> immutableList = (ImmutableList) fay.a(ImmutableList.a(fbx.a((Iterable<E>) nzb.a()).a((Function<? super E, T>) new $$Lambda$nye$8qtYbK4pBHdEuGMkDCdOx_lf5bs<Object,T>(nyu)).a()));
        b a2 = nv.a(new nyi(nyk.a, nyk.e, immutableList));
        nyk.e = immutableList;
        a2.a((a) nyk);
        nye.h.d(nzb.b());
        nye.h.M.c = nzb.c();
        nye.h.M.d = nzb.d();
        nyy nyy = bVar.f;
        nye.k.a(nyy.a(), nyy.b(), nyy.c());
    }
}
