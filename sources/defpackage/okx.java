package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: okx reason: default package */
public final class okx {
    public final String a;
    final List<wbu> b = Collections.emptyList();

    /* renamed from: okx$a */
    public final class a {
        public final List<wbu> a;

        private a() {
            List<wbu> list = okx.this.b;
            defpackage.wbu.a a2 = wbu.a();
            a2.a = "transition_view";
            wbu a3 = a2.a();
            ArrayList arrayList = new ArrayList(list.size() + 1);
            arrayList.add(a3);
            this.a = Collections.unmodifiableList(arrayList);
        }

        public /* synthetic */ a(okx okx, byte b2) {
            this();
        }
    }

    public okx(String str) {
        this.a = str;
    }
}
