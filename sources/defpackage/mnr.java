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

/* renamed from: mnr reason: default package */
public final class mnr {
    public final CompositeDisposable a = new CompositeDisposable();
    private final mns b;
    private final vjj c;
    private final ToastieManager d;
    private final Context e;

    public mnr(mns mns, vjj vjj, ToastieManager toastieManager, Context context) {
        this.b = mns;
        this.c = vjj;
        this.d = toastieManager;
        this.e = context;
    }

    /* access modifiers changed from: private */
    public void a() {
        new Handler(Looper.getMainLooper()).post(new $$Lambda$mnr$igT9JfJ2aYZSQbuIaPq31IiLcCU(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, xgo xgo) {
        if (xgo.a()) {
            this.a.a(this.c.a(str).a((Action) new $$Lambda$mnr$wMEFOUKo7tXD04J5U7RhgAv8_Y(this), (Consumer<? super Throwable>) new $$Lambda$mnr$UuXpCJBQ8VejGucFZx8PHw0oAc<Object>(this)));
        } else {
            b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        b();
    }

    private void b() {
        new Handler(Looper.getMainLooper()).post(new $$Lambda$mnr$fxm4adagTMykwHrOeXfIVpp9kqQ(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.d.a(uzy.a(this.e.getString(R.string.refresh_error), CrashReportManager.TIME_WINDOW).c(R.color.cat_white).b(R.color.cat_black).a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.d.a(uzy.a(this.e.getString(R.string.refresh_success), CrashReportManager.TIME_WINDOW).c(R.color.cat_white).b(R.color.cat_black).a());
    }

    public final void a(String str) {
        this.a.a(this.b.a(jva.a(str).f()).a(12000, TimeUnit.MILLISECONDS).a((Consumer<? super T>) new $$Lambda$mnr$H_RFxc7HsTkeJrXvXk1rMo4r0ZM<Object>(this, str), (Consumer<? super Throwable>) new $$Lambda$mnr$j2UeHXXdhv35CwqKlb_8OK_Qo0<Object>(this)));
    }
}
