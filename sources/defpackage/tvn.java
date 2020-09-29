package defpackage;

import android.text.TextUtils;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Set;

/* renamed from: tvn reason: default package */
public final class tvn {
    private static final FormatListType[] b = FormatListType.values();
    public final EnumMap<FormatListType, a> a = new EnumMap<>(FormatListType.class);

    public tvn(Set<tvp> set) {
        FormatListType[] formatListTypeArr;
        for (tvp a2 : set) {
            a a3 = a2.a();
            FormatListType a4 = a3.a();
            if (this.a.containsKey(a4)) {
                StringBuilder sb = new StringBuilder("Format list type ");
                sb.append(a4);
                sb.append(" is already registered.");
                Assertion.b(sb.toString());
            }
            this.a.put(a4, a3);
        }
        for (FormatListType formatListType : b) {
            if (formatListType != FormatListType.PLAYLIST && this.a.get(formatListType) == null) {
                StringBuilder sb2 = new StringBuilder("Could not find provider for format list type ");
                sb2.append(formatListType);
                sb2.append(". All format list types are required to have a provider. See javadoc of FormatListType on how to add a provider for your new format list type.");
                Assertion.b(sb2.toString());
            }
        }
    }

    private boolean a(FormatListType formatListType, fqn fqn) {
        a aVar = (a) this.a.get(formatListType);
        if (aVar == null) {
            return false;
        }
        return aVar.a(fqn);
    }

    public final FormatListType a(String str) {
        if (TextUtils.isEmpty(str)) {
            return FormatListType.PLAYLIST;
        }
        FormatListType formatListType = FormatListType.PLAYLIST;
        for (a aVar : this.a.values()) {
            if (aVar.b().matcher(str).matches()) {
                FormatListType a2 = aVar.a();
                if (formatListType != FormatListType.PLAYLIST) {
                    StringBuilder sb = new StringBuilder("Ambiguous patterns detected. Pattern for type ");
                    sb.append(formatListType);
                    sb.append(" overlaps with ");
                    sb.append(a2);
                    sb.append(", which is not allowed.");
                    Assertion.b(sb.toString());
                }
                formatListType = a2;
            }
        }
        return formatListType;
    }

    public final String a(FormatListType formatListType, String str, fqn fqn) {
        a aVar = (a) this.a.get(formatListType);
        if (aVar == null) {
            return str;
        }
        String c = aVar.c();
        boolean isEmpty = TextUtils.isEmpty(c);
        boolean a2 = a(formatListType, fqn);
        if (a2 && isEmpty) {
            Assertion.b("Provider says that we should redirect, but we don't have an baseViewUri to redirect to.");
        }
        if (isEmpty || !a2) {
            return str;
        }
        return String.format(Locale.US, "%s:%s", new Object[]{c, str});
    }
}
