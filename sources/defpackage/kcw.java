package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: kcw reason: default package */
public final class kcw {
    public final int a;
    public List<kcv> b;

    public kcw(int i, List<kcv> list) {
        this.a = i;
        this.b = Collections.unmodifiableList(list);
    }
}
