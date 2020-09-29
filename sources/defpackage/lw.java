package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;

/* renamed from: lw reason: default package */
public final class lw extends Fragment {
    a a;

    /* renamed from: lw$a */
    interface a {
        void a();

        void b();
    }

    public static void a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        String str = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(new lw(), str).commit();
            fragmentManager.executePendingTransactions();
        }
    }

    private void a(Event event) {
        Activity activity = getActivity();
        if (activity instanceof lo) {
            ((lo) activity).b().a(event);
            return;
        }
        if (activity instanceof lm) {
            Lifecycle Y_ = ((lm) activity).Y_();
            if (Y_ instanceof ln) {
                ((ln) Y_).a(event);
            }
        }
    }

    static lw b(Activity activity) {
        return (lw) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(Event.ON_CREATE);
    }

    public final void onDestroy() {
        super.onDestroy();
        a(Event.ON_DESTROY);
        this.a = null;
    }

    public final void onPause() {
        super.onPause();
        a(Event.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        a aVar = this.a;
        if (aVar != null) {
            aVar.b();
        }
        a(Event.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
        a(Event.ON_START);
    }

    public final void onStop() {
        super.onStop();
        a(Event.ON_STOP);
    }
}
