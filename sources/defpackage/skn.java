package defpackage;

import com.spotify.android.flags.Overridable;

/* renamed from: skn reason: default package */
public final class skn extends hju {
    private static fqa a = hjp.b("ab-lyrics-v2-1", Overridable.ALWAYS);
    private static fqa b = hjp.b("ab-lyrics-v2-2", Overridable.ALWAYS);
    private static fqa c = hjp.b("ab-lyrics-v2-3", Overridable.ALWAYS);
    private static fqa d = hjp.b("ab-lyrics-v2-4", Overridable.ALWAYS);
    private static fqa e = hjp.b("ab-lyrics-v2-5", Overridable.ALWAYS);
    private static fqa[] f = {a, b, c, d, e};

    public static boolean a(fpt fpt) {
        fqa[] fqaArr;
        for (fqa fqa : f) {
            if (fqa != null) {
                String str = (String) fpt.a(fqa);
                if (str != null && str.equalsIgnoreCase("Enabled")) {
                    return true;
                }
            }
        }
        return false;
    }
}
