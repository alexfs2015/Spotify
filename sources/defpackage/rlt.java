package defpackage;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: rlt reason: default package */
final class rlt extends rle {
    rlt() {
    }

    public final void a(aia aia, boolean z) {
        ArrayList arrayList;
        Map b = fpw.b();
        synchronized (b) {
            arrayList = new ArrayList(b.size());
            for (Entry entry : b.entrySet()) {
                StringBuilder sb = new StringBuilder();
                sb.append((String) entry.getKey());
                sb.append("=\"");
                sb.append(((Serializable) entry.getValue()).toString());
                sb.append('\"');
                arrayList.add(sb.toString());
            }
        }
        for (Entry entry2 : a(arrayList).entrySet()) {
            aia.a((String) entry2.getKey(), (String) entry2.getValue());
        }
    }

    private static Map<String, String> a(List<String> list) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            str = ",";
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            i += str3.length() + 1;
            if (i < 1024) {
                arrayList2.add(str3);
            } else {
                arrayList.add(TextUtils.join(str, arrayList2));
                arrayList2.clear();
                arrayList2.add(str3);
                i = str3.length() + 1;
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(TextUtils.join(str, arrayList2));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String str4 = "flag-set-";
            if (i2 == arrayList.size() - 1) {
                StringBuilder sb = new StringBuilder(str4);
                sb.append(i2);
                sb.append("-most-recently-read");
                str2 = sb.toString();
            } else if (i2 == 0) {
                str2 = "flag-set-0-least-recently-read";
            } else {
                StringBuilder sb2 = new StringBuilder(str4);
                sb2.append(i2);
                str2 = sb2.toString();
            }
            linkedHashMap.put(str2, arrayList.get(i2));
        }
        return linkedHashMap;
    }
}
