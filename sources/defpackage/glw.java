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

/* renamed from: glw reason: default package */
public final class glw<T extends Parcelable> implements com.spotify.libs.otp.session.OtpExpirationHandler.a {
    public final OtpExpirationHandler a = new OtpExpirationHandler(this);
    public Disposable b = Disposables.b();
    public glx<T> c;
    private final Set<c> d = new HashSet();
    private final Scheduler e;
    private final b<T> f;

    /* renamed from: glw$a */
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

    /* renamed from: glw$b */
    public interface b<T> {
        Single<a> a(T t);

        Single<a> ay_();
    }

    /* renamed from: glw$c */
    public interface c {
        void a();

        void a(a aVar);

        void a(Throwable th);
    }

    public glw(Scheduler scheduler, b<T> bVar) {
        this.e = (Scheduler) fay.a(scheduler);
        this.f = (b) fay.a(bVar);
    }

    public final void a(c cVar) {
        fay.b(!this.d.contains(cVar));
        this.d.add(cVar);
    }

    public final void b(c cVar) {
        fay.b(this.d.contains(cVar));
        this.d.remove(cVar);
    }

    public final boolean b() {
        return this.c != null;
    }

    public final void c() {
        this.a.a();
        this.c = null;
        this.b.bf_();
    }

    public final int d() {
        fay.a(this.c);
        return this.c.d;
    }

    public final T e() {
        fay.a(this.c);
        return this.c.a;
    }

    public final String f() {
        fay.a(this.c);
        return this.c.e;
    }

    public final void g() {
        fay.a(this.c);
        Parcelable e2 = e();
        c();
        a(e2, this.f.ay_());
    }

    public final void a(T t) {
        a(t, this.f.a(t));
    }

    private void a(T t, Single<a> single) {
        fay.a(t);
        fay.b(!b());
        this.b = single.a(this.e).a((Consumer<? super T>) new $$Lambda$glw$oJxMpzvdXVH89cbCBWRqwyWsw2w<Object>(this, t, SystemClock.uptimeMillis()), (Consumer<? super Throwable>) new $$Lambda$glw$mJYnbleJASDg_i9xxdvoF3uE8SQ<Object>(this));
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        Logger.e(th, "OtpSession: request error", new Object[0]);
        fay.b(!b());
        for (c a2 : new ArrayList(this.d)) {
            a2.a(th);
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

    public final void a(Bundle bundle) {
        glx<T> glx = null;
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("handle");
            if (parcelable != null) {
                long j = bundle.getLong("request-uptime-millis");
                long j2 = bundle.getLong("expiration-uptime-millis");
                int i = bundle.getInt("code-length");
                String string = bundle.getString("canonical-phone-number");
                boolean z = true;
                fay.b(j > 0);
                fay.b(j2 >= j);
                if (i <= 0) {
                    z = false;
                }
                fay.b(z);
                fay.a(string);
                glx<T> glx2 = new glx<>(parcelable, j, j2, i, string);
                glx = glx2;
            }
        }
        this.c = glx;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Parcelable parcelable, long j, a aVar) {
        fay.b(!b());
        long millis = TimeUnit.SECONDS.toMillis((long) aVar.c) + j;
        if (SystemClock.uptimeMillis() < millis) {
            glx glx = new glx(parcelable, j, millis, aVar.b, aVar.a);
            this.c = glx;
            for (c a2 : new ArrayList(this.d)) {
                a2.a(aVar);
            }
            this.a.a(j, millis);
            return;
        }
        h();
    }
}
