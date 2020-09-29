package defpackage;

import java.util.Comparator;

/* renamed from: dmx reason: default package */
final class dmx implements Comparator<dnd> {
    dmx() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        dnd dnd = (dnd) obj;
        dnd dnd2 = (dnd) obj2;
        int i = dnd.c - dnd2.c;
        return i != 0 ? i : (int) (dnd.a - dnd2.a);
    }
}
