package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: dey reason: default package */
final class dey extends dfe {
    private final /* synthetic */ dev a;

    private dey(dev dev) {
        this.a = dev;
        super(dev, 0);
    }

    /* synthetic */ dey(dev dev, byte b) {
        this(dev);
    }

    public final Iterator<Entry<K, V>> iterator() {
        return new dex(this.a, 0);
    }
}
