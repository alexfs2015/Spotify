package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {
    public final bsv a;

    private static bsv getChimeraLifecycleFragmentImpl(bsu bsu) {
        throw new IllegalStateException("Method not available in SDK.");
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

    public static bsv a(Activity activity) {
        return a(new bsu(activity));
    }

    protected LifecycleCallback(bsv bsv) {
        this.a = bsv;
    }

    public final Activity a() {
        return this.a.D_();
    }

    public static bsv a(bsu bsu) {
        if (bsu.a instanceof ka) {
            return bvz.a((ka) bsu.a);
        }
        if (bsu.a instanceof Activity) {
            return bvx.a((Activity) bsu.a);
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
}
