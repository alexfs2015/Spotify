package defpackage;

import io.reactivex.functions.Function3;

/* renamed from: sdc reason: default package */
public final class sdc implements Function3<sgd, sgd, sgd, Boolean> {
    public final /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
        sgd sgd = (sgd) obj;
        sgd sgd2 = (sgd) obj2;
        sgd sgd3 = (sgd) obj3;
        fay.a(sgd3);
        fay.a(sgd2);
        fay.a(sgd);
        String b = sgd.a.b();
        String b2 = sgd2.a.b();
        String b3 = sgd3.a.b();
        boolean z = true;
        if ((sgw.a(b) && sgw.a(b2) && !sgw.a(b3)) || sgd3.c.a() != sgd.c.a() || (!b2.equals(b3) && ((!b.startsWith(b3) && !b3.startsWith(b)) || (!sgw.a(b2) && ((b.startsWith(b2) || b2.startsWith(b)) && Math.abs(b.length() - b3.length()) >= Math.abs(b.length() - b2.length())))))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
