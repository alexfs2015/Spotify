package defpackage;

/* renamed from: wxo reason: default package */
final class wxo {
    private wxo() {
    }

    public static void a(String str, boolean z) {
        if (z) {
            System.load(str);
        } else {
            System.loadLibrary(str);
        }
    }
}
