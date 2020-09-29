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
    public gne g;
    public Scheduler h;
    public gnv i;
    public gog j;
    public gnr k;
    private final Listeners l = new Listeners();
    private String m;
    private String n;
    private String o;
    /* access modifiers changed from: private */
    public Disposable p = Disposables.b();

    public void onCreate(Bundle bundle) {
        setTheme(2132017728);
        vtj.a((Activity) this);
        fzx.a(this);
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_magiclink);
        if (bundle == null) {
            this.j.a(goa.a(new c()));
        }
        Uri parse = Uri.parse(fax.b(getIntent().getDataString()));
        this.m = parse.getQueryParameter("username");
        this.o = parse.getQueryParameter("t");
        this.n = parse.getFragment();
        if (fax.a(this.m) || fax.a(this.n)) {
            this.j.a(goa.a((goh) new c(), (goe) new l()));
            j();
            return;
        }
        this.j.a(goa.a((goh) new c(), (goe) new m()));
        this.l.a(bundle);
    }

    public void onResume() {
        super.onResume();
        this.l.a((gbr<b>) Event.ON_RESUME);
        this.g.a(this.m, this.n).a(this.h).b((SingleObserver<? super T>) new SingleObserver<gnf>() {
            public final /* synthetic */ void c_(Object obj) {
                ((gnf) obj).a((gcs<b>) new gcs() {
                    public final void accept(Object obj) {
                        AnonymousClass1.this.a((b) obj);
                    }
                }, (gcs<a>) new gcs() {
                    public final void accept(Object obj) {
                        AnonymousClass1.this.a((a) obj);
                    }
                });
            }

            public final void onSubscribe(Disposable disposable) {
                MagicLinkActivity.this.p.bf_();
                MagicLinkActivity.this.p = disposable;
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(b bVar) {
                MagicLinkActivity.c(MagicLinkActivity.this);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(a aVar) {
                MagicLinkActivity.a(MagicLinkActivity.this, aVar.a);
            }

            public final void onError(Throwable th) {
                if (th instanceof AlreadyLoggedInException) {
                    MagicLinkActivity.b(MagicLinkActivity.this);
                    return;
                }
                MagicLinkActivity.a(MagicLinkActivity.this, -1);
                Logger.e(th, "Failed to observe login state changes", new Object[0]);
            }
        });
    }

    public void onStop() {
        this.p.bf_();
        this.l.a((gbr<b>) Event.ON_STOP);
        super.onStop();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(DialogInterface dialogInterface, int i2) {
        this.j.a(goa.a(new c(), new d(), new a()));
        k();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface) {
        this.j.a(goa.a(new c(), new a(), new a()));
        k();
    }

    private void j() {
        this.j.a(goa.a((goh) new c(), (goc) new b()));
        fsr b = fsy.a(this, getString(R.string.magiclink_error_dialog_text_link_expired)).a(getString(R.string.magiclink_error_dialog_button_send_new_link), new OnClickListener() {
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

    /* access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface, int i2) {
        this.j.a(goa.a(new c(), new j(), new b()));
        this.k.a(this, this.m, true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i2) {
        this.j.a(goa.a(new c(), new b(), new b()));
        k();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.j.a(goa.a(new c(), new a(), new b()));
        k();
    }

    private void k() {
        this.k.a(this);
    }

    public void onStart() {
        super.onStart();
        this.l.a((gbr<b>) Event.ON_START);
    }

    public void onPause() {
        super.onPause();
        this.l.a((gbr<b>) Event.ON_PAUSE);
    }

    public void onDestroy() {
        super.onDestroy();
        this.l.a((gbr<b>) Event.ON_DESTROY);
    }

    public final boolean a(b bVar) {
        return this.l.a((b) fay.a(bVar));
    }

    public final boolean b(b bVar) {
        return this.l.b((b) fay.a(bVar));
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.SIGNUP, null);
    }

    static /* synthetic */ void b(MagicLinkActivity magicLinkActivity) {
        magicLinkActivity.j.a(goa.a((goh) new c(), (goe) new a()));
        magicLinkActivity.k();
    }

    static /* synthetic */ void a(MagicLinkActivity magicLinkActivity, int i2) {
        magicLinkActivity.j.a(goa.a((goh) new c(), (goe) new b()));
        magicLinkActivity.j.a(goa.a(new c(), new b(), new b(), String.valueOf(i2)));
        if (i2 == 408) {
            magicLinkActivity.j.a(goa.a((goh) new c(), (goc) new a()));
            fsr a = fsy.a(magicLinkActivity, magicLinkActivity.getString(R.string.magiclink_error_dialog_region_mismatch_title), magicLinkActivity.getString(R.string.magiclink_error_dialog_region_mismatch_body)).a(magicLinkActivity.getString(R.string.magiclink_error_dialog_region_mismatch_cta), new OnClickListener() {
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

    static /* synthetic */ void c(MagicLinkActivity magicLinkActivity) {
        magicLinkActivity.j.a(new a(new c()));
        magicLinkActivity.j.a(goa.a((goh) new c(), (goe) new c()));
        gnv gnv = magicLinkActivity.i;
        String str = magicLinkActivity.o;
        SpSharedPreferences.a a = gnv.c.a();
        a.a(gnv.a, true);
        if (TextUtils.isEmpty(str)) {
            a.a(gnv.b);
        } else {
            a.a(gnv.b, str);
        }
        a.a();
        magicLinkActivity.k();
    }
}
