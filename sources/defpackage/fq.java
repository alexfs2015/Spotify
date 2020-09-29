package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: fq reason: default package */
public final class fq implements Iterable<Intent> {
    public final ArrayList<Intent> a = new ArrayList<>();
    public final Context b;

    /* renamed from: fq$a */
    public interface a {
        Intent f();
    }

    private fq(Context context) {
        this.b = context;
    }

    public static fq a(Context context) {
        return new fq(context);
    }

    public final fq a(Intent intent) {
        this.a.add(intent);
        return this;
    }

    public final fq a(ComponentName componentName) {
        int size = this.a.size();
        try {
            Intent a2 = fg.a(this.b, componentName);
            while (a2 != null) {
                this.a.add(size, a2);
                a2 = fg.a(this.b, a2.getComponent());
            }
            return this;
        } catch (NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.a.iterator();
    }
}
