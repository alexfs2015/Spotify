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

/* renamed from: utu reason: default package */
public final class utu implements utt {
    final uto a;
    WeakReference<utz> b;
    private final gmm<IdModel> c;
    private final utw d;
    private final utv e;
    private final hxx f;
    private final xil g;
    private final xil h;
    private final utg i;
    private final jxz j;
    private final boolean k;
    private xip l;
    private xip m;
    private final xok n = new xok();
    private final xij<ho<IdModel, String>> o = new xij<ho<IdModel, String>>() {
        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
            utz utz = (utz) utu.this.b.get();
            if (utz != null) {
                utz.l();
                if (th instanceof ScannablesException) {
                    utz.m();
                } else {
                    utz.r();
                }
            }
        }

        public final /* synthetic */ void onNext(Object obj) {
            ho hoVar = (ho) obj;
            utz utz = (utz) utu.this.b.get();
            if (utz != null) {
                uto uto = utu.this.a;
                String target = ((IdModel) fbp.a(hoVar.a)).getTarget();
                String str = (String) fbp.a(hoVar.b);
                jlr jlr = uto.b;
                bf bfVar = r5;
                bf bfVar2 = new bf(null, uto.c, str, 0, 0, target, "scan", "navigate-forward", (double) jtp.a.a());
                jlr.a(bfVar);
                utz.l();
                utz.a(((IdModel) hoVar.a).getTarget());
            }
        }
    };
    private final xis<String> p = new $$Lambda$utu$zo_jpz3dh8fQ8Tcoj96qOJIG_9w(this);

    public utu(xil xil, xil xil2, hxx hxx, uto uto, gmm<IdModel> gmm, utw utw, utv utv, xip xip, xip xip2, utg utg, jxz jxz, boolean z) {
        this.g = xil;
        this.h = xil2;
        this.f = hxx;
        this.a = uto;
        this.c = gmm;
        this.e = utv;
        this.d = utw;
        this.l = xip;
        this.m = xip2;
        this.i = utg;
        this.j = jxz;
        this.k = z;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(Optional optional) {
        if (optional.b()) {
            return (String) optional.c();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(utp utp) {
        return utv.a(utp).b(this.g);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Context context, SessionState sessionState) {
        utg utg = this.i;
        utg.b.a(context, sessionState.currentUserName()).a().a(utg.a, true).b();
    }

    private void a(xis<SessionState> xis) {
        this.n.a(wit.a((xfk<T>) this.f.a).i($$Lambda$TqnEXuCpi0iJVFC5FQQtiiwXxE.INSTANCE).a(this.h).a(xis, (xis<Throwable>) $$Lambda$utu$EPT90rOk2zRUi7p8j3a418nS1w.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Context context, SessionState sessionState) {
        utg utg = this.i;
        boolean a2 = utg.b.a(context, sessionState.currentUserName()).a(utg.a, false);
        boolean a3 = this.j.a(context, "android.permission.CAMERA");
        if (!a2 || !a3) {
            utz utz = (utz) this.b.get();
            if (utz != null) {
                utz.s();
                return;
            }
            return;
        }
        utz utz2 = (utz) this.b.get();
        if (utz2 != null) {
            utz2.t();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        utz utz = (utz) this.b.get();
        if (utz != null) {
            utz.a(R.string.scannables_progress_dialog_title, R.string.scannables_progress_dialog_contacting_server);
            utz.q();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(Throwable th) {
        throw new RuntimeException("RxJava 1 exception in ScannablesPresenterImpl #2", th);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii c(String str) {
        StringBuilder sb = new StringBuilder("hm://scannable-id/id/");
        sb.append(str);
        sb.append("?format=json");
        return this.c.resolve(RequestBuilder.get(sb.toString()).build());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(Throwable th) {
        throw new RuntimeException("RxJava 1 exception in ScannablesPresenterImpl #1", th);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(String str) {
        utz utz = (utz) this.b.get();
        if (utz != null) {
            utz.l();
            utz.a(str);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        utz utz = (utz) this.b.get();
        if (utz != null) {
            utz.k();
            utz.a(R.string.scannables_progress_dialog_title, R.string.scannables_progress_dialog_decoding);
        }
    }

    public final void a() {
        this.n.a();
    }

    public final void a(ContentResolver contentResolver, Uri uri) {
        this.m.unsubscribe();
        xii b2 = xii.a((Callable<? extends T>) new Callable<String>(contentResolver, uri) {
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
                options.inSampleSize = utf.a(options, 1024, 1024);
                options.inJustDecodeBounds = false;
                Bitmap decodeStream = BitmapFactory.decodeStream(contentResolver.openInputStream(uri), null, options);
                String[] a2 = utf.a(utf.a(decodeStream.getWidth(), decodeStream.getHeight(), decodeStream), 0, decodeStream.getWidth(), decodeStream.getHeight());
                if (a2 != null && a2.length > 0) {
                    return a2[0];
                }
                throw new ScannablesException(1);
            }
        }).a(this.h).b(this.g);
        if (this.k) {
            this.m = b2.a(this.h).a(this.p, (xis<Throwable>) $$Lambda$utu$tizD5N9mKrMiWadzA1mTxxlned4.INSTANCE);
        } else {
            this.m = b2.d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$utu$un2vHuB5lG0Z8hR7d3i5nSWyEBA<Object,Object>(this)).e((xiy<? super T, ? extends R>) new $$Lambda$utu$GrlV4UqJRiSanarpOce4cRpNjQQ<Object,Object>("scannables/imagePicker")).a((xir) new $$Lambda$utu$w63IHBnXI4M0nDfH0yMwMASFuzk(this)).a(this.h).a(this.o);
        }
        this.n.a(this.m);
    }

    public final void a(Context context) {
        a((xis<SessionState>) new $$Lambda$utu$8Dtew88k9eFMElF5QRsFIF9gEY<SessionState>(this, context));
    }

    public final void a(String str) {
        uto uto = this.a;
        jlr jlr = uto.b;
        String str2 = "scannable";
        bd bdVar = r3;
        bd bdVar2 = new bd(null, uto.c, null, 0, 0, str, str2, null, (double) jtp.a.a());
        jlr.a(bdVar);
    }

    public final void a(utz utz) {
        this.b = new WeakReference<>(utz);
        this.n.a(this.m);
        this.n.a(this.l);
    }

    public final void a(xii<utp> xii) {
        xii xii2;
        this.l.unsubscribe();
        $$Lambda$utu$b1LeRQtO6rnEVvZwqeHqym9lssw r0 = new $$Lambda$utu$b1LeRQtO6rnEVvZwqeHqym9lssw(this);
        if (xii.getClass() == ScalarSynchronousObservable.class) {
            xii2 = ((ScalarSynchronousObservable) xii).k(r0);
        } else {
            xii e2 = xii.e((xiy<? super T, ? extends R>) r0);
            xii2 = e2.getClass() == ScalarSynchronousObservable.class ? ((ScalarSynchronousObservable) e2).k(Identity.INSTANCE) : e2.a((b<? extends R, ? super T>) OperatorMerge.a(false, 4));
        }
        xii e3 = xii2.i($$Lambda$ABi9LaFRgDG3h8KBDuFD9ZWyZJ0.INSTANCE).e((xiy<? super T, ? extends R>) $$Lambda$utu$mQtHSY58hqMxkJO0ojkIuDIX7Uo.INSTANCE);
        if (this.k) {
            this.l = e3.a(this.h).a(this.p, (xis<Throwable>) $$Lambda$utu$oJFhvnpWhrrUDUsAxSI1LNHZsU.INSTANCE);
        } else {
            this.l = e3.b((xis<? super T>) new $$Lambda$utu$iPWDvMArORiFFtCSu_rBBOXq9Q<Object>(this)).d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$utu$un2vHuB5lG0Z8hR7d3i5nSWyEBA<Object,Object>(this)).e((xiy<? super T, ? extends R>) new $$Lambda$utu$GrlV4UqJRiSanarpOce4cRpNjQQ<Object,Object>("scannables/scanner")).a(this.h).a(this.o);
        }
        this.n.a(this.l);
    }

    public final void b() {
        utz utz = (utz) this.b.get();
        if (utz != null) {
            uto uto = this.a;
            jlr jlr = uto.b;
            bd bdVar = r4;
            bd bdVar2 = new bd(null, uto.c, null, 0, 0, null, "photo-library", null, (double) jtp.a.a());
            jlr.a(bdVar);
            uto uto2 = this.a;
            jlr jlr2 = uto2.b;
            bf bfVar = r4;
            bf bfVar2 = new bf(null, uto2.c, null, 0, 0, null, "tap-photo-library-button", "navigate-forward", (double) jtp.a.a());
            jlr2.a(bfVar);
            utz.n();
        }
    }

    public final void b(Context context) {
        a((xis<SessionState>) new $$Lambda$utu$wEV8RJ4g0Mm4wuRMc6dauPqkwI<SessionState>(this, context));
    }

    public final void c() {
        uto uto = this.a;
        jlr jlr = uto.b;
        bf bfVar = r3;
        bf bfVar2 = new bf(null, uto.c, null, 0, 0, null, "tap-photo-library-cancel-button", "navigate-backward", (double) jtp.a.a());
        jlr.a(bfVar);
    }

    public final void d() {
        uto uto = this.a;
        jlr jlr = uto.b;
        bf bfVar = r3;
        bf bfVar2 = new bf(null, uto.c, null, 0, 0, null, "select-photo-library-photo", "select-photo", (double) jtp.a.a());
        jlr.a(bfVar);
    }
}
