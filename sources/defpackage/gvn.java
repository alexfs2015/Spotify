package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences.Update;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.Update.Type;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: gvn reason: default package */
public final class gvn implements c {
    private final gvk a;
    private final gvp b;
    private final gvs c;
    private final gvm d;
    private final CompositeDisposable e = new CompositeDisposable();

    public gvn(gvk gvk, gvp gvp, gvs gvs, gvm gvm) {
        this.a = gvk;
        this.b = gvp;
        this.c = gvs;
        this.d = gvm;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Update update) {
        if (update.a != null && update.b == Type.CHANGED) {
            this.d.d = ((Boolean) update.a).booleanValue();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        if (!Boolean.TRUE.equals(bool) || bool.booleanValue() != this.d.a) {
            if (bool.booleanValue()) {
                this.b.a(false);
            }
            this.d.a = bool.booleanValue();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Update update) {
        if (update.a != null && update.b == Type.CHANGED) {
            boolean booleanValue = ((Boolean) update.a).booleanValue();
            this.d.c = booleanValue;
            if (booleanValue) {
                this.b.a(false);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Boolean bool) {
        if (bool.booleanValue()) {
            this.c.b(false);
        }
        this.d.b = bool.booleanValue();
    }

    public final void ai_() {
        this.e.a(this.b.b().a((Consumer<? super T>) new $$Lambda$gvn$6gEJyawSzYYRS1O1awRbedlfLE<Object>(this), (Consumer<? super Throwable>) $$Lambda$gvn$0o6B3KRbfFiM3A8pH8Vv8RpZWk.INSTANCE));
        this.e.a(this.a.a.a((Consumer<? super T>) new $$Lambda$gvn$x80SbsYjoXMRBFCsrA2SiEFGk<Object>(this), (Consumer<? super Throwable>) $$Lambda$gvn$sG0ppj5rwPlPZWsf6kkk0yMqi9M.INSTANCE));
        this.e.a(this.c.c().a((Consumer<? super T>) new $$Lambda$gvn$Onw9NbRWhyXMot7R2_VtgGUQEA<Object>(this), (Consumer<? super Throwable>) $$Lambda$gvn$LDAZNACMq484Ecw5wnt_cD3I4CA.INSTANCE));
        this.e.a(this.c.d().a((Consumer<? super T>) new $$Lambda$gvn$Yqv_vZLC_ohLOQyZRkmPMQDqwNA<Object>(this), (Consumer<? super Throwable>) $$Lambda$gvn$mKTNxIDluaZA63_36clQOQxqiiE.INSTANCE));
    }

    public final void aj_() {
        this.e.c();
    }

    public final String c() {
        return "CarViewEligibilityControllerPlugin";
    }
}
