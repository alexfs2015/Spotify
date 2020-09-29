package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: azb reason: default package */
public final class azb implements azh {
    private final List<axd> a;

    public azb() {
        this(Collections.emptyList());
    }

    private azb(List<axd> list) {
        this.a = list;
    }

    public final a<azf> a() {
        return new axc(new azg(), this.a);
    }

    public final a<azf> a(azd azd) {
        return new axc(new azg(azd), this.a);
    }
}
