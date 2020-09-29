package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: azf reason: default package */
public abstract class azf implements axb<azf> {
    public final String n;
    public final List<String> o;
    public final boolean p;

    protected azf(String str, List<String> list, boolean z) {
        this.n = str;
        this.o = Collections.unmodifiableList(list);
        this.p = z;
    }
}
