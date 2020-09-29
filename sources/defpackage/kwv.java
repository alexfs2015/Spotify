package defpackage;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import androidx.room.RoomDatabase;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: kwv reason: default package */
public final class kwv implements kwu {
    final RoomDatabase a;
    final oy b;
    final ox c;
    final pi d;

    public kwv(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new oy<kwt>(roomDatabase) {
            public final String a() {
                return "INSERT OR REPLACE INTO `cachedClientInfo`(`client_id`,`redirect_uri`,`scopes`,`timestamp`,`package_name`,`app_signature`,`last_used_timestamp`) VALUES (?,?,?,?,?,?,?)";
            }

            public final /* bridge */ /* synthetic */ void a(px pxVar, Object obj) {
                kwt kwt = (kwt) obj;
                if (kwt.a == null) {
                    pxVar.a(1);
                } else {
                    pxVar.a(1, kwt.a);
                }
                if (kwt.b == null) {
                    pxVar.a(2);
                } else {
                    pxVar.a(2, kwt.b);
                }
                if (kwt.c == null) {
                    pxVar.a(3);
                } else {
                    pxVar.a(3, kwt.c);
                }
                pxVar.a(4, kwt.d);
                if (kwt.e == null) {
                    pxVar.a(5);
                } else {
                    pxVar.a(5, kwt.e);
                }
                if (kwt.f == null) {
                    pxVar.a(6);
                } else {
                    pxVar.a(6, kwt.f);
                }
                pxVar.a(7, kwt.g);
            }
        };
        this.c = new ox<kwt>(roomDatabase) {
            public final String a() {
                return "DELETE FROM `cachedClientInfo` WHERE `client_id` = ? AND `redirect_uri` = ? AND `package_name` = ? AND `app_signature` = ?";
            }

            public final /* bridge */ /* synthetic */ void a(px pxVar, Object obj) {
                kwt kwt = (kwt) obj;
                if (kwt.a == null) {
                    pxVar.a(1);
                } else {
                    pxVar.a(1, kwt.a);
                }
                if (kwt.b == null) {
                    pxVar.a(2);
                } else {
                    pxVar.a(2, kwt.b);
                }
                if (kwt.e == null) {
                    pxVar.a(3);
                } else {
                    pxVar.a(3, kwt.e);
                }
                if (kwt.f == null) {
                    pxVar.a(4);
                } else {
                    pxVar.a(4, kwt.f);
                }
            }
        };
        this.d = new pi(roomDatabase) {
            public final String a() {
                return "DELETE FROM cachedClientInfo";
            }
        };
    }

    public final Completable a(final kwt kwt) {
        return Completable.b((Callable<?>) new Callable<Void>() {
            /* JADX INFO: finally extract failed */
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() {
                kwv.this.a.e();
                try {
                    kwv.this.b.a(kwt);
                    kwv.this.a.g();
                    kwv.this.a.f();
                    return null;
                } catch (Throwable th) {
                    kwv.this.a.f();
                    throw th;
                }
            }
        });
    }

    public final Single<List<kwt>> a() {
        final ph a2 = ph.a("SELECT * FROM cachedClientInfo", 0);
        return Single.a((Callable<? extends T>) new Callable<List<kwt>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public List<kwt> call() {
                Cursor a2 = kwv.this.a.a((pw) a2);
                try {
                    int a3 = pl.a(a2, "client_id");
                    int a4 = pl.a(a2, "redirect_uri");
                    int a5 = pl.a(a2, "scopes");
                    int a6 = pl.a(a2, "timestamp");
                    int a7 = pl.a(a2, "package_name");
                    int a8 = pl.a(a2, "app_signature");
                    int a9 = pl.a(a2, "last_used_timestamp");
                    ArrayList arrayList = new ArrayList(a2.getCount());
                    while (a2.moveToNext()) {
                        kwt kwt = new kwt(a2.getString(a3), a2.getString(a4), a2.getString(a5), a2.getLong(a6), a2.getString(a7), a2.getString(a8), a2.getLong(a9));
                        arrayList.add(kwt);
                    }
                    return arrayList;
                } finally {
                    a2.close();
                }
            }

            /* access modifiers changed from: protected */
            public final void finalize() {
                a2.a();
            }
        });
    }

    public final Single<kwt> a(String str, String str2, String str3, String str4) {
        final ph a2 = ph.a("SELECT * FROM cachedClientInfo WHERE client_id = ? AND redirect_uri = ? AND package_name = ? AND app_signature = ?", 4);
        if (str == null) {
            a2.b[1] = 1;
        } else {
            a2.a(1, str);
        }
        if (str2 == null) {
            a2.b[2] = 1;
        } else {
            a2.a(2, str2);
        }
        if (str3 == null) {
            a2.b[3] = 1;
        } else {
            a2.a(3, str3);
        }
        if (str4 == null) {
            a2.b[4] = 1;
        } else {
            a2.a(4, str4);
        }
        return Single.a((Callable<? extends T>) new Callable<kwt>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public kwt call() {
                Cursor a2 = kwv.this.a.a((pw) a2);
                try {
                    kwt kwt = a2.moveToFirst() ? new kwt(a2.getString(pl.a(a2, "client_id")), a2.getString(pl.a(a2, "redirect_uri")), a2.getString(pl.a(a2, "scopes")), a2.getLong(pl.a(a2, "timestamp")), a2.getString(pl.a(a2, "package_name")), a2.getString(pl.a(a2, "app_signature")), a2.getLong(pl.a(a2, "last_used_timestamp"))) : null;
                    if (kwt != null) {
                        return kwt;
                    }
                    StringBuilder sb = new StringBuilder("Query returned empty result set: ");
                    sb.append(a2.a);
                    throw new EmptyResultSetException(sb.toString());
                } finally {
                    a2.close();
                }
            }

            /* access modifiers changed from: protected */
            public final void finalize() {
                a2.a();
            }
        });
    }

    public final Completable b(final kwt kwt) {
        return Completable.b((Callable<?>) new Callable<Void>() {
            /* JADX INFO: finally extract failed */
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() {
                kwv.this.a.e();
                try {
                    kwv.this.c.a(kwt);
                    kwv.this.a.g();
                    kwv.this.a.f();
                    return null;
                } catch (Throwable th) {
                    kwv.this.a.f();
                    throw th;
                }
            }
        });
    }

    public final Single<Integer> b() {
        return Single.a((Callable<? extends T>) new Callable<Integer>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Integer call() {
                px b = kwv.this.d.b();
                kwv.this.a.e();
                try {
                    Integer valueOf = Integer.valueOf(b.a());
                    kwv.this.a.g();
                    return valueOf;
                } finally {
                    kwv.this.a.f();
                    kwv.this.d.a(b);
                }
            }
        });
    }
}
