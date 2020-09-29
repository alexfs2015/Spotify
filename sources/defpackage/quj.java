package defpackage;

import android.os.Bundle;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import java.util.UUID;

/* renamed from: quj reason: default package */
public final class quj implements quk {
    String a = UUID.randomUUID().toString();

    public quj(final String str, a aVar) {
        aVar.a(new c() {
            public final void a(Bundle bundle) {
                bundle.putString(str, quj.this.a);
            }

            public final void b(Bundle bundle) {
                if (bundle != null) {
                    quj.this.a = bundle.getString(str, UUID.randomUUID().toString());
                }
            }
        });
    }

    public final String a() {
        return this.a;
    }
}
