package defpackage;

import java.util.Comparator;

/* renamed from: dmg reason: default package */
final class dmg implements Comparator<dmm> {
    dmg() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        dmm dmm = (dmm) obj;
        dmm dmm2 = (dmm) obj2;
        int i = dmm.c - dmm2.c;
        return i != 0 ? i : (int) (dmm.a - dmm2.a);
    }
}
