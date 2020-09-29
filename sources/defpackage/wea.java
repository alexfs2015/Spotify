package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: wea reason: default package */
public abstract class wea implements Iterable<Entry<String, String>> {
    public abstract Iterator<Entry<CharSequence, CharSequence>> a();

    public abstract wea a(String str);

    public abstract wea a(String str, Iterable<?> iterable);

    public abstract wea a(String str, Object obj);

    public abstract String b(String str);

    public abstract wea b(String str, Object obj);

    public abstract boolean b();

    public abstract List<String> c(String str);

    public abstract boolean d(String str);

    @Deprecated
    public abstract Iterator<Entry<String, String>> iterator();

    static {
        wdr.c();
    }

    protected wea() {
    }

    public String b(CharSequence charSequence) {
        return b(charSequence.toString());
    }

    public List<String> c(CharSequence charSequence) {
        return c(charSequence.toString());
    }

    public boolean d(CharSequence charSequence) {
        return d(charSequence.toString());
    }

    public wea a(CharSequence charSequence, Object obj) {
        return a(charSequence.toString(), obj);
    }

    public wea b(CharSequence charSequence, Object obj) {
        return b(charSequence.toString(), obj);
    }

    public wea a(CharSequence charSequence, Iterable<?> iterable) {
        return a(charSequence.toString(), iterable);
    }

    public wea a(CharSequence charSequence) {
        return a(charSequence.toString());
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

    public boolean a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        return a(charSequence.toString(), charSequence2.toString(), z);
    }
}
