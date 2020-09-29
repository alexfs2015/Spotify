package defpackage;

import com.google.android.gms.internal.ads.zzbah;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: dcq reason: default package */
public final class dcq implements Iterator {
    private int a = 0;
    private final int b = this.c.a();
    private final /* synthetic */ zzbah c;

    public dcq(zzbah zzbah) {
        this.c = zzbah;
    }

    private final byte a() {
        try {
            zzbah zzbah = this.c;
            int i = this.a;
            this.a = i + 1;
            return zzbah.a(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final boolean hasNext() {
        return this.a < this.b;
    }

    public final /* synthetic */ Object next() {
        return Byte.valueOf(a());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
