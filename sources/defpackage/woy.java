package defpackage;

/* renamed from: woy reason: default package */
public interface woy extends wwk<wox> {
    public static final woy a = new woy() {
        public final /* synthetic */ void operationComplete(wwi wwi) {
            ((wox) wwi).e().i();
        }
    };
    public static final woy b = new woy() {
        public final /* synthetic */ void operationComplete(wwi wwi) {
            wox wox = (wox) wwi;
            if (!wox.g()) {
                wox.e().i();
            }
        }
    };

    static {
        new woy() {
            public final /* synthetic */ void operationComplete(wwi wwi) {
                wox wox = (wox) wwi;
                if (!wox.g()) {
                    wox.e().c().a(wox.f());
                }
            }
        };
    }
}
