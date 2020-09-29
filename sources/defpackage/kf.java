package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import com.spotify.mobile.android.core.internal.AudioDriver;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: kf reason: default package */
public class kf extends k implements defpackage.ez.a, c {
    final ln c = new ln(this);
    boolean d;
    int e;
    dw<String> f;
    private kh g = new kh((kj) hr.a(new a(), "callbacks == null"));
    private boolean h;
    private boolean i;
    private boolean j = true;

    /* renamed from: kf$a */
    class a extends kj<kf> implements m, mc {
        public a() {
            super(kf.this);
        }

        public final Lifecycle Y_() {
            return kf.this.c;
        }

        public final View a(int i) {
            return kf.this.findViewById(i);
        }

        public final void a(Fragment fragment) {
            kf.this.a(fragment);
        }

        public final void a(Fragment fragment, Intent intent, int i, Bundle bundle) {
            kf kfVar = kf.this;
            kfVar.d = true;
            if (i == -1) {
                try {
                    ez.a(kfVar, intent, -1, bundle);
                } finally {
                    kfVar.d = false;
                }
            } else {
                kf.b(i);
                if (kfVar.f.b() < 65534) {
                    while (kfVar.f.d(kfVar.e) >= 0) {
                        kfVar.e = (kfVar.e + 1) % 65534;
                    }
                    int i2 = kfVar.e;
                    kfVar.f.b(i2, fragment.h);
                    kfVar.e = (kfVar.e + 1) % 65534;
                    ez.a(kfVar, intent, ((i2 + 1) << 16) + (i & AudioDriver.SPOTIFY_MAX_VOLUME), bundle);
                    kfVar.d = false;
                    return;
                }
                throw new IllegalStateException("Too many pending Fragment activity results.");
            }
        }

        public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            kf.this.dump(str, null, printWriter, strArr);
        }

        public final mb aq_() {
            return kf.this.aq_();
        }

        public final OnBackPressedDispatcher c() {
            return kf.this.b;
        }

        public final boolean d() {
            return !kf.this.isFinishing();
        }

        public final LayoutInflater e() {
            return kf.this.getLayoutInflater().cloneInContext(kf.this);
        }

        public final boolean e_() {
            Window window = kf.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public final void f() {
            kf.this.e();
        }

        public final boolean g() {
            return kf.this.getWindow() != null;
        }

        public final int h() {
            Window window = kf.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        public final /* bridge */ /* synthetic */ Object i() {
            return kf.this;
        }
    }

    private View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.g.a(view, str, context, attributeSet);
    }

    private static boolean a(kk kkVar, State state) {
        boolean z = false;
        for (Fragment fragment : kkVar.f()) {
            if (fragment != null) {
                if (fragment.Q.a().a(State.STARTED)) {
                    fragment.Q.a(state);
                    z = true;
                }
                if (fragment.r() != null) {
                    z |= a(fragment.t(), state);
                }
            }
        }
        return z;
    }

    static void b(int i2) {
        if ((i2 & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private void g() {
        do {
        } while (a(i(), State.CREATED));
    }

    public void a(Fragment fragment) {
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("  ");
        String sb2 = sb.toString();
        printWriter.print(sb2);
        printWriter.print("mCreated=");
        printWriter.print(this.h);
        printWriter.print(" mResumed=");
        printWriter.print(this.i);
        printWriter.print(" mStopped=");
        printWriter.print(this.j);
        if (getApplication() != null) {
            md.a(this).a(sb2, fileDescriptor, printWriter, strArr);
        }
        this.g.a.d.a(str, fileDescriptor, printWriter, strArr);
    }

    @Deprecated
    public void e() {
        invalidateOptionsMenu();
    }

    /* access modifiers changed from: protected */
    public void h() {
        this.c.a(Event.ON_RESUME);
        this.g.a.d.r();
    }

    public final kk i() {
        return this.g.a.d;
    }

    public final void l_(int i2) {
        if (i2 != -1) {
            b(i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        this.g.a();
        int i4 = i2 >> 16;
        if (i4 != 0) {
            int i5 = i4 - 1;
            String str = (String) this.f.a(i5, null);
            this.f.a(i5);
            if (str != null) {
                Fragment a2 = this.g.a(str);
                if (a2 == null) {
                    new StringBuilder("Activity result no fragment exists for who: ").append(str);
                } else {
                    a2.a(i2 & AudioDriver.SPOTIFY_MAX_VOLUME, i3, intent);
                }
            }
        } else {
            b a3 = ez.a();
            if (a3 == null || !a3.a()) {
                super.onActivityResult(i2, i3, intent);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g.a();
        this.g.a.d.a(configuration);
    }

    public void onCreate(Bundle bundle) {
        kh khVar = this.g;
        khVar.a.d.a((kj) khVar.a, (kg) khVar.a, (Fragment) null);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            kh khVar2 = this.g;
            if (khVar2.a instanceof mc) {
                khVar2.a.d.a(parcelable);
                String str = "android:support:next_request_index";
                if (bundle.containsKey(str)) {
                    this.e = bundle.getInt(str);
                    int[] intArray = bundle.getIntArray("android:support:request_indicies");
                    String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                    if (!(intArray == null || stringArray == null || intArray.length != stringArray.length)) {
                        this.f = new dw<>(intArray.length);
                        for (int i2 = 0; i2 < intArray.length; i2++) {
                            this.f.b(intArray[i2], stringArray[i2]);
                        }
                    }
                }
            } else {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
        }
        if (this.f == null) {
            this.f = new dw<>();
            this.e = 0;
        }
        super.onCreate(bundle);
        this.c.a(Event.ON_CREATE);
        this.g.a.d.o();
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0) {
            return super.onCreatePanelMenu(i2, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i2, menu);
        kh khVar = this.g;
        return onCreatePanelMenu | khVar.a.d.a(menu, getMenuInflater());
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a2 = a(view, str, context, attributeSet);
        return a2 == null ? super.onCreateView(view, str, context, attributeSet) : a2;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a2 = a(null, str, context, attributeSet);
        return a2 == null ? super.onCreateView(str, context, attributeSet) : a2;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.g.a.d.t();
        this.c.a(Event.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.g.a.d.u();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.g.a.d.a(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.g.a.d.b(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.g.a.d.a(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.g.a();
    }

    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.g.a.d.b(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.i = false;
        this.g.a.d.b(3);
        this.c.a(Event.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.g.a.d.b(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        h();
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        return i2 == 0 ? super.onPreparePanel(0, view, menu) | this.g.a.d.a(menu) : super.onPreparePanel(i2, view, menu);
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.g.a();
        int i3 = (i2 >> 16) & AudioDriver.SPOTIFY_MAX_VOLUME;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String str = (String) this.f.a(i4, null);
            this.f.a(i4);
            if (str != null && this.g.a(str) == null) {
                new StringBuilder("Activity result no fragment exists for who: ").append(str);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.i = true;
        this.g.a();
        this.g.b();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        g();
        this.c.a(Event.ON_STOP);
        Parcelable m = this.g.a.d.m();
        if (m != null) {
            bundle.putParcelable("android:support:fragments", m);
        }
        if (this.f.b() > 0) {
            bundle.putInt("android:support:next_request_index", this.e);
            int[] iArr = new int[this.f.b()];
            String[] strArr = new String[this.f.b()];
            for (int i2 = 0; i2 < this.f.b(); i2++) {
                iArr[i2] = this.f.b(i2);
                strArr[i2] = (String) this.f.c(i2);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.j = false;
        if (!this.h) {
            this.h = true;
            this.g.a.d.p();
        }
        this.g.a();
        this.g.b();
        this.c.a(Event.ON_START);
        this.g.a.d.q();
    }

    public void onStateNotSaved() {
        this.g.a();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.j = true;
        g();
        this.g.a.d.s();
        this.c.a(Event.ON_STOP);
    }

    public void startActivityForResult(Intent intent, int i2) {
        if (!this.d && i2 != -1) {
            b(i2);
        }
        super.startActivityForResult(intent, i2);
    }

    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        if (!this.d && i2 != -1) {
            b(i2);
        }
        super.startActivityForResult(intent, i2, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        if (i2 != -1) {
            b(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        if (i2 != -1) {
            b(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }
}
