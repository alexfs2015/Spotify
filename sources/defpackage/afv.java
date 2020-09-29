package defpackage;

import java.lang.reflect.Type;

/* renamed from: afv reason: default package */
public final class afv {
    public static afu[] a(afb afb, Type type, int i) {
        if (type.equals(aff.class)) {
            return a((adn) afb, i);
        }
        if (type.equals(afe.class)) {
            return b((adn) afb, i);
        }
        if (type.equals(afc.class)) {
            return c((adn) afb, i);
        }
        if (type.equals(afg.class)) {
            return d((adn) afb, i);
        }
        return null;
    }

    private static aff[] a(adn adn, int i) {
        aff[] affArr = new aff[i];
        for (int i2 = 0; i2 < i; i2++) {
            affArr[i2] = new ads(adn, i2);
        }
        return affArr;
    }

    private static afe[] b(adn adn, int i) {
        afe[] afeArr = new afe[i];
        for (int i2 = 0; i2 < i; i2++) {
            afeArr[i2] = new adr(adn, i2);
        }
        return afeArr;
    }

    private static afc[] c(adn adn, int i) {
        afc[] afcArr = new afc[i];
        for (int i2 = 0; i2 < i; i2++) {
            afcArr[i2] = new adq(adn, i2);
        }
        return afcArr;
    }

    private static afg[] d(adn adn, int i) {
        afg[] afgArr = new afg[i];
        for (int i2 = 0; i2 < i; i2++) {
            afgArr[i2] = new adt(adn, i2);
        }
        return afgArr;
    }
}
