package defpackage;

import android.os.Environment;
import java.util.concurrent.Callable;

/* renamed from: dsb reason: default package */
final class dsb implements Callable<Boolean> {
    dsb() {
    }

    public final /* synthetic */ Object call() {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}
