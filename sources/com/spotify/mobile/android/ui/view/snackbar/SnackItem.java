package com.spotify.mobile.android.ui.view.snackbar;

import android.view.ViewGroup;

public interface SnackItem extends jtd {

    public enum Priority {
        DEFAULT,
        HIGH;
        
        public static final Priority[] c = null;

        static {
            c = values();
        }
    }

    public enum Type {
        DEFAULT,
        NAVIGATION
    }

    int a();

    void a(ViewGroup viewGroup);

    void a(Type type, Priority priority);

    void a(boolean z);

    boolean aF_();

    Priority c();

    Type d();
}
