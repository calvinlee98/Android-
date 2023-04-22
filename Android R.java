关于R的一切
Android中 res目录下的资源都会经过编译、链接获得一个identifier（id值）
id值 32位int  PPTTNNNN
pp 资源所属包类型 0x7f代表APK包资源 0x01 代表系统包资源（来自Android.jar) 
TT 代表资源类型
      0x02：drawable
      0x03：layout
      0x04：values
      0x05：xml
      0x06：raw
      0x07：color
      0x08：menu
通过APKTools  可以在resource.arsc里面查找真正的资源
AAR
Module
Application
