package defpackage;

/* renamed from: bva reason: default package */
final class bva implements Runnable {
    private final /* synthetic */ ewx a;
    private final /* synthetic */ buy b;

    bva(buy buy, ewx ewx) {
        this.b = buy;
        this.a = ewx;
    }

    public final void run() {
        buy.a(this.b, this.a);
    }
}
