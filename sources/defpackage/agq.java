package defpackage;

import java.util.HashMap;

/* renamed from: agq reason: default package */
public final class agq {
    private static HashMap<String, agp> a = new HashMap<>();

    public static synchronized agp a(String str) {
        agp agp;
        synchronized (agq.class) {
            agp = (agp) a.get(str);
            if (agp == null) {
                agp = new agp(str);
                a.put(str, agp);
            }
        }
        return agp;
    }
}
