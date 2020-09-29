package com.spotify.loginflow;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle.State;
import com.spotify.libs.pse.PreSignupExperimentHelper;
import com.spotify.libs.pse.model.PreSignupExperimentFlags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.music.toastie.ToastieManager;
import dagger.android.DispatchingAndroidInjector;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

public class LoginActivity extends jme implements whx {
    public who<waq> g;
    public PreSignupExperimentHelper h;
    public Scheduler i;
    public goy j;
    public ToastieManager k;
    public DispatchingAndroidInjector<Object> l;
    public goz m;
    public who<gpb> n;
    public gbp o;
    private final CompositeDisposable p = new CompositeDisposable();
    private ImageView q;
    private jrd r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private String x;

    public interface a {
        void onFlowFinish(Context context, Intent intent);
    }

    public static Intent a(Context context, Intent intent) {
        Intent intent2 = new Intent();
        intent2.setClass(context, LoginActivity.class);
        intent2.putExtra("intent", intent);
        intent2.setFlags(268468224);
        return intent2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PreSignupExperimentFlags preSignupExperimentFlags) {
        a(this.h.b());
    }

    private void a(String str, boolean z) {
        this.v = z;
        this.w = true;
        this.x = str;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        a(this.h.b());
    }

    private void a(boolean z) {
        Intent intent = getIntent();
        if (a(intent)) {
            b(intent);
        }
        if (this.w) {
            this.j.a(z);
            this.j.b(this.x);
            this.w = false;
            this.x = "";
        } else if (!this.u) {
            this.u = true;
            this.p.a(((gpb) this.n.get()).a().d((Consumer<? super T>) new Consumer(z) {
                private final /* synthetic */ boolean f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    LoginActivity.this.a(this.f$1, (gpd) obj);
                }
            }));
        } else {
            this.j.a(z);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, gpd gpd) {
        if (gpd instanceof b) {
            this.j.d();
        } else {
            this.j.a(z);
        }
    }

    private static boolean a(Intent intent) {
        Intent intent2 = (Intent) intent.getParcelableExtra("intent");
        return intent2 != null && intent2.getBooleanExtra("password_reset", false);
    }

    private void b(Intent intent) {
        Intent intent2 = (Intent) intent.getParcelableExtra("intent");
        a(fbo.b(intent2.getStringExtra("password_reset_username")), intent2.getBooleanExtra("password_reset_auto_send_email", false));
    }

    private Fragment l() {
        return i().a("flow_fragment");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m() {
        this.q.setVisibility(l() instanceof gpa ? 0 : 8);
    }

    public final void a(jrd jrd) {
        a(jrd, true);
    }

    public final void a(jrd jrd, boolean z) {
        Assertion.a("Fragment container for the flow activity has not been set", true);
        if (!this.a.a().a(State.RESUMED)) {
            this.r = jrd;
            this.s = z;
            Assertion.c("switchToFragment transactions should not be made in this state");
            return;
        }
        kr a2 = i().a();
        if (z) {
            a2.a((String) null);
        }
        a2.b(R.id.fragment_container, jrd, "flow_fragment");
        a2.b();
    }

    public final whq<Object> j() {
        return this.l;
    }

    public final void k() {
        Assertion.a("Fragment container for the flow activity has not been set", true);
        if (!this.a.a().a(State.RESUMED)) {
            this.t = true;
            Assertion.c("dismissCurrentFragment transactions should not be made in this state");
            return;
        }
        i().c();
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Fragment l2 = l();
        if (l2 != null) {
            l2.a(i2, i3, intent);
        }
        super.onActivityResult(i2, i3, intent);
        if (waq.a(i2)) {
            ((waq) this.g.get()).a(i2, i3, intent);
        }
    }

    public void onBackPressed() {
        Fragment l2 = l();
        if (!(l2 instanceof gow ? ((gow) l2).a() : false)) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        setTheme(2132017722);
        gar.a(this);
        whp.a((Activity) this);
        super.onCreate(bundle);
        DebugFlag debugFlag = DebugFlag.ENABLE_PRE_LOGIN_SCREENSHOTS;
        getWindow().setFlags(8192, 8192);
        setContentView((int) R.layout.activity_login);
        this.q = (ImageView) findViewById(R.id.back_button);
        this.q.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                LoginActivity.this.a(view);
            }
        });
        i().a((b) new b() {
            public final void onBackStackChanged() {
                LoginActivity.this.m();
            }
        });
        if (bundle == null) {
            this.p.a(this.h.a(3000).a(this.i).a((Consumer<? super T>) new Consumer() {
                public final void accept(Object obj) {
                    LoginActivity.this.a((PreSignupExperimentFlags) obj);
                }
            }, (Consumer<? super Throwable>) new Consumer() {
                public final void accept(Object obj) {
                    LoginActivity.this.a((Throwable) obj);
                }
            }));
        } else {
            this.u = bundle.getBoolean("com.spotify.login.smartlock_credentials_have_been_requested", false);
            bundle.setClassLoader(getClassLoader());
        }
        setVisible(false);
        this.o.a(new c(amf.a(getApplicationContext())));
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        if (a(intent)) {
            b(intent);
        }
    }

    public void onPostResume() {
        super.onPostResume();
        jrd jrd = this.r;
        if (jrd != null) {
            a(jrd, this.s);
            this.r = null;
        }
        if (this.t) {
            k();
            this.t = false;
        }
    }

    public void onResume() {
        super.onResume();
        this.k.a((q) this);
        this.m.start();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.spotify.login.smartlock_credentials_have_been_requested", this.u);
    }

    public void onStop() {
        this.p.c();
        super.onStop();
    }
}
