package defpackage;

/* renamed from: eap reason: default package */
final /* synthetic */ class eap implements Runnable {
    private final eao a;
    private final String b;

    eap(eao eao, String str) {
        this.a = eao;
        this.b = str;
    }

    public final void run() {
        eao eao = this.a;
        eao.a.b(this.b);
    }
}
