package defpackage;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.activity.ComponentActivity$2;
import androidx.activity.ComponentActivity$3;
import androidx.activity.ImmLeaksCleaner;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.State;

/* renamed from: k reason: default package */
public class k extends fe implements lh, lx, m, pm {
    public final li a = new li(this);
    public final OnBackPressedDispatcher b = new OnBackPressedDispatcher(new Runnable() {
        public final void run() {
            k.super.onBackPressed();
        }
    });
    private final pl c = pl.a((pm) this);
    private lw d;

    /* renamed from: k$a */
    static final class a {
        Object a;
        lw b;

        a() {
        }
    }

    public k() {
        if (this.a != null) {
            if (VERSION.SDK_INT >= 19) {
                this.a.a(new ComponentActivity$2(this));
            }
            this.a.a(new ComponentActivity$3(this));
            if (19 <= VERSION.SDK_INT && VERSION.SDK_INT <= 23) {
                this.a.a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c.a(bundle);
        lr.a((Activity) this);
    }

    public final Object onRetainNonConfigurationInstance() {
        lw lwVar = this.d;
        if (lwVar == null) {
            a aVar = (a) getLastNonConfigurationInstance();
            if (aVar != null) {
                lwVar = aVar.b;
            }
        }
        if (lwVar == null) {
            return null;
        }
        a aVar2 = new a();
        aVar2.a = null;
        aVar2.b = lwVar;
        return aVar2;
    }

    public final Lifecycle Y_() {
        return this.a;
    }

    public final lw ar_() {
        if (getApplication() != null) {
            if (this.d == null) {
                a aVar = (a) getLastNonConfigurationInstance();
                if (aVar != null) {
                    this.d = aVar.b;
                }
                if (this.d == null) {
                    this.d = new lw();
                }
            }
            return this.d;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void onBackPressed() {
        this.b.a();
    }

    public final OnBackPressedDispatcher c() {
        return this.b;
    }

    public final pk d() {
        return this.c.a;
    }

    public void onSaveInstanceState(Bundle bundle) {
        li liVar = this.a;
        if (liVar instanceof li) {
            liVar.a(State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.c.b(bundle);
    }
}
