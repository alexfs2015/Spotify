package defpackage;

/* renamed from: dvl reason: default package */
final class dvl implements Runnable {
    private final /* synthetic */ duy a;
    private final /* synthetic */ dvk b;

    dvl(dvk dvk, duy duy) {
        this.b = dvk;
        this.a = duy;
    }

    public final void run() {
        dvk.a(this.b, this.a);
    }
}
