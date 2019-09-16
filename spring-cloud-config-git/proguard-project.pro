# To enable ProGuard in your project, edit project.properties
# to define the proguard.config property as described in that file.
#
# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in ${sdk.dir}/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the ProGuard
# include property in project.properties.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:

-keepattributes *Annotation*
-keepattributes *JavascriptInterface*
-dontshrink
-keepattributes Signature,InnerClasses,SourceFile,LineNumberTable
-optimizationpasses 5
-dontusemixedcaseclassnames
-dontskipnonpubliclibraryclasses
-dontskipnonpubliclibraryclassmembers
-dontpreverify
-dontoptimize
-dontwarn com.baidu.**
-dontwarn com.nostra13.**
-dontwarn com.samsung.android.sdk.pen.**
-dontwarn cn.sharesdk.sina.weibo.**
-dontwarn com.mob.tools.**
-dontwarn com.google.android.gms.**
-dontwarn rx.internal.util.unsafe.**
-dontwarn net.jcip.annotations.NotThreadSafe.**
-dontwarn com.squareup.picasso.**
-dontwarn com.gprinter.aidl.**
-dontwarn zpSDK.zpSDK.**



#地区3级联动选择器

-keep class com.lljjcoder.**{
	*;
}

-dontwarn demo.**
-keep class demo.**{*;}
-dontwarn net.sourceforge.pinyin4j.**
-keep class net.sourceforge.pinyin4j.**{*;}
-keep class net.sourceforge.pinyin4j.format.**{*;}
-keep class net.sourceforge.pinyin4j.format.exception.**{*;}

-keep class io.openflat.sdk.**{*;}


-verbose
-optimizations !code/simplification/arithmetic,!field/*,!class/merging/*


-keep public class * extends android.app.Activity
-keep public class * extends android.app.Application
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider
-keep public class * extends android.app.backup.BackupAgentHelper
-keep public class * extends android.preference.Preference
-keep public class * extends android.support.**  
-keep public class * extends android.app.Fragment
-keep public class com.google.vending.licensing.ILicensingService
-keep public class com.android.vending.licensing.ILicensingService

-keep class android.support.v4.** {*; }
-keep class com.mapbar.** {*; }   
-keep class com.mapbar.android.location.** {*; }
-keep public class com.mob.tools.utils.DeviceHelper.** {*; }
-keep class com.egis.sdk.security.**{ *; }
-keep class com.google.android.gms.** {*;}
-keep class com.yintong.**
-keep class com.yintong.secure.** {*;}

# Keep - Library. Keep all public and protected classes, fields, and methods.

-keep public class com.yx.app.entity.Table_Location {
	public protected <fields>;
}

-keep public class com.yx.app.entity.Table_PushMessageList {
	public protected <fields>;
}

-keepclassmembers class * extends android.widget.ListView{
	public protected <methods>;
}

-keepclasseswithmembernames class * {
    native <methods>;
}

-keepclasseswithmembers class * {
    public <init>(android.content.Context);
}

-keepclasseswithmembers class * {
    public <init>(android.content.Context, android.util.AttributeSet);
}

-keepclasseswithmembers class * {
    public <init>(android.content.Context, android.util.AttributeSet, int);
}

-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

-keepclassmembers class * implements android.os.Parcelable {
	public protected <fields>;
	public static final android.os.Parcelable$Creator *;
}
-keepclassmembers class * extends android.app.Activity {
   public void *(android.view.View);
}
# Also keep - Serialization code. Keep all fields and methods that are used for
# serialization.
-keepclassmembers class * implements java.io.Serializable {
	public protected <fields>;
	public protected <methods>;
    static final long serialVersionUID;
    static final java.io.ObjectStreamField[] serialPersistentFields;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}
