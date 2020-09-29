package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences.Update;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.Update.Type;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: gtn reason: default package */
public final class gtn implements c {
    private final gtk a;
    private final gtp b;
    private final gts c;
    private final gtm d;
    private final CompositeDisposable e = new CompositeDisposable();

    public final String c() {
        return "CarViewEligibilityControllerPlugin";
    }

    public gtn(gtk gtk, gtp gtp, gts gts, gtm gtm) {
        this.a = gtk;
        this.b = gtp;
        this.c = gts;
        this.d = gtm;
    }

    public final void ai_() {
        this.e.a(this.b.b().a((Consumer<? super T>) new $$Lambda$gtn$jCEz00GJUgjvN6FM2MoQDraZfA<Object>(this), (Consumer<? super Throwable>) $$Lambda$gtn$cK_u5vujzTswsKxM7tJihPIonLg.INSTANCE));
        this.e.a(this.a.a.a((Consumer<? super T>) new $$Lambda$gtn$J_OXOMwZBpHNOv50tVUeWiRs4<Object>(this), (Consumer<? super Throwable>) $$Lambda$gtn$fmggz_QQflfs7cy9I_RKQtyyA68.INSTANCE));
        this.e.a(this.c.c().a((Consumer<? super T>) new $$Lambda$gtn$57YgbMPgp2qZ7XGwS99JShd4yuY<Object>(this), (Consumer<? super Throwable>) $$Lambda$gtn$3WCkCnwyJWAUoOEm4WxQ3eK64k.INSTANCE));
        this.e.a(this.c.d().a((Consumer<? super T>) new $$Lambda$gtn$eFzhSIfGJbRX2bgAr0xi8e1sc<Object>(this), (Consumer<? super Throwable>) $$Lambda$gtn$esgcQxv_XZuwseBDUo96QJNoSvY.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Boolean bool) {
        if (bool.booleanValue()) {
            this.c.b(false);
        }
        this.d.b = bool.booleanValue();
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
    public /* synthetic */ void a(Update update) {
        if (update.a != null && update.b == Type.CHANGED) {
            this.d.d = ((Boolean) update.a).booleanValue();
        }
    }

    public final void aj_() {
        this.e.c();
    }
}
