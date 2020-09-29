package defpackage;

import com.google.common.collect.Lists;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Covers.Size;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.Show.MediaType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.time.DateUtils;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: too reason: default package */
public final class too implements rxh {
    private final ryv a;
    private final toh b;
    private final jrp c;

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(uys uys) {
        return true;
    }

    public too(ryv ryv, toh toh, jrp jrp) {
        this.a = ryv;
        this.b = toh;
        this.c = jrp;
    }

    /* access modifiers changed from: private */
    public static uyy<uys> a(final uyy<uys> uyy) {
        return new uyy<uys>() {
            private int a;

            public final boolean isLoading() {
                return uyy.isLoading();
            }

            public final int getUnfilteredLength() {
                return uyy.getUnfilteredLength() - this.a;
            }

            public final int getUnrangedLength() {
                return uyy.getUnrangedLength() - this.a;
            }

            public final /* synthetic */ Object[] getItems() {
                uys[] uysArr;
                this.a = 0;
                ArrayList arrayList = new ArrayList(((uys[]) uyy.getItems()).length);
                for (uys uys : (uys[]) uyy.getItems()) {
                    if (!uys.isHeader()) {
                        arrayList.add(uys);
                    } else {
                        this.a++;
                    }
                }
                return (uys[]) arrayList.toArray(new uys[0]);
            }
        };
    }

    /* access modifiers changed from: private */
    public uyy<uys> b(uyy<uys> uyy) {
        ArrayList arrayList = new ArrayList(((uys[]) uyy.getItems()).length);
        ArrayList a2 = Lists.a((E[]) uyy.getItems());
        a("today", arrayList, a2, new $$Lambda$too$z14ZaoIDR34jcHzdLfmO1Skuoo(this));
        a("yesterday", arrayList, a2, new $$Lambda$too$mEN4LquCUACzbUoxHIV6Rd4ptY(this));
        a("thisWeek", arrayList, a2, new $$Lambda$too$mNAEWCPC5ONbJVfzYiNL0K7j4E(this));
        a("unplayed", arrayList, a2, $$Lambda$too$T3OCAs5l_WR2nKarbbDVIseMtMk.INSTANCE);
        return a((uys[]) arrayList.toArray(new uys[0]), uyy.isLoading(), arrayList.size());
    }

    private static void a(String str, List<uys> list, List<uys> list2, faz<uys> faz) {
        if (!list2.isEmpty()) {
            list.add(new uys(str) {
                private /* synthetic */ String a;

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

                {
                    this.a = r1;
                }

                public final Integer n() {
                    return Integer.valueOf(0);
                }

                public final Map<String, String> v() {
                    return Collections.emptyMap();
                }

                public final MediaType w() {
                    return MediaType.AUDIO;
                }

                public final String getHeader() {
                    return this.a;
                }

                public final String getUri() {
                    return this.a;
                }

                public final uzf u() {
                    return new f();
                }
            });
            boolean z = false;
            while (!list2.isEmpty() && faz.apply(list2.get(0))) {
                list.add(list2.remove(0));
                z = true;
            }
            if (!z) {
                list.remove(list.size() - 1);
            }
        }
    }

    private static uyy<uys> a(final uys[] uysArr, final boolean z, final int i) {
        return new uyy<uys>() {
            public final boolean isLoading() {
                return z;
            }

            public final int getUnfilteredLength() {
                return i;
            }

            public final int getUnrangedLength() {
                return i;
            }

            public final /* bridge */ /* synthetic */ Object[] getItems() {
                return uysArr;
            }
        };
    }

    /* access modifiers changed from: private */
    public static ton a(Throwable th) {
        String message = th.getMessage();
        if (message != null) {
            return ton.a(message);
        }
        return ton.a("unknown error");
    }

    public final wud<uyy<uys>> e() {
        return wud.a(this.a.e().f($$Lambda$Se6cs4my_EFxYGJumKJWn9u8KsI.INSTANCE).h($$Lambda$too$uEt303o9LGWgC4XQO3UQZi0ULc.INSTANCE), this.b.e().f($$Lambda$too$ClWYb7OjAgfiWSWJRg1N5WoeU.INSTANCE).f(new $$Lambda$too$DXZApbuCkAG_v_qDQrTQ2Eh41Ns(this)).f($$Lambda$Se6cs4my_EFxYGJumKJWn9u8KsI.INSTANCE).h($$Lambda$too$uEt303o9LGWgC4XQO3UQZi0ULc.INSTANCE), (wuu<? super T1, ? super T2, ? extends R>) $$Lambda$too$86VAmNZe7MuJvpLyw38zgbf0hAo.INSTANCE).d((wut<? super T, ? extends wud<? extends R>>) $$Lambda$too$shZEVo6TYeo_y2YpaPFJmGvvKwM.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static ton a(ton ton, ton ton2) {
        if ((ton instanceof a) && (ton2 instanceof a)) {
            StringBuilder sb = new StringBuilder("All data endpoints returned error: ");
            a aVar = (a) ton;
            sb.append(aVar.a);
            sb.append(", ");
            sb.append(aVar.a);
            return ton.a(sb.toString());
        }
        uys[] uysArr = new uys[0];
        if (ton instanceof b) {
            uysArr = (uys[]) wpi.a((T[]) uysArr, (T[]) ((b) ton).a.getItems());
        }
        if (ton2 instanceof b) {
            uysArr = (uys[]) wpi.a((T[]) uysArr, (T[]) ((b) ton2).a.getItems());
        }
        return ton.a(a(uysArr, false, uysArr.length));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ wud a(ton ton) {
        if (ton instanceof b) {
            return ScalarSynchronousObservable.d(((b) ton).a);
        }
        return wud.a(new Throwable(((a) ton).a));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean b(uys uys) {
        if (uys != null) {
            if (new Date(((long) uys.s()) * 1000).after(DateUtils.a(DateUtils.b(new Date(this.c.a()), 5), -7))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean c(uys uys) {
        if (uys != null) {
            long a2 = this.c.a();
            Date date = new Date(a2);
            Date date2 = new Date(a2 - 86400000);
            Date date3 = new Date(((long) uys.s()) * 1000);
            if (DateUtils.a(date, date3) || DateUtils.a(date2, date3)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean d(uys uys) {
        if (uys != null) {
            if (DateUtils.a(new Date(this.c.a()), new Date(((long) uys.s()) * 1000))) {
                return true;
            }
        }
        return false;
    }
}
