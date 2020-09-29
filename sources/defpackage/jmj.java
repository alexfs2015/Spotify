package defpackage;

import android.view.KeyEvent;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.ConnectManager.d;

/* renamed from: jmj reason: default package */
public abstract class jmj extends lbm implements d {
    public ConnectManager g;
    public gmk h;

    public void a(float f) {
    }

    public final boolean b(float f) {
        if (!this.g.v()) {
            return false;
        }
        this.h.a(Float.valueOf(f));
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return (this.g.u() || !this.g.v() || this.g.q() == null) ? super.onKeyDown(i, keyEvent) : i != 24 ? i != 25 ? super.onKeyDown(i, keyEvent) : this.h.b() : this.h.a();
    }

    public void onStart() {
        this.g.a((d) this);
        super.onStart();
    }

    public void onStop() {
        super.onStop();
        this.g.b((d) this);
    }
}
