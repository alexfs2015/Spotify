package defpackage;

/* renamed from: cff reason: default package */
final class cff implements cpu<cti> {
    private final /* synthetic */ String a;
    private final /* synthetic */ bhc b;

    cff(String str, bhc bhc) {
        this.a = str;
        this.b = bhc;
    }

    public final /* synthetic */ void a(Object obj) {
        ((cti) obj).a(this.a, this.b);
    }

    public final void a(Throwable th) {
    }
}
