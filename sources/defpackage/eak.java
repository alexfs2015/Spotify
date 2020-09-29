package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@cfp
/* renamed from: eak reason: default package */
public abstract class eak<ReferenceT> {
    private final Map<String, CopyOnWriteArrayList<bhc<? super ReferenceT>>> a = new HashMap();

    private final synchronized void a(String str, Map<String, String> map) {
        if (cml.a(2)) {
            String str2 = "Received GMSG: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            cml.a();
            for (String str3 : map.keySet()) {
                String str4 = (String) map.get(str3);
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 4 + String.valueOf(str4).length());
                sb.append("  ");
                sb.append(str3);
                sb.append(": ");
                sb.append(str4);
                sb.toString();
                cml.a();
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.a.get(str);
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                cqo.a.execute(new eal(this, (bhc) it.next(), map));
            }
        }
    }

    public final synchronized void a(String str, bhc<? super ReferenceT> bhc) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.a.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.a.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(bhc);
    }

    public final synchronized void a(String str, cag<bhc<? super ReferenceT>> cag) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.a.get(str);
        if (copyOnWriteArrayList != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                bhc bhc = (bhc) it.next();
                if (cag.a(bhc)) {
                    arrayList.add(bhc);
                }
            }
            copyOnWriteArrayList.removeAll(arrayList);
        }
    }

    public final boolean a(Uri uri) {
        if ("gmsg".equalsIgnoreCase(uri.getScheme())) {
            if ("mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
                String path = uri.getPath();
                bkc.e();
                a(path, cmu.a(uri));
                return true;
            }
        }
        return false;
    }

    public final synchronized void b(String str, bhc<? super ReferenceT> bhc) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.a.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(bhc);
        }
    }

    public synchronized void k() {
        this.a.clear();
    }

    public abstract ReferenceT n();
}
