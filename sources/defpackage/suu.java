package defpackage;

import com.spotify.android.flags.Overridable;

/* renamed from: suu reason: default package */
public final class suu extends hmm {
    private static fqu a = hmh.b("ab-lyrics-v2-1", Overridable.ALWAYS);
    private static fqu b = hmh.b("ab-lyrics-v2-pilot-new-users-1-and", Overridable.ALWAYS);
    private static fqu c = hmh.b("ab-lyrics-v2-pilot-new-users-2-and", Overridable.ALWAYS);
    private static fqu d = hmh.b("ab-lyrics-v2-pilot-existing-users-1-and", Overridable.ALWAYS);
    private static fqu e = hmh.b("ab-lyrics-v2-pilot-existing-users-2-and", Overridable.ALWAYS);
    private static fqu[] f = {a, b, c, d, e};

    public static boolean a(fqn fqn) {
        fqu[] fquArr;
        for (fqu fqu : f) {
            if (fqu != null) {
                String str = (String) fqn.a(fqu);
                if (str != null && str.equalsIgnoreCase("Enabled")) {
                    return true;
                }
            }
        }
        return false;
    }
}
