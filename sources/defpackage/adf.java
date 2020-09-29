package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: adf reason: default package */
public final class adf {
    public static byte[] a(Context context, String str) {
        String[] list;
        String str2;
        AssetManager assets = context.getAssets();
        StringBuilder sb = new StringBuilder("bmwgroup");
        sb.append(File.separator);
        sb.append(str);
        sb.append(File.separator);
        sb.append("images");
        String sb2 = sb.toString();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
        try {
            for (String str3 : assets.list(sb2)) {
                String str4 = ".png";
                String str5 = "v3";
                if (str3.equalsIgnoreCase("application_icon_57x51.png")) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(ael.a(str5).a("APPLICATION_ICON_57X51"));
                    sb3.append(str4);
                    str2 = sb3.toString();
                } else if (str3.equalsIgnoreCase("playerscreen_icon_toolbar_0.png")) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(ael.a(str5).a("PLAYERSCREEN_ICON_TOOLBAR_0"));
                    sb4.append(str4);
                    str2 = sb4.toString();
                } else if (str3.equalsIgnoreCase("playerscreen_icon_toolbar_1.png")) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(ael.a(str5).a("PLAYERSCREEN_ICON_TOOLBAR_1"));
                    sb5.append(str4);
                    str2 = sb5.toString();
                } else if (str3.equalsIgnoreCase("playerscreen_icon_toolbar_2.png")) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(ael.a(str5).a("PLAYERSCREEN_ICON_TOOLBAR_2"));
                    sb6.append(str4);
                    str2 = sb6.toString();
                } else if (str3.equalsIgnoreCase("playerscreen_icon_toolbar_3.png")) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(ael.a(str5).a("PLAYERSCREEN_ICON_TOOLBAR_3"));
                    sb7.append(str4);
                    str2 = sb7.toString();
                } else if (str3.equalsIgnoreCase("playerscreen_icon_toolbar_4.png")) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(ael.a(str5).a("PLAYERSCREEN_ICON_TOOLBAR_4"));
                    sb8.append(str4);
                    str2 = sb8.toString();
                } else if (str3.equalsIgnoreCase("playerscreen_icon_toolbar_5.png")) {
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(ael.a(str5).a("PLAYERSCREEN_ICON_TOOLBAR_5"));
                    sb9.append(str4);
                    str2 = sb9.toString();
                } else if (str3.equalsIgnoreCase("playerscreen_icon_toolbar_6.png")) {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(ael.a(str5).a("PLAYERSCREEN_ICON_TOOLBAR_6"));
                    sb10.append(str4);
                    str2 = sb10.toString();
                } else if (str3.equalsIgnoreCase("playerscreen_icon_toolbar_7.png")) {
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append(ael.a(str5).a("PLAYERSCREEN_ICON_TOOLBAR_7"));
                    sb11.append(str4);
                    str2 = sb11.toString();
                } else if (str3.equalsIgnoreCase("playerscreen_cover_200x200.png")) {
                    StringBuilder sb12 = new StringBuilder();
                    sb12.append(ael.a(str5).a("PLAYERSCREEN_COVER_200X200"));
                    sb12.append(str4);
                    str2 = sb12.toString();
                } else if (str3.equalsIgnoreCase("playerscreen_cover_320x320.png")) {
                    StringBuilder sb13 = new StringBuilder();
                    sb13.append(ael.a(str5).a("PLAYERSCREEN_COVER_320X320"));
                    sb13.append(str4);
                    str2 = sb13.toString();
                } else if (str3.equalsIgnoreCase("playerscreen_icon_album_65x51.png")) {
                    StringBuilder sb14 = new StringBuilder();
                    sb14.append(ael.a(str5).a("PLAYERSCREEN_ICON_ALBUM_65X51"));
                    sb14.append(str4);
                    str2 = sb14.toString();
                } else if (str3.equalsIgnoreCase("playerscreen_icon_checkmark_65x51.png")) {
                    StringBuilder sb15 = new StringBuilder();
                    sb15.append(ael.a(str5).a("PLAYERSCREEN_ICON_CHECKMARK_65X51"));
                    sb15.append(str4);
                    str2 = sb15.toString();
                } else if (str3.equalsIgnoreCase("playerscreen_icon_interpret_65x51.png")) {
                    StringBuilder sb16 = new StringBuilder();
                    sb16.append(ael.a(str5).a("PLAYERSCREEN_ICON_INTERPRET_65X51"));
                    sb16.append(str4);
                    str2 = sb16.toString();
                } else if (str3.equalsIgnoreCase("playerscreen_icon_shuffle_on_65x51.png")) {
                    StringBuilder sb17 = new StringBuilder();
                    sb17.append(ael.a(str5).a("PLAYERSCREEN_ICON_SHUFFLE_ON_65X51"));
                    sb17.append(str4);
                    str2 = sb17.toString();
                } else if (str3.equalsIgnoreCase("playerscreen_icon_title_65x51.png")) {
                    StringBuilder sb18 = new StringBuilder();
                    sb18.append(ael.a(str5).a("PLAYERSCREEN_ICON_TITLE_65X51"));
                    sb18.append(str4);
                    str2 = sb18.toString();
                } else {
                    str2 = str3;
                }
                zipOutputStream.putNextEntry(new ZipEntry(str2));
                StringBuilder sb19 = new StringBuilder();
                sb19.append(sb2);
                sb19.append(File.separator);
                sb19.append(str3);
                InputStream a = a(assets, sb19.toString());
                a(a, (OutputStream) zipOutputStream);
                zipOutputStream.closeEntry();
                a.close();
            }
            zipOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] b(Context context, String str) {
        String[] list;
        AssetManager assets = context.getAssets();
        StringBuilder sb = new StringBuilder("bmwgroup");
        sb.append(File.separator);
        sb.append(str);
        sb.append(File.separator);
        sb.append("texts");
        String sb2 = sb.toString();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
        try {
            for (String str2 : assets.list(sb2)) {
                if (str2.endsWith("txt")) {
                    zipOutputStream.putNextEntry(new ZipEntry(str2));
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append(File.separator);
                    sb3.append(str2);
                    InputStream a = a(assets, sb3.toString());
                    b(a, (OutputStream) zipOutputStream);
                    zipOutputStream.closeEntry();
                    a.close();
                }
            }
            zipOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static InputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.open(str);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
    }

    private static void b(InputStream inputStream, OutputStream outputStream) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                bufferedWriter.write(readLine.replaceAll("TITLE", "163"));
            } catch (IOException e) {
                e.printStackTrace();
                try {
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                try {
                    inputStreamReader.close();
                    return;
                } catch (IOException e3) {
                    e3.printStackTrace();
                    return;
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                try {
                    inputStreamReader.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
        }
        bufferedWriter.flush();
        try {
        } catch (IOException e6) {
            e6.printStackTrace();
        }
        try {
            inputStreamReader.close();
        } catch (IOException e7) {
            e7.printStackTrace();
        }
    }
}
