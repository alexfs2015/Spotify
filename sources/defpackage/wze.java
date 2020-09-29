package defpackage;

/* renamed from: wze reason: default package */
public interface wze {
    public static final int a = Integer.getInteger("jctools.cacheLineSize", 64).intValue();

    static {
        wzg.a.pageSize();
        Runtime.getRuntime().availableProcessors();
    }
}
