package defpackage;

import java.lang.reflect.Type;

/* renamed from: agj reason: default package */
public final class agj {
    private static aft[] a(aeb aeb, int i) {
        aft[] aftArr = new aft[i];
        for (int i2 = 0; i2 < i; i2++) {
            aftArr[i2] = new aeg(aeb, i2);
        }
        return aftArr;
    }

    public static agi[] a(afp afp, Type type, int i) {
        if (type.equals(aft.class)) {
            return a((aeb) afp, i);
        }
        if (type.equals(afs.class)) {
            return b((aeb) afp, i);
        }
        if (type.equals(afq.class)) {
            return c((aeb) afp, i);
        }
        if (type.equals(afu.class)) {
            return d((aeb) afp, i);
        }
        return null;
    }

    private static afs[] b(aeb aeb, int i) {
        afs[] afsArr = new afs[i];
        for (int i2 = 0; i2 < i; i2++) {
            afsArr[i2] = new aef(aeb, i2);
        }
        return afsArr;
    }

    private static afq[] c(aeb aeb, int i) {
        afq[] afqArr = new afq[i];
        for (int i2 = 0; i2 < i; i2++) {
            afqArr[i2] = new aee(aeb, i2);
        }
        return afqArr;
    }

    private static afu[] d(aeb aeb, int i) {
        afu[] afuArr = new afu[i];
        for (int i2 = 0; i2 < i; i2++) {
            afuArr[i2] = new aeh(aeb, i2);
        }
        return afuArr;
    }
}
