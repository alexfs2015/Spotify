package defpackage;

/* renamed from: fjq reason: default package */
public final class fjq {
    private static final int a;

    static {
        String property = System.getProperty("java.version");
        int a2 = a(property);
        if (a2 == -1) {
            a2 = b(property);
        }
        if (a2 == -1) {
            a2 = 6;
        }
        a = a2;
    }

    public static int a() {
        return a;
    }

    private static int a(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private static int b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static boolean b() {
        return a >= 9;
    }
}
