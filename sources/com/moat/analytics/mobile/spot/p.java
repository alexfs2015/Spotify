package com.moat.analytics.mobile.spot;

import android.util.Log;

class p {
    p() {
    }

    private static String a(String str) {
        StringBuilder sb = new StringBuilder("Moat");
        sb.append(str);
        return sb.toString();
    }

    static void a(int i, String str, Object obj, String str2) {
        if (w.a().b) {
            String a = a(str);
            if (obj == null) {
                Log.println(i, a, String.format("message = %s", new Object[]{str2}));
                return;
            }
            Log.println(i, a, String.format("id = %s, message = %s", new Object[]{Integer.valueOf(obj.hashCode()), str2}));
        }
    }

    static void a(String str, Object obj, String str2, Throwable th) {
        if (w.a().b) {
            Log.e(a(str), String.format("id = %s, message = %s", new Object[]{Integer.valueOf(obj.hashCode()), str2}), th);
        }
    }

    static void a(String str, String str2) {
        if (!w.a().b && ((k) MoatAnalytics.getInstance()).a) {
            int i = 2;
            if (str.equals("[ERROR] ")) {
                i = 6;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            Log.println(i, "MoatAnalytics", sb.toString());
        }
    }

    static void b(int i, String str, Object obj, String str2) {
        if (w.a().c) {
            String a = a(str);
            Object[] objArr = new Object[2];
            objArr[0] = obj == null ? "null" : Integer.valueOf(obj.hashCode());
            objArr[1] = str2;
            Log.println(i, a, String.format("id = %s, message = %s", objArr));
        }
    }
}
