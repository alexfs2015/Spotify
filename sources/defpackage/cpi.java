package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: cpi reason: default package */
final class cpi {
    long a;
    final String b;
    final String c;
    final long d;
    final long e;
    final long f;
    final long g;
    final List<drc> h;

    cpi(String str, dif dif) {
        List list;
        dif dif2 = dif;
        String str2 = dif2.b;
        long j = dif2.c;
        long j2 = dif2.d;
        long j3 = dif2.e;
        long j4 = dif2.f;
        if (dif2.h != null) {
            list = dif2.h;
        } else {
            Map<String, String> map = dif2.g;
            ArrayList arrayList = new ArrayList(map.size());
            for (Entry entry : map.entrySet()) {
                arrayList.add(new drc((String) entry.getKey(), (String) entry.getValue()));
            }
            list = arrayList;
        }
        this(str, str2, j, j2, j3, j4, list);
        this.a = (long) dif2.a.length;
    }

    private cpi(String str, String str2, long j, long j2, long j3, long j4, List<drc> list) {
        this.b = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }

    static cpi a(cqj cqj) {
        if (coj.a((InputStream) cqj) == 538247942) {
            cpi cpi = new cpi(coj.a(cqj), coj.a(cqj), coj.b((InputStream) cqj), coj.b((InputStream) cqj), coj.b((InputStream) cqj), coj.b((InputStream) cqj), coj.b(cqj));
            return cpi;
        }
        throw new IOException();
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(OutputStream outputStream) {
        try {
            coj.a(outputStream, 538247942);
            coj.a(outputStream, this.b);
            coj.a(outputStream, this.c == null ? "" : this.c);
            coj.a(outputStream, this.d);
            coj.a(outputStream, this.e);
            coj.a(outputStream, this.f);
            coj.a(outputStream, this.g);
            List<drc> list = this.h;
            if (list != null) {
                coj.a(outputStream, list.size());
                for (drc drc : list) {
                    coj.a(outputStream, drc.a);
                    coj.a(outputStream, drc.b);
                }
            } else {
                coj.a(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e2) {
            chg.b("%s", e2.toString());
            return false;
        }
    }
}
