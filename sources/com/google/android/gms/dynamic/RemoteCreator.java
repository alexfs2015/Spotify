package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;

public abstract class RemoteCreator<T> {
    private final String a;
    private T b;

    public static class RemoteCreatorException extends Exception {
        public RemoteCreatorException(String str) {
            super(str);
        }

        public RemoteCreatorException(String str, Throwable th) {
            super(str, th);
        }
    }

    protected RemoteCreator(String str) {
        this.a = str;
    }

    /* access modifiers changed from: protected */
    public abstract T a(IBinder iBinder);

    public final T a(Context context) {
        if (this.b == null) {
            bwx.a(context);
            Context remoteContext = brz.getRemoteContext(context);
            if (remoteContext != null) {
                try {
                    this.b = a((IBinder) remoteContext.getClassLoader().loadClass(this.a).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new RemoteCreatorException("Could not load creator class.", e);
                } catch (InstantiationException e2) {
                    throw new RemoteCreatorException("Could not instantiate creator.", e2);
                } catch (IllegalAccessException e3) {
                    throw new RemoteCreatorException("Could not access creator.", e3);
                }
            } else {
                throw new RemoteCreatorException("Could not get remote context.");
            }
        }
        return this.b;
    }
}
