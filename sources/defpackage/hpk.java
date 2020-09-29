package defpackage;

import com.spotify.mobile.android.service.media.browser.RootListType;
import java.util.regex.Pattern;

/* renamed from: hpk reason: default package */
public final class hpk {
    private static final Pattern a = Pattern.compile(":type:");

    public static boolean a(String str) {
        String[] split = a.split(str);
        if (split.length == 2) {
            String str2 = split[1];
            for (RootListType rootListType : RootListType.d) {
                if (rootListType.name.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static RootListType b(String str) {
        RootListType[] rootListTypeArr;
        String[] split = a.split(str);
        if (split.length == 2) {
            String str2 = split[1];
            for (RootListType rootListType : RootListType.d) {
                if (rootListType.name.equalsIgnoreCase(str2)) {
                    return rootListType;
                }
            }
        }
        return null;
    }
}
