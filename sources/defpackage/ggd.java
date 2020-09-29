package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.common.base.Optional;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: ggd reason: default package */
public final class ggd extends c implements kjd<ggq, ggo> {
    private final ggg a;
    private final jjs b;
    private final ggk c;
    private Optional<b<ggq, ggo>> d = Optional.e();
    private Optional<kkn<String>> e = Optional.e();

    public ggd(ggg ggg, Activity activity, ggk ggk) {
        this.a = ggg;
        this.b = (jjs) activity;
        this.b.a(this);
        this.c = ggk;
    }

    public final void a(Intent intent) {
        String stringExtra = intent.getStringExtra("DEVICE_ID");
        if (stringExtra != null) {
            this.c.a = false;
            if (!this.d.b()) {
                b a2 = kjt.a(this.a.a(stringExtra), ggq.a, kkd.a());
                a2.a(this);
                a2.c();
                this.d = Optional.b(a2);
            } else if (this.e.b()) {
                ((kkn) this.e.c()).accept(stringExtra);
            }
        }
    }

    public final void a() {
        this.c.a = true;
    }

    public final void aP_() {
        if (this.d.b()) {
            ((b) this.d.c()).d();
            ((b) this.d.c()).b();
            this.d = Optional.e();
        }
        this.b.b(this);
    }

    public final kje<ggq> connect(kkn<ggo> kkn) {
        this.e = Optional.b(new $$Lambda$ggd$L98uCISjgqLzzYCPgANeDGpE2M(kkn));
        return new kje<ggq>() {
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }

            public final void dispose() {
            }
        };
    }
}
