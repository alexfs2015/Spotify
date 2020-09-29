package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: dhw reason: default package */
public final class dhw extends dhv {
    private dhw(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static dhw a(String str, Context context, boolean z) {
        a(context, z);
        return new dhw(context, str, z);
    }

    /* access modifiers changed from: protected */
    public final List<Callable<Void>> a(dil dil, dbr dbr, cyt cyt) {
        if (dil.b == null || !this.r) {
            return super.a(dil, dbr, cyt);
        }
        int c = dil.c();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.a(dil, dbr, cyt));
        djf djf = new djf(dil, "1QeH3Cf7T53ayw17Ebbo9YTdhU+IFx0X5nCtC5gZQym4uicOVPXxYWmMK9k58i8n", "bHJRpFJ+2R5LAbYQUBDMyfYpLd1oiGixlpIqMJOBQPY=", dbr, c);
        arrayList.add(djf);
        return arrayList;
    }
}
