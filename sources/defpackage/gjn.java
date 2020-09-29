package defpackage;

import com.google.common.base.Optional;

/* renamed from: gjn reason: default package */
public final class gjn implements wig<gjm> {
    private final wzi<String> a;
    private final wzi<String> b;
    private final wzi<Optional<String>> c;
    private final wzi<Optional<String>> d;

    private gjn(wzi<String> wzi, wzi<String> wzi2, wzi<Optional<String>> wzi3, wzi<Optional<String>> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static gjn a(wzi<String> wzi, wzi<String> wzi2, wzi<Optional<String>> wzi3, wzi<Optional<String>> wzi4) {
        return new gjn(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new gjm(this.a, this.b, this.c, this.d);
    }
}
