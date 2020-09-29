package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ato reason: default package */
public final class ato {
    public static final a a = $$Lambda$ato$K0RFn8ZwoLDzfCSjn79TTtpW56I.INSTANCE;
    private static final Pattern d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int b = -1;
    public int c = -1;

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(int i, int i2, int i3, int i4, int i5) {
        return i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2);
    }

    private boolean a(String str) {
        Matcher matcher = d.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.b = parseInt;
                    this.c = parseInt2;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public final boolean a() {
        return (this.b == -1 || this.c == -1) ? false : true;
    }

    public final boolean a(awr awr) {
        for (a aVar : awr.a) {
            String str = "iTunSMPB";
            if (aVar instanceof axd) {
                axd axd = (axd) aVar;
                if (str.equals(axd.a) && a(axd.b)) {
                    return true;
                }
            } else if (aVar instanceof axh) {
                axh axh = (axh) aVar;
                if ("com.apple.iTunes".equals(axh.a) && str.equals(axh.b) && a(axh.d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
