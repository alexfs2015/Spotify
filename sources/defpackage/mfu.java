package defpackage;

import android.webkit.WebBackForwardList;
import android.webkit.WebView;

/* renamed from: mfu reason: default package */
public abstract class mfu {

    /* renamed from: mfu$a */
    static class a extends mfu {
        private final WebView a;
        private final WebBackForwardList b;

        private a(WebView webView) {
            this.a = webView;
            this.b = webView.copyBackForwardList();
        }

        /* synthetic */ a(WebView webView, byte b2) {
            this(webView);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002b A[LOOP:0: B:1:0x0008->B:11:0x002b, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0028 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a() {
            /*
                r7 = this;
                android.webkit.WebBackForwardList r0 = r7.b
                int r0 = r0.getCurrentIndex()
                int r1 = r0 + -1
            L_0x0008:
                r2 = 2147483647(0x7fffffff, float:NaN)
                r3 = 0
                r4 = 1
                if (r1 < 0) goto L_0x002e
                android.webkit.WebBackForwardList r5 = r7.b
                android.webkit.WebHistoryItem r5 = r5.getItemAtIndex(r1)
                if (r5 == 0) goto L_0x0025
                java.lang.String r5 = r5.getUrl()
                java.lang.String r6 = "about:blank"
                boolean r5 = r6.equals(r5)
                if (r5 != 0) goto L_0x0025
                r5 = 1
                goto L_0x0026
            L_0x0025:
                r5 = 0
            L_0x0026:
                if (r5 == 0) goto L_0x002b
                int r0 = r1 - r0
                goto L_0x0031
            L_0x002b:
                int r1 = r1 + -1
                goto L_0x0008
            L_0x002e:
                r0 = 2147483647(0x7fffffff, float:NaN)
            L_0x0031:
                if (r0 == r2) goto L_0x0039
                android.webkit.WebView r1 = r7.a
                r1.goBackOrForward(r0)
                return r4
            L_0x0039:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mfu.a.a():boolean");
        }
    }

    /* renamed from: mfu$b */
    static class b extends mfu {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final boolean a() {
            return false;
        }
    }

    public abstract boolean a();
}
