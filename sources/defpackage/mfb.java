package defpackage;

import android.content.Context;
import com.spotify.music.features.connect.cast.discovery.DiscoveredDevice;
import com.spotify.music.features.connect.cast.discovery.DiscoveryEvent;
import com.spotify.music.features.connect.cast.discovery.DiscoveryEvent.EventType;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: mfb reason: default package */
public abstract class mfb implements FlowableOnSubscribe<DiscoveryEvent>, mfh {
    protected String a;
    protected boolean b;
    protected final Map<String, DiscoveredDevice> c = new HashMap();
    protected FlowableEmitter<DiscoveryEvent> d;
    private final Context e;
    private final Observable<DiscoveryEvent> f = Flowable.a((FlowableOnSubscribe<T>) this, BackpressureStrategy.BUFFER).j().a(1).a();

    public mfb(Context context, String str) {
        this.e = context;
        this.a = str;
    }

    public void b() {
        this.b = true;
    }

    public void c() {
        this.b = false;
        for (DiscoveredDevice c2 : this.c.values()) {
            c(c2);
        }
        this.c.clear();
    }

    public final boolean k() {
        return this.b;
    }

    public boolean a(String str) {
        return this.c.containsKey(str);
    }

    public void subscribe(FlowableEmitter<DiscoveryEvent> flowableEmitter) {
        this.d = flowableEmitter;
    }

    public final Observable<DiscoveryEvent> l() {
        return this.f;
    }

    /* access modifiers changed from: protected */
    public void c(DiscoveredDevice discoveredDevice) {
        FlowableEmitter<DiscoveryEvent> flowableEmitter = this.d;
        if (flowableEmitter != null) {
            flowableEmitter.a(new DiscoveryEvent(EventType.LOST, discoveredDevice));
        }
    }
}
