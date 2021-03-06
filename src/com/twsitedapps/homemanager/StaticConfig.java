/*****************************************************************************
 *    Copyright 2011 Twisted Apps LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *  limitations under the License.
 *  
 */

package com.twsitedapps.homemanager;

import android.content.SharedPreferences;

/*****************************************************************************
 * StaticConfig - Global static references.
 * 
 * @author Russell T Mackler
 * @version 1.0
 * @since 1.0
 */
public class StaticConfig
{
    // No way to instantiate
    private StaticConfig(){};
    
    public static final String      TWISTED_TAG                 = "+++++ TWISTED +++++ ";

    // Position for widget
    public static int               position                    = 0;

    // Intents
    public static final String      PREFERENCES_INTENT          = "com.twsitedapps.homemanager.action.PREFERENCES";
    public static final String      GETHOME_INTENT              = "com.twsitedapps.homemanager.action.GETHOME";
    public static final String      NEXT_HOME                   = "com.twsitedapps.homemanager.action.NEXT";
    public static final String      PREV_HOME                   = "com.twsitedapps.homemanager.action.PREV";

    // External Location references
    public static final String      THM_URL                     = "http://www.twistedapps.org";
    public static final String      ROLL_URL                    = "http://www.twistedapps.org/?cat=192";
    public static final String      GITHUB_URL                  = "https://github.com/rmack/TwistedHomeManager";
    public static final String      THM_BLOG                    = "http://www.twistedapps.org/?page_id=563";
    public static final String      THM_MRK                     = "market://search?q=com.twsitedapps.homemanager";

    // All Shared Preference keys
    // ---------------------------------------------------------
    public static SharedPreferences preferences;

    // Standard Options
    public static final String      THEME                       = "themeKey";
    public static int               theme                       = 0;
    public static final int         BLACK                       = 0;
    public static final int         WHITE                       = 1;
    public static final int         GREY                        = 2;
    public static final int         CYAN                        = 3;
    public static final int         GREEN                       = 4;
    public static final int         MAGENTA                     = 5;

       
    // List of known Home Apps
    public static final String      ADWLauncherName             = "ADW.Launcher";
    public static final String      ADWLauncher                 = "market://search?q=org.adw.launcher";
    public static final String      ApexLauncherName            = "Apex Launcher";
    public static final String      ApexLauncher                = "market://search?q=com.anddoes.launcher";
    public static final String      AtomLauncherName            = "Atom Launcher";
    public static final String      AtomLauncher                = "market://search?q=com.dlto.atom.launcher";
    public static final String      BalancerName                = "Balancer";
    public static final String      Balancer                    = "market://search?q=com.ddna.balancer.launcher";
    public static final String      ClaystoneLauncherName       = "Claystone Launcher";
    public static final String      ClaystoneLauncher           = "market://search?q=com.claystoneinc";
    public static final String      CrazyHomeLiteName           = "Crazy Home Lite";
    public static final String      CrazyHomeLite               = "market://search?q=com.cdproductions.apps.crazyhomelite";
    public static final String      dxTopLiteName               = "dxTop Lite";
    public static final String      dxTopLite                   = "market://search?q=com.android.dxtop.demo.launcher";
    public static final String      FastHomeName                = "FastHome";
    public static final String      FastHome                    = "market://search?q=com.bitzophrenic.android.FastHome";
    public static final String      GOLauncherEXName            = "GO Launcher EX";
    public static final String      GOLauncherEX                = "market://search?q=com.gau.go.launcherex";
    public static final String      HiLauncherName              = "Hi Launcher";
    public static final String      HiLauncher                  = "market://search?q=Hi Launcher";
    public static final String      HoneycombLauncherName       = "Honeycomb Launcher";
    public static final String      HoneycombLauncher           = "market://search?q=mobi.TeamSyndicate.HCL";
    public static final String      HomeName                    = "Home++";
    public static final String      Home                        = "market://search?q=mobi.intuitit.android.x.launcher";
    public static final String      homescreen3DfreeversionName = "homescreen 3D (free version)";
    public static final String      homescreen3Dfreeversion     = "market://search?q=com.zeropointnine.homeScreen3d";
    public static final String      IceCreamSandwich4Name       = "Ice Cream Sandwich 4.0";
    public static final String      IceCreamSandwich4           = "market://search?q=mobi.SyndicateApps.ICSv2";
    public static final String      iHomeName                   = "iHome";
    public static final String      iHome                       = "market://search?q=com.chethan.iHome";
    public static final String      JellyBean41Name             = "JellyBean 4.1";
    public static final String      JellyBean41                 = "market://search?q=com.SyndicateApps.jblauncher";
    public static final String      LauncherProName             = "LauncherPro";
    public static final String      LauncherPro                 = "market://search?q=com.fede.launcher";
    public static final String      LauncherName                = "Launcher";
    public static final String      Launcher                    = "market://search?q=com.ebproductions.android.launcher";
    public static final String      Launcher7Name               = "Launcher7";
    public static final String      Launcher7                   = "market://search?q=info.tikuwarez.launcher3";
    public static final String      LiveHomeName                = "LiveHome";
    public static final String      LiveHome                    = "market://search?q=com.mo.android.livehome";
    public static final String      mooLauncherName             = "Launcher";
    public static final String      mooLauncher                 = "market://search?q=com.moo.android.launcher.gingerbread";
    public static final String      MXHomeLauncherName          = "MXHome Launcher";
    public static final String      MXHomeLauncher              = "market://search?q=com.neomtel.mxhome";
    public static final String      MyLauncherName              = "MyLauncher";
    public static final String      MyLauncher                  = "market://search?q=com.morgoo.launcher";
    public static final String      NemusLauncherName           = "Nemus Launcher";
    public static final String      NemusLauncher               = "market://search?q=com.nemustech.launcher";
    public static final String      NovaLauncherName            = "Nova Launcher";
    public static final String      NovaLauncher                = "market://search?q=com.teslacoilsw.launcher";
    public static final String      MetroUIName                 = "Metro UI";
    public static final String      MetroUI                     = "market://search?q=chrisman.android.home.metroui";
    public static final String      MyHomeliteName              = "My Home lite";
    public static final String      MyHomelite                  = "market://search?q=com.farm.myhome_lite";
    //public static final String      OpenHome6Name               = "Open Home 6";
    //public static final String      OpenHome6                   = "market://search?q=com.betterandroid.openhome6";
    public static final String      PandaHomeName               = "91PandaHome";
    public static final String      PandaHome                   = "market://search?q=com.nd.android.pandahomepro";
    public static final String      QuickLaunchHomeName         = "Quick Launch Home";
    public static final String      QuickLaunchHome             = "market://search?q=com.tormas.home";
    public static final String      QQLauncherProName           = "QQ Launcher Pro";
    public static final String      QQLauncherPro               = "market://search?q=com.tencent.qqlauncher";
    public static final String      ReginaLauncherName          = "Regina Launcher";
    public static final String      ReginaLauncher              = "market://search?q=com.nemustech.regina";
    public static final String      SimpleHomeLiteName          = "Simple Home (Lite)";
    public static final String      SimpleHomeLite              = "market://search?q=org.guesswork.simplehome.lite";
    public static final String      SmartLauncherName           = "Smart Launcher";
    public static final String      SmartLauncher               = "market://search?q=ginlemon.flowerfree";
    public static final String      TagHome22Name               = "Tag Home 2.2";
    public static final String      TagHome22                   = "market://search?q=com.stain46.taghome22";
    public static final String      TagHome16Name               = "Tag Home 1.6";
    public static final String      TagHome16                   = "market://search?q=com.stain46.taghome16";
    public static final String      TagHomeName                 = "Tag Home";
    public static final String      TagHome                     = "market://search?q=com.stain46.taghom";
    public static final String      TwLauncherName              = "TwLauncher";
    public static final String      TwLauncher                  = "market://search?q=com.sec.android.app.twlauncher";
    public static final String      ZeamLauncherName            = "Zeam Launcher";
    public static final String      ZeamLauncher                = "market://search?q=org.zeam";
    public static final String      Launcher360Name             = "360 Launcher";
    public static final String      Launcher360                 = "market://search?q=com.qihoo360.launcher";
    public static final String      launcher91Name             = "91 Launcher";
    public static final String      launcher91                 = "market://search?q=com.nd.android.launcher91";
    
} // End StaticConfig
