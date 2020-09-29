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

/* renamed from: tij reason: default package */
public final class tij extends ith<PlayerTrack> implements kci, tio {
    private static final ImmutableSet<CanvasContentType> a = ImmutableSet.b(CanvasContentType.VIDEO_LOOPING, CanvasContentType.VIDEO_LOOPING_RANDOM);
    /* access modifiers changed from: private */
    public final jzm b;
    private final VideoSurfaceView c;
    private final kxz d;
    private final View e;
    private final ImageView f;
    /* access modifiers changed from: private */
    public final kye g;
    /* access modifiers changed from: private */
    public final kyg h;
    /* access modifiers changed from: private */
    public kxy i;
    private final Picasso j;
    private final kyb k;
    private final b l = new c() {
        public final void a() {
            tij.this.b.am_();
            tij.this.B();
        }

        public final void aN_() {
            Logger.b("onDestroy", new Object[0]);
            tij.this.b.ak_();
            kyg d = tij.this.h;
            kyg.a.clear();
            d.b.unsubscribe();
        }

        public final void c() {
            tij.this.b.b();
            tij.this.C();
        }
    };

    public tij(LayoutInflater layoutInflater, int i2, a aVar, jzn jzn, kad kad, kxz kxz, kao kao, kye kye, kyg kyg, Picasso picasso, ViewGroup viewGroup, kyb kyb) {
        super(layoutInflater.inflate(i2, viewGroup, false));
        this.d = kxz;
        this.k = kyb;
        this.c = (VideoSurfaceView) this.o.findViewById(R.id.video_surface);
        this.e = this.o.findViewById(R.id.peek_placeholder);
        this.c.setVisibility(8);
        this.c.a(ScaleType.ASPECT_FILL);
        aVar.a(this.l);
        this.g = kye;
        this.h = kyg;
        this.f = (ImageView) this.o.findViewById(R.id.image);
        this.j = picasso;
        ImmutableList a2 = ImmutableList.a(this);
        jzn.d = "canvas-video";
        jzn.b = new kbd();
        jzn.f = kao;
        jzn a3 = jzn.a(a2);
        a3.e = false;
        a3.g = kad.c().a(false).a();
        this.b = a3.a();
        this.b.a_(true);
    }

    /* access modifiers changed from: private */
    public void B() {
        this.c.setVisibility(4);
    }

    /* access modifiers changed from: private */
    public void C() {
        gaw.a((View) this.c, 400);
    }

    static /* synthetic */ void a(tij tij, BetamaxException betamaxException) {
        String str;
        kye kye = tij.g;
        kxy kxy = tij.i;
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
        kye.a(kxy, "CANVAS_VIDEO_PLAYBACK_ERROR", str);
        kyg kyg = tij.h;
        String a2 = tij.i.a();
        kyg.a.remove(a2);
        kyg.c.onNext(new kxr(a2, false));
    }

    static /* synthetic */ boolean f(tij tij) {
        return !fbo.a(tij.i.c());
    }

    public final void A() {
        if (this.f.getVisibility() == 0) {
            this.e.setVisibility(8);
        } else {
            gaw.a(this.e, (View) this.f);
        }
    }

    public final /* synthetic */ void a(Object obj, int i2) {
        PlayerTrack playerTrack = (PlayerTrack) obj;
        Uri b2 = iyd.b(playerTrack);
        if (Uri.EMPTY.equals(b2)) {
            this.f.setImageResource(R.drawable.bg_placeholder_album);
        } else {
            ((Picasso) fbp.a(this.j)).a(b2).a((int) R.drawable.bg_placeholder_album).a(this.f);
        }
        A();
        this.i = kxz.a(playerTrack);
        if (this.i != null) {
            this.b.a(this.c);
            jzx c2 = jzx.c().a(true).a(Long.valueOf(this.i.e() == CanvasContentType.VIDEO_LOOPING_RANDOM ? (long) this.k.a.nextInt(8000) : 0)).c();
            a a2 = kab.e().b(false).a(true);
            if (fbo.a(this.i.c())) {
                a2.a(this.i.b());
            } else {
                a2.a(kdq.a(this.i.c()));
            }
            this.b.c(a.contains(this.i.e()));
            this.b.a(a2.c(), c2);
        }
    }

    public final void aQ_() {
        this.f.setVisibility(4);
        this.e.setVisibility(0);
        this.c.setVisibility(4);
    }

    public final Optional<kch> createEventObserver(kaa kaa, jzx jzx, kac kac, String str, kad kad) {
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
                tij.this.C();
                tij.this.h.b(tij.this.i.a());
                if (tij.f(tij.this)) {
                    tij.this.g.a(tij.this.i, "started_streaming", null, null);
                } else {
                    tij.this.g.b(tij.this.i);
                }
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

            public final void a(BetamaxException betamaxException, long j, long j2) {
                tij.this.B();
                tij.a(tij.this, betamaxException);
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

            public final void a(boolean z, long j) {
                tij.this.B();
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

            public final void b(BetamaxException betamaxException, long j, long j2) {
                tij.this.B();
                tij.a(tij.this, betamaxException);
            }

            public /* synthetic */ void c(long j, long j2) {
                CC.$default$c(this, j, j2);
            }

            public final void d(long j, long j2) {
                tij.this.B();
                tij.this.h.a(tij.this.i.a());
                if (tij.f(tij.this)) {
                    tij.this.g.a(tij.this.i, "started_buffering", null, null);
                } else {
                    tij.this.g.a(tij.this.i);
                }
            }

            public /* synthetic */ void e(long j, long j2) {
                CC.$default$e(this, j, j2);
            }
        });
    }

    public final void w() {
        Logger.b("onViewAttachedToWindow", new Object[0]);
        super.w();
        this.b.a(this.c);
        gaw.a((View) this.c, 400);
        this.b.b();
    }

    public final void x() {
        Logger.b("onViewDetachedFromWindow", new Object[0]);
        this.b.am_();
        B();
        this.b.b(this.c);
        super.x();
    }

    public final void y() {
        Logger.b("onViewRecycled", new Object[0]);
        this.b.al_();
    }
}
