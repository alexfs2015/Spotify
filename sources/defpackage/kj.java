package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: kj reason: default package */
public abstract class kj<E> extends kg {
    public final Activity a;
    public final Context b;
    public final Handler c;
    final kl d;
    private final int e;

    private kj(Activity activity, Context context, Handler handler, int i) {
        this.d = new kl();
        this.a = activity;
        this.b = (Context) hr.a(context, "context == null");
        this.c = (Handler) hr.a(handler, "handler == null");
        this.e = 0;
    }

    kj(kf kfVar) {
        this(kfVar, kfVar, new Handler(), 0);
    }

    public View a(int i) {
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void a(Fragment fragment) {
    }

    public void a(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            this.b.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public boolean d() {
        return true;
    }

    public LayoutInflater e() {
        return LayoutInflater.from(this.b);
    }

    public boolean e_() {
        return true;
    }

    public void f() {
    }

    public boolean g() {
        return true;
    }

    public int h() {
        return this.e;
    }

    public abstract E i();
}
