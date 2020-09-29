package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@cfp
/* renamed from: cls reason: default package */
public final class cls {
    public final cme a;
    public final LinkedList<clt> b;
    public final Object c;
    public long d;
    public long e;
    public boolean f;
    public long g;
    public long h;
    public long i;
    public long j;
    private final String k;
    private final String l;

    private cls(cme cme, String str, String str2) {
        this.c = new Object();
        this.d = -1;
        this.e = -1;
        this.f = false;
        this.g = -1;
        this.h = 0;
        this.i = -1;
        this.j = -1;
        this.a = cme;
        this.k = str;
        this.l = str2;
        this.b = new LinkedList<>();
    }

    public cls(String str, String str2) {
        this(bkc.j(), str, str2);
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.c) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.k);
            bundle.putString("slotid", this.l);
            bundle.putBoolean("ismediation", this.f);
            bundle.putLong("treq", this.i);
            bundle.putLong("tresponse", this.j);
            bundle.putLong("timp", this.e);
            bundle.putLong("tload", this.g);
            bundle.putLong("pcc", this.h);
            bundle.putLong("tfetch", this.d);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                clt clt = (clt) it.next();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("topen", clt.a);
                bundle2.putLong("tclose", clt.b);
                arrayList.add(bundle2);
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }
}
