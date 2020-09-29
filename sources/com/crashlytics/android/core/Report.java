package com.crashlytics.android.core;

import java.io.File;
import java.util.Map;

public interface Report {

    public enum Type {
        JAVA,
        NATIVE
    }

    String a();

    String b();

    File c();

    File[] d();

    Map<String, String> e();

    void f();

    Type g();
}
