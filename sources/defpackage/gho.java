package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.common.base.Optional;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: gho reason: default package */
public final class gho extends c implements kmm<gib, ghz> {
    private final ghr a;
    private final jme b;
    private final ghv c;
    private Optional<b<gib, ghz>> d = Optional.e();
    private Optional<knw<String>> e = Optional.e();

    public gho(ghr ghr, Activity activity, ghv ghv) {
        this.a = ghr;
        this.b = (jme) activity;
        this.b.a(this);
        this.c = ghv;
    }

    public final void a() {
        this.c.a = true;
    }

    public final void a(Intent intent) {
        String stringExtra = intent.getStringExtra("DEVICE_ID");
        if (stringExtra != null) {
            this.c.a = false;
            if (!this.d.b()) {
                b a2 = knc.a(this.a.a(stringExtra), gib.a, knm.a());
                a2.a(this);
                a2.c();
                this.d = Optional.b(a2);
            } else if (this.e.b()) {
                ((knw) this.e.c()).accept(stringExtra);
            }
        }
    }

    public final void aN_() {
        if (this.d.b()) {
            ((b) this.d.c()).d();
            ((b) this.d.c()).b();
            this.d = Optional.e();
        }
        this.b.b(this);
    }

    public final kmn<gib> connect(knw<ghz> knw) {
        this.e = Optional.b(new $$Lambda$gho$K7cB_0dAMatdHryY0gVqeUt3_cM(knw));
        return new kmn<gib>() {
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }

            public final void dispose() {
            }
        };
    }
}
