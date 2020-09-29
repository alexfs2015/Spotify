package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;

@cey
/* renamed from: crt reason: default package */
public final class crt implements OnAudioFocusChangeListener {
    boolean a;
    boolean b;
    float c = 1.0f;
    private final AudioManager d;
    private final crv e;
    private boolean f;

    public crt(Context context, crv crv) {
        this.d = (AudioManager) context.getSystemService("audio");
        this.e = crv;
    }

    public final void a() {
        this.f = true;
        c();
    }

    public final void a(boolean z) {
        this.b = z;
        c();
    }

    public final void b() {
        this.f = false;
        c();
    }

    /* access modifiers changed from: 0000 */
    public final void c() {
        boolean z = false;
        boolean z2 = this.f && !this.b && this.c > 0.0f;
        if (z2) {
            boolean z3 = this.a;
            if (!z3) {
                AudioManager audioManager = this.d;
                if (audioManager != null && !z3) {
                    if (audioManager.requestAudioFocus(this, 3, 2) == 1) {
                        z = true;
                    }
                    this.a = z;
                }
                this.e.i();
                return;
            }
        }
        if (!z2) {
            boolean z4 = this.a;
            if (z4) {
                AudioManager audioManager2 = this.d;
                if (audioManager2 != null && z4) {
                    if (audioManager2.abandonAudioFocus(this) == 0) {
                        z = true;
                    }
                    this.a = z;
                }
                this.e.i();
            }
        }
    }

    public final void onAudioFocusChange(int i) {
        this.a = i > 0;
        this.e.i();
    }
}
