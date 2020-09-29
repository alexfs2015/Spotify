package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: bxn reason: default package */
final class bxn extends bxi {
    private final b<Status> a;

    public bxn(b<Status> bVar) {
        this.a = bVar;
    }

    public final void a(int i) {
        this.a.a(new Status(i));
    }
}
