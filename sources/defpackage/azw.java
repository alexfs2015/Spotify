package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: azw reason: default package */
public abstract class azw implements axs<azw> {
    public final String n;
    public final List<String> o;
    public final boolean p;

    protected azw(String str, List<String> list, boolean z) {
        this.n = str;
        this.o = Collections.unmodifiableList(list);
        this.p = z;
    }
}
