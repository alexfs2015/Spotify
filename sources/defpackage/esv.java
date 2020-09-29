package defpackage;

/* renamed from: esv reason: default package */
public final class esv implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ long b;
    private final /* synthetic */ eqw c;

    public esv(eqw eqw, String str, long j) {
        this.c = eqw;
        this.a = str;
        this.b = j;
    }

    public final void run() {
        eqw eqw = this.c;
        String str = this.a;
        long j = this.b;
        eqw.c();
        bxo.a(str);
        Integer num = (Integer) eqw.b.get(str);
        if (num != null) {
            euf v = eqw.h().v();
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                eqw.b.remove(str);
                Long l = (Long) eqw.a.get(str);
                if (l == null) {
                    eqw.q().c.a("First ad unit exposure time was never set");
                } else {
                    long longValue = j - l.longValue();
                    eqw.a.remove(str);
                    eqw.a(str, longValue, v);
                }
                if (eqw.b.isEmpty()) {
                    if (eqw.c == 0) {
                        eqw.q().c.a("First ad exposure time was never set");
                        return;
                    } else {
                        eqw.a(j - eqw.c, v);
                        eqw.c = 0;
                    }
                }
                return;
            }
            eqw.b.put(str, Integer.valueOf(intValue));
            return;
        }
        eqw.q().c.a("Call to endAdUnitExposure for unknown ad unit id", str);
    }
}
