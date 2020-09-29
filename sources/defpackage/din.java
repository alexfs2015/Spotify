package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: din reason: default package */
public final class din extends dim {
    private din(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static din a(String str, Context context, boolean z) {
        a(context, z);
        return new din(context, str, z);
    }

    /* access modifiers changed from: protected */
    public final List<Callable<Void>> a(djc djc, dci dci, czk czk) {
        if (djc.b == null || !this.r) {
            return super.a(djc, dci, czk);
        }
        int c = djc.c();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.a(djc, dci, czk));
        djw djw = new djw(djc, "1QeH3Cf7T53ayw17Ebbo9YTdhU+IFx0X5nCtC5gZQym4uicOVPXxYWmMK9k58i8n", "bHJRpFJ+2R5LAbYQUBDMyfYpLd1oiGixlpIqMJOBQPY=", dci, c);
        arrayList.add(djw);
        return arrayList;
    }
}
