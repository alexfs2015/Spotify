package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: nyo reason: default package */
public final class nyo {
    final String a;
    final List<wbu> b = Collections.emptyList();

    /* renamed from: nyo$a */
    public final class a {
        final List<wbu> a;

        private a() {
            List<wbu> list = nyo.this.b;
            defpackage.wbu.a a2 = wbu.a();
            a2.a = "login_button";
            wbu a3 = a2.a();
            ArrayList arrayList = new ArrayList(list.size() + 1);
            arrayList.add(a3);
            this.a = Collections.unmodifiableList(arrayList);
        }

        /* synthetic */ a(nyo nyo, byte b2) {
            this();
        }
    }

    public nyo(String str) {
        this.a = str;
    }
}
