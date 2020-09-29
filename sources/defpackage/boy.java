package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: boy reason: default package */
final class boy implements bsm<Status> {
    private final long a;
    private final /* synthetic */ e b;

    boy(e eVar, long j) {
        this.b = eVar;
        this.a = j;
    }

    public final /* synthetic */ void onResult(bsl bsl) {
        Status status = (Status) bsl;
        if (!status.c()) {
            boo.this.f.a(this.a, status.f);
        }
    }
}
