package defpackage;

/* renamed from: afe reason: default package */
public final class afe {
    private static final agd a = agd.a("CarSdkRemoteInterface");

    public static int[] a(String str) {
        int[] iArr = {-1, -1, -1, -1};
        if (str != null) {
            int lastIndexOf = str.lastIndexOf(47) + 1;
            String substring = str.substring(lastIndexOf);
            int indexOf = substring.indexOf(36);
            if (indexOf == -1) {
                indexOf = substring.indexOf(58);
            }
            iArr[3] = (str.length() - substring.length()) + indexOf;
            int lastIndexOf2 = substring.lastIndexOf(58);
            if (lastIndexOf2 != -1) {
                iArr[1] = Integer.parseInt(substring.substring(lastIndexOf2 + 1));
            } else {
                lastIndexOf2 = substring.length();
            }
            int indexOf2 = substring.indexOf(58);
            if (indexOf2 == -1) {
                indexOf2 = substring.indexOf(36);
            }
            if (indexOf2 != -1) {
                if (lastIndexOf2 == -1 || lastIndexOf2 == indexOf2) {
                    iArr[0] = Integer.parseInt(substring.substring(indexOf2 + 1));
                } else {
                    iArr[0] = Integer.parseInt(substring.substring(indexOf2 + 1, lastIndexOf2));
                }
                if (lastIndexOf == 0) {
                    iArr[2] = lastIndexOf2;
                } else {
                    iArr[2] = (str.length() - substring.length()) - 1;
                }
            }
            a.b("parseIdent(%s) -> %d, %d, %d, %d", str, Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]), Integer.valueOf(iArr[2]), Integer.valueOf(iArr[3]));
        }
        return iArr;
    }
}
