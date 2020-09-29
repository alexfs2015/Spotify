package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* renamed from: ath reason: default package */
final class ath extends TagPayloadReader {
    long a = -9223372036854775807L;

    public final boolean a(bdj bdj) {
        return true;
    }

    public ath() {
        super(null);
    }

    private static Boolean b(bdj bdj) {
        boolean z = true;
        if (bdj.c() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private static Double c(bdj bdj) {
        return Double.valueOf(Double.longBitsToDouble(bdj.k()));
    }

    private static String d(bdj bdj) {
        int d = bdj.d();
        int i = bdj.b;
        bdj.d(d);
        return new String(bdj.a, i, d);
    }

    private static ArrayList<Object> e(bdj bdj) {
        int n = bdj.n();
        ArrayList<Object> arrayList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arrayList.add(a(bdj, bdj.c()));
        }
        return arrayList;
    }

    private static HashMap<String, Object> f(bdj bdj) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String d = d(bdj);
            int c = bdj.c();
            if (c == 9) {
                return hashMap;
            }
            hashMap.put(d, a(bdj, c));
        }
    }

    private static HashMap<String, Object> g(bdj bdj) {
        int n = bdj.n();
        HashMap<String, Object> hashMap = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            hashMap.put(d(bdj), a(bdj, bdj.c()));
        }
        return hashMap;
    }

    private static Date h(bdj bdj) {
        Date date = new Date((long) c(bdj).doubleValue());
        bdj.d(2);
        return date;
    }

    private static Object a(bdj bdj, int i) {
        if (i == 0) {
            return c(bdj);
        }
        if (i == 1) {
            return b(bdj);
        }
        if (i == 2) {
            return d(bdj);
        }
        if (i == 3) {
            return f(bdj);
        }
        if (i == 8) {
            return g(bdj);
        }
        if (i == 10) {
            return e(bdj);
        }
        if (i != 11) {
            return null;
        }
        return h(bdj);
    }

    public final void a(bdj bdj, long j) {
        if (bdj.c() == 2) {
            if ("onMetaData".equals(d(bdj)) && bdj.c() == 8) {
                HashMap g = g(bdj);
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
}
