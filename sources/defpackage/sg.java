package defpackage;

import android.util.Log;

/* renamed from: sg reason: default package */
public abstract class sg {
    private static sg a = null;
    private static final int b = 20;

    /* renamed from: sg$a */
    public static class a extends sg {
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

    public abstract void a(String str, String str2, Throwable... thArr);

    public static synchronized void a(sg sgVar) {
        synchronized (sg.class) {
            a = sgVar;
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

    public static synchronized sg a() {
        sg sgVar;
        synchronized (sg.class) {
            if (a == null) {
                a = new a(3);
            }
            sgVar = a;
        }
        return sgVar;
    }
}
