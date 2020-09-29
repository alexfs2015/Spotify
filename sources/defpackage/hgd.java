package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.loginflow.LoginActivity;
import com.spotify.loginflow.LoginActivity.a;
import com.spotify.music.R;
import com.spotify.music.spotlets.tracker.identifier.ErrorTypeIdentifier;
import com.spotify.music.spotlets.tracker.identifier.EventIdentifier;
import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function3;

/* renamed from: hgd reason: default package */
public final class hgd implements gnj {
    LoginActivity a;
    final ujc b;
    private final gni c;
    private final hec d;
    private final hed e;
    private final rrg f;
    private final qhr g;
    private final twu h;
    private final rgz i;
    private final gny j;
    private final SerialDisposable k = new SerialDisposable();

    public hgd(Activity activity, gni gni, hec hec, rrg rrg, hed hed, ujc ujc, qhr qhr, twu twu, rgz rgz, gny gny) {
        this.d = hec;
        this.e = hed;
        this.f = rrg;
        this.g = qhr;
        this.h = twu;
        this.i = rgz;
        this.j = gny;
        this.b = ujc;
        try {
            this.a = (LoginActivity) activity;
        } catch (ClassCastException unused) {
            Logger.e("The activity need to extent the FlowActivity", new Object[0]);
        }
        this.c = gni;
    }

    public final void a(boolean z) {
        if (z) {
            this.a.a((jor) ocj.c(), false);
        } else {
            this.a.a((jor) nsb.c(), false);
        }
    }

    public final void a() {
        this.a.a((jor) oci.c());
    }

    public final void b() {
        this.a.a((jor) och.c());
    }

    public final void c() {
        this.a.a((jor) lly.ae());
    }

    public final void a(Bundle bundle) {
        this.a.a((jor) llp.a(bundle), false);
    }

    public final void b(final String str) {
        if (TextUtils.isEmpty(str)) {
            this.a.a((jor) gnq.a(str, false, (String) null));
        } else {
            this.j.a(str, new a() {
                public final void b() {
                    hgd.this.b.a(ScreenIdentifier.LOGIN, ErrorTypeIdentifier.NO_CONNECTION, InputFieldIdentifier.NONE);
                    hgd.this.a.a((jor) gnq.a(str, false, hgd.this.a.getString(R.string.magiclink_error_request_generic)));
                }

                public final void a() {
                    hgd.this.b.a(ScreenIdentifier.LOGIN, ErrorTypeIdentifier.RATE_LIMIT, InputFieldIdentifier.NONE);
                    hgd.this.a.a((jor) gnq.a(str, true, (String) null));
                }

                public final void c() {
                    hgd.this.b.a(ScreenIdentifier.LOGIN, ErrorTypeIdentifier.RATE_LIMIT, InputFieldIdentifier.NONE);
                    hgd.this.a.a((jor) gnq.a(str, false, hgd.this.a.getString(R.string.magiclink_error_request_limited)));
                }

                public final void d() {
                    hgd.this.b.a(ScreenIdentifier.LOGIN, EventIdentifier.MAGICLINK_REQUEST_USER_NOT_FOUND_PREFILLED);
                    hgd.this.a.a((jor) gnq.a(str, false, hgd.this.a.getString(R.string.magiclink_error_request_user_not_found)));
                }

                public final void a(int i) {
                    if (i == 400) {
                        hgd.this.b.a(ScreenIdentifier.LOGIN, EventIdentifier.MAGICLINK_REQUEST_BAD_EMAIL_PREFILLED);
                    } else {
                        hgd.this.b.a(ScreenIdentifier.LOGIN, ErrorTypeIdentifier.GENERIC, InputFieldIdentifier.NONE, String.valueOf(i));
                    }
                    hgd.this.a.a((jor) gnq.a(str, false, hgd.this.a.getString(R.string.magiclink_error_request_generic)));
                }
            });
        }
    }

    public final void d() {
        this.a.a(-1, (a) new $$Lambda$hgd$529Z4MtSd802klQ9vClnbIr3nMw(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Context context, Intent intent) {
        if (intent == null) {
            intent = this.c.a(context);
        }
        intent.setExtrasClassLoader(this.a.getClassLoader());
        intent.putExtra("just_logged_in", true);
        context.startActivity(intent);
    }

    public final void e() {
        this.a.a(-1, (a) new $$Lambda$hgd$Y3DJlXF0wdHDhRkHTiV_KbgxE8w(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Context context, Intent intent) {
        Intent b2 = this.c.b(context);
        b2.setExtrasClassLoader(this.a.getClassLoader());
        b2.putExtra("just_logged_in", true);
        context.startActivity(b2);
    }

    public final void f() {
        this.k.a(this.d.a().a(AndroidSchedulers.a()).c(1).a((Consumer<? super T>) new $$Lambda$hgd$dZTdswSlquMuDcFeJKSAXd_9axE<Object>(this), (Consumer<? super Throwable>) new $$Lambda$hgd$DNnCeDXdsD9XR3XAVeqyKEiqtn0<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fpt fpt) {
        if (fpt.b(kzc.a)) {
            this.a.a((jor) hkv.a(fpt));
        } else {
            g();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        g();
    }

    public final void g() {
        Observable b2 = this.f.b();
        this.k.a(Observable.a((ObservableSource<? extends T1>) this.d.a().j(), (ObservableSource<? extends T2>) b2, (ObservableSource<? extends T3>) vun.b(twu.b(this.e)), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$oHCgMOj8GCh4JgoTCtIVCq6xD_8.INSTANCE).a(AndroidSchedulers.a()).c(1).a((Consumer<? super T>) new $$Lambda$hgd$RCPhhpPHGnVaqXeW6VtUpzWJnpg<Object>(this), (Consumer<? super Throwable>) new $$Lambda$hgd$WoycQOzP2IRCObvOx9_rRoYKtdA<Object>(this)));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0039, code lost:
        if (r2 == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void a(org.apache.commons.lang3.tuple.ImmutableTriple r7) {
        /*
            r6 = this;
            L r0 = r7.left
            fpt r0 = (defpackage.fpt) r0
            R r1 = r7.right
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            M r7 = r7.middle
            java.lang.Object r7 = defpackage.fay.a(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            qhr r2 = r6.g
            java.lang.String r2 = r2.a()
            boolean r2 = defpackage.fax.a(r2)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x003c
            if (r0 == 0) goto L_0x0038
            fqa r2 = defpackage.qlx.a
            java.io.Serializable r2 = r0.a(r2)
            java.lang.String r5 = "enabled"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0038
            r2 = 1
            goto L_0x0039
        L_0x0038:
            r2 = 0
        L_0x0039:
            if (r2 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r3 = 0
        L_0x003d:
            if (r3 != 0) goto L_0x006d
            fpq r2 = defpackage.kzc.b
            boolean r2 = r0.b(r2)
            if (r2 == 0) goto L_0x0048
            goto L_0x006d
        L_0x0048:
            if (r7 == 0) goto L_0x004e
            r6.e()
            return
        L_0x004e:
            rgz r7 = r6.i
            boolean r7 = r7.a(r0)
            if (r7 != 0) goto L_0x0063
            boolean r7 = defpackage.twu.a(r0)
            if (r7 != 0) goto L_0x0063
            if (r1 == 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            r6.d()
            return
        L_0x0063:
            com.spotify.loginflow.LoginActivity r7 = r6.a
            hld r0 = defpackage.hld.a(r0)
            r7.a(r0)
            return
        L_0x006d:
            r6.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgd.a(org.apache.commons.lang3.tuple.ImmutableTriple):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        d();
    }

    public final void h() {
        this.a.k();
    }

    public final void a(String str) {
        if (fax.a(str)) {
            this.a.a((jor) nro.c());
        } else {
            this.a.a((jor) nro.b(str));
        }
    }
}
