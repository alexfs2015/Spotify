package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: kaw reason: default package */
public final class kaw {
    public final int a;
    public List<kav> b;

    public kaw(int i, List<kav> list) {
        this.a = i;
        this.b = Collections.unmodifiableList(list);
    }
}
