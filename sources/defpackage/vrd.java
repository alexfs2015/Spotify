package defpackage;

/* renamed from: vrd reason: default package */
public abstract class vrd {
    public static final vrd a = a("UNKNOWN");
    public static final vrd b = a("INVALID_TOKEN");
    public static final vrd c = a("INVALID_RESPONSE");
    public static final vrd d = a("BOOTSTRAP");
    public static final vrd e = a("HTTP_HEADERS");
    public static final vrd f = a("PLAYER");
    public static final vrd g = a("CHANNEL");
    public static final vrd h = a("INITIALIZATION");
    public static final vrd i = a("START");
    public static final vrd j = a("NO_MIC_DATA");
    public static final vrd k = a("INVALID_BUFFER_SIZE");

    public abstract String a();

    public static vrd a(String str) {
        return new vqy(str);
    }
}
