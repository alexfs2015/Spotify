package defpackage;

/* renamed from: erf reason: default package */
public final class erf implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ long b;
    private final /* synthetic */ eqf c;

    public erf(eqf eqf, String str, long j) {
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
        if (eqf.b.isEmpty()) {
            eqf.c = j;
        }
        Integer num = (Integer) eqf.b.get(str);
        if (num != null) {
            eqf.b.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (eqf.b.size() >= 100) {
            eqf.q().f.a("Too many ads visible");
        } else {
            eqf.b.put(str, Integer.valueOf(1));
            eqf.a.put(str, Long.valueOf(j));
        }
    }
}
