package defpackage;

import com.google.android.gms.common.api.Status;
import defpackage.bsr.a;

/* renamed from: bvh reason: default package */
public final class bvh<A extends a<? extends bsl, b>> extends bua {
    private final A a;

    public bvh(int i, A a2) {
        super(i);
        this.a = a2;
    }

    public final void a(a<?> aVar) {
        try {
            this.a.b(aVar.a);
        } catch (RuntimeException e) {
            a(e);
        }
    }

    public final void a(Status status) {
        this.a.b(status);
    }

    public final void a(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.a.b(new Status(10, sb.toString()));
    }

    public final void a(btc btc, boolean z) {
        A a2 = this.a;
        btc.a.put(a2, Boolean.valueOf(z));
        a2.a((a) new btd(btc, a2));
    }
}
