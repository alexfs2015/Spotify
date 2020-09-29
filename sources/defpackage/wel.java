package defpackage;

/* renamed from: wel reason: default package */
public abstract class wel {
    public static final wel a = a("UNKNOWN");
    public static final wel b = a("INVALID_TOKEN");
    public static final wel c = a("INVALID_RESPONSE");
    public static final wel d = a("BOOTSTRAP");
    public static final wel e = a("HTTP_HEADERS");
    public static final wel f = a("PLAYER");
    public static final wel g = a("CHANNEL");
    public static final wel h = a("INITIALIZATION");
    public static final wel i = a("START");
    public static final wel j = a("NO_MIC_DATA");
    public static final wel k = a("INVALID_BUFFER_SIZE");
    public static final wel l = a("NO_MIC_PERMISSION");
    public static final wel m = a("OFFLINE");

    public static wel a(String str) {
        return new weg(str);
    }

    public abstract String a();
}
