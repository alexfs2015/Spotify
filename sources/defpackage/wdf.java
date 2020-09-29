package defpackage;

import android.media.AudioDeviceInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.player.model.PlayerState;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Predicate;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;
import rx.internal.operators.OperatorPublish;

/* renamed from: wdf reason: default package */
public interface wdf {

    /* renamed from: wdf$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Single<weo> a(Flowable<PlayerState> flowable, wck wck, wep wep) {
            return Single.a((SingleSource<? extends T1>) flowable.a(0), (SingleSource<? extends T2>) wck.a, (SingleSource<? extends T3>) wep.d(), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$XWQcxTT4CczfwBBe4BIFPrlksHk.INSTANCE);
        }

        public static /* synthetic */ weq a(wcu wcu, wot wot) {
            if (wot.D()) {
                return weq.a(wcu.a().d(16, TimeUnit.MILLISECONDS).c((Function<? super T, ? extends R>) new wcr<Object,Object>()).b((Predicate<? super T>) new $$Lambda$wdf$eOkpULcd46aPx_FiIMILR_f8Cm4<Object>(wot)));
            }
            throw new IllegalStateException("Connection closed");
        }

        public static wuj a() {
            try {
                wuk wuk = new wuk(false);
                return wuk.a ? wuj.a(null, null, null, null, null, null, null, null, wuk.b, null, 0, 0, wuk.c, false) : wuj.a(null, null, null, null, null, null, null, null, wuk.b, null, 0, 0);
            } catch (SSLException e) {
                Logger.e(e, "failed to get SSL context", new Object[0]);
                return null;
            }
        }

        public static /* synthetic */ xfk a(ObjectMapper objectMapper, wuj wuj, wqb wqb, String str, String str2, wep wep, String str3, wem wem, weo weo) {
            if (weo.b() == null || weo.a() == null) {
                return Flowable.a((Throwable) new IllegalArgumentException("Non-null values required."));
            }
            String b = weo.b();
            DebugFlag debugFlag = DebugFlag.VOICE_SAVE_AUDIO;
            ObjectMapper objectMapper2 = objectMapper;
            wuj wuj2 = wuj;
            wqb wqb2 = wqb;
            String str4 = str;
            String str5 = str2;
            wdc wdc = new wdc(b, objectMapper2, wuj2, wqb2, false, weo.a(), str4, str5, "", !weo.c(), wep.a(), str3, wep.e(), wep.c(), wem);
            return Flowable.a((FlowableOnSubscribe<T>) wdc, BackpressureStrategy.LATEST);
        }

        public static xii<?> a(String str, wdx wdx, wep wep, xii<wot> xii, wcu wcu, xii<weq> xii2) {
            return xii.a(xii, wit.a((xfk<T>) wcu.a().b((Consumer<? super xfm>) new $$Lambda$wdf$br1QipK9TjZyquWRWGuyzQxf6cM<Object>(wep, str, wdx, wcu))).a((b<? extends R, ? super T>) new xkr<Object,Object>(xii2.i($$Lambda$MDs_TVJTKN4aBzRAmTPeIEWcQVM.INSTANCE))), (xiz<? super T1, ? super T2, ? extends R>) $$Lambda$ddJJXkCPlVqDltcsDv0lmC68I.INSTANCE).b((xis<? super T>) new wcz<Object>());
        }

        public static xii<wot> a(wcu wcu, ObjectMapper objectMapper, wuj wuj, wqb wqb, Single<weo> single, wep wep, String str, String str2, wem wem) {
            if (wuj != null) {
                $$Lambda$wdf$AQXVGS6GLDeJukY9CTth3VQKJFw r0 = new $$Lambda$wdf$AQXVGS6GLDeJukY9CTth3VQKJFw(objectMapper, wuj, wqb, String.format(Locale.US, "content-type: audio/l16; rate=%s", new Object[]{Integer.valueOf(wcu.b())}), str2, wep, str, wem);
                Single<weo> single2 = single;
                return wit.a((xfk<T>) single.b((Function<? super T, ? extends xfk<? extends R>>) r0)).d().e();
            }
            throw new IllegalArgumentException("SslContext is null");
        }

        public static xii<weq> a(xii<wot> xii, wco wco, wcu wcu) {
            return OperatorPublish.a(xii.d((xiy<? super T, ? extends xii<? extends R>>) new wcy<Object,Object>()).a((b<? extends R, ? super T>) new xks<Object,Object>($$Lambda$wdf$YwNy9kw0H5lBo0IRXFtGqo6uTk.INSTANCE)).e((xiy<? super T, ? extends R>) wco), new $$Lambda$wdf$arlntdJyKclHI4YMYDZ8JwXp41E(xii, wcu), false).d().e();
        }

        public static /* synthetic */ void a(wep wep, String str, wdx wdx, wcu wcu, xfm xfm) {
            if (!wep.a().e()) {
                wdw wdw = new wdw(str, wep.b().name(), wdx);
                AudioDeviceInfo c = wcu.c();
                if (c != null) {
                    wdw.b.a(new a().a(wdw.c).b(wdw.d).c(wdw.a.a(c)).a());
                }
            }
        }

        public static /* synthetic */ boolean a(wot wot, Float f) {
            return !wot.D();
        }
    }
}
