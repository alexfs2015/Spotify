package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@cey
/* renamed from: dzt reason: default package */
public abstract class dzt<ReferenceT> {
    private final Map<String, CopyOnWriteArrayList<bgl<? super ReferenceT>>> a = new HashMap();

    public final synchronized void a(String str, bgl<? super ReferenceT> bgl) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.a.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.a.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(bgl);
    }

    public final synchronized void a(String str, bzp<bgl<? super ReferenceT>> bzp) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.a.get(str);
        if (copyOnWriteArrayList != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                bgl bgl = (bgl) it.next();
                if (bzp.a(bgl)) {
                    arrayList.add(bgl);
                }
            }
            copyOnWriteArrayList.removeAll(arrayList);
        }
    }

    public final boolean a(Uri uri) {
        if ("gmsg".equalsIgnoreCase(uri.getScheme())) {
            if ("mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
                String path = uri.getPath();
                bjl.e();
                a(path, cmd.a(uri));
                return true;
            }
        }
        return false;
    }

    public final synchronized void b(String str, bgl<? super ReferenceT> bgl) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.a.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(bgl);
        }
    }

    public synchronized void k() {
        this.a.clear();
    }

    public abstract ReferenceT n();

    private final synchronized void a(String str, Map<String, String> map) {
        if (clu.a(2)) {
            String str2 = "Received GMSG: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            clu.a();
            for (String str3 : map.keySet()) {
                String str4 = (String) map.get(str3);
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 4 + String.valueOf(str4).length());
                sb.append("  ");
                sb.append(str3);
                sb.append(": ");
                sb.append(str4);
                sb.toString();
                clu.a();
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.a.get(str);
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                cpx.a.execute(new dzu(this, (bgl) it.next(), map));
            }
        }
    }
}
