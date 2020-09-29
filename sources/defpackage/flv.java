package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import com.google.thirdparty.publicsuffix.PublicSuffixType;
import java.util.LinkedList;
import java.util.List;

/* renamed from: flv reason: default package */
final class flv {
    private static final fbl a = fbl.a("");

    private static int a(List<CharSequence> list, CharSequence charSequence, int i, a<String, PublicSuffixType> aVar) {
        int length = charSequence.length();
        int i2 = i;
        char c = 0;
        while (i2 < length) {
            c = charSequence.charAt(i2);
            if (c == '&' || c == '?' || c == '!' || c == ':' || c == ',') {
                break;
            }
            i2++;
        }
        list.add(0, b(charSequence.subSequence(i, i2)));
        if (c == '!' || c == '?' || c == ':' || c == ',') {
            String a2 = a.a((Iterable<?>) list);
            if (a2.length() > 0) {
                aVar.b(a2, PublicSuffixType.a(c));
            }
        }
        int i3 = i2 + 1;
        if (c != '?' && c != ',') {
            while (true) {
                if (i3 >= length) {
                    break;
                }
                i3 += a(list, charSequence, i3, aVar);
                if (charSequence.charAt(i3) != '?') {
                    if (charSequence.charAt(i3) == ',') {
                        break;
                    }
                } else {
                    break;
                }
            }
            i3++;
        }
        list.remove(0);
        return i3 - i;
    }

    static ImmutableMap<String, PublicSuffixType> a(CharSequence charSequence) {
        a g = ImmutableMap.g();
        int i = 0;
        while (i < charSequence.length()) {
            i += a(new LinkedList(), charSequence, i, g);
        }
        return g.b();
    }

    private static CharSequence b(CharSequence charSequence) {
        return new StringBuilder(charSequence).reverse();
    }
}
