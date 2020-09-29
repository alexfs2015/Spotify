package defpackage;

import com.google.common.collect.Lists;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Covers.Size;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.Show.MediaType;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.time.DateUtils;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: uao reason: default package */
public final class uao implements sgr {
    private final sij a;
    private final uaq b;
    private final uah c;
    private final jtz d;
    private final boolean e;
    private int f;
    private int g;

    public uao(sij sij, uaq uaq, uah uah, jtz jtz, boolean z) {
        this.a = sij;
        this.b = uaq;
        this.c = uah;
        this.d = jtz;
        this.e = z;
    }

    /* access modifiers changed from: private */
    public static uan a(Throwable th) {
        String message = th.getMessage();
        return message != null ? uan.a(message) : uan.a("unknown error");
    }

    /* access modifiers changed from: private */
    public static uan a(uan uan, uan uan2) {
        if ((uan instanceof a) && (uan2 instanceof a)) {
            StringBuilder sb = new StringBuilder("All data endpoints returned error: ");
            a aVar = (a) uan;
            sb.append(aVar.a);
            sb.append(", ");
            sb.append(aVar.a);
            return uan.a(sb.toString());
        }
        vkv[] vkvArr = new vkv[0];
        if (uan instanceof b) {
            vkvArr = (vkv[]) xdo.a((T[]) vkvArr, (T[]) ((b) uan).a.getItems());
        }
        if (uan2 instanceof b) {
            vkvArr = (vkv[]) xdo.a((T[]) vkvArr, (T[]) ((b) uan2).a.getItems());
        }
        return uan.a(a(vkvArr, false, vkvArr.length));
    }

    /* access modifiers changed from: private */
    public static vlb<vkv> a(final vlb<vkv> vlb) {
        return new vlb<vkv>() {
            private int a;

            public final /* synthetic */ Object[] getItems() {
                vkv[] vkvArr;
                this.a = 0;
                ArrayList arrayList = new ArrayList(((vkv[]) vlb.getItems()).length);
                for (vkv vkv : (vkv[]) vlb.getItems()) {
                    if (!vkv.isHeader()) {
                        arrayList.add(vkv);
                    } else {
                        this.a++;
                    }
                }
                return (vkv[]) arrayList.toArray(new vkv[0]);
            }

            public final int getUnfilteredLength() {
                return vlb.getUnfilteredLength() - this.a;
            }

            public final int getUnrangedLength() {
                return vlb.getUnrangedLength() - this.a;
            }

            public final boolean isLoading() {
                return vlb.isLoading();
            }
        };
    }

    private static vlb<vkv> a(final vkv[] vkvArr, final boolean z, final int i) {
        return new vlb<vkv>() {
            public final /* bridge */ /* synthetic */ Object[] getItems() {
                return vkvArr;
            }

            public final int getUnfilteredLength() {
                return i;
            }

            public final int getUnrangedLength() {
                return i;
            }

            public final boolean isLoading() {
                return z;
            }
        };
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ xii a(uan uan) {
        return uan instanceof b ? ScalarSynchronousObservable.d(((b) uan).a) : xii.a(new Throwable(((a) uan).a));
    }

    private static void a(String str, List<vkv> list, List<vkv> list2, fbq<vkv> fbq) {
        if (!list2.isEmpty()) {
            list.add(new vkv(str) {
                private /* synthetic */ String a;

                {
                    this.a = r1;
                }

                public final String a() {
                    return "";
                }

                public final Covers b() {
                    return null;
                }

                public final Covers c() {
                    return null;
                }

                public final String d() {
                    return "";
                }

                public final String e() {
                    return "";
                }

                public final String f() {
                    return "";
                }

                public final String g() {
                    return null;
                }

                public final String getHeader() {
                    return this.a;
                }

                public final String getImageUri() {
                    return "";
                }

                public final String getImageUri(Size size) {
                    return "";
                }

                public final String getTargetUri() {
                    return "";
                }

                public final String getTitle() {
                    return "";
                }

                public final String getUri() {
                    return this.a;
                }

                public final boolean h() {
                    return false;
                }

                public final boolean i() {
                    return false;
                }

                public final boolean isHeader() {
                    return true;
                }

                public final boolean j() {
                    return false;
                }

                public final boolean k() {
                    return false;
                }

                public final boolean l() {
                    return false;
                }

                public final int m() {
                    return 0;
                }

                public final Integer n() {
                    return Integer.valueOf(0);
                }

                public final boolean o() {
                    return false;
                }

                public final boolean p() {
                    return false;
                }

                public final Long q() {
                    return null;
                }

                public final boolean r() {
                    return false;
                }

                public final int s() {
                    return 0;
                }

                public final Show t() {
                    return null;
                }

                public final vli u() {
                    return new f();
                }

                public final Map<String, String> v() {
                    return Collections.emptyMap();
                }

                public final MediaType w() {
                    return MediaType.AUDIO;
                }
            });
            boolean z = false;
            while (!list2.isEmpty() && fbq.apply(list2.get(0))) {
                list.add(list2.remove(0));
                z = true;
            }
            if (!z) {
                list.remove(list.size() - 1);
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(vkv vkv) {
        return true;
    }

    /* access modifiers changed from: private */
    public vlb<vkv> b(vlb<vkv> vlb) {
        ArrayList arrayList = new ArrayList(((vkv[]) vlb.getItems()).length);
        ArrayList a2 = Lists.a((E[]) vlb.getItems());
        a("today", arrayList, a2, new $$Lambda$uao$daSNgLV0lZ7evJtorv9DoJtZl48(this));
        a("yesterday", arrayList, a2, new $$Lambda$uao$jIeGuDc2_nT2kQfqWjqfBFwqtnM(this));
        a("thisWeek", arrayList, a2, new $$Lambda$uao$DuKtHyNTVawvtf_n53H82AvEc4(this));
        a("unplayed", arrayList, a2, $$Lambda$uao$NozEy_zbFNnegnZsEL7j_g3Nz4Y.INSTANCE);
        return a((vkv[]) arrayList.toArray(new vkv[0]), vlb.isLoading(), arrayList.size());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean b(vkv vkv) {
        if (vkv != null) {
            if (new Date(((long) vkv.s()) * 1000).after(DateUtils.a(DateUtils.b(new Date(this.d.a()), 5), -7))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean c(vkv vkv) {
        if (vkv != null) {
            long a2 = this.d.a();
            Date date = new Date(a2);
            Date date2 = new Date(a2 - 86400000);
            Date date3 = new Date(((long) vkv.s()) * 1000);
            if (DateUtils.a(date, date3) || DateUtils.a(date2, date3)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean d(vkv vkv) {
        if (vkv != null) {
            if (DateUtils.a(new Date(this.d.a()), new Date(((long) vkv.s()) * 1000))) {
                return true;
            }
        }
        return false;
    }

    public final xii<vlb<vkv>> a(int i, int i2) {
        this.f = i;
        this.g = i2;
        return e();
    }

    public final xii<vlb<vkv>> e() {
        xii g2 = (this.e ? wit.a((ObservableSource<T>) this.b.b.a(uaq.a).d(), BackpressureStrategy.BUFFER) : this.a.e()).e((xiy<? super T, ? extends R>) $$Lambda$6SINQADj86FsNLSo8autDaGYJFU.INSTANCE).g($$Lambda$uao$YXuA6ROel3ScdpFrCvbPX0whXDg.INSTANCE);
        int i = this.g;
        return xii.a(g2, (i != 0 ? this.c.a(this.f, i) : this.c.e()).e((xiy<? super T, ? extends R>) $$Lambda$uao$wXTdL9659ErTVMuhPT5w8OzHvKM.INSTANCE).e((xiy<? super T, ? extends R>) new $$Lambda$uao$bkDrAPDz4ibvajF1HIh6w7hWIx0<Object,Object>(this)).e((xiy<? super T, ? extends R>) $$Lambda$6SINQADj86FsNLSo8autDaGYJFU.INSTANCE).g($$Lambda$uao$YXuA6ROel3ScdpFrCvbPX0whXDg.INSTANCE), (xiz<? super T1, ? super T2, ? extends R>) $$Lambda$uao$7h3tgwlKHCJ7XO7Wenxzxi9nvQ.INSTANCE).d((xiy<? super T, ? extends xii<? extends R>>) $$Lambda$uao$HrFtoCcL8kqvklOJCSB6Ke2CUQ.INSTANCE);
    }
}
