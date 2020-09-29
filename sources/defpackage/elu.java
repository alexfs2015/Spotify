package defpackage;

import com.google.android.gms.internal.measurement.zzun;
import java.util.NoSuchElementException;

/* renamed from: elu reason: default package */
public final class elu extends elw {
    private int a = 0;
    private final int b = this.c.a();
    private final /* synthetic */ zzun c;

    public elu(zzun zzun) {
        this.c = zzun;
    }

    public final boolean hasNext() {
        return this.a < this.b;
    }

    public final byte a() {
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            return this.c.b(i);
        }
        throw new NoSuchElementException();
    }
}
