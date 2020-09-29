package defpackage;

import android.app.Application;
import android.content.ContentProvider;

/* renamed from: vtn reason: default package */
public abstract class vtn extends ContentProvider {
    public boolean onCreate() {
        vuf.a(this, "contentProvider");
        Application application = (Application) getContext().getApplicationContext();
        if (application instanceof vtr) {
            vtj.a((Object) this, (vtr) application);
            return true;
        }
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), vtr.class.getCanonicalName()}));
    }
}
