package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: bpp reason: default package */
final class bpp implements btd<Status> {
    private final long a;
    private final /* synthetic */ e b;

    bpp(e eVar, long j) {
        this.b = eVar;
        this.a = j;
    }

    public final /* synthetic */ void onResult(btc btc) {
        Status status = (Status) btc;
        if (!status.c()) {
            bpf.this.f.a(this.a, status.f);
        }
    }
}
