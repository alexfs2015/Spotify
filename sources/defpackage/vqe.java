package defpackage;

import android.media.AudioDeviceInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
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

/* renamed from: vqe reason: default package */
public interface vqe {

    /* renamed from: vqe$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static wud<wan> a(vpt vpt, ObjectMapper objectMapper, wgd wgd, wbv wbv, Single<vrg> single, vrh vrh, String str, String str2, vre vre) {
            if (wgd != null) {
                $$Lambda$vqe$N1p7HYWgtMteyxexZOGpadKvrY r0 = new $$Lambda$vqe$N1p7HYWgtMteyxexZOGpadKvrY(objectMapper, wgd, wbv, String.format(Locale.US, "content-type: audio/l16; rate=%s", new Object[]{Integer.valueOf(vpt.b())}), str2, vrh, str, vre);
                Single<vrg> single2 = single;
                return vun.a((wrf<T>) single.b((Function<? super T, ? extends wrf<? extends R>>) r0)).d().e();
            }
            throw new IllegalArgumentException("SslContext is null");
        }

        public static /* synthetic */ wrf a(ObjectMapper objectMapper, wgd wgd, wbv wbv, String str, String str2, vrh vrh, String str3, vre vre, vrg vrg) {
            if (vrg.b() == null || vrg.a() == null) {
                return Flowable.a((Throwable) new IllegalArgumentException("Non-null values required."));
            }
            String b = vrg.b();
            DebugFlag debugFlag = DebugFlag.VOICE_SAVE_AUDIO;
            ObjectMapper objectMapper2 = objectMapper;
            wgd wgd2 = wgd;
            wbv wbv2 = wbv;
            String str4 = str;
            String str5 = str2;
            vqb vqb = new vqb(b, objectMapper2, wgd2, wbv2, false, vrg.a(), str4, str5, "", !vrg.c(), vrh.a(), str3, vrh.e(), vrh.c(), vre);
            return Flowable.a((FlowableOnSubscribe<T>) vqb, BackpressureStrategy.LATEST);
        }

        public static wud<vri> a(wud<wan> wud, vpn vpn, vpt vpt) {
            return OperatorPublish.a(wud.d((wut<? super T, ? extends wud<? extends R>>) new vpx<Object,Object>()).k($$Lambda$vqe$_zyNMpnz6YQF2siCQVEypbrX9d0.INSTANCE).f(vpn), new $$Lambda$vqe$lcbNmujX4UbNTDEBkb4RIYr0eU8(wud, vpt), false).d().e();
        }

        public static wud<?> a(String str, vqp vqp, vrh vrh, wud<wan> wud, vpt vpt, wud<vri> wud2) {
            return wud.a(wud, vun.a((wrf<T>) vpt.a().b((Consumer<? super wrh>) new $$Lambda$vqe$_2WC6uPIbDkqq5uhmjJXMD0Yk<Object>(vrh, str, vqp, vpt))).a((b<? extends R, ? super T>) new wwm<Object,Object>(wud2.j($$Lambda$iwJviwIzkgKT2NIttKiRV_7WEe4.INSTANCE))), (wuu<? super T1, ? super T2, ? extends R>) $$Lambda$BKYtc9oROul1eT8eFCCcFPqsNhY.INSTANCE).b((wun<? super T>) new vpy<Object>());
        }

        public static /* synthetic */ void a(vrh vrh, String str, vqp vqp, vpt vpt, wrh wrh) {
            if (!vrh.a().e()) {
                vqo vqo = new vqo(str, vrh.b().name(), vqp);
                AudioDeviceInfo c = vpt.c();
                if (c != null) {
                    vqo.b.a(new a().a(vqo.c).b(vqo.d).c(vqo.a.a(c)).a());
                }
            }
        }

        public static /* synthetic */ vri a(vpt vpt, wan wan) {
            if (wan.D()) {
                return vri.a(vpt.a().d(16, TimeUnit.MILLISECONDS).c((Function<? super T, ? extends R>) new vpq<Object,Object>()).b((Predicate<? super T>) new $$Lambda$vqe$ZgjxQqXCrOGr6fnV3_lxvXdopdg<Object>(wan)));
            }
            throw new IllegalStateException("Connection closed");
        }

        public static /* synthetic */ boolean a(wan wan, Float f) {
            return !wan.D();
        }

        public static Single<vrg> a(Flowable<PlayerState> flowable, vpj vpj, vrh vrh) {
            return Single.a((SingleSource<? extends T1>) flowable.a(0), (SingleSource<? extends T2>) vpj.a, (SingleSource<? extends T3>) vrh.d(), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$65IXqlQlGTgjurWAqI9Mg4fWrJo.INSTANCE);
        }

        public static wgd a() {
            try {
                wge wge = new wge(false);
                if (wge.a) {
                    return wgd.a(null, null, null, null, null, null, null, null, wge.b, null, 0, 0, wge.c, false);
                }
                return wgd.a(null, null, null, null, null, null, null, null, wge.b, null, 0, 0);
            } catch (SSLException e) {
                Logger.e(e, "failed to get SSL context", new Object[0]);
                return null;
            }
        }
    }
}
