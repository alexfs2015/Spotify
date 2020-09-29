package defpackage;

import io.reactivex.functions.Function3;

/* renamed from: snj reason: default package */
public final class snj implements Function3<sqk, sqk, sqk, Boolean> {
    public final /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
        sqk sqk = (sqk) obj;
        sqk sqk2 = (sqk) obj2;
        sqk sqk3 = (sqk) obj3;
        fbp.a(sqk3);
        fbp.a(sqk2);
        fbp.a(sqk);
        String b = sqk.a.b();
        String b2 = sqk2.a.b();
        String b3 = sqk3.a.b();
        boolean z = true;
        if ((srd.a(b) && srd.a(b2) && !srd.a(b3)) || sqk3.c.a() != sqk.c.a() || (!b2.equals(b3) && ((!b.startsWith(b3) && !b3.startsWith(b)) || (!srd.a(b2) && ((b.startsWith(b2) || b2.startsWith(b)) && Math.abs(b.length() - b3.length()) >= Math.abs(b.length() - b2.length())))))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
