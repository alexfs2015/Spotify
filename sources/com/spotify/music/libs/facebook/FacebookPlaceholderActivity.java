package com.spotify.music.libs.facebook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.CallbackManagerImpl;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.music.R;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.Collection;
import java.util.List;

public class FacebookPlaceholderActivity extends lbm {
    public saf g;
    public jvf h;
    public sal i;
    public hha j;
    aki k;
    private final SerialDisposable l = new SerialDisposable();
    private final SerialDisposable m = new SerialDisposable();
    private final SerialDisposable n = new SerialDisposable();
    private akm o;
    /* access modifiers changed from: private */
    public boolean p;

    /* access modifiers changed from: private */
    public void a(aki aki) {
        this.l.a(this.i.b().a(AndroidSchedulers.a()).a((Consumer<? super T>) new Consumer(aki) {
            private final /* synthetic */ aki f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                FacebookPlaceholderActivity.this.a(this.f$1, (SocialState) obj);
            }
        }, (Consumer<? super Throwable>) $$Lambda$FacebookPlaceholderActivity$bARcyVW7uYF9GuBrysBcXa0k8.INSTANCE));
        this.m.a(this.i.b(aki.e).a((Action) $$Lambda$FacebookPlaceholderActivity$rhBpNaTntaIPqJtvPdQhsZDmPts.INSTANCE, (Consumer<? super Throwable>) $$Lambda$FacebookPlaceholderActivity$Z2VrShfaCyXWMOqMNCTGd1dzaCg.INSTANCE));
        this.j.a("post-open-graph", saf.a((List<String>) saf.c) ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(aki aki, SocialState socialState) {
        if (socialState.enabled()) {
            Intent intent = getIntent();
            intent.putExtra("extraGrantedScopes", fbl.a(',').a((Iterable<?>) aki.b));
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(SocialEvent socialEvent) {
        setResult(0);
        finish();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(SocialEvent socialEvent) {
        return socialEvent.socialError() == SocialError.SERVICE_CONNECT_NOT_PERMITTED;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        Logger.e(th, "Failed to subscribe to social events", new Object[0]);
        this.h.a((int) R.string.toast_generic_facebook_error, 1, new Object[0]);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void k() {
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.FACEBOOK_CONNECT, null);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        this.o.a(i2, i3, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final any a = this.g.a();
        if (bundle == null) {
            a.c();
        }
        final boolean booleanExtra = getIntent().getBooleanExtra("extraAskForPublishActions", false);
        this.o = new CallbackManagerImpl();
        a.a(this.o, (ako<aoa>) new ako<aoa>() {
            public final void a() {
                aki a2 = aki.a();
                if (!saf.a((List<String>) saf.a) || a2.d()) {
                    FacebookPlaceholderActivity.this.setResult(0);
                    FacebookPlaceholderActivity.this.finish();
                    return;
                }
                FacebookPlaceholderActivity.this.k = a2;
            }

            public final void a(FacebookException facebookException) {
                FacebookPlaceholderActivity.this.h.a((int) R.string.toast_generic_facebook_error, 1, new Object[0]);
                FacebookPlaceholderActivity.this.setResult(0);
                FacebookPlaceholderActivity.this.finish();
            }

            public final /* synthetic */ void a(Object obj) {
                aoa aoa = (aoa) obj;
                aki a2 = aki.a();
                if (!booleanExtra || aoa.a.contains("publish_actions")) {
                    if (!a2.d()) {
                        FacebookPlaceholderActivity facebookPlaceholderActivity = FacebookPlaceholderActivity.this;
                        facebookPlaceholderActivity.k = a2;
                        if (facebookPlaceholderActivity.p) {
                            FacebookPlaceholderActivity facebookPlaceholderActivity2 = FacebookPlaceholderActivity.this;
                            facebookPlaceholderActivity2.a(facebookPlaceholderActivity2.k);
                            return;
                        }
                    } else {
                        FacebookPlaceholderActivity.this.setResult(0);
                        FacebookPlaceholderActivity.this.finish();
                    }
                    return;
                }
                a.b((Activity) FacebookPlaceholderActivity.this, (Collection<String>) saf.c);
            }
        });
        a.a((Activity) this, (Collection<String>) saf.b);
    }

    public void onPause() {
        super.onPause();
        this.p = false;
        this.l.a(Disposables.a());
        this.m.a(Disposables.a());
        this.n.a(Disposables.a());
    }

    public void onResume() {
        super.onResume();
        this.p = true;
        this.n.a(this.i.a().a((Predicate<? super T>) $$Lambda$FacebookPlaceholderActivity$3X7Y4uyQxF_XiwFj5OHhU3itEdk.INSTANCE).a(AndroidSchedulers.a()).a((Consumer<? super T>) new Consumer() {
            public final void accept(Object obj) {
                FacebookPlaceholderActivity.this.a((SocialEvent) obj);
            }
        }, (Consumer<? super Throwable>) new Consumer() {
            public final void accept(Object obj) {
                FacebookPlaceholderActivity.this.c((Throwable) obj);
            }
        }));
        aki aki = this.k;
        if (aki != null) {
            a(aki);
            this.k = null;
        }
    }
}
