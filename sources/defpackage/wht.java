package defpackage;

import android.app.Application;
import android.content.ContentProvider;

/* renamed from: wht reason: default package */
public abstract class wht extends ContentProvider {
    public boolean onCreate() {
        wil.a(this, "contentProvider");
        Application application = (Application) getContext().getApplicationContext();
        if (application instanceof whx) {
            whp.a((Object) this, (whx) application);
            return true;
        }
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), whx.class.getCanonicalName()}));
    }
}
