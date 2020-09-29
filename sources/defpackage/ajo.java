package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.TreeSet;

/* renamed from: ajo reason: default package */
final class ajo implements ajt {
    private final Context a;
    private final ajr b;
    private final ajp c;

    ajo(Context context, ajr ajr, ajp ajp) {
        this.a = context;
        this.b = ajr;
        this.c = ajp;
    }

    public final boolean a() {
        File a2 = this.c.a();
        if (a2 == null) {
            return false;
        }
        try {
            return this.b.a(a2.getCanonicalPath(), this.a.getAssets());
        } catch (IOException e) {
            vuu.a().c("CrashlyticsNdk", "Error initializing CrashlyticsNdk", e);
            return false;
        }
    }

    public final aie b() {
        TreeSet b2 = this.c.b();
        if (!b2.isEmpty()) {
            b2.pollFirst();
        }
        return new aie(b2);
    }
}
