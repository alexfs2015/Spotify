package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: asx reason: default package */
public final class asx {
    public static final a a = $$Lambda$asx$TE7613B1eutiICKRe5mZxZD9gmk.INSTANCE;
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

    public final boolean a(awa awa) {
        for (a aVar : awa.a) {
            String str = "iTunSMPB";
            if (aVar instanceof awm) {
                awm awm = (awm) aVar;
                if (str.equals(awm.a) && a(awm.b)) {
                    return true;
                }
            } else if (aVar instanceof awq) {
                awq awq = (awq) aVar;
                if ("com.apple.iTunes".equals(awq.a) && str.equals(awq.b) && a(awq.d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
