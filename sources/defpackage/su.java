package defpackage;

import android.util.Log;

/* renamed from: su reason: default package */
public abstract class su {
    private static su a = null;
    private static final int b = 20;

    /* renamed from: su$a */
    public static class a extends su {
        private int a;

        public a(int i) {
            this.a = i;
        }

        public final void a(String str, String str2, Throwable... thArr) {
            if (this.a <= 6) {
                if (thArr.length > 0) {
                    Log.e(str, str2, thArr[0]);
                    return;
                }
                Log.e(str, str2);
            }
        }
    }

    public static String a(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = b;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public static synchronized su a() {
        su suVar;
        synchronized (su.class) {
            if (a == null) {
                a = new a(3);
            }
            suVar = a;
        }
        return suVar;
    }

    public static synchronized void a(su suVar) {
        synchronized (su.class) {
            a = suVar;
        }
    }

    public abstract void a(String str, String str2, Throwable... thArr);
}
