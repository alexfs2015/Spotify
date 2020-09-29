package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: ben reason: default package */
public final class ben {
    public static final int a = VERSION.SDK_INT;
    public static final String b = Build.DEVICE;
    public static final String c = Build.MANUFACTURER;
    public static final String d = Build.MODEL;
    public static final String e;
    public static final byte[] f = new byte[0];
    private static final Pattern g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
    private static final Pattern h = Pattern.compile("%([A-Fa-f0-9]{2})");
    private static final int[] i = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        String str = ", ";
        sb.append(str);
        sb.append(d);
        sb.append(str);
        sb.append(c);
        sb.append(str);
        sb.append(a);
        e = sb.toString();
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    }

    public static float a(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static int a(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static int a(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static <T extends Comparable<? super T>> int a(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i2;
        int binarySearch = Collections.binarySearch(list, t);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (((Comparable) list.get(binarySearch)).compareTo(t) == 0);
            i2 = binarySearch + 1;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    public static int a(byte[] bArr, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < i3; i5++) {
            i4 = i[((i4 >>> 24) ^ (bArr[i5] & 255)) & 255] ^ (i4 << 8);
        }
        return i4;
    }

    public static int a(long[] jArr, long j, boolean z, boolean z2) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            i2 = binarySearch + 1;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    public static long a(long j, float f2) {
        if (f2 == 1.0f) {
            return j;
        }
        double d2 = (double) j;
        double d3 = (double) f2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return Math.round(d2 * d3);
    }

    public static long a(long j, long j2) {
        return ((j + j2) - 1) / j2;
    }

    public static long a(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    public static long a(long j, arj arj, long j2, long j3) {
        arj arj2 = arj;
        if (arj.a.equals(arj)) {
            return j;
        }
        long j4 = arj2.c;
        long j5 = j - j4;
        if (((j4 ^ j) & (j ^ j5)) < 0) {
            j5 = Long.MIN_VALUE;
        }
        long j6 = arj2.d;
        long j7 = j + j6;
        if (((j6 ^ j7) & (j ^ j7)) < 0) {
            j7 = Long.MAX_VALUE;
        }
        boolean z = true;
        boolean z2 = j5 <= j2 && j2 <= j7;
        if (j5 > j3 || j3 > j7) {
            z = false;
        }
        return (!z2 || !z) ? z2 ? j2 : z ? j3 : j5 : Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3;
    }

    public static Handler a(Looper looper, Callback callback) {
        return new Handler(looper, callback);
    }

    public static Looper a() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    @EnsuresNonNull({"#1"})
    public static <T> T a(T t) {
        return t;
    }

    public static String a(String str, int i2) {
        String[] i3 = i(str);
        if (i3.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : i3) {
            if (i2 == bdx.i(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String a(byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    public static String a(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, Charset.forName("UTF-8"));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Thread a(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static ExecutorService a(String str) {
        return Executors.newSingleThreadExecutor(new $$Lambda$ben$kScfaSntrVI9tSsirfnuyYOn__Q(str));
    }

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static void a(bce bce) {
        if (bce != null) {
            try {
                bce.c();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(Throwable th) {
        throw th;
    }

    public static <T> void a(List<T> list, int i2, int i3) {
        if (i2 < 0 || i3 > list.size() || i2 > i3) {
            throw new IllegalArgumentException();
        } else if (i2 != i3) {
            list.subList(i2, i3).clear();
        }
    }

    public static void a(long[] jArr, long j, long j2) {
        int i2 = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long j3 = j2 / 1000000;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j3;
                i2++;
            }
        } else if (j2 >= 1000000 || 1000000 % j2 != 0) {
            double d2 = (double) j2;
            Double.isNaN(d2);
            double d3 = 1000000.0d / d2;
            while (i2 < jArr.length) {
                double d4 = (double) jArr[i2];
                Double.isNaN(d4);
                jArr[i2] = (long) (d4 * d3);
                i2++;
            }
        } else {
            long j4 = 1000000 / j2;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j4;
                i2++;
            }
        }
    }

    public static boolean a(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static boolean a(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static boolean a(bea bea, bea bea2, Inflater inflater) {
        if (bea.b() <= 0) {
            return false;
        }
        byte[] bArr = bea2.a;
        if (bArr.length < bea.b()) {
            bArr = new byte[(bea.b() * 2)];
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(bea.a, bea.b, bea.b());
        int i2 = 0;
        while (true) {
            try {
                i2 += inflater.inflate(bArr, i2, bArr.length - i2);
                if (inflater.finished()) {
                    bea2.a(bArr, i2);
                    inflater.reset();
                    return true;
                } else if (inflater.needsDictionary()) {
                    break;
                } else if (inflater.needsInput()) {
                    break;
                } else if (i2 == bArr.length) {
                    bArr = Arrays.copyOf(bArr, bArr.length << 1);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int[] a(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((Integer) list.get(i2)).intValue();
        }
        return iArr;
    }

    @EnsuresNonNull({"#1"})
    public static <T> T[] a(T[] tArr) {
        return tArr;
    }

    public static <T> T[] a(T[] tArr, int i2) {
        bdl.a(i2 <= tArr.length);
        return Arrays.copyOf(tArr, i2);
    }

    public static String[] a(String str, String str2) {
        return str.split(str2, -1);
    }

    public static int b(int i2) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 2;
        }
        if (i2 != 24) {
            return i2 != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    public static int b(int i2, int i3) {
        if (i2 == Integer.MIN_VALUE) {
            return i3 * 3;
        }
        if (i2 != 1073741824) {
            if (i2 == 2) {
                return i3 << 1;
            }
            if (i2 == 3) {
                return i3;
            }
            if (i2 != 4) {
                throw new IllegalArgumentException();
            }
        }
        return i3 << 2;
    }

    public static int b(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static int b(long[] jArr, long j, boolean z, boolean z2) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i2 = binarySearch ^ -1;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            i2 = z ? binarySearch - 1 : binarySearch;
        }
        return z2 ? Math.min(jArr.length - 1, i2) : i2;
    }

    public static long b(long j, float f2) {
        if (f2 == 1.0f) {
            return j;
        }
        double d2 = (double) j;
        double d3 = (double) f2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return Math.round(d2 / d3);
    }

    public static long b(long j, long j2, long j3) {
        if (j3 >= j2 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        double d2 = (double) j2;
        double d3 = (double) j3;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = d2 / d3;
        double d5 = (double) j;
        Double.isNaN(d5);
        return (long) (d5 * d4);
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new Locale(str).getISO3Language();
        } catch (MissingResourceException unused) {
            return d(str);
        }
    }

    public static String b(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < objArr.length; i2++) {
            sb.append(objArr[i2].getClass().getSimpleName());
            if (i2 < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static String[] b(String str, String str2) {
        return str.split(str2, 2);
    }

    public static boolean c(int i2) {
        return i2 == 3 || i2 == 2 || i2 == Integer.MIN_VALUE || i2 == 1073741824 || i2 == 4;
    }

    public static byte[] c(String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    public static String d(String str) {
        return str == null ? str : str.toLowerCase(Locale.US);
    }

    public static boolean d(int i2) {
        return i2 == Integer.MIN_VALUE || i2 == 1073741824;
    }

    public static int e(int i2) {
        switch (i2) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i3 = a;
                return (i3 < 23 && i3 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static String e(String str) {
        return str == null ? str : str.toUpperCase(Locale.US);
    }

    public static int f(int i2) {
        switch (i2) {
            case 1:
            case 12:
            case 14:
                return 3;
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 13:
                return 1;
            default:
                return 3;
        }
    }

    public static long f(String str) {
        Matcher matcher = g.matcher(str);
        if (matcher.matches()) {
            int i2 = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i2 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                if ("-".equals(matcher.group(11))) {
                    i2 = -i2;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                StringBuilder sb = new StringBuilder("0.");
                sb.append(matcher.group(8));
                gregorianCalendar.set(14, new BigDecimal(sb.toString()).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            return i2 != 0 ? timeInMillis - ((long) (i2 * 60000)) : timeInMillis;
        }
        StringBuilder sb2 = new StringBuilder("Invalid date/time format: ");
        sb2.append(str);
        throw new ParserException(sb2.toString());
    }

    public static int g(int i2) {
        if (i2 == 0) {
            return 16777216;
        }
        if (i2 == 1) {
            return 3538944;
        }
        if (i2 == 2) {
            return 13107200;
        }
        if (i2 == 3 || i2 == 4 || i2 == 5) {
            return 131072;
        }
        throw new IllegalStateException();
    }

    public static int g(String str) {
        int length = str.length();
        bdl.a(length <= 4);
        char c2 = 0;
        for (int i2 = 0; i2 < length; i2++) {
            c2 = (c2 << 8) | str.charAt(i2);
        }
        return c2;
    }

    public static byte[] h(String str) {
        byte[] bArr = new byte[(str.length() / 2)];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = i2 << 1;
            bArr[i2] = (byte) ((Character.digit(str.charAt(i3), 16) << 4) + Character.digit(str.charAt(i3 + 1), 16));
        }
        return bArr;
    }

    public static String[] i(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    public static String j(String str) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (str.charAt(i4) == '%') {
                i3++;
            }
        }
        if (i3 == 0) {
            return str;
        }
        int i5 = length - (i3 << 1);
        StringBuilder sb = new StringBuilder(i5);
        Matcher matcher = h.matcher(str);
        while (i3 > 0 && matcher.find()) {
            char parseInt = (char) Integer.parseInt(matcher.group(1), 16);
            sb.append(str, i2, matcher.start());
            sb.append(parseInt);
            i2 = matcher.end();
            i3--;
        }
        if (i2 < length) {
            sb.append(str, i2, length);
        }
        if (sb.length() != i5) {
            return null;
        }
        return sb.toString();
    }
}
