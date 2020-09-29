package defpackage;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.codeless.internal.EventBinding;
import java.lang.ref.WeakReference;

/* renamed from: alp reason: default package */
public class alp {

    /* renamed from: alp$a */
    public static class a implements OnTouchListener {
        boolean a = false;
        private EventBinding b;
        private WeakReference<View> c;
        private WeakReference<View> d;
        private OnTouchListener e;

        public a(EventBinding eventBinding, View view, View view2) {
            if (eventBinding != null && view != null && view2 != null) {
                this.e = alt.e(view2);
                this.b = eventBinding;
                this.c = new WeakReference<>(view2);
                this.d = new WeakReference<>(view);
                this.a = true;
            }
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                EventBinding eventBinding = this.b;
                if (eventBinding != null) {
                    final String str = eventBinding.a;
                    final Bundle a2 = alo.a(this.b, (View) this.d.get(), (View) this.c.get());
                    String str2 = "_valueToSum";
                    if (a2.containsKey(str2)) {
                        a2.putDouble(str2, alv.a(a2.getString(str2)));
                    }
                    a2.putString("_is_fb_codeless", "1");
                    akq.e().execute(new Runnable() {
                        public final void run() {
                            AppEventsLogger.a(akq.g()).a(str, a2);
                        }
                    });
                }
            }
            OnTouchListener onTouchListener = this.e;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
    }

    static {
        alp.class.getCanonicalName();
    }

    public static a a(EventBinding eventBinding, View view, View view2) {
        return new a(eventBinding, view, view2);
    }
}
