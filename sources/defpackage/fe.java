package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.State;

/* renamed from: fe reason: default package */
public class fe extends Activity implements a, lh {
    private dv<Class<? extends Object>, Object> a = new dv<>();
    private li b = new li(this);

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        lr.a((Activity) this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.b.a(State.CREATED);
        super.onSaveInstanceState(bundle);
    }

    public Lifecycle Y_() {
        return this.b;
    }

    public final boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !hy.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !hy.a(decorView, keyEvent)) {
            return hy.a(this, decorView, this, keyEvent);
        }
        return true;
    }
}
