package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.messages.CoreIntegrationTestEvent;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.music.R;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.Arrays;
import java.util.List;

/* renamed from: mst reason: default package */
public class mst extends jrd implements jqx, uqq {
    private static List<String> b = Arrays.asList(new String[]{"one", "two", "three"});
    private final CompositeDisposable T = new CompositeDisposable();
    public RxResolver a;

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Request request, View view) {
        this.T.a(this.a.resolve(request).d((Consumer<? super T>) $$Lambda$mst$IdCl6K4lKvRrJuEC7ovZf82qiw.INSTANCE));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Response response) {
        if (response.getStatus() == 200) {
            Logger.b("Event posted successfully to Core: %s", response.toString());
            return;
        }
        Logger.b("Event failed: %s", response.toString());
    }

    public static mst c() {
        return new mst();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.fragment_eventsender, viewGroup, false);
        ((Button) viewGroup2.findViewById(R.id.eventsender_core_event_btn)).setOnClickListener(new $$Lambda$mst$HdZ1pfF2uwpOYGKyjqT05Nj3u2I(this, RequestBuilder.putBytes("sp://event_sender/v1/gabitoevent/CoreIntegrationTestEvent", ((CoreIntegrationTestEvent) CoreIntegrationTestEvent.k().a("this is a test string").a((Iterable<String>) b).g()).b()).build()));
        return viewGroup2;
    }

    public final Fragment ae() {
        return this;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.EVENTSENDER_DEBUG, null);
    }

    public final uqm ag() {
        return uqo.R;
    }

    public final gkq aj() {
        return PageIdentifiers.EVENTSENDER_DEBUG;
    }

    public final String b(Context context) {
        return context.getString(R.string.eventsender_fragment_title);
    }

    public final String e() {
        return "fragment_eventsender";
    }

    public final void h() {
        this.T.c();
        super.h();
    }
}
