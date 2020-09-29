package defpackage;

import com.google.android.gms.common.api.Status;
import defpackage.bti.a;

/* renamed from: bvy reason: default package */
public final class bvy<A extends a<? extends btc, b>> extends bur {
    private final A a;

    public bvy(int i, A a2) {
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

    public final void a(btt btt, boolean z) {
        A a2 = this.a;
        btt.a.put(a2, Boolean.valueOf(z));
        a2.a((a) new btu(btt, a2));
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
}
