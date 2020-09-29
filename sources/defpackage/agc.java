package defpackage;

import java.util.HashMap;

/* renamed from: agc reason: default package */
public final class agc {
    private static HashMap<String, agb> a = new HashMap<>();

    public static synchronized agb a(String str) {
        agb agb;
        synchronized (agc.class) {
            agb = (agb) a.get(str);
            if (agb == null) {
                agb = new agb(str);
                a.put(str, agb);
            }
        }
        return agb;
    }
}
