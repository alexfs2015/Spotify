package defpackage;

import android.os.Environment;
import java.util.concurrent.Callable;

/* renamed from: dss reason: default package */
final class dss implements Callable<Boolean> {
    dss() {
    }

    public final /* synthetic */ Object call() {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}
