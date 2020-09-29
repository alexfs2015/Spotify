package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: wdr reason: default package */
public final class wdr extends wea {
    public static final wdr a = wem.a;
    private static Iterator<Entry<CharSequence, CharSequence>> b = Collections.emptyList().iterator();

    public final String b(String str) {
        return null;
    }

    public final boolean b() {
        return true;
    }

    public final boolean d(String str) {
        return false;
    }

    @Deprecated
    static wdr c() {
        return wem.a;
    }

    protected wdr() {
    }

    public final List<String> c(String str) {
        return Collections.emptyList();
    }

    public final wea a(String str, Object obj) {
        throw new UnsupportedOperationException("read only");
    }

    public final wea b(String str, Object obj) {
        throw new UnsupportedOperationException("read only");
    }

    public final wea a(String str, Iterable<?> iterable) {
        throw new UnsupportedOperationException("read only");
    }

    public final wea a(String str) {
        throw new UnsupportedOperationException("read only");
    }

    public final Iterator<Entry<CharSequence, CharSequence>> a() {
        return b;
    }

    public final Iterator<Entry<String, String>> iterator() {
        return Collections.emptyList().iterator();
    }
}
