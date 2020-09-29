package defpackage;

/* renamed from: aer reason: default package */
public final class aer extends adp implements agb {
    private final aeb c;
    private final aeb d;
    private final afq e = ((afq[]) agj.a(this.c, afq.class, 1))[0];

    public aer(acq acq, acr acr) {
        super(acq, acr);
        String str = "%s:%d";
        this.c = new aeb(String.format(str, new Object[]{this.b, Integer.valueOf(0)}));
        this.d = new aeb(String.format(str, new Object[]{this.b, Integer.valueOf(1)}));
    }
}
