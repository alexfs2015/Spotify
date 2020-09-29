package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* renamed from: aty reason: default package */
final class aty extends TagPayloadReader {
    long a = -9223372036854775807L;

    public aty() {
        super(null);
    }

    private static Object a(bea bea, int i) {
        if (i == 0) {
            return c(bea);
        }
        if (i == 1) {
            return b(bea);
        }
        if (i == 2) {
            return d(bea);
        }
        if (i == 3) {
            return f(bea);
        }
        if (i == 8) {
            return g(bea);
        }
        if (i == 10) {
            return e(bea);
        }
        if (i != 11) {
            return null;
        }
        return h(bea);
    }

    private static Boolean b(bea bea) {
        boolean z = true;
        if (bea.c() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private static Double c(bea bea) {
        return Double.valueOf(Double.longBitsToDouble(bea.k()));
    }

    private static String d(bea bea) {
        int d = bea.d();
        int i = bea.b;
        bea.d(d);
        return new String(bea.a, i, d);
    }

    private static ArrayList<Object> e(bea bea) {
        int n = bea.n();
        ArrayList<Object> arrayList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arrayList.add(a(bea, bea.c()));
        }
        return arrayList;
    }

    private static HashMap<String, Object> f(bea bea) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String d = d(bea);
            int c = bea.c();
            if (c == 9) {
                return hashMap;
            }
            hashMap.put(d, a(bea, c));
        }
    }

    private static HashMap<String, Object> g(bea bea) {
        int n = bea.n();
        HashMap<String, Object> hashMap = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            hashMap.put(d(bea), a(bea, bea.c()));
        }
        return hashMap;
    }

    private static Date h(bea bea) {
        Date date = new Date((long) c(bea).doubleValue());
        bea.d(2);
        return date;
    }

    public final void a(bea bea, long j) {
        if (bea.c() == 2) {
            if ("onMetaData".equals(d(bea)) && bea.c() == 8) {
                HashMap g = g(bea);
                String str = "duration";
                if (g.containsKey(str)) {
                    double doubleValue = ((Double) g.get(str)).doubleValue();
                    if (doubleValue > 0.0d) {
                        this.a = (long) (doubleValue * 1000000.0d);
                    }
                }
                return;
            }
            return;
        }
        throw new ParserException();
    }

    public final boolean a(bea bea) {
        return true;
    }
}
