package defpackage;

import java.util.Map;

/* renamed from: chk reason: default package */
final class chk implements bgl<Object> {
    private final /* synthetic */ chj a;

    chk(chj chj) {
        this.a = chj;
    }

    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.a.b) {
            if (!this.a.e.isDone()) {
                if (this.a.c.equals(map.get("request_id"))) {
                    chp chp = new chp(1, map);
                    String str = chp.d;
                    String valueOf = String.valueOf(chp.a);
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(valueOf).length());
                    sb.append("Invalid ");
                    sb.append(str);
                    sb.append(" request error: ");
                    sb.append(valueOf);
                    sb.toString();
                    cow.a(5);
                    this.a.e.b(chp);
                }
            }
        }
    }
}
