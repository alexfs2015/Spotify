package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {
    public final btm a;

    protected LifecycleCallback(btm btm) {
        this.a = btm;
    }

    public static btm a(Activity activity) {
        return a(new btl(activity));
    }

    public static btm a(btl btl) {
        if (btl.a instanceof kf) {
            return bwq.a((kf) btl.a);
        }
        if (btl.a instanceof Activity) {
            return bwo.a((Activity) btl.a);
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    private static btm getChimeraLifecycleFragmentImpl(btl btl) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public final Activity a() {
        return this.a.D_();
    }

    public void a(int i, int i2, Intent intent) {
    }

    public void a(Bundle bundle) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void b() {
    }

    public void b(Bundle bundle) {
    }

    public void c() {
    }

    public void d() {
    }
}
