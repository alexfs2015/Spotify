package defpackage;

/* renamed from: wky reason: default package */
public interface wky {
    public static final int a = Integer.getInteger("jctools.cacheLineSize", 64).intValue();

    static {
        wla.a.pageSize();
        Runtime.getRuntime().availableProcessors();
    }
}
