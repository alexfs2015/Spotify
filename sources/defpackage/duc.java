package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: duc reason: default package */
public interface duc {
    View a(OnClickListener onClickListener, boolean z);

    void a(MotionEvent motionEvent);

    void a(View view);

    void a(View view, dua dua);

    void a(View view, String str, Bundle bundle, Map<String, WeakReference<View>> map, View view2);

    void a(View view, Map<String, WeakReference<View>> map);

    void a(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2);

    void a(dws dws);

    boolean a();

    boolean a(Bundle bundle);

    void b(Bundle bundle);

    void b(View view);

    void b(View view, Map<String, WeakReference<View>> map);

    boolean b();

    void c();

    void c(Bundle bundle);

    void c(View view);

    void c(View view, Map<String, WeakReference<View>> map);

    void d();

    void h();

    void i();

    void j();

    void k();

    View l();

    Context m();
}
