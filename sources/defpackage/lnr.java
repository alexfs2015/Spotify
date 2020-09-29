package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;

/* renamed from: lnr reason: default package */
public final class lnr implements wig<ObjectMapper> {
    private final wzi<rwj> a;

    private lnr(wzi<rwj> wzi) {
        this.a = wzi;
    }

    public static lnr a(wzi<rwj> wzi) {
        return new lnr(wzi);
    }

    public final /* synthetic */ Object get() {
        return (ObjectMapper) wil.a(((rwj) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
