package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: nsl reason: default package */
public final class nsl {
    final String a;
    final List<vom> b = Collections.emptyList();

    /* renamed from: nsl$a */
    public final class a {
        final List<vom> a;

        /* synthetic */ a(nsl nsl, byte b2) {
            this();
        }

        private a() {
            List<vom> list = nsl.this.b;
            defpackage.vom.a a2 = vom.a();
            a2.a = "login_button";
            vom a3 = a2.a();
            ArrayList arrayList = new ArrayList(list.size() + 1);
            arrayList.add(a3);
            this.a = Collections.unmodifiableList(arrayList);
        }
    }

    public nsl(String str) {
        this.a = str;
    }
}
