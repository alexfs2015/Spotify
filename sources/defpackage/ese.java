package defpackage;

/* renamed from: ese reason: default package */
public final class ese implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ long b;
    private final /* synthetic */ eqf c;

    public ese(eqf eqf, String str, long j) {
        this.c = eqf;
        this.a = str;
        this.b = j;
    }

    public final void run() {
        eqf eqf = this.c;
        String str = this.a;
        long j = this.b;
        eqf.c();
        bwx.a(str);
        Integer num = (Integer) eqf.b.get(str);
        if (num != null) {
            eto v = eqf.h().v();
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                eqf.b.remove(str);
                Long l = (Long) eqf.a.get(str);
                if (l == null) {
                    eqf.q().c.a("First ad unit exposure time was never set");
                } else {
                    long longValue = j - l.longValue();
                    eqf.a.remove(str);
                    eqf.a(str, longValue, v);
                }
                if (eqf.b.isEmpty()) {
                    if (eqf.c == 0) {
                        eqf.q().c.a("First ad exposure time was never set");
                        return;
                    } else {
                        eqf.a(j - eqf.c, v);
                        eqf.c = 0;
                    }
                }
                return;
            }
            eqf.b.put(str, Integer.valueOf(intValue));
            return;
        }
        eqf.q().c.a("Call to endAdUnitExposure for unknown ad unit id", str);
    }
}
