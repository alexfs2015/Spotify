package defpackage;

import android.view.KeyEvent;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.ConnectManager.d;

/* renamed from: jjx reason: default package */
public abstract class jjx extends kyd implements d, a<ConnectManager> {
    public hip g;
    public gkw h;

    public void a(float f) {
    }

    public final void e() {
    }

    public void onStart() {
        this.g.a(this);
        super.onStart();
    }

    public void onStop() {
        this.g.b(this);
        if (this.g.d()) {
            ((ConnectManager) this.g.i()).b((d) this);
        }
        super.onStop();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!this.g.d() || ((ConnectManager) this.g.i()).u() || !((ConnectManager) this.g.i()).v() || ((ConnectManager) this.g.i()).q() == null) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i == 24) {
            return this.h.a();
        }
        if (i != 25) {
            return super.onKeyDown(i, keyEvent);
        }
        return this.h.b();
    }

    public final boolean b(float f) {
        if (!this.g.d() || !((ConnectManager) this.g.i()).v()) {
            return false;
        }
        this.h.a(Float.valueOf(f));
        return true;
    }

    public final /* synthetic */ void a(Object obj) {
        ((ConnectManager) this.g.i()).a((d) this);
    }
}
