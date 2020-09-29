package defpackage;

import com.google.common.base.Optional;

/* renamed from: rvn reason: default package */
public abstract class rvn {
    public abstract boolean a();

    public abstract boolean b();

    public final rvn a(Optional<Boolean> optional, Optional<Boolean> optional2) {
        return new rvl(optional.b() ? ((Boolean) optional.c()).booleanValue() : a(), optional2.b() ? ((Boolean) optional2.c()).booleanValue() : b());
    }
}
