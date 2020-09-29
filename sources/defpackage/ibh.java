package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.comscore.Analytics;
import com.comscore.PublisherConfiguration.Builder;
import com.comscore.UsagePropertiesAutoUpdateMode;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: ibh reason: default package */
public final class ibh implements Callback {
    public Handler a;
    public boolean b;
    public boolean c;
    private final a d;
    private final Context e;

    /* renamed from: ibh$a */
    public static class a {
    }

    public ibh(Application application) {
        this(application, new a());
    }

    private ibh(Context context, a aVar) {
        this.e = context;
        this.c = false;
        this.b = false;
        this.d = aVar;
    }

    public final synchronized void a() {
        if (this.a == null) {
            if (defpackage.lcm.a.a) {
                this.a = new Handler(Looper.getMainLooper(), this);
            } else {
                HandlerThread handlerThread = new HandlerThread("ComScoreBackgroundThread");
                handlerThread.start();
                this.a = new Handler(handlerThread.getLooper(), this);
            }
        }
        if (!this.c) {
            this.a.sendEmptyMessage(0);
            this.c = true;
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            Context context = this.e;
            Analytics.getConfiguration().addClient(((Builder) ((Builder) new Builder().publisherId("15654041").publisherSecret("f07164b6b5502e2c4e0ae7ba636c8387").usagePropertiesAutoUpdateMode(UsagePropertiesAutoUpdateMode.FOREGROUND_AND_BACKGROUND)).vce(false)).build());
            Analytics.start(context);
        } else if (i == 1) {
            Analytics.notifyUxActive();
            this.b = true;
        } else if (i == 2) {
            Analytics.notifyUxInactive();
            this.b = false;
        } else if (i == 3) {
            Analytics.notifyEnterForeground();
        } else if (i != 4) {
            StringBuilder sb = new StringBuilder("Unexpected message ");
            sb.append(message.what);
            Assertion.a(sb.toString());
        } else {
            Analytics.notifyExitForeground();
        }
        return true;
    }
}
