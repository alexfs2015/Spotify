package defpackage;

/* renamed from: erw reason: default package */
public final class erw implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ long b;
    private final /* synthetic */ eqw c;

    public erw(eqw eqw, String str, long j) {
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
        if (eqw.b.isEmpty()) {
            eqw.c = j;
        }
        Integer num = (Integer) eqw.b.get(str);
        if (num != null) {
            eqw.b.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (eqw.b.size() >= 100) {
            eqw.q().f.a("Too many ads visible");
        } else {
            eqw.b.put(str, Integer.valueOf(1));
            eqw.a.put(str, Long.valueOf(j));
        }
    }
}
