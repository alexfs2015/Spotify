package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: fow reason: default package */
public interface fow extends IInterface {

    /* renamed from: fow$a */
    public static abstract class a extends Binder implements fow {

        /* renamed from: fow$a$a reason: collision with other inner class name */
        static class C0031a implements fow {
            private IBinder a;

            C0031a(IBinder iBinder) {
                this.a = iBinder;
            }

            public final String a(String str, String str2, String str3, fov fov) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.msc.sa.aidl.ISAService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeStrongBinder(fov != null ? fov.asBinder() : null);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean a(int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.msc.sa.aidl.ISAService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    boolean z = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.msc.sa.aidl.ISAService");
                    obtain.writeString(str);
                    boolean z = false;
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.a;
            }

            public final boolean b(int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.msc.sa.aidl.ISAService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    boolean z = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean c(int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.msc.sa.aidl.ISAService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    boolean z = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean d(int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.msc.sa.aidl.ISAService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    boolean z = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static fow a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.msc.sa.aidl.ISAService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof fow)) ? new C0031a(iBinder) : (fow) queryLocalInterface;
        }

        /* JADX WARNING: type inference failed for: r0v1 */
        /* JADX WARNING: type inference failed for: r0v2, types: [fov] */
        /* JADX WARNING: type inference failed for: r0v5, types: [fov$a$a] */
        /* JADX WARNING: type inference failed for: r0v6, types: [fov] */
        /* JADX WARNING: type inference failed for: r0v7, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r0v10, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r0v11, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r0v14, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r0v15, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r0v18, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r0v19, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r0v22, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r0v23 */
        /* JADX WARNING: type inference failed for: r0v24 */
        /* JADX WARNING: type inference failed for: r0v25 */
        /* JADX WARNING: type inference failed for: r0v26 */
        /* JADX WARNING: type inference failed for: r0v27 */
        /* JADX WARNING: type inference failed for: r0v28 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], android.os.Bundle, fov$a$a, fov]
          uses: [fov, android.os.Bundle]
          mth insns count: 89
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 7 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "com.msc.sa.aidl.ISAService"
                if (r5 == r0) goto L_0x00ec
                r0 = 0
                switch(r5) {
                    case 1: goto L_0x00b7;
                    case 2: goto L_0x00a5;
                    case 3: goto L_0x0080;
                    case 4: goto L_0x005b;
                    case 5: goto L_0x0036;
                    case 6: goto L_0x0011;
                    default: goto L_0x000c;
                }
            L_0x000c:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0011:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                java.lang.String r8 = r6.readString()
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x002b
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x002b:
                boolean r5 = r4.d(r5, r8, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0036:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                java.lang.String r8 = r6.readString()
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0050
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0050:
                boolean r5 = r4.c(r5, r8, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x005b:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                java.lang.String r8 = r6.readString()
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0075
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0075:
                boolean r5 = r4.b(r5, r8, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0080:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                java.lang.String r8 = r6.readString()
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x009a
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x009a:
                boolean r5 = r4.a(r5, r8, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x00a5:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                boolean r5 = r4.a(r5)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x00b7:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                java.lang.String r8 = r6.readString()
                java.lang.String r2 = r6.readString()
                android.os.IBinder r6 = r6.readStrongBinder()
                if (r6 != 0) goto L_0x00cd
                goto L_0x00e1
            L_0x00cd:
                java.lang.String r0 = "com.msc.sa.aidl.ISACallback"
                android.os.IInterface r0 = r6.queryLocalInterface(r0)
                if (r0 == 0) goto L_0x00dc
                boolean r3 = r0 instanceof defpackage.fov
                if (r3 == 0) goto L_0x00dc
                fov r0 = (defpackage.fov) r0
                goto L_0x00e1
            L_0x00dc:
                fov$a$a r0 = new fov$a$a
                r0.<init>(r6)
            L_0x00e1:
                java.lang.String r5 = r4.a(r5, r8, r2, r0)
                r7.writeNoException()
                r7.writeString(r5)
                return r1
            L_0x00ec:
                r7.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.fow.a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    String a(String str, String str2, String str3, fov fov);

    boolean a(int i, String str, Bundle bundle);

    boolean a(String str);

    boolean b(int i, String str, Bundle bundle);

    boolean c(int i, String str, Bundle bundle);

    boolean d(int i, String str, Bundle bundle);
}
