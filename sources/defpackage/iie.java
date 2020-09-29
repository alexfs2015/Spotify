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

/* renamed from: iie reason: default package */
public final class iie implements DeathRecipient, ihz {
    public a a;
    private final Messenger b = new Messenger(new b(this));
    private final Messenger c;
    private defpackage.ihz.a d;

    /* renamed from: iie$a */
    public interface a {
        void onIoDied();
    }

    /* renamed from: iie$b */
    static class b extends Handler {
        private final WeakReference<iie> a;

        public b(iie iie) {
            this.a = new WeakReference<>(iie);
        }

        public final void handleMessage(Message message) {
            iie iie = (iie) this.a.get();
            if (iie != null) {
                iie.a(iie, message.getData().getByteArray("MESSAGE_BODY"));
            }
        }
    }

    public iie(Messenger messenger) {
        this.c = messenger;
    }

    public final void a(boolean z) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        if (z) {
            obtain.replyTo = this.b;
        }
        a(obtain);
    }

    public final void a(int i, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("MESSAGE_BODY", bArr);
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.setData(bundle);
        a(obtain);
    }

    private void a(Message message) {
        try {
            this.c.send(message);
        } catch (RemoteException unused) {
            Logger.e("Could not send the message to the remote client", new Object[0]);
        }
    }

    public final void a(defpackage.ihz.a aVar) {
        this.d = aVar;
    }

    public final void a() {
        try {
            this.c.getBinder().linkToDeath(this, 0);
        } catch (RemoteException unused) {
            Logger.e("Trying to create a session but client binder is already dead.", new Object[0]);
            binderDied();
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

    public final void binderDied() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.onIoDied();
        }
    }

    static /* synthetic */ void a(iie iie, byte[] bArr) {
        defpackage.ihz.a aVar = iie.d;
        if (aVar != null) {
            aVar.a(bArr);
        }
    }
}
