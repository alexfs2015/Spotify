package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Function;

/* renamed from: kyw reason: default package */
public final class kyw {
    public final szp a;
    private final Context b;
    private final Bundle c = fb.a(this.b, 17432576, 17432577).a();
    private final Function<Intent, Intent> d;

    public kyw(Context context, szp szp, Function<Intent, Intent> function) {
        this.b = (Context) fbp.a(context);
        this.a = (szp) fbp.a(szp);
        this.d = (Function) fbp.a(function);
    }

    public final void a(Intent intent) {
        if (intent != null) {
            if (intent.getComponent() == null) {
                try {
                    intent = (Intent) this.d.apply(intent);
                } catch (Exception e) {
                    Logger.e(e, "failed to add target class", new Object[0]);
                }
            }
            this.b.startActivity(intent, this.c);
        }
    }
}
