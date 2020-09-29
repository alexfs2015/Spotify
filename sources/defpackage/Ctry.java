package defpackage;

import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: try reason: invalid class name and default package */
public final class Ctry {
    final b a;
    private final long b;
    private final Pattern c = Pattern.compile("\\(((?:(?:\\d+:[0-5]\\d:)|(?:\\d+:))[0-5]\\d)\\)");
    private final Pattern d = Pattern.compile("\\(((?:(?:\\d+:[0-5]\\d:)|(?:\\d+:))[0-5]\\d)\\s?-\\s?((?:(?:\\d+:[0-5]\\d:)|(?:\\d+:))[0-5]\\d)\\)");

    /* renamed from: try$a */
    public static class a {
    }

    /* renamed from: try$b */
    public interface b {
        void onTimeStampClicked(long j);
    }

    public Ctry(long j, b bVar) {
        fay.a(bVar);
        this.b = j;
        this.a = bVar;
    }

    public void a(Spannable spannable) {
        Matcher matcher = this.c.matcher(spannable);
        while (matcher.find()) {
            a(spannable, matcher, 1);
        }
    }

    public void b(Spannable spannable) {
        Matcher matcher = this.d.matcher(spannable);
        while (matcher.find()) {
            a(spannable, matcher, 1);
            a(spannable, matcher, 2);
        }
    }

    private void a(Spannable spannable, Matcher matcher, int i) {
        long a2 = a(matcher.group(i));
        if (a(a2)) {
            a(spannable, matcher.start(i), matcher.end(i), a2);
        }
    }

    private boolean a(long j) {
        return j >= 0 && j <= this.b;
    }

    private void a(Spannable spannable, int i, int i2, final long j) {
        spannable.setSpan(new ClickableSpan() {
            public final void onClick(View view) {
                Ctry.this.a.onTimeStampClicked(j);
            }
        }, i, i2, 33);
    }

    private static long a(String str) {
        long j = -1;
        if (str == null) {
            return -1;
        }
        String[] split = str.split(":");
        long j2 = 0;
        int length = split.length - 1;
        while (length >= 0) {
            double d2 = (double) j2;
            try {
                double parseLong = (double) Long.parseLong(split[length]);
                double pow = Math.pow(60.0d, (double) ((split.length - 1) - length));
                Double.isNaN(parseLong);
                double d3 = parseLong * pow * 1000.0d;
                Double.isNaN(d2);
                j2 = (long) (d2 + d3);
                length--;
            } catch (NumberFormatException unused) {
            }
        }
        j = j2;
        return j;
    }
}
