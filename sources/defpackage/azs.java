package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: azs reason: default package */
public final class azs implements azy {
    private final List<axu> a;

    public azs() {
        this(Collections.emptyList());
    }

    private azs(List<axu> list) {
        this.a = list;
    }

    public final a<azw> a() {
        return new axt(new azx(), this.a);
    }

    public final a<azw> a(azu azu) {
        return new axt(new azx(azu), this.a);
    }
}
