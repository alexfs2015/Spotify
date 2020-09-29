package defpackage;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: beo reason: default package */
public final class beo {
    private static boolean a(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean a(XmlPullParser xmlPullParser, String str) {
        return a(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static String b(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
}
