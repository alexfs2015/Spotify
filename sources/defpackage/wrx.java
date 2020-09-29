package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: wrx reason: default package */
public final class wrx extends wsg {
    public static final wrx a = wss.a;
    private static Iterator<Entry<CharSequence, CharSequence>> b = Collections.emptyList().iterator();

    protected wrx() {
    }

    @Deprecated
    static wrx c() {
        return wss.a;
    }

    public final Iterator<Entry<CharSequence, CharSequence>> a() {
        return b;
    }

    public final wsg a(String str) {
        throw new UnsupportedOperationException("read only");
    }

    public final wsg a(String str, Iterable<?> iterable) {
        throw new UnsupportedOperationException("read only");
    }

    public final wsg a(String str, Object obj) {
        throw new UnsupportedOperationException("read only");
    }

    public final String b(String str) {
        return null;
    }

    public final wsg b(String str, Object obj) {
        throw new UnsupportedOperationException("read only");
    }

    public final boolean b() {
        return true;
    }

    public final List<String> c(String str) {
        return Collections.emptyList();
    }

    public final boolean d(String str) {
        return false;
    }

    public final Iterator<Entry<String, String>> iterator() {
        return Collections.emptyList().iterator();
    }
}
