package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: cor reason: default package */
final class cor {
    long a;
    final String b;
    final String c;
    final long d;
    final long e;
    final long f;
    final long g;
    final List<dql> h;

    cor(String str, dho dho) {
        List list;
        dho dho2 = dho;
        String str2 = dho2.b;
        long j = dho2.c;
        long j2 = dho2.d;
        long j3 = dho2.e;
        long j4 = dho2.f;
        if (dho2.h != null) {
            list = dho2.h;
        } else {
            Map<String, String> map = dho2.g;
            ArrayList arrayList = new ArrayList(map.size());
            for (Entry entry : map.entrySet()) {
                arrayList.add(new dql((String) entry.getKey(), (String) entry.getValue()));
            }
            list = arrayList;
        }
        this(str, str2, j, j2, j3, j4, list);
        this.a = (long) dho2.a.length;
    }

    private cor(String str, String str2, long j, long j2, long j3, long j4, List<dql> list) {
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

    static cor a(cps cps) {
        if (cns.a((InputStream) cps) == 538247942) {
            cor cor = new cor(cns.a(cps), cns.a(cps), cns.b((InputStream) cps), cns.b((InputStream) cps), cns.b((InputStream) cps), cns.b((InputStream) cps), cns.b(cps));
            return cor;
        }
        throw new IOException();
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(OutputStream outputStream) {
        try {
            cns.a(outputStream, 538247942);
            cns.a(outputStream, this.b);
            cns.a(outputStream, this.c == null ? "" : this.c);
            cns.a(outputStream, this.d);
            cns.a(outputStream, this.e);
            cns.a(outputStream, this.f);
            cns.a(outputStream, this.g);
            List<dql> list = this.h;
            if (list != null) {
                cns.a(outputStream, list.size());
                for (dql dql : list) {
                    cns.a(outputStream, dql.a);
                    cns.a(outputStream, dql.b);
                }
            } else {
                cns.a(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e2) {
            cgp.b("%s", e2.toString());
            return false;
        }
    }
}
