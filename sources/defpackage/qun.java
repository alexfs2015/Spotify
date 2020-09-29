package defpackage;

import android.os.Bundle;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: qun reason: default package */
public final class qun {
    int a;
    private final quk b;

    public qun(a aVar, quk quk) {
        this.b = quk;
        aVar.a(new c() {
            public final void a(Bundle bundle) {
                bundle.putInt("key_sequence_number", qun.this.a);
            }

            public final void b(Bundle bundle) {
                if (bundle != null) {
                    qun.this.a = bundle.getInt("key_sequence_number");
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
