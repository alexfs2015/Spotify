package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.comscore.util.crashreport.CrashReportManager;
import com.spotify.music.R;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* renamed from: miy reason: default package */
public final class miy {
    public final CompositeDisposable a = new CompositeDisposable();
    private final miz b;
    private final uxh c;
    private final ToastieManager d;
    private final Context e;

    public miy(miz miz, uxh uxh, ToastieManager toastieManager, Context context) {
        this.b = miz;
        this.c = uxh;
        this.d = toastieManager;
        this.e = context;
    }

    public final void a(String str) {
        this.a.a(this.b.a(jst.a(str).f()).a(12000, TimeUnit.MILLISECONDS).a((Consumer<? super T>) new $$Lambda$miy$4L9M2P4rjnDOspKyBG9zQC82K0E<Object>(this, str), (Consumer<? super Throwable>) new $$Lambda$miy$U6zXkxvyiokYCvuIuamUk9opjLo<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, wsj wsj) {
        if (wsj.a()) {
            this.a.a(this.c.a(str).a((Action) new $$Lambda$miy$akTLLqKe_uVPpguLGN236yhXBEw(this), (Consumer<? super Throwable>) new $$Lambda$miy$4lj1wPsitEDWljOILsufTv3etA<Object>(this)));
        } else {
            b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        b();
    }

    /* access modifiers changed from: private */
    public void a() {
        new Handler(Looper.getMainLooper()).post(new $$Lambda$miy$OII126dQoKSw554uvg7P8GOwly0(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.d.a(uos.a(this.e.getString(R.string.refresh_success), CrashReportManager.TIME_WINDOW).c(R.color.cat_white).b(R.color.cat_black).a());
    }

    private void b() {
        new Handler(Looper.getMainLooper()).post(new $$Lambda$miy$RcyN6WBGsdeM04r8uIhq5_JkKXM(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.d.a(uos.a(this.e.getString(R.string.refresh_error), CrashReportManager.TIME_WINDOW).c(R.color.cat_white).b(R.color.cat_black).a());
    }
}
