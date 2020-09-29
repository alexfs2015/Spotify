package defpackage;

import com.spotify.mobile.android.util.Assertion;
import java.io.ByteArrayOutputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: jsd reason: default package */
public final class jsd {
    private static final char[] a = {' ', 'K', 'M', 'B'};

    static {
        Pattern.compile("([^=&]+)=?([^&]*)&?");
    }

    public static String a(String str, String str2) {
        int i = 0;
        Assertion.a((Object) Integer.valueOf(0), (Object) Integer.valueOf(str.length() % 2));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (i < str.length()) {
            int i2 = i + 2;
            byteArrayOutputStream.write(Integer.parseInt(str2.substring(i, i2), 16) ^ Integer.parseInt(str.substring(i, i2), 16));
            i = i2;
        }
        return new String(byteArrayOutputStream.toByteArray(), far.d);
    }

    public static String a(String str, Locale locale) {
        StringBuilder sb = new StringBuilder(str.toLowerCase(locale));
        int length = sb.length();
        boolean z = true;
        for (int i = 0; i < length; i++) {
            char charAt = sb.charAt(i);
            if (charAt == ' ') {
                z = true;
            } else if (z) {
                sb.replace(i, i + 1, String.valueOf(charAt).toUpperCase(locale));
                z = false;
            }
        }
        return sb.toString();
    }

    public static String a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public static String b(String str, Locale locale) {
        if (str.length() <= 1) {
            return str.toUpperCase(locale);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, 1).toUpperCase(locale));
        sb.append(str.substring(1));
        return sb.toString();
    }

    public static String a(int i, Locale locale) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(locale);
        String str = "#,###";
        if (i < 10000) {
            return new DecimalFormat(str, decimalFormatSymbols).format((long) i);
        }
        double d = (double) i;
        int floor = (int) Math.floor(Math.log10(d));
        int i2 = floor / 3;
        if (floor < 3 || i2 >= 4) {
            return new DecimalFormat(str, decimalFormatSymbols).format((long) i);
        }
        StringBuilder sb = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("##.#", decimalFormatSymbols);
        double pow = Math.pow(10.0d, (double) (i2 * 3));
        Double.isNaN(d);
        sb.append(decimalFormat.format(d / pow));
        sb.append(a[i2]);
        return sb.toString();
    }

    public static String a(String str) {
        try {
            return Normalizer.normalize(str, Form.NFKD).replaceAll("[^\\x20-\\x7E]", "");
        } catch (AssertionError e) {
            return a(str, e);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.String r6, java.lang.AssertionError r7) {
        /*
            r0 = 100
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0005 }
        L_0x0005:
            java.text.Normalizer$Form r0 = java.text.Normalizer.Form.NFKD     // Catch:{ AssertionError -> 0x0019 }
            java.lang.String r6 = java.text.Normalizer.normalize(r6, r0)     // Catch:{ AssertionError -> 0x0019 }
            java.lang.String r0 = "normalize worked after sleeping"
            com.spotify.mobile.android.util.Assertion.b(r0)     // Catch:{ AssertionError -> 0x0019 }
            java.lang.String r0 = "[^\\x20-\\x7E]"
            java.lang.String r1 = ""
            java.lang.String r6 = r6.replaceAll(r0, r1)     // Catch:{ AssertionError -> 0x0019 }
            return r6
        L_0x0019:
            java.lang.String r6 = "libcore.icu.NativeNormalizer$1"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x006f, NoSuchFieldException -> 0x0068, IllegalAccessException -> 0x0061 }
            java.lang.String r0 = "$SwitchMap$java$text$Normalizer$Form"
            java.lang.reflect.Field r0 = r6.getDeclaredField(r0)     // Catch:{ ClassNotFoundException -> 0x006f, NoSuchFieldException -> 0x0068, IllegalAccessException -> 0x0061 }
            r1 = 1
            r0.setAccessible(r1)     // Catch:{ ClassNotFoundException -> 0x006f, NoSuchFieldException -> 0x0068, IllegalAccessException -> 0x0061 }
            java.lang.Object r6 = r0.get(r6)     // Catch:{ ClassNotFoundException -> 0x006f, NoSuchFieldException -> 0x0068, IllegalAccessException -> 0x0061 }
            int[] r6 = (int[]) r6     // Catch:{ ClassNotFoundException -> 0x006f, NoSuchFieldException -> 0x0068, IllegalAccessException -> 0x0061 }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ ClassNotFoundException -> 0x006f, NoSuchFieldException -> 0x0068, IllegalAccessException -> 0x0061 }
            java.lang.String r2 = "switchmap overwritten? 0x%08x,0x%08x,0x%08x,0x%08x"
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x006f, NoSuchFieldException -> 0x0068, IllegalAccessException -> 0x0061 }
            r4 = 0
            r5 = r6[r4]     // Catch:{ ClassNotFoundException -> 0x006f, NoSuchFieldException -> 0x0068, IllegalAccessException -> 0x0061 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ ClassNotFoundException -> 0x006f, NoSuchFieldException -> 0x0068, IllegalAccessException -> 0x0061 }
            r3[r4] = r5     // Catch:{ ClassNotFoundException -> 0x006f, NoSuchFieldException -> 0x0068, IllegalAccessException -> 0x0061 }
            r4 = r6[r1]     // Catch:{ ClassNotFoundException -> 0x006f, NoSuchFieldException -> 0x0068, IllegalAccessException -> 0x0061 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ ClassNotFoundException -> 0x006f, NoSuchFieldException -> 0x0068, IllegalAccessException -> 0x0061 }
            r3[r1] = r4     // Catch:{ ClassNotFoundException -> 0x006f, NoSuchFieldException -> 0x0068, IllegalAccessException -> 0x0061 }
            r1 = 2
            r4 = r6[r1]     // Catch:{ ClassNotFoundException -> 0x006f, NoSuchFieldException -> 0x0068, IllegalAccessException -> 0x0061 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ ClassNotFoundException -> 0x006f, NoSuchFieldException -> 0x0068, IllegalAccessException -> 0x0061 }
            r3[r1] = r4     // Catch:{ ClassNotFoundException -> 0x006f, NoSuchFieldException -> 0x0068, IllegalAccessException -> 0x0061 }
            r1 = 3
            r6 = r6[r1]     // Catch:{ ClassNotFoundException -> 0x006f, NoSuchFieldException -> 0x0068, IllegalAccessException -> 0x0061 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ ClassNotFoundException -> 0x006f, NoSuchFieldException -> 0x0068, IllegalAccessException -> 0x0061 }
            r3[r1] = r6     // Catch:{ ClassNotFoundException -> 0x006f, NoSuchFieldException -> 0x0068, IllegalAccessException -> 0x0061 }
            java.lang.String r6 = java.lang.String.format(r2, r3)     // Catch:{ ClassNotFoundException -> 0x006f, NoSuchFieldException -> 0x0068, IllegalAccessException -> 0x0061 }
            r0.<init>(r6, r7)     // Catch:{ ClassNotFoundException -> 0x006f, NoSuchFieldException -> 0x0068, IllegalAccessException -> 0x0061 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x006f, NoSuchFieldException -> 0x0068, IllegalAccessException -> 0x0061 }
        L_0x0061:
            r6 = move-exception
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>(r6)
            throw r7
        L_0x0068:
            r6 = move-exception
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>(r6)
            throw r7
        L_0x006f:
            r6 = move-exception
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsd.a(java.lang.String, java.lang.AssertionError):java.lang.String");
    }

    public static CharSequence b(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean isWhitespace = Character.isWhitespace(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!isWhitespace) {
                    break;
                }
                length--;
            } else if (!isWhitespace) {
                z = true;
            } else {
                i++;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }
}
