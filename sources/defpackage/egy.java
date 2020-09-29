package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: egy reason: default package */
public class egy extends ehc {
    final List<eia> a = Collections.synchronizedList(new ArrayList());

    public egy(String str, String str2) {
        super(str, str2, null);
    }

    public void a() {
        synchronized (this.a) {
            for (eia a2 : this.a) {
                a2.a(2002);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(eia eia) {
        this.a.add(eia);
    }
}
