package defpackage;

import com.google.common.base.Optional;

/* renamed from: gdb reason: default package */
public final class gdb implements kci {
    private final gdc a;
    private final jtz b;
    private boolean c = true;

    public gdb(jtz jtz, gdc gdc) {
        this.b = jtz;
        this.a = gdc;
    }

    public final Optional<kch> createEventObserver(kaa kaa, jzx jzx, kac kac, String str, kad kad) {
        return this.c ? Optional.b(new gda(kaa, this.b, this.a)) : Optional.e();
    }
}
