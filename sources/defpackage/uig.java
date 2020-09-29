package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.R;
import com.spotify.music.spotlets.scannables.ScannablesException;
import com.spotify.music.spotlets.scannables.model.IdModel;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import rx.internal.operators.OperatorMerge;
import rx.internal.util.ScalarSynchronousObservable;
import rx.internal.util.UtilityFunctions.Identity;

/* renamed from: uig reason: default package */
public final class uig implements uif {
    final uia a;
    WeakReference<uil> b;
    private final gky<IdModel> c;
    private final uii d;
    private final uih e;
    private final hvl f;
    private final wug g;
    private final wug h;
    private final uhs i;
    private final jvr j;
    private final boolean k;
    private wuk l;
    private wuk m;
    private final xag n = new xag();
    private final wue<ho<IdModel, String>> o = new wue<ho<IdModel, String>>() {
        public final void onCompleted() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            ho hoVar = (ho) obj;
            uil uil = (uil) uig.this.b.get();
            if (uil != null) {
                uia uia = uig.this.a;
                String target = ((IdModel) fay.a(hoVar.a)).getTarget();
                String str = (String) fay.a(hoVar.b);
                jjf jjf = uia.b;
                bg bgVar = r5;
                bg bgVar2 = new bg(null, uia.c, str, 0, 0, target, "scan", "navigate-forward", (double) jrf.a.a());
                jjf.a(bgVar);
                uil.l();
                uil.a(((IdModel) hoVar.a).getTarget());
            }
        }

        public final void onError(Throwable th) {
            uil uil = (uil) uig.this.b.get();
            if (uil != null) {
                uil.l();
                if (th instanceof ScannablesException) {
                    uil.m();
                } else {
                    uil.r();
                }
            }
        }
    };
    private final wun<String> p = new $$Lambda$uig$gX40WAEeqmMy1PM1Af4Zt7SDhuY(this);

    /* access modifiers changed from: private */
    public /* synthetic */ void d(String str) {
        uil uil = (uil) this.b.get();
        if (uil != null) {
            uil.l();
            uil.a(str);
        }
    }

    public uig(wug wug, wug wug2, hvl hvl, uia uia, gky<IdModel> gky, uii uii, uih uih, wuk wuk, wuk wuk2, uhs uhs, jvr jvr, boolean z) {
        this.g = wug;
        this.h = wug2;
        this.f = hvl;
        this.a = uia;
        this.c = gky;
        this.e = uih;
        this.d = uii;
        this.l = wuk;
        this.m = wuk2;
        this.i = uhs;
        this.j = jvr;
        this.k = z;
    }

    public final void a(uil uil) {
        this.b = new WeakReference<>(uil);
        this.n.a(this.m);
        this.n.a(this.l);
    }

    public final void a(wud<uib> wud) {
        wud wud2;
        this.l.unsubscribe();
        $$Lambda$uig$AXmV7BJgOYei4VvCmcunfUB0BO4 r0 = new $$Lambda$uig$AXmV7BJgOYei4VvCmcunfUB0BO4(this);
        if (wud.getClass() == ScalarSynchronousObservable.class) {
            wud2 = ((ScalarSynchronousObservable) wud).m(r0);
        } else {
            wud f2 = wud.f(r0);
            if (f2.getClass() == ScalarSynchronousObservable.class) {
                wud2 = ((ScalarSynchronousObservable) f2).m(Identity.INSTANCE);
            } else {
                wud2 = f2.a((b<? extends R, ? super T>) OperatorMerge.a(false, 4));
            }
        }
        wud f3 = wud2.j($$Lambda$LvDlpltRqUWH4hvLSPEVc9ySwSc.INSTANCE).f($$Lambda$uig$wW53TR7Cab5mimIlvsPpEI3AeU.INSTANCE);
        if (this.k) {
            this.l = f3.a(this.h).a(this.p, (wun<Throwable>) $$Lambda$uig$2E8EyxmyPkqrQPVKq1fj9hC5Xw.INSTANCE);
        } else {
            this.l = f3.b((wun<? super T>) new $$Lambda$uig$ZMWqqvCsUYyN0XlxFbu5ZsaaK0<Object>(this)).d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$uig$bOn7SowdYbMoOcV2xLYJ3nL8IP4<Object,Object>(this)).f(new $$Lambda$uig$kjQxJ6eOLMMnYmlA0XEbyVsraFo("scannables/scanner")).a(this.h).a(this.o);
        }
        this.n.a(this.l);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(uib uib) {
        return uih.a(uib).b(this.g);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(Optional optional) {
        if (optional.b()) {
            return (String) optional.c();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(Throwable th) {
        throw new RuntimeException("RxJava 1 exception in ScannablesPresenterImpl #1", th);
    }

    public final void a() {
        this.n.a();
    }

    public final void a(ContentResolver contentResolver, Uri uri) {
        this.m.unsubscribe();
        wud b2 = wud.a((Callable<? extends T>) new Callable<String>(contentResolver, uri) {
            private /* synthetic */ ContentResolver a;
            private /* synthetic */ Uri b;

            {
                this.a = r2;
                this.b = r3;
            }

            public final /* synthetic */ Object call() {
                ContentResolver contentResolver = this.a;
                Uri uri = this.b;
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(contentResolver.openInputStream(uri), null, options);
                options.inSampleSize = uhr.a(options, 1024, 1024);
                options.inJustDecodeBounds = false;
                Bitmap decodeStream = BitmapFactory.decodeStream(contentResolver.openInputStream(uri), null, options);
                String[] a2 = uhr.a(uhr.a(decodeStream.getWidth(), decodeStream.getHeight(), decodeStream), 0, decodeStream.getWidth(), decodeStream.getHeight());
                if (a2 != null && a2.length > 0) {
                    return a2[0];
                }
                throw new ScannablesException(1);
            }
        }).a(this.h).b(this.g);
        if (this.k) {
            this.m = b2.a(this.h).a(this.p, (wun<Throwable>) $$Lambda$uig$xaAg1Tw42fWI7NdsFTqo8xKJyAM.INSTANCE);
        } else {
            this.m = b2.d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$uig$bOn7SowdYbMoOcV2xLYJ3nL8IP4<Object,Object>(this)).f(new $$Lambda$uig$kjQxJ6eOLMMnYmlA0XEbyVsraFo("scannables/imagePicker")).a((wum) new $$Lambda$uig$az7CYiaSjdXmZG86sYTDNeyxdpI(this)).a(this.h).a(this.o);
        }
        this.n.a(this.m);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(Throwable th) {
        throw new RuntimeException("RxJava 1 exception in ScannablesPresenterImpl #2", th);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        uil uil = (uil) this.b.get();
        if (uil != null) {
            uil.k();
            uil.a(R.string.scannables_progress_dialog_title, R.string.scannables_progress_dialog_decoding);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        uil uil = (uil) this.b.get();
        if (uil != null) {
            uil.a(R.string.scannables_progress_dialog_title, R.string.scannables_progress_dialog_contacting_server);
            uil.q();
        }
    }

    public final void b() {
        uil uil = (uil) this.b.get();
        if (uil != null) {
            uia uia = this.a;
            jjf jjf = uia.b;
            be beVar = r4;
            be beVar2 = new be(null, uia.c, null, 0, 0, null, "photo-library", null, (double) jrf.a.a());
            jjf.a(beVar);
            uia uia2 = this.a;
            jjf jjf2 = uia2.b;
            bg bgVar = r4;
            bg bgVar2 = new bg(null, uia2.c, null, 0, 0, null, "tap-photo-library-button", "navigate-forward", (double) jrf.a.a());
            jjf2.a(bgVar);
            uil.n();
        }
    }

    private void a(wun<SessionState> wun) {
        this.n.a(vun.a((wrf<T>) this.f.a).j($$Lambda$K6LBDee2P7uQjQt0uNTOG54xquk.INSTANCE).a(this.h).a(wun, (wun<Throwable>) $$Lambda$uig$rzt0ikOuQv6_DBIziLODdD7xZ0.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Context context, SessionState sessionState) {
        uhs uhs = this.i;
        boolean a2 = uhs.b.a(context, sessionState.currentUserName()).a(uhs.a, false);
        boolean a3 = this.j.a(context, "android.permission.CAMERA");
        if (!a2 || !a3) {
            uil uil = (uil) this.b.get();
            if (uil != null) {
                uil.s();
                return;
            }
            return;
        }
        uil uil2 = (uil) this.b.get();
        if (uil2 != null) {
            uil2.t();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Context context, SessionState sessionState) {
        uhs uhs = this.i;
        uhs.b.a(context, sessionState.currentUserName()).a().a(uhs.a, true).b();
    }

    public final void c() {
        uia uia = this.a;
        jjf jjf = uia.b;
        bg bgVar = r3;
        bg bgVar2 = new bg(null, uia.c, null, 0, 0, null, "tap-photo-library-cancel-button", "navigate-backward", (double) jrf.a.a());
        jjf.a(bgVar);
    }

    public final void d() {
        uia uia = this.a;
        jjf jjf = uia.b;
        bg bgVar = r3;
        bg bgVar2 = new bg(null, uia.c, null, 0, 0, null, "select-photo-library-photo", "select-photo", (double) jrf.a.a());
        jjf.a(bgVar);
    }

    public final void a(String str) {
        uia uia = this.a;
        jjf jjf = uia.b;
        String str2 = "scannable";
        be beVar = r3;
        be beVar2 = new be(null, uia.c, null, 0, 0, str, str2, null, (double) jrf.a.a());
        jjf.a(beVar);
    }

    public final void a(Context context) {
        a((wun<SessionState>) new $$Lambda$uig$VsSu6ClS6ED2aDPl7lxkQWQKWrk<SessionState>(this, context));
    }

    public final void b(Context context) {
        a((wun<SessionState>) new $$Lambda$uig$S2CQABewu44sESYBfsJrh4wco<SessionState>(this, context));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud c(String str) {
        StringBuilder sb = new StringBuilder("hm://scannable-id/id/");
        sb.append(str);
        sb.append("?format=json");
        return this.c.resolve(RequestBuilder.get(sb.toString()).build());
    }
}
