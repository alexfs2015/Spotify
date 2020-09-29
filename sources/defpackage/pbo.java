package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.b;
import com.google.common.base.Optional;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.VideoSurfaceView.ScaleType;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.exception.BetamaxException;
import com.spotify.music.R;
import com.spotify.music.features.playlistentity.story.header.PlaylistStoryHeaderAnimatedTooltip;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import java.util.Collections;
import java.util.List;

/* renamed from: pbo reason: default package */
final class pbo implements pbm, pbn {
    private final pbj b;
    private final Picasso c;
    /* access modifiers changed from: private */
    public final Context d;
    private final pbc e;
    private final jzn f;
    private final a g;
    private fyh h;
    private CoordinatorLayout i;
    /* access modifiers changed from: private */
    public AppBarLayout j;
    private ViewGroup k;
    private Optional<Boolean> l = Optional.e();
    /* access modifiers changed from: private */
    public pbb m;
    private RecyclerView n;
    private gmu o;
    private jzm p;
    private Drawable q;

    public pbo(Picasso picasso, Context context, pbk pbk, jzn jzn, a aVar, pbc pbc, fqn fqn) {
        pbk pbk2 = pbk;
        pbc pbc2 = pbc;
        pbj pbj = new pbj((sbq) pbk.a(pbk2.a.get(), 1), (opw) pbk.a(pbk2.b.get(), 2), (pbe) pbk.a(pbk2.c.get(), 3), (vjv) pbk.a(pbk2.d.get(), 4), (pbh) pbk.a(pbk2.e.get(), 5), (oml) pbk.a(pbk2.f.get(), 6), (String) pbk.a(pbk2.g.get(), 7), (Scheduler) pbk.a(pbk2.h.get(), 8), (Scheduler) pbk.a(pbk2.i.get(), 9), (pbd) pbk.a(pbk2.j.get(), 10), (pav) pbk.a(pbk2.k.get(), 11), ((Integer) pbk.a(pbk2.l.get(), 12)).intValue(), (pbc) pbk.a(pbc2, 13), (fqn) pbk.a(fqn, 14));
        this.b = pbj;
        this.c = picasso;
        this.d = context;
        this.g = aVar;
        this.e = pbc2;
        this.f = jzn;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Optional a(kaa kaa, jzx jzx, kac kac, String str, kad kad) {
        return Optional.b(new kch() {
            public /* synthetic */ void a() {
                CC.$default$a(this);
            }

            public /* synthetic */ void a(float f, long j, long j2) {
                CC.$default$a((kch) this, f, j, j2);
            }

            public /* synthetic */ void a(int i) {
                CC.$default$a((kch) this, i);
            }

            public /* synthetic */ void a(long j) {
                CC.$default$a((kch) this, j);
            }

            public final void a(long j, long j2) {
                pbo.a((View) pbo.this.m.g, (View) pbo.this.m.f);
            }

            public /* synthetic */ void a(long j, long j2, long j3) {
                CC.$default$a((kch) this, j, j2, j3);
            }

            public /* synthetic */ void a(Optional<VideoSurfaceView> optional, long j, long j2) {
                CC.$default$a((kch) this, (Optional) optional, j, j2);
            }

            public /* synthetic */ void a(EncryptionType encryptionType) {
                CC.$default$a((kch) this, encryptionType);
            }

            public /* synthetic */ void a(BetamaxException betamaxException, long j, long j2) {
                CC.$default$a((kch) this, betamaxException, j, j2);
            }

            public /* synthetic */ void a(List<kai> list) {
                CC.$default$a((kch) this, (List) list);
            }

            public /* synthetic */ void a(jzr jzr, ReasonEnd reasonEnd, long j, long j2) {
                CC.$default$a(this, jzr, reasonEnd, j, j2);
            }

            public /* synthetic */ void a(kaa kaa, long j) {
                CC.$default$a((kch) this, kaa, j);
            }

            public /* synthetic */ void a(kai kai, long j, long j2) {
                CC.$default$a((kch) this, kai, j, j2);
            }

            public /* synthetic */ void a(kcc kcc, long j, long j2) {
                CC.$default$a((kch) this, kcc, j, j2);
            }

            public /* synthetic */ void a(kcm kcm, long j, long j2) {
                CC.$default$a((kch) this, kcm, j, j2);
            }

            public /* synthetic */ void a(boolean z, long j) {
                CC.$default$a((kch) this, z, j);
            }

            public /* synthetic */ void a(boolean z, long j, long j2) {
                CC.$default$a((kch) this, z, j, j2);
            }

            public /* synthetic */ void b(long j) {
                CC.$default$b(this, j);
            }

            public /* synthetic */ void b(long j, long j2) {
                CC.$default$b(this, j, j2);
            }

            public /* synthetic */ void b(BetamaxException betamaxException, long j, long j2) {
                CC.$default$b(this, betamaxException, j, j2);
            }

            public /* synthetic */ void c(long j, long j2) {
                CC.$default$c(this, j, j2);
            }

            public /* synthetic */ void d(long j, long j2) {
                CC.$default$d(this, j, j2);
            }

            public /* synthetic */ void e(long j, long j2) {
                CC.$default$e(this, j, j2);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.b.c();
    }

    static /* synthetic */ void a(View view, final View view2) {
        if (view.getVisibility() != 0) {
            view.setAlpha(0.0f);
            view.setVisibility(0);
            AnimatorSet duration = new AnimatorSet().setDuration(600);
            duration.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    view2.setVisibility(8);
                }
            });
            String str = "alpha";
            duration.playSequentially(new Animator[]{ObjectAnimator.ofFloat(view, str, new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat(view2, str, new float[]{1.0f, 0.0f})});
            duration.start();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, pbb pbb, AppBarLayout appBarLayout, int i2) {
        int abs = Math.abs(i2);
        float f2 = (float) abs;
        float height = f2 / ((float) view.getHeight());
        pbb.a(abs, height);
        pbb.getView().setTranslationY(f2);
        this.h.a(height);
        pbj pbj = this.b;
        pbj.c.accept(Boolean.valueOf(abs < pbj.d));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(int i2) {
        this.i.post(new $$Lambda$pbo$410jLyjYgp4U97p7m7pXLH6ykQ(this, i2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.b.c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(int i2) {
        this.j.a(false, false, true);
        i d2 = this.n.d();
        if (i2 >= 0 && d2 != null) {
            d2.e(i2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.b.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.b.a();
    }

    private void e(boolean z) {
        int j2 = j();
        int i2 = 8;
        if (z) {
            float f2 = (float) ((this.e.e() ? 8 : 0) + 24);
            this.j.setPadding(0, j2, 0, vfj.c(f2, this.d.getResources()));
            this.j.setClipToPadding(false);
            this.n.setPadding(0, vfj.c(f2, this.d.getResources()), 0, 0);
            this.n.setClipToPadding(false);
        } else {
            this.j.setPadding(0, j2, 0, 0);
            this.n.setPadding(0, 0, 0, 0);
        }
        ViewGroup viewGroup = this.k;
        if (z) {
            i2 = 0;
        }
        viewGroup.setVisibility(i2);
    }

    private int j() {
        return gau.c(this.d) + vgl.c(this.d, R.attr.actionBarSize);
    }

    public final Completable a() {
        return this.b.b;
    }

    public final List<View> a(LayoutInflater layoutInflater, ViewGroup viewGroup, fsz fsz) {
        gmu gmu;
        this.i = (CoordinatorLayout) layoutInflater.inflate(R.layout.story_header, viewGroup, false);
        this.n = (RecyclerView) this.i.findViewById(R.id.recycler_view);
        this.j = (AppBarLayout) this.i.findViewById(R.id.header_view);
        this.k = (ViewGroup) this.i.findViewById(R.id.accessory);
        this.n.a((i) new LinearLayoutManager(this.d));
        gau.a(this.d);
        this.h = fsz.b();
        this.h.a(0.0f);
        if (this.e.a()) {
            if (this.e.e()) {
                gmu = this.g.a(this.d);
            } else {
                a aVar = this.g;
                gat.a();
                gmu = aVar.a(a.a(this.d));
            }
            gmu.a((OnClickListener) new $$Lambda$pbo$NDp6MptORyLxW4hH8_RLtDWQQo(this));
            this.k.addView(gmu.a());
            this.o = gmu;
            e(true);
        } else {
            e(false);
        }
        this.q = gaa.f(this.d);
        this.m = new pbb(this.d, this.j);
        pbb pbb = this.m;
        View view = pbb.getView();
        this.j.addView(view);
        this.j.a((b) new $$Lambda$pbo$wwx9NZ1vLeUB8uAQfdwhMJHq3Xg(this, view, pbb));
        if (this.e.c()) {
            pbb.e.setVisibility(0);
            pbb.e.setOnClickListener(new $$Lambda$pbo$o4a_MGdFoGt8RLY8qsX4Rj9Roac(this));
        }
        if (this.l.b()) {
            this.j.a(((Boolean) this.l.c()).booleanValue(), false, true);
            this.l = Optional.e();
        }
        return Collections.singletonList(this.i);
    }

    public final void a(int i2) {
        this.n.post(new $$Lambda$pbo$pgkOTYhmWKCoA3xVH9A7J9DdK8(this, i2));
    }

    public final void a(Bundle bundle) {
        pbj pbj = this.b;
        if (bundle != null) {
            pbj.f = Boolean.valueOf(bundle.getBoolean(pbj.class.getName()));
        }
    }

    public final void a(CharSequence charSequence) {
        pbb pbb = this.m;
        if (pbb != null) {
            pbb.c.setText(charSequence);
        }
    }

    public final void a(String str) {
        pbb pbb = this.m;
        if (pbb != null) {
            pbb.d.setText(str);
        }
        this.h.a(str);
    }

    public final void a(String str, boolean z) {
        pbb pbb = this.m;
        if (pbb != null) {
            pbb.b.setVisibility(0);
            pbb.b.setText(str);
            if (z) {
                pbb.b.setCompoundDrawablesWithIntrinsicBounds(frr.a(pbb.b.getContext()), null, null, null);
                pbb.b.setCompoundDrawablePadding(pbb.a);
                return;
            }
            pbb.b.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        }
    }

    public final void a(a aVar) {
        this.b.a(aVar);
    }

    public final void a(boolean z) {
        pbb pbb = this.m;
        if (pbb != null) {
            pbb.e.setChecked(z);
        }
    }

    public final void ay_() {
        this.b.a((pbn) this);
    }

    public final void b(Bundle bundle) {
        pbj pbj = this.b;
        if (pbj.e != null) {
            bundle.putBoolean(pbj.class.getName(), pbj.e.e());
        }
    }

    public final void b(String str) {
        AnonymousClass2 r0 = new wgx() {
            public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
                fbp.a(!bitmap.isRecycled());
                BitmapDrawable bitmapDrawable = new BitmapDrawable(pbo.this.d.getResources(), bitmap);
                fwx fwx = new fwx();
                fwx.a((Drawable) bitmapDrawable, (Drawable) new ColorDrawable());
                fwx.a = true;
                ip.a((View) pbo.this.j, (Drawable) fwz.a((Drawable) fwx, (Drawable) new fwy(pbo.this.d)));
                fbp.a(!bitmap.isRecycled());
            }

            public final void a(Drawable drawable) {
            }

            public final void b(Drawable drawable) {
            }
        };
        this.j.setTag(r0);
        this.c.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a((wgx) r0);
    }

    public final void b(boolean z) {
        gmu gmu = this.o;
        if (gmu != null) {
            gmu.a(z);
        }
    }

    public final void c() {
        this.b.a((pbn) null);
    }

    public final void c(String str) {
        ImageView imageView = this.m.f;
        if (imageView == null) {
            imageView = new ImageView(this.d);
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable == null) {
            drawable = this.q;
        }
        this.c.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a(drawable).b(drawable).a((wgz) new vgz()).a(imageView);
        imageView.setOnClickListener(new $$Lambda$pbo$OO1EaHqbWEK1CElL8lfEDGBQz08(this));
    }

    public final void c(boolean z) {
        gmu gmu = this.o;
        if (gmu != null) {
            gmu.b(z);
        }
    }

    public final void d() {
        this.b.a.c();
        jzm jzm = this.p;
        if (jzm != null) {
            jzm.al_();
            this.p.ak_();
            this.p = null;
        }
    }

    public final void d(String str) {
        PlaylistStoryHeaderAnimatedTooltip playlistStoryHeaderAnimatedTooltip = this.m.h;
        if (playlistStoryHeaderAnimatedTooltip != null && !fbo.a(str)) {
            this.c.a(str).a((wgz) new vgz()).a(gaa.f(playlistStoryHeaderAnimatedTooltip.getContext())).b(gaa.f(playlistStoryHeaderAnimatedTooltip.getContext())).a(playlistStoryHeaderAnimatedTooltip.c);
        }
    }

    public final void d(boolean z) {
        AppBarLayout appBarLayout = this.j;
        if (appBarLayout != null) {
            appBarLayout.a(z, false, true);
        } else {
            this.l = Optional.b(Boolean.valueOf(z));
        }
    }

    public final void e(String str) {
        if (!fbo.a(str)) {
            VideoSurfaceView videoSurfaceView = this.m.g;
            videoSurfaceView.setOnClickListener(new $$Lambda$pbo$MZYYROd_ypL7YbYeqxjCjsgVOqg(this));
            videoSurfaceView.a(ScaleType.ASPECT_FILL);
            kab c2 = kab.e().a(kdq.a(str)).a(false).b(false).c();
            if (this.p == null) {
                VideoSurfaceView videoSurfaceView2 = this.m.g;
                jzn jzn = this.f;
                jzn.d = "Playlist Story Header";
                jzn.e = false;
                jzn.a = videoSurfaceView2;
                this.p = jzn.a(Collections.singletonList(new $$Lambda$pbo$iMhqYA877Imf8GAVZtt1Gq034(this))).a();
            }
            this.p.a_(true);
            this.p.c(true);
            this.p.a(c2);
        }
    }

    public final boolean e() {
        AppBarLayout appBarLayout = this.j;
        return appBarLayout != null && appBarLayout.getHeight() - this.j.getBottom() == 0;
    }

    public final void f() {
        PlaylistStoryHeaderAnimatedTooltip playlistStoryHeaderAnimatedTooltip = this.m.h;
        if (playlistStoryHeaderAnimatedTooltip != null) {
            PlaylistStoryHeaderAnimatedTooltip.a(playlistStoryHeaderAnimatedTooltip.b, (int) R.id.hide_animation_end_listener, playlistStoryHeaderAnimatedTooltip.g);
            if (playlistStoryHeaderAnimatedTooltip.b.getTag(R.id.show_animation_end_listener) instanceof b) {
                playlistStoryHeaderAnimatedTooltip.d.a((b) playlistStoryHeaderAnimatedTooltip.b.getTag(R.id.show_animation_end_listener));
                playlistStoryHeaderAnimatedTooltip.d.a(1.0f);
                playlistStoryHeaderAnimatedTooltip.e.a(1.0f);
            }
        }
    }

    public final void g() {
        PlaylistStoryHeaderAnimatedTooltip playlistStoryHeaderAnimatedTooltip = this.m.h;
        if (playlistStoryHeaderAnimatedTooltip != null) {
            PlaylistStoryHeaderAnimatedTooltip.a(playlistStoryHeaderAnimatedTooltip.b, (int) R.id.show_animation_end_listener, playlistStoryHeaderAnimatedTooltip.d);
            if (playlistStoryHeaderAnimatedTooltip.b.getTag(R.id.hide_animation_end_listener) instanceof b) {
                playlistStoryHeaderAnimatedTooltip.g.a((b) playlistStoryHeaderAnimatedTooltip.b.getTag(R.id.hide_animation_end_listener));
                playlistStoryHeaderAnimatedTooltip.g.a(playlistStoryHeaderAnimatedTooltip.l);
                playlistStoryHeaderAnimatedTooltip.j.a(playlistStoryHeaderAnimatedTooltip.m);
                playlistStoryHeaderAnimatedTooltip.k.a(0.0f);
                playlistStoryHeaderAnimatedTooltip.f.a(0.0f);
                playlistStoryHeaderAnimatedTooltip.h.a(0.0f);
                playlistStoryHeaderAnimatedTooltip.i.a(0.0f);
            }
        }
    }

    public final void h() {
        PlaylistStoryHeaderAnimatedTooltip playlistStoryHeaderAnimatedTooltip = this.m.h;
        if (playlistStoryHeaderAnimatedTooltip != null) {
            playlistStoryHeaderAnimatedTooltip.setVisibility(4);
        }
    }

    public final RecyclerView i() {
        return (RecyclerView) fbp.a(this.n);
    }

    public final boolean l() {
        return false;
    }
}
