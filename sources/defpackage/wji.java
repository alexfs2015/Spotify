package defpackage;

/* renamed from: wji reason: default package */
final class wji {
    public static void a(String str, boolean z) {
        if (z) {
            System.load(str);
        } else {
            System.loadLibrary(str);
        }
    }

    private wji() {
    }
}
