package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.spotify.base.java.logging.Logger;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

/* renamed from: ikr reason: default package */
public final class ikr implements DeathRecipient, ikm {
    public a a;
    private final Messenger b = new Messenger(new b(this));
    private final Messenger c;
    private defpackage.ikm.a d;

    /* renamed from: ikr$a */
    public interface a {
        void onIoDied();
    }

    /* renamed from: ikr$b */
    static class b extends Handler {
        private final WeakReference<ikr> a;

        public b(ikr ikr) {
            this.a = new WeakReference<>(ikr);
        }

        public final void handleMessage(Message message) {
            ikr ikr = (ikr) this.a.get();
            if (ikr != null) {
                ikr.a(ikr, message.getData().getByteArray("MESSAGE_BODY"));
            }
        }
    }

    public ikr(Messenger messenger) {
        this.c = messenger;
    }

    private void a(Message message) {
        try {
            this.c.send(message);
        } catch (RemoteException unused) {
            Logger.e("Could not send the message to the remote client", new Object[0]);
        }
    }

    static /* synthetic */ void a(ikr ikr, byte[] bArr) {
        defpackage.ikm.a aVar = ikr.d;
        if (aVar != null) {
            aVar.a(bArr);
        }
    }

    public final void a() {
        try {
            this.c.getBinder().linkToDeath(this, 0);
        } catch (RemoteException unused) {
            Logger.e("Trying to create a session but client binder is already dead.", new Object[0]);
            binderDied();
        }
    }

    public final void a(int i, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("MESSAGE_BODY", bArr);
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.setData(bundle);
        a(obtain);
    }

    public final void a(defpackage.ikm.a aVar) {
        this.d = aVar;
    }

    public final void a(boolean z) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        if (z) {
            obtain.replyTo = this.b;
        }
        a(obtain);
    }

    public final void binderDied() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.onIoDied();
        }
    }

    public final void close() {
        try {
            this.c.getBinder().unlinkToDeath(this, 0);
        } catch (NoSuchElementException unused) {
            Logger.e("Trying to close a session that has never been started.", new Object[0]);
            binderDied();
        }
    }
}
