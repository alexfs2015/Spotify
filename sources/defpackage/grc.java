package defpackage;

import android.os.IBinder;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: grc reason: default package */
public interface grc {

    /* renamed from: grc$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static a a(ConnectManager connectManager) {
            return new $$Lambda$grc$XBueuamrRYFjy_FQ_dkC7w07qk(connectManager);
        }

        public static /* synthetic */ ConnectManager a(ConnectManager connectManager, IBinder iBinder) {
            if (iBinder instanceof hhx) {
                return ((hhx) iBinder).a();
            }
            Class cls = iBinder.getClass();
            Assertion.a(String.format("Wrong IBinder received: %s", new Object[]{cls.getName()}), cls.getClassLoader().toString());
            return connectManager;
        }
    }
}
