package defpackage;

/* renamed from: qih reason: default package */
public final class qih implements gxk {
    private final squ b;
    private final qiu c;

    public qih(squ squ, qiu qiu) {
        this.b = (squ) fbp.a(squ);
        this.c = qiu;
    }

    public static hci a(String str, int i) {
        fbp.a(str);
        return hct.builder().a("openHistoryItem").a("targetUri", str).a("position", Integer.valueOf(i)).a();
    }

    public final void handleCommand(hci hci, gwy gwy) {
        this.b.a();
        String string = hci.data().string("targetUri");
        int intValue = hci.data().intValue("position").intValue();
        if (!fbo.a(string)) {
            this.c.a(string, intValue);
        }
    }
}