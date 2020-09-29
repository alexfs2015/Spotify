package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.otp.session.OtpExpirationHandler;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: gnl reason: default package */
public final class gnl<T extends Parcelable> implements com.spotify.libs.otp.session.OtpExpirationHandler.a {
    public final OtpExpirationHandler a = new OtpExpirationHandler(this);
    public Disposable b = Disposables.b();
    public gnm<T> c;
    private final Set<c> d = new HashSet();
    private final Scheduler e;
    private final b<T> f;

    /* renamed from: gnl$a */
    public static class a {
        public final String a;
        public final int b;
        public final int c;

        public a(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }
    }

    /* renamed from: gnl$b */
    public interface b<T> {
        Single<a> a(T t);

        Single<a> ax_();
    }

    /* renamed from: gnl$c */
    public interface c {
        void a();

        void a(a aVar);

        void a(Throwable th);
    }

    public gnl(Scheduler scheduler, b<T> bVar) {
        this.e = (Scheduler) fbp.a(scheduler);
        this.f = (b) fbp.a(bVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Parcelable parcelable, long j, a aVar) {
        fbp.b(!b());
        long millis = TimeUnit.SECONDS.toMillis((long) aVar.c) + j;
        if (SystemClock.uptimeMillis() < millis) {
            gnm gnm = new gnm(parcelable, j, millis, aVar.b, aVar.a);
            this.c = gnm;
            for (c a2 : new ArrayList(this.d)) {
                a2.a(aVar);
            }
            this.a.a(j, millis);
            return;
        }
        h();
    }

    private void a(T t, Single<a> single) {
        fbp.a(t);
        fbp.b(!b());
        this.b = single.a(this.e).a((Consumer<? super T>) new $$Lambda$gnl$kz4kT1A8Kczzb8hynyTmVl0eIoc<Object>(this, t, SystemClock.uptimeMillis()), (Consumer<? super Throwable>) new $$Lambda$gnl$l78q43gUbKhPDZt2r_B2aw9NuY<Object>(this));
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        Logger.e(th, "OtpSession: request error", new Object[0]);
        fbp.b(!b());
        for (c a2 : new ArrayList(this.d)) {
            a2.a(th);
        }
    }

    private void b(float f2) {
        Iterator it = new ArrayList(this.d).iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void h() {
        for (c a2 : new ArrayList(this.d)) {
            a2.a();
        }
    }

    public final void a() {
        this.c = null;
        b(0.0f);
        h();
    }

    public final void a(float f2) {
        b(f2);
    }

    public final void a(Bundle bundle) {
        gnm<T> gnm = null;
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("handle");
            if (parcelable != null) {
                long j = bundle.getLong("request-uptime-millis");
                long j2 = bundle.getLong("expiration-uptime-millis");
                int i = bundle.getInt("code-length");
                String string = bundle.getString("canonical-phone-number");
                boolean z = true;
                fbp.b(j > 0);
                fbp.b(j2 >= j);
                if (i <= 0) {
                    z = false;
                }
                fbp.b(z);
                fbp.a(string);
                gnm<T> gnm2 = new gnm<>(parcelable, j, j2, i, string);
                gnm = gnm2;
            }
        }
        this.c = gnm;
    }

    public final void a(T t) {
        a(t, this.f.a(t));
    }

    public final void a(c cVar) {
        fbp.b(!this.d.contains(cVar));
        this.d.add(cVar);
    }

    public final void b(c cVar) {
        fbp.b(this.d.contains(cVar));
        this.d.remove(cVar);
    }

    public final boolean b() {
        return this.c != null;
    }

    public final void c() {
        this.a.a();
        this.c = null;
        this.b.bd_();
    }

    public final int d() {
        fbp.a(this.c);
        return this.c.d;
    }

    public final T e() {
        fbp.a(this.c);
        return this.c.a;
    }

    public final String f() {
        fbp.a(this.c);
        return this.c.e;
    }

    public final void g() {
        fbp.a(this.c);
        Parcelable e2 = e();
        c();
        a(e2, this.f.ax_());
    }
}
