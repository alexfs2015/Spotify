package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.pageloader.NetworkErrorReason;

/* renamed from: tuf reason: default package */
public final class tuf {

    /* renamed from: tuf$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[NetworkErrorReason.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.pageloader.NetworkErrorReason[] r0 = com.spotify.pageloader.NetworkErrorReason.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.pageloader.NetworkErrorReason r1 = com.spotify.pageloader.NetworkErrorReason.FORCED_OFFLINE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.pageloader.NetworkErrorReason r1 = com.spotify.pageloader.NetworkErrorReason.AIRPLANE_MODE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.pageloader.NetworkErrorReason r1 = com.spotify.pageloader.NetworkErrorReason.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.tuf.AnonymousClass2.<clinit>():void");
        }
    }

    public static String a(Context context) {
        return "Something went wrong.\n Have another go?";
    }

    public static String a(Context context, NetworkErrorReason networkErrorReason) {
        int i = AnonymousClass2.a[networkErrorReason.ordinal()];
        return i != 1 ? i != 2 ? "There was a problem with your internet connection." : "There was a problem with your internet connection. Please disable airplane mode or connect to a wi-fi." : "Please disable offline mode to use this feature.";
    }

    public static tua a() {
        return new tua() {
            public final View a(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
                return new FrameLayout(context);
            }

            public final void a() {
            }

            public final void a(View view) {
            }
        };
    }

    public static tuh b() {
        return new tty();
    }
}
