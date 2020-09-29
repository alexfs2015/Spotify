package defpackage;

import com.google.common.base.Optional;

/* renamed from: kep reason: default package */
public final class kep implements kci {
    private final gfk<fli> a;

    public kep(gfk<fli> gfk) {
        this.a = gfk;
    }

    public final Optional<kch> createEventObserver(kaa kaa, jzx jzx, kac kac, String str, kad kad) {
        return Optional.b(new keo(kaa, this.a, str));
    }
}
