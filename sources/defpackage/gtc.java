package defpackage;

import android.os.IBinder;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: gtc reason: default package */
public interface gtc {

    /* renamed from: gtc$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ ConnectManager a(ConnectManager connectManager, IBinder iBinder) {
            if (iBinder instanceof hkr) {
                return ((hkr) iBinder).a();
            }
            Class cls = iBinder.getClass();
            Assertion.a(String.format("Wrong IBinder received: %s", new Object[]{cls.getName()}), cls.getClassLoader().toString());
            return connectManager;
        }

        public static a a(ConnectManager connectManager) {
            return new $$Lambda$gtc$yxe04m4rLmwa6mXB9qnzNlZ03KQ(connectManager);
        }
    }
}
