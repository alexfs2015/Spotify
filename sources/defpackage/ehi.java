package defpackage;

import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat.a;
import android.view.KeyEvent;

/* renamed from: ehi reason: default package */
public final class ehi extends a {
    private final /* synthetic */ ehe c;

    public ehi(ehe ehe) {
        this.c = ehe;
    }

    public final boolean a(Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null && (keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 126)) {
            this.c.f.k();
        }
        return true;
    }

    public final void b() {
        this.c.f.k();
    }

    public final void c() {
        this.c.f.k();
    }

    public final void f() {
        if (this.c.f.j()) {
            this.c.f.k();
        }
    }
}