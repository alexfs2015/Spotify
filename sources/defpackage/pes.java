package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: pes reason: default package */
public final class pes {
    private final List<pen> a = new ArrayList(3);

    public pes(peu peu, peo peo, peq peq) {
        this.a.add(peu);
        this.a.add(peo);
        this.a.add(peq);
    }

    public final boolean a() {
        for (pen a2 : this.a) {
            if (!a2.a()) {
                return false;
            }
        }
        return true;
    }
}
