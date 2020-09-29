package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: odr reason: default package */
public final class odr {
    public final String a;
    final List<vom> b = Collections.emptyList();

    /* renamed from: odr$a */
    public final class a {
        public final List<vom> a;

        public /* synthetic */ a(odr odr, byte b2) {
            this();
        }

        private a() {
            List<vom> list = odr.this.b;
            defpackage.vom.a a2 = vom.a();
            a2.a = "transition_view";
            vom a3 = a2.a();
            ArrayList arrayList = new ArrayList(list.size() + 1);
            arrayList.add(a3);
            this.a = Collections.unmodifiableList(arrayList);
        }
    }

    public odr(String str) {
        this.a = str;
    }
}
