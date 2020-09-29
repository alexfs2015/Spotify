package defpackage;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.service.RadioStateObserver;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Cancellable;

/* renamed from: hqo reason: default package */
public final class hqo implements hqq {
    final xog<usi> a = xog.e();
    ObservableEmitter<usi> b;
    private final ure c;
    private final urx d;
    private final hqy e;

    /* renamed from: hqo$a */
    final class a implements RadioStateObserver {
        private a() {
        }

        /* synthetic */ a(hqo hqo, byte b) {
            this();
        }

        public final void a() {
        }

        public final void a(RadioStationsModel radioStationsModel) {
        }

        public final void a(usi usi) {
            hqo.this.a.onNext(usi);
            ObservableEmitter<usi> observableEmitter = hqo.this.b;
            if (observableEmitter != null) {
                observableEmitter.a(usi);
            }
        }
    }

    public hqo(Context context, ure ure, hqy hqy, ury ury) {
        this.c = ure;
        this.d = ury.a(context, new a(this, 0), context.getClass().getSimpleName());
        this.e = hqy;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ObservableEmitter observableEmitter) {
        this.b = observableEmitter;
        observableEmitter.a((Cancellable) new $$Lambda$hqo$P3t4gdDDZ03_z4gE2XV8ADKIBsw(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.b = null;
    }

    public final xii<usi> a() {
        return this.a;
    }

    public final void a(String str, String str2) {
        this.c.a(new String[]{str}, ViewUris.bO, false, true, -1, uqo.aq, rta.o, null);
        this.e.a(str2, "start_radio", "start_radio", str, (byte[]) null);
        Logger.a("LogHelper.logStartRadio uri: %s", str);
    }

    public final void a(boolean z, String str) {
        this.c.a(z);
        hqy hqy = this.e;
        int i = z ? 1 : -1;
        hqy.a(str, "rate", i == 1 ? "thumb_up" : "thumb_down", (String) null, (byte[]) null);
        Logger.a("LogHelper.logRate rating: %d", Integer.valueOf(i));
    }

    public final Observable<usi> b() {
        return Observable.a((ObservableOnSubscribe<T>) new $$Lambda$hqo$vOD2d2mqFwqVw5e3JEvMrJurliA<T>(this));
    }

    public final void c() {
        this.d.a();
    }

    public final void d() {
        this.d.b();
    }
}
