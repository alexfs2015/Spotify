package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult;
import com.spotify.mobile.android.spotlets.eventshub.model.EventResult;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.Flowable;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: ita reason: default package */
public class ita extends uee<EventResult> {
    public static final String a = ViewUris.ac.toString();
    public Flowable<SessionState> T;
    public jrp U;
    /* access modifiers changed from: private */
    public RecyclerView V;
    /* access modifiers changed from: private */
    public itd W;
    private iss X;
    private final OnClickListener Y = new OnClickListener() {
        public final void onClick(View view) {
            u b = ita.this.V.b(view);
            ConcertResult concertResult = (ConcertResult) view.getTag();
            itd b2 = ita.this.W;
            fpu.a((Fragment) ita.this);
            ka p = ita.this.p();
            long e = (long) b.e();
            if (concertResult instanceof ConcertResult) {
                ConcertResult concertResult2 = concertResult;
                Boolean discovery = concertResult2.getDiscovery();
                if (discovery == null || !discovery.booleanValue()) {
                    b2.a.a(Long.valueOf(e), concertResult2.getSourceType(), concertResult2.getConcert().getId());
                } else {
                    b2.a.b(Long.valueOf(e), concertResult2.getSourceType(), concertResult2.getConcert().getId());
                }
                StringBuilder sb = new StringBuilder("spotify:concert:");
                sb.append(concertResult2.getConcert().getId());
                p.startActivity(kmf.a(p, sb.toString()).a);
            }
        }
    };
    public itk b;

    public final /* synthetic */ void a(Parcelable parcelable) {
        iss iss = new iss(p(), ((EventResult) parcelable).getConcertResults(), this.Y, this.U.f(), new itx(o().getResources()), this.U);
        this.X = iss;
        this.V.a((a) this.X);
    }

    public static ita a(fpt fpt) {
        ita ita = new ita();
        fpu.a((Fragment) ita, fpt);
        return ita;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.V = new RecyclerView(p());
        this.V.a((i) new LinearLayoutManager(p()));
        this.V.a((h) new ist((int) o().getResources().getDimension(R.dimen.concerts_list_bottom_padding)), -1);
        return this.V;
    }

    public final sih ae_() {
        return ViewUris.ac;
    }

    public final String b(Context context) {
        return context != null ? context.getString(R.string.events_hub_title) : "";
    }

    public final String e() {
        return a;
    }

    public final udr ag() {
        return udt.al;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.CONCERTS_GROUP, null);
    }

    public static boolean b(Intent intent) {
        return intent.hasExtra("event-result-arg");
    }

    public final uef<EventResult> ah() {
        EventResult eventResult = (EventResult) this.i.getParcelable("event-result-arg");
        if (eventResult == null) {
            eventResult = EventResult.EMPTY;
        }
        this.W = new itd(ScalarSynchronousObservable.d(eventResult), vun.a((wrf<T>) this.T), this.b);
        return this.W;
    }
}
