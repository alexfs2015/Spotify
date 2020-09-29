package com.spotify.magiclink;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.login.AlreadyLoggedInException;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.ui.Lifecycle.Listeners;
import com.spotify.mobile.android.util.ui.Lifecycle.Listeners.Event;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.b;
import com.spotify.music.R;
import io.reactivex.Scheduler;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;

public class MagicLinkActivity extends q implements a, b {
    public got g;
    public Scheduler h;
    public gpk i;
    public gpv j;
    public gpg k;
    private final Listeners l = new Listeners();
    private String m;
    private String n;
    private String o;
    /* access modifiers changed from: private */
    public Disposable p = Disposables.b();

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.j.a(gpp.a(new c(), new a(), new b()));
        k();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i2) {
        this.j.a(gpp.a(new c(), new b(), new b()));
        k();
    }

    static /* synthetic */ void a(MagicLinkActivity magicLinkActivity, int i2) {
        magicLinkActivity.j.a(gpp.a((gpw) new c(), (gpt) new b()));
        magicLinkActivity.j.a(gpp.a(new c(), new b(), new b(), String.valueOf(i2)));
        if (i2 == 408) {
            magicLinkActivity.j.a(gpp.a((gpw) new c(), (gpr) new a()));
            ftl a = fts.a(magicLinkActivity, magicLinkActivity.getString(R.string.magiclink_error_dialog_region_mismatch_title), magicLinkActivity.getString(R.string.magiclink_error_dialog_region_mismatch_body)).a(magicLinkActivity.getString(R.string.magiclink_error_dialog_region_mismatch_cta), new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    MagicLinkActivity.this.c(dialogInterface, i);
                }
            });
            a.f = new OnCancelListener() {
                public final void onCancel(DialogInterface dialogInterface) {
                    MagicLinkActivity.this.b(dialogInterface);
                }
            };
            a.a().a();
            return;
        }
        magicLinkActivity.j();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface) {
        this.j.a(gpp.a(new c(), new a(), new a()));
        k();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface, int i2) {
        this.j.a(gpp.a(new c(), new j(), new b()));
        this.k.a(this, this.m, true);
    }

    static /* synthetic */ void b(MagicLinkActivity magicLinkActivity) {
        magicLinkActivity.j.a(gpp.a((gpw) new c(), (gpt) new a()));
        magicLinkActivity.k();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(DialogInterface dialogInterface, int i2) {
        this.j.a(gpp.a(new c(), new d(), new a()));
        k();
    }

    static /* synthetic */ void c(MagicLinkActivity magicLinkActivity) {
        magicLinkActivity.j.a(new a(new c()));
        magicLinkActivity.j.a(gpp.a((gpw) new c(), (gpt) new c()));
        gpk gpk = magicLinkActivity.i;
        String str = magicLinkActivity.o;
        SpSharedPreferences.a a = gpk.c.a();
        a.a(gpk.a, true);
        if (TextUtils.isEmpty(str)) {
            a.a(gpk.b);
        } else {
            a.a(gpk.b, str);
        }
        a.a();
        magicLinkActivity.k();
    }

    private void j() {
        this.j.a(gpp.a((gpw) new c(), (gpr) new b()));
        ftl b = fts.a(this, getString(R.string.magiclink_error_dialog_text_link_expired)).a(getString(R.string.magiclink_error_dialog_button_send_new_link), new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                MagicLinkActivity.this.b(dialogInterface, i);
            }
        }).b(getString(R.string.magiclink_error_dialog_close), new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                MagicLinkActivity.this.a(dialogInterface, i);
            }
        });
        b.f = new OnCancelListener() {
            public final void onCancel(DialogInterface dialogInterface) {
                MagicLinkActivity.this.a(dialogInterface);
            }
        };
        b.a().a();
    }

    private void k() {
        this.k.a(this);
    }

    public final boolean a(b bVar) {
        return this.l.a((b) fbp.a(bVar));
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.SIGNUP, null);
    }

    public final boolean b(b bVar) {
        return this.l.b((b) fbp.a(bVar));
    }

    public void onCreate(Bundle bundle) {
        setTheme(2132017731);
        whp.a((Activity) this);
        gar.a(this);
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_magiclink);
        if (bundle == null) {
            this.j.a(gpp.a(new c()));
        }
        Uri parse = Uri.parse(fbo.b(getIntent().getDataString()));
        this.m = parse.getQueryParameter("username");
        this.o = parse.getQueryParameter("t");
        this.n = parse.getFragment();
        if (fbo.a(this.m) || fbo.a(this.n)) {
            this.j.a(gpp.a((gpw) new c(), (gpt) new l()));
            j();
            return;
        }
        this.j.a(gpp.a((gpw) new c(), (gpt) new m()));
        this.l.a(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        this.l.a((gcp<b>) Event.ON_DESTROY);
    }

    public void onPause() {
        super.onPause();
        this.l.a((gcp<b>) Event.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        this.l.a((gcp<b>) Event.ON_RESUME);
        this.g.a(this.m, this.n).a(this.h).b((SingleObserver<? super T>) new SingleObserver<gou>() {
            /* access modifiers changed from: private */
            public /* synthetic */ void a(a aVar) {
                MagicLinkActivity.a(MagicLinkActivity.this, aVar.a);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(b bVar) {
                MagicLinkActivity.c(MagicLinkActivity.this);
            }

            public final /* synthetic */ void c_(Object obj) {
                ((gou) obj).a((ged<b>) new ged() {
                    public final void accept(Object obj) {
                        AnonymousClass1.this.a((b) obj);
                    }
                }, (ged<a>) new ged() {
                    public final void accept(Object obj) {
                        AnonymousClass1.this.a((a) obj);
                    }
                });
            }

            public final void onError(Throwable th) {
                if (th instanceof AlreadyLoggedInException) {
                    MagicLinkActivity.b(MagicLinkActivity.this);
                    return;
                }
                MagicLinkActivity.a(MagicLinkActivity.this, -1);
                Logger.e(th, "Failed to observe login state changes", new Object[0]);
            }

            public final void onSubscribe(Disposable disposable) {
                MagicLinkActivity.this.p.bd_();
                MagicLinkActivity.this.p = disposable;
            }
        });
    }

    public void onStart() {
        super.onStart();
        this.l.a((gcp<b>) Event.ON_START);
    }

    public void onStop() {
        this.p.bd_();
        this.l.a((gcp<b>) Event.ON_STOP);
        super.onStop();
    }
}
