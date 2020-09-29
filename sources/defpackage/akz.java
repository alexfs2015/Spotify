package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import com.facebook.FacebookException;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.EventBinding.ActionType;
import java.lang.ref.WeakReference;

/* renamed from: akz reason: default package */
public class akz {
    /* access modifiers changed from: private */
    public static final String a = akz.class.getCanonicalName();

    /* renamed from: akz$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[ActionType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.facebook.appevents.codeless.internal.EventBinding$ActionType[] r0 = com.facebook.appevents.codeless.internal.EventBinding.ActionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.facebook.appevents.codeless.internal.EventBinding$ActionType r1 = com.facebook.appevents.codeless.internal.EventBinding.ActionType.CLICK     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.facebook.appevents.codeless.internal.EventBinding$ActionType r1 = com.facebook.appevents.codeless.internal.EventBinding.ActionType.SELECTED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.facebook.appevents.codeless.internal.EventBinding$ActionType r1 = com.facebook.appevents.codeless.internal.EventBinding.ActionType.TEXT_CHANGED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akz.AnonymousClass1.<clinit>():void");
        }
    }

    /* renamed from: akz$a */
    public static class a extends AccessibilityDelegate {
        boolean a = false;
        private EventBinding b;
        private WeakReference<View> c;
        private WeakReference<View> d;
        private int e;
        private AccessibilityDelegate f;
        private boolean g = false;

        public a() {
        }

        public a(EventBinding eventBinding, View view, View view2) {
            if (eventBinding != null && view != null && view2 != null) {
                this.f = alf.d(view2);
                this.b = eventBinding;
                this.c = new WeakReference<>(view2);
                this.d = new WeakReference<>(view);
                ActionType actionType = eventBinding.b;
                int i = AnonymousClass1.a[eventBinding.b.ordinal()];
                if (i == 1) {
                    this.e = 1;
                } else if (i == 2) {
                    this.e = 4;
                } else if (i == 3) {
                    this.e = 16;
                } else {
                    StringBuilder sb = new StringBuilder("Unsupported action type: ");
                    sb.append(actionType.toString());
                    throw new FacebookException(sb.toString());
                }
                this.a = true;
            }
        }

        public final void sendAccessibilityEvent(View view, int i) {
            if (i == -1) {
                Log.e(akz.a, "Unsupported action type");
            }
            if (i == this.e) {
                AccessibilityDelegate accessibilityDelegate = this.f;
                if (accessibilityDelegate != null && !(accessibilityDelegate instanceof a)) {
                    accessibilityDelegate.sendAccessibilityEvent(view, i);
                }
                final String str = this.b.a;
                final Bundle a2 = ala.a(this.b, (View) this.d.get(), (View) this.c.get());
                String str2 = "_valueToSum";
                if (a2.containsKey(str2)) {
                    a2.putDouble(str2, alh.a(a2.getString(str2)));
                }
                a2.putString("_is_fb_codeless", "1");
                akc.e().execute(new Runnable() {
                    public final void run() {
                        AppEventsLogger.a(akc.g()).a(str, a2);
                    }
                });
            }
        }
    }

    public static a a(EventBinding eventBinding, View view, View view2) {
        return new a(eventBinding, view, view2);
    }
}
