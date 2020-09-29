package defpackage;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.b;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.VideoSurfaceView.ScaleType;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.exception.BetamaxException;
import com.spotify.music.R;
import com.spotify.music.canvas.model.CanvasContentType;
import com.squareup.picasso.Picasso;
import java.util.List;

/* renamed from: syc reason: default package */
public final class syc extends iqu<PlayerTrack> implements kai, syh {
    private static final ImmutableSet<CanvasContentType> a = ImmutableSet.b(CanvasContentType.VIDEO_LOOPING, CanvasContentType.VIDEO_LOOPING_RANDOM);
    /* access modifiers changed from: private */
    public final jxm b;
    private final VideoSurfaceView c;
    private final kuq d;
    private final View e;
    private final ImageView f;
    /* access modifiers changed from: private */
    public final kuv g;
    /* access modifiers changed from: private */
    public final kux h;
    /* access modifiers changed from: private */
    public kup i;
    private final Picasso j;
    private final kus k;
    private final b l = new c() {
        public final void a() {
            syc.this.b.an_();
            syc.this.A();
        }

        public final void c() {
            syc.this.b.b();
            syc.this.B();
        }

        public final void aP_() {
            Logger.b("onDestroy", new Object[0]);
            syc.this.b.al_();
            kux d = syc.this.h;
            kux.a.clear();
            d.b.unsubscribe();
        }
    };

    public final /* synthetic */ void a(Object obj, int i2) {
        PlayerTrack playerTrack = (PlayerTrack) obj;
        Uri b2 = ivs.b(playerTrack);
        if (Uri.EMPTY.equals(b2)) {
            this.f.setImageResource(R.drawable.bg_placeholder_album);
        } else {
            ((Picasso) fay.a(this.j)).a(b2).a((int) R.drawable.bg_placeholder_album).a(this.f);
        }
        z();
        this.i = kuq.a(playerTrack);
        if (this.i != null) {
            this.b.a(this.c);
            jxx c2 = jxx.c().a(true).a(Long.valueOf(this.i.e() == CanvasContentType.VIDEO_LOOPING_RANDOM ? (long) this.k.a.nextInt(8000) : 0)).c();
            a a2 = jyb.e().b(false).a(true);
            if (fax.a(this.i.c())) {
                a2.a(this.i.b());
            } else {
                a2.a(kbq.a(this.i.c()));
            }
            this.b.c(a.contains(this.i.e()));
            this.b.a(a2.c(), c2);
        }
    }

    public syc(LayoutInflater layoutInflater, int i2, a aVar, jxn jxn, jyd jyd, kuq kuq, jyo jyo, kuv kuv, kux kux, Picasso picasso, ViewGroup viewGroup, kus kus) {
        super(layoutInflater.inflate(i2, viewGroup, false));
        this.d = kuq;
        this.k = kus;
        this.c = (VideoSurfaceView) this.o.findViewById(R.id.video_surface);
        this.e = this.o.findViewById(R.id.peek_placeholder);
        this.c.setVisibility(8);
        this.c.a(ScaleType.ASPECT_FILL);
        aVar.a(this.l);
        this.g = kuv;
        this.h = kux;
        this.f = (ImageView) this.o.findViewById(R.id.image);
        this.j = picasso;
        ImmutableList a2 = ImmutableList.a(this);
        jxn.d = "canvas-video";
        jxn.b = new jzd();
        jxn.f = jyo;
        jxn a3 = jxn.a(a2);
        a3.e = false;
        a3.g = jyd.c().a(false).a();
        this.b = a3.a();
        this.b.a_(true);
    }

    public final void v() {
        Logger.b("onViewAttachedToWindow", new Object[0]);
        super.v();
        this.b.a(this.c);
        gac.a((View) this.c, 400);
        this.b.b();
    }

    public final void w() {
        Logger.b("onViewDetachedFromWindow", new Object[0]);
        this.b.an_();
        A();
        this.b.b(this.c);
        super.w();
    }

    public final void x() {
        Logger.b("onViewRecycled", new Object[0]);
        this.b.am_();
    }

    public final void aS_() {
        this.f.setVisibility(4);
        this.e.setVisibility(0);
        this.c.setVisibility(4);
    }

    public final void z() {
        if (this.f.getVisibility() == 0) {
            this.e.setVisibility(8);
        } else {
            gac.a(this.e, (View) this.f);
        }
    }

    /* access modifiers changed from: private */
    public void A() {
        this.c.setVisibility(4);
    }

    /* access modifiers changed from: private */
    public void B() {
        gac.a((View) this.c, 400);
    }

    public final Optional<kah> a(jya jya, jxx jxx, jyc jyc, String str, jyd jyd) {
        return Optional.b(new kah() {
            public /* synthetic */ void a() {
                CC.$default$a(this);
            }

            public /* synthetic */ void a(float f, long j, long j2) {
                CC.$default$a((kah) this, f, j, j2);
            }

            public /* synthetic */ void a(int i) {
                CC.$default$a((kah) this, i);
            }

            public /* synthetic */ void a(long j) {
                CC.$default$a((kah) this, j);
            }

            public /* synthetic */ void a(long j, long j2, long j3) {
                CC.$default$a((kah) this, j, j2, j3);
            }

            public /* synthetic */ void a(Optional<VideoSurfaceView> optional, long j, long j2) {
                CC.$default$a((kah) this, (Optional) optional, j, j2);
            }

            public /* synthetic */ void a(EncryptionType encryptionType) {
                CC.$default$a((kah) this, encryptionType);
            }

            public /* synthetic */ void a(List<jyi> list) {
                CC.$default$a((kah) this, (List) list);
            }

            public /* synthetic */ void a(jxr jxr, ReasonEnd reasonEnd, long j, long j2) {
                CC.$default$a(this, jxr, reasonEnd, j, j2);
            }

            public /* synthetic */ void a(jya jya, long j) {
                CC.$default$a((kah) this, jya, j);
            }

            public /* synthetic */ void a(jyi jyi, long j, long j2) {
                CC.$default$a((kah) this, jyi, j, j2);
            }

            public /* synthetic */ void a(kac kac, long j, long j2) {
                CC.$default$a((kah) this, kac, j, j2);
            }

            public /* synthetic */ void a(kam kam, long j, long j2) {
                CC.$default$a((kah) this, kam, j, j2);
            }

            public /* synthetic */ void a(boolean z, long j, long j2) {
                CC.$default$a((kah) this, z, j, j2);
            }

            public /* synthetic */ void b(long j) {
                CC.$default$b(this, j);
            }

            public /* synthetic */ void b(long j, long j2) {
                CC.$default$b(this, j, j2);
            }

            public /* synthetic */ void c(long j, long j2) {
                CC.$default$c(this, j, j2);
            }

            public /* synthetic */ void e(long j, long j2) {
                CC.$default$e(this, j, j2);
            }

            public final void a(boolean z, long j) {
                syc.this.A();
            }

            public final void a(BetamaxException betamaxException, long j, long j2) {
                syc.this.A();
                syc.a(syc.this, betamaxException);
            }

            public final void b(BetamaxException betamaxException, long j, long j2) {
                syc.this.A();
                syc.a(syc.this, betamaxException);
            }

            public final void d(long j, long j2) {
                syc.this.A();
                syc.this.h.a(syc.this.i.a());
                if (syc.f(syc.this)) {
                    syc.this.g.a(syc.this.i, "started_buffering", null, null);
                } else {
                    syc.this.g.a(syc.this.i);
                }
            }

            public final void a(long j, long j2) {
                syc.this.B();
                syc.this.h.b(syc.this.i.a());
                if (syc.f(syc.this)) {
                    syc.this.g.a(syc.this.i, "started_streaming", null, null);
                } else {
                    syc.this.g.b(syc.this.i);
                }
            }
        });
    }

    static /* synthetic */ void a(syc syc, BetamaxException betamaxException) {
        String str;
        kuv kuv = syc.g;
        kup kup = syc.i;
        switch (betamaxException.mErrorType) {
            case ERROR_UNKNOWN:
                str = betamaxException.getMessage();
                break;
            case ERROR_GEORESTRICTED:
                str = "This content is georestricted";
                break;
            case ERROR_UNSUPPORTED_PLATFORM_VERSION:
                str = "This content is unsupported for platform version";
                break;
            case ERROR_UNSUPPORTED_CLIENT_VERSION:
                str = "This content is unsupported for client version";
                break;
            case ERROR_IN_OFFLINE_MODE:
                str = "There is no internet connection";
                break;
            case ERROR_COUNTRY_RESTRICTED:
                str = "This content is country restricted";
                break;
            case ERROR_UNAVAILABLE:
                str = "The content is unavailable";
                break;
            case ERROR_CATALOGUE_RESTRICTED:
                str = "The catalogue is restricted";
                break;
            case ERROR_PLAYBACK_STUCK:
                str = "Video playback is stuck";
                break;
            default:
                str = "There is a error we didn't catch.";
                break;
        }
        kuv.a(kup, "CANVAS_VIDEO_PLAYBACK_ERROR", str);
        kux kux = syc.h;
        String a2 = syc.i.a();
        kux.a.remove(a2);
        kux.c.onNext(new kui(a2, false));
    }

    static /* synthetic */ boolean f(syc syc) {
        return !fax.a(syc.i.c());
    }
}
