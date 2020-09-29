package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: wsg reason: default package */
public abstract class wsg implements Iterable<Entry<String, String>> {
    static {
        wrx.c();
    }

    protected wsg() {
    }

    public abstract Iterator<Entry<CharSequence, CharSequence>> a();

    public wsg a(CharSequence charSequence) {
        return a(charSequence.toString());
    }

    public wsg a(CharSequence charSequence, Iterable<?> iterable) {
        return a(charSequence.toString(), iterable);
    }

    public wsg a(CharSequence charSequence, Object obj) {
        return a(charSequence.toString(), obj);
    }

    public abstract wsg a(String str);

    public abstract wsg a(String str, Iterable<?> iterable);

    public abstract wsg a(String str, Object obj);

    public boolean a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        return a(charSequence.toString(), charSequence2.toString(), z);
    }

    public boolean a(String str, String str2, boolean z) {
        List<String> c = c(str);
        if (c.isEmpty()) {
            return false;
        }
        for (String str3 : c) {
            if (z) {
                if (str3.equalsIgnoreCase(str2)) {
                    return true;
                }
            } else if (str3.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public String b(CharSequence charSequence) {
        return b(charSequence.toString());
    }

    public abstract String b(String str);

    public wsg b(CharSequence charSequence, Object obj) {
        return b(charSequence.toString(), obj);
    }

    public abstract wsg b(String str, Object obj);

    public abstract boolean b();

    public List<String> c(CharSequence charSequence) {
        return c(charSequence.toString());
    }

    public abstract List<String> c(String str);

    public boolean d(CharSequence charSequence) {
        return d(charSequence.toString());
    }

    public abstract boolean d(String str);

    @Deprecated
    public abstract Iterator<Entry<String, String>> iterator();
}
