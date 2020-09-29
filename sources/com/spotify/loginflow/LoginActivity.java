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
import com.spotify.base.java.logging.Logger;
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

public class LoginActivity extends jjs implements vtr {
    public vti<vnk> g;
    public PreSignupExperimentHelper h;
    public Scheduler i;
    public gnj j;
    public ToastieManager k;
    public DispatchingAndroidInjector<Object> l;
    public gnk m;
    public vti<gnm> n;
    private final CompositeDisposable o = new CompositeDisposable();
    private ImageView p;
    private jor q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private String w;

    public interface a {
        void onFlowFinish(Context context, Intent intent);
    }

    private static boolean a(Intent intent) {
        Intent intent2 = (Intent) intent.getParcelableExtra("intent");
        if (intent2 == null || !intent2.getBooleanExtra("password_reset", false)) {
            return false;
        }
        return true;
    }

    public static Intent a(Context context, Intent intent) {
        Intent intent2 = new Intent();
        intent2.setClass(context, LoginActivity.class);
        intent2.putExtra("intent", intent);
        intent2.setFlags(268468224);
        return intent2;
    }

    public final vtk<Object> j() {
        return this.l;
    }

    private Fragment l() {
        return i().a("flow_fragment");
    }

    public void onPostResume() {
        super.onPostResume();
        jor jor = this.q;
        if (jor != null) {
            a(jor, this.r);
            this.q = null;
        }
        if (this.s) {
            k();
            this.s = false;
        }
    }

    public void onResume() {
        super.onResume();
        this.k.a((q) this);
        this.m.start();
    }

    public void onBackPressed() {
        Fragment l2 = l();
        if (!(l2 instanceof gnh ? ((gnh) l2).a() : false)) {
            super.onBackPressed();
        }
    }

    public final void a(int i2, a aVar) {
        if (isFinishing()) {
            Logger.d("Already finishing.", new Object[0]);
            return;
        }
        setResult(-1);
        if (aVar != null) {
            Intent intent = getIntent();
            fay.a(intent);
            aVar.onFlowFinish(this, (Intent) intent.getParcelableExtra("intent"));
        }
        finish();
    }

    public final void a(jor jor) {
        a(jor, true);
    }

    public final void a(jor jor, boolean z) {
        Assertion.a("Fragment container for the flow activity has not been set", true);
        if (!this.a.a().a(State.RESUMED)) {
            this.q = jor;
            this.r = z;
            Assertion.c("switchToFragment transactions should not be made in this state");
            return;
        }
        km a2 = i().a();
        if (z) {
            a2.a((String) null);
        }
        a2.b(R.id.fragment_container, jor, "flow_fragment");
        a2.b();
    }

    public final void k() {
        Assertion.a("Fragment container for the flow activity has not been set", true);
        if (!this.a.a().a(State.RESUMED)) {
            this.s = true;
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
        if (vnk.a(i2)) {
            ((vnk) this.g.get()).a(i2, i3, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        setTheme(2132017719);
        fzx.a(this);
        vtj.a((Activity) this);
        super.onCreate(bundle);
        DebugFlag debugFlag = DebugFlag.ENABLE_PRE_LOGIN_SCREENSHOTS;
        getWindow().setFlags(8192, 8192);
        setContentView((int) R.layout.activity_login);
        this.p = (ImageView) findViewById(R.id.back_button);
        this.p.setOnClickListener(new OnClickListener() {
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
            this.o.a(this.h.a(3000).a(this.i).a((Consumer<? super T>) new Consumer() {
                public final void accept(Object obj) {
                    LoginActivity.this.a((PreSignupExperimentFlags) obj);
                }
            }, (Consumer<? super Throwable>) new Consumer() {
                public final void accept(Object obj) {
                    LoginActivity.this.a((Throwable) obj);
                }
            }));
        } else {
            this.t = bundle.getBoolean("com.spotify.login.smartlock_credentials_have_been_requested", false);
            bundle.setClassLoader(getClassLoader());
        }
        setVisible(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PreSignupExperimentFlags preSignupExperimentFlags) {
        a(this.h.b());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        a(this.h.b());
    }

    public void onDestroy() {
        this.o.c();
        super.onDestroy();
    }

    private void a(String str, boolean z) {
        this.u = z;
        this.v = true;
        this.w = str;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.spotify.login.smartlock_credentials_have_been_requested", this.t);
    }

    private void a(boolean z) {
        Intent intent = getIntent();
        if (a(intent)) {
            b(intent);
        }
        if (this.v) {
            this.j.a(z);
            this.j.b(this.w);
            this.v = false;
            this.w = "";
        } else if (!this.t) {
            this.t = true;
            this.o.a(((gnm) this.n.get()).a().d((Consumer<? super T>) new Consumer(z) {
                private final /* synthetic */ boolean f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    LoginActivity.this.a(this.f$1, (gno) obj);
                }
            }));
        } else {
            this.j.a(z);
        }
    }

    private void b(Intent intent) {
        Intent intent2 = (Intent) intent.getParcelableExtra("intent");
        a(fax.b(intent2.getStringExtra("password_reset_username")), intent2.getBooleanExtra("password_reset_auto_send_email", false));
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        if (a(intent)) {
            b(intent);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, gno gno) {
        if (gno instanceof b) {
            this.j.d();
        } else {
            this.j.a(z);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m() {
        this.p.setVisibility(l() instanceof gnl ? 0 : 8);
    }
}
