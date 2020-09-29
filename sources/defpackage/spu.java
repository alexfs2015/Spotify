package defpackage;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;

/* renamed from: spu reason: default package */
public final class spu implements a<Intent> {
    public final /* synthetic */ void a(Object obj) {
        Logger.b("No route found in intent-router for input: %s", (Intent) obj);
    }

    public final /* synthetic */ void a(Object obj, gjv gjv) {
        Logger.b("Route found in intent-router for input: %s", (Intent) obj);
        Logger.b("Matched by: %s, Command: %s", gjv.a().a(), gjv.b().a());
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<gjv>, for r5v0, types: [java.util.List<gjv>, java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(java.lang.Object r4, java.util.List<defpackage.gjv> r5) {
        /*
            r3 = this;
            android.content.Intent r4 = (android.content.Intent) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 200(0xc8, float:2.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "Too many routes found in intent-router for input: "
            r0.append(r1)
            r0.append(r4)
            r4 = 10
            r0.append(r4)
            java.util.Iterator r5 = r5.iterator()
        L_0x001a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x004a
            java.lang.Object r1 = r5.next()
            gjv r1 = (defpackage.gjv) r1
            java.lang.String r2 = "    Matched by: "
            r0.append(r2)
            gjx r2 = r1.a()
            java.lang.String r2 = r2.a()
            r0.append(r2)
            java.lang.String r2 = ", Command: "
            r0.append(r2)
            gjs r1 = r1.b()
            java.lang.String r1 = r1.a()
            r0.append(r1)
            r0.append(r4)
            goto L_0x001a
        L_0x004a:
            java.lang.String r4 = r0.toString()
            com.spotify.mobile.android.util.Assertion.b(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spu.a(java.lang.Object, java.util.List):void");
    }
}
