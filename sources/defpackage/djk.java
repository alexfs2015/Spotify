package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: djk reason: default package */
public final class djk {
    static {
        "0123456789abcdef".toCharArray();
    }

    public static long a(double d, DisplayMetrics displayMetrics) {
        double d2 = (double) displayMetrics.density;
        Double.isNaN(d2);
        return Math.round(d / d2);
    }

    public static Activity a(View view) {
        View rootView = view.getRootView();
        if (rootView != null) {
            view = rootView;
        }
        Context context = view.getContext();
        int i = 0;
        while ((context instanceof ContextWrapper) && i < 10) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            i++;
        }
        return null;
    }

    public static String a(String str) {
        if (str == null || !str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            return str;
        }
        UUID fromString = UUID.fromString(str);
        byte[] bArr = new byte[16];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(fromString.getMostSignificantBits());
        wrap.putLong(fromString.getLeastSignificantBits());
        return dhp.a(bArr, true);
    }

    public static String a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        dby.a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean a(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public static boolean b(String str) {
        return str == null || str.isEmpty();
    }
}
