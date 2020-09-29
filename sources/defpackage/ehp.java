package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ehp reason: default package */
public class ehp extends eht {
    final List<eir> a = Collections.synchronizedList(new ArrayList());

    public ehp(String str, String str2) {
        super(str, str2, null);
    }

    public void a() {
        synchronized (this.a) {
            for (eir a2 : this.a) {
                a2.a(2002);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(eir eir) {
        this.a.add(eir);
    }
}
