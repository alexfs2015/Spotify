package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.TreeSet;

/* renamed from: akc reason: default package */
final class akc implements akh {
    private final Context a;
    private final akf b;
    private final akd c;

    akc(Context context, akf akf, akd akd) {
        this.a = context;
        this.b = akf;
        this.c = akd;
    }

    public final boolean a() {
        File a2 = this.c.a();
        if (a2 == null) {
            return false;
        }
        try {
            return this.b.a(a2.getCanonicalPath(), this.a.getAssets());
        } catch (IOException e) {
            wja.a().c("CrashlyticsNdk", "Error initializing CrashlyticsNdk", e);
            return false;
        }
    }

    public final ais b() {
        TreeSet b2 = this.c.b();
        if (!b2.isEmpty()) {
            b2.pollFirst();
        }
        return new ais(b2);
    }
}
