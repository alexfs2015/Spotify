package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: pme reason: default package */
public final class pme {
    private final List<plz> a = new ArrayList(3);

    public pme(pmg pmg, pma pma, pmc pmc) {
        this.a.add(pmg);
        this.a.add(pma);
        this.a.add(pmc);
    }

    public final boolean a() {
        for (plz a2 : this.a) {
            if (!a2.a()) {
                return false;
            }
        }
        return true;
    }
}
