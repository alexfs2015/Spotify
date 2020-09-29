package defpackage;

import java.util.Map;

/* renamed from: cib reason: default package */
final class cib implements bhc<Object> {
    private final /* synthetic */ cia a;

    cib(cia cia) {
        this.a = cia;
    }

    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.a.b) {
            if (!this.a.e.isDone()) {
                if (this.a.c.equals(map.get("request_id"))) {
                    cig cig = new cig(1, map);
                    String str = cig.d;
                    String valueOf = String.valueOf(cig.a);
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(valueOf).length());
                    sb.append("Invalid ");
                    sb.append(str);
                    sb.append(" request error: ");
                    sb.append(valueOf);
                    sb.toString();
                    cpn.a(5);
                    this.a.e.b(cig);
                }
            }
        }
    }
}
