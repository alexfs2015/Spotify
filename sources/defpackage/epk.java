package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: epk reason: default package */
final class epk extends epq {
    private final /* synthetic */ eph a;

    private epk(eph eph) {
        this.a = eph;
        super(eph, 0);
    }

    /* synthetic */ epk(eph eph, byte b) {
        this(eph);
    }

    public final Iterator<Entry<K, V>> iterator() {
        return new epj(this.a, 0);
    }
}
