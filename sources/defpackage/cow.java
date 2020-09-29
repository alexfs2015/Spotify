package defpackage;

@cfp
/* renamed from: cow reason: default package */
public final class cow {
    private static cow b;
    String a;

    private cow() {
    }

    public static cow a() {
        if (b == null) {
            b = new cow();
        }
        return b;
    }
}
