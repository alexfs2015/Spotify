package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.loginflow.LoginActivity;
import com.spotify.music.R;
import com.spotify.music.spotlets.tracker.identifier.ErrorTypeIdentifier;
import com.spotify.music.spotlets.tracker.identifier.EventIdentifier;
import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;

/* renamed from: hiz reason: default package */
public final class hiz implements goy {
    LoginActivity a;
    final uun b;
    private final gox c;
    private final hgy d;
    private final hgz e;
    private final qqf f;
    private final uix g;
    private final rqb h;
    private final gpn i;
    private final SerialDisposable j = new SerialDisposable();

    public hiz(Activity activity, gox gox, hgy hgy, hgz hgz, uun uun, qqf qqf, uix uix, rqb rqb, gpn gpn) {
        this.d = hgy;
        this.e = hgz;
        this.f = qqf;
        this.g = uix;
        this.h = rqb;
        this.i = gpn;
        this.b = uun;
        try {
            this.a = (LoginActivity) activity;
        } catch (ClassCastException unused) {
            Logger.e("The activity need to extent the FlowActivity", new Object[0]);
        }
        this.c = gox;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Context context, Intent intent) {
        if (intent == null) {
            intent = this.c.a(context);
        }
        intent.setExtrasClassLoader(this.a.getClassLoader());
        intent.putExtra("just_logged_in", true);
        context.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fqn fqn) {
        if (fqn.b(lcl.a)) {
            this.a.a((jrd) hnn.a(fqn));
        } else {
            f();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r1 == false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void a(defpackage.ho r6) {
        /*
            r5 = this;
            F r0 = r6.a
            java.lang.Object r0 = defpackage.fbp.a(r0)
            fqn r0 = (defpackage.fqn) r0
            S r6 = r6.b
            java.lang.Object r6 = defpackage.fbp.a(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            qqf r1 = r5.f
            java.lang.String r1 = r1.a()
            boolean r1 = defpackage.fbo.a(r1)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0038
            if (r0 == 0) goto L_0x0034
            fqu r1 = defpackage.qug.a
            java.io.Serializable r1 = r0.a(r1)
            java.lang.String r4 = "enabled"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0034
            r1 = 1
            goto L_0x0035
        L_0x0034:
            r1 = 0
        L_0x0035:
            if (r1 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r2 = 0
        L_0x0039:
            if (r2 != 0) goto L_0x0063
            fqk r1 = defpackage.lcl.b
            boolean r1 = r0.b(r1)
            if (r1 == 0) goto L_0x0044
            goto L_0x0063
        L_0x0044:
            rqb r1 = r5.h
            boolean r1 = r1.a(r0)
            if (r1 != 0) goto L_0x0059
            boolean r1 = defpackage.uix.a(r0)
            if (r1 != 0) goto L_0x0059
            if (r6 == 0) goto L_0x0055
            goto L_0x0059
        L_0x0055:
            r5.d()
            return
        L_0x0059:
            com.spotify.loginflow.LoginActivity r6 = r5.a
            hnv r0 = defpackage.hnv.a(r0)
            r6.a(r0)
            return
        L_0x0063:
            r5.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hiz.a(ho):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        d();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        f();
    }

    public final void a() {
        this.a.a((jrd) ojo.e());
    }

    public final void a(Bundle bundle) {
        this.a.a((jrd) lpp.a(bundle), false);
    }

    public final void a(String str) {
        if (fbo.a(str)) {
            this.a.a((jrd) nxr.c());
        } else {
            this.a.a((jrd) nxr.b(str));
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.a.a((jrd) ojp.c(), false);
        } else {
            this.a.a((jrd) nye.c(), false);
        }
    }

    public final void b() {
        this.a.a((jrd) ojn.c());
    }

    public final void b(final String str) {
        if (TextUtils.isEmpty(str)) {
            this.a.a((jrd) gpf.a(str, false, (String) null));
        } else {
            this.i.a(str, new a() {
                public final void a() {
                    hiz.this.b.a(ScreenIdentifier.LOGIN, ErrorTypeIdentifier.RATE_LIMIT, InputFieldIdentifier.NONE);
                    hiz.this.a.a((jrd) gpf.a(str, true, (String) null));
                }

                public final void a(int i) {
                    if (i == 400) {
                        hiz.this.b.a(ScreenIdentifier.LOGIN, EventIdentifier.MAGICLINK_REQUEST_BAD_EMAIL_PREFILLED);
                    } else {
                        hiz.this.b.a(ScreenIdentifier.LOGIN, ErrorTypeIdentifier.GENERIC, InputFieldIdentifier.NONE, String.valueOf(i));
                    }
                    hiz.this.a.a((jrd) gpf.a(str, false, hiz.this.a.getString(R.string.magiclink_error_request_generic)));
                }

                public final void b() {
                    hiz.this.b.a(ScreenIdentifier.LOGIN, ErrorTypeIdentifier.NO_CONNECTION, InputFieldIdentifier.NONE);
                    hiz.this.a.a((jrd) gpf.a(str, false, hiz.this.a.getString(R.string.magiclink_error_request_generic)));
                }

                public final void c() {
                    hiz.this.b.a(ScreenIdentifier.LOGIN, ErrorTypeIdentifier.RATE_LIMIT, InputFieldIdentifier.NONE);
                    hiz.this.a.a((jrd) gpf.a(str, false, hiz.this.a.getString(R.string.magiclink_error_request_limited)));
                }

                public final void d() {
                    hiz.this.b.a(ScreenIdentifier.LOGIN, EventIdentifier.MAGICLINK_REQUEST_USER_NOT_FOUND_PREFILLED);
                    hiz.this.a.a((jrd) gpf.a(str, false, hiz.this.a.getString(R.string.magiclink_error_request_user_not_found)));
                }
            });
        }
    }

    public final void c() {
        this.a.a((jrd) lpy.ae());
    }

    public final void d() {
        LoginActivity loginActivity = this.a;
        $$Lambda$hiz$NvxYOmsGUMPnERJ5QjRYnp2vlEU r1 = new $$Lambda$hiz$NvxYOmsGUMPnERJ5QjRYnp2vlEU(this);
        if (loginActivity.isFinishing()) {
            Logger.d("Already finishing.", new Object[0]);
            return;
        }
        loginActivity.setResult(-1);
        if (r1 != null) {
            Intent intent = loginActivity.getIntent();
            fbp.a(intent);
            r1.onFlowFinish(loginActivity, (Intent) intent.getParcelableExtra("intent"));
        }
        loginActivity.finish();
    }

    public final void e() {
        this.j.a(this.d.a().a(AndroidSchedulers.a()).c(1).a((Consumer<? super T>) new $$Lambda$hiz$WPqrYYGGGbU38soy1Fdo4xOY8E<Object>(this), (Consumer<? super Throwable>) new $$Lambda$hiz$UJ5dERLZsX7DYDQ4PaM3YhMBivg<Object>(this)));
    }

    public final void f() {
        this.j.a(Observable.a((ObservableSource<? extends T1>) this.d.a().j(), (ObservableSource<? extends T2>) wit.b(uix.b(this.e)), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$obUZQ5sN8zzBjfQOSJUmTgjodA.INSTANCE).a(AndroidSchedulers.a()).c(1).a((Consumer<? super T>) new $$Lambda$hiz$gNAz1Ytb56DtuXta9qGpbdTjHU8<Object>(this), (Consumer<? super Throwable>) new $$Lambda$hiz$3D7YMCRWEjkHzXUaHrZOyBFcczE<Object>(this)));
    }

    public final void g() {
        this.a.k();
    }
}
