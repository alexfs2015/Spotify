package defpackage;

import android.os.Bundle;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: qmf reason: default package */
public final class qmf {
    int a;
    private final qmc b;

    public qmf(a aVar, qmc qmc) {
        this.b = qmc;
        aVar.a(new c() {
            public final void a(Bundle bundle) {
                bundle.putInt("key_sequence_number", qmf.this.a);
            }

            public final void b(Bundle bundle) {
                if (bundle != null) {
                    qmf.this.a = bundle.getInt("key_sequence_number");
                }
            }
        });
    }

    public final int a() {
        int i = this.a;
        this.a = i + 1;
        return i;
    }

    public final String b() {
        return this.b.a();
    }
}
