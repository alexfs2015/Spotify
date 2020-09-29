package defpackage;

/* renamed from: mdi reason: default package */
public final class mdi {
    public static int a(hcs hcs) {
        return ((Integer) jvi.a(hcs.custom().intValue("next_page_offset"), Integer.valueOf(0))).intValue();
    }

    public static boolean b(hcs hcs) {
        return hcs.custom().intValue("next_page_offset") != null;
    }
}
