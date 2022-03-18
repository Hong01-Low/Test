
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,Int,Html,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * three arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page and an `AssetFinder`
 * to define to reverse route static assets.
 */
  def apply/*8.2*/(title: String, role: Int)(content: Html)(implicit assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.1*/("""
"""),format.raw/*10.1*/("""<!DOCTYPE html>
<html lang="en">
"""),_display_(/*12.2*/if(role == 1)/*12.15*/ {_display_(Seq[Any](format.raw/*12.17*/("""
    """),format.raw/*13.5*/("""<head>
        """),format.raw/*14.62*/("""
        """),format.raw/*15.9*/("""<title>"""),_display_(/*15.17*/title),format.raw/*15.22*/("""</title>
        <link rel="stylesheet" href='"""),_display_(/*16.39*/routes/*16.45*/.Assets.versioned("styles/components/_aliceCarousel.css")),format.raw/*16.102*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*17.39*/routes/*17.45*/.Assets.versioned("styles/components/_autoComplete.css")),format.raw/*17.101*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*18.39*/routes/*18.45*/.Assets.versioned("styles/components/_backgrounds.css")),format.raw/*18.100*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*19.39*/routes/*19.45*/.Assets.versioned("styles/components/_bqscan.css")),format.raw/*19.95*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*20.39*/routes/*20.45*/.Assets.versioned("styles/components/_buttons.css")),format.raw/*20.96*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*21.39*/routes/*21.45*/.Assets.versioned("styles/components/_carousel.css")),format.raw/*21.97*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*22.39*/routes/*22.45*/.Assets.versioned("styles/components/_carousel.css")),format.raw/*22.97*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*23.39*/routes/*23.45*/.Assets.versioned("styles/components/_charts.css")),format.raw/*23.95*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*24.39*/routes/*24.45*/.Assets.versioned("styles/components/_components.css")),format.raw/*24.99*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*25.39*/routes/*25.45*/.Assets.versioned("styles/components/_containers.css")),format.raw/*25.99*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*26.39*/routes/*26.45*/.Assets.versioned("styles/components/_dashboard.css")),format.raw/*26.98*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*27.39*/routes/*27.45*/.Assets.versioned("styles/components/_datePicker.css")),format.raw/*27.99*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*28.39*/routes/*28.45*/.Assets.versioned("styles/components/_devextreme.css")),format.raw/*28.99*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*29.39*/routes/*29.45*/.Assets.versioned("styles/components/_forms.css")),format.raw/*29.94*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*30.39*/routes/*30.45*/.Assets.versioned("styles/components/_landing.css")),format.raw/*30.96*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*31.39*/routes/*31.45*/.Assets.versioned("styles/components/_modal.css")),format.raw/*31.94*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*32.39*/routes/*32.45*/.Assets.versioned("styles/components/_navBar.css")),format.raw/*32.95*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*33.39*/routes/*33.45*/.Assets.versioned("styles/components/_phoneInput.css")),format.raw/*33.99*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*34.39*/routes/*34.45*/.Assets.versioned("styles/components/_popOver.css")),format.raw/*34.96*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*35.39*/routes/*35.45*/.Assets.versioned("styles/components/_progressStep.css")),format.raw/*35.101*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*36.39*/routes/*36.45*/.Assets.versioned("styles/components/_syncfusion.css")),format.raw/*36.99*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*37.39*/routes/*37.45*/.Assets.versioned("styles/components/_table.css")),format.raw/*37.94*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*38.39*/routes/*38.45*/.Assets.versioned("styles/components/_tools.css")),format.raw/*38.94*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*39.39*/routes/*39.45*/.Assets.versioned("styles/components/_treeTable.css")),format.raw/*39.98*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*40.39*/routes/*40.45*/.Assets.versioned("styles/utilities/_spacing.css")),format.raw/*40.95*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*41.39*/routes/*41.45*/.Assets.versioned("styles/utilities/_themify.css")),format.raw/*41.95*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*42.39*/routes/*42.45*/.Assets.versioned("styles/utilities/_typography.css")),format.raw/*42.98*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*43.39*/routes/*43.45*/.Assets.versioned("styles/utilities/_utilities.css")),format.raw/*43.97*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*44.39*/routes/*44.45*/.Assets.versioned("styles/_config.css")),format.raw/*44.84*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*45.39*/routes/*45.45*/.Assets.versioned("styles/App.css")),format.raw/*45.80*/("""'>
        <script src='"""),_display_(/*46.23*/assetsFinder/*46.35*/.path("javascripts/hello.js")),format.raw/*46.64*/("""' type="text/javascript"></script>
    </head>
    <body>
        """),format.raw/*50.32*/("""
        """),_display_(/*51.10*/content),format.raw/*51.17*/("""
    """),format.raw/*52.5*/("""</body>
</html>
""")))}))
      }
    }
  }

  def render(title:String,role:Int,content:Html,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(title,role)(content)(assetsFinder)

  def f:((String,Int) => (Html) => (AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (title,role) => (content) => (assetsFinder) => apply(title,role)(content)(assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: ac7455f20f1be0c3846dc27831012577fc666a26
                  MATRIX: 1071->327|1243->406|1271->407|1331->441|1353->454|1393->456|1425->461|1468->529|1504->538|1539->546|1565->551|1639->598|1654->604|1733->661|1801->702|1816->708|1894->764|1962->805|1977->811|2054->866|2122->907|2137->913|2208->963|2276->1004|2291->1010|2363->1061|2431->1102|2446->1108|2519->1160|2587->1201|2602->1207|2675->1259|2743->1300|2758->1306|2829->1356|2897->1397|2912->1403|2987->1457|3055->1498|3070->1504|3145->1558|3213->1599|3228->1605|3302->1658|3370->1699|3385->1705|3460->1759|3528->1800|3543->1806|3618->1860|3686->1901|3701->1907|3771->1956|3839->1997|3854->2003|3926->2054|3994->2095|4009->2101|4079->2150|4147->2191|4162->2197|4233->2247|4301->2288|4316->2294|4391->2348|4459->2389|4474->2395|4546->2446|4614->2487|4629->2493|4707->2549|4775->2590|4790->2596|4865->2650|4933->2691|4948->2697|5018->2746|5086->2787|5101->2793|5171->2842|5239->2883|5254->2889|5328->2942|5396->2983|5411->2989|5482->3039|5550->3080|5565->3086|5636->3136|5704->3177|5719->3183|5793->3236|5861->3277|5876->3283|5949->3335|6017->3376|6032->3382|6092->3421|6160->3462|6175->3468|6231->3503|6283->3528|6304->3540|6354->3569|6448->3725|6485->3735|6513->3742|6545->3747
                  LINES: 27->8|32->9|33->10|35->12|35->12|35->12|36->13|37->14|38->15|38->15|38->15|39->16|39->16|39->16|40->17|40->17|40->17|41->18|41->18|41->18|42->19|42->19|42->19|43->20|43->20|43->20|44->21|44->21|44->21|45->22|45->22|45->22|46->23|46->23|46->23|47->24|47->24|47->24|48->25|48->25|48->25|49->26|49->26|49->26|50->27|50->27|50->27|51->28|51->28|51->28|52->29|52->29|52->29|53->30|53->30|53->30|54->31|54->31|54->31|55->32|55->32|55->32|56->33|56->33|56->33|57->34|57->34|57->34|58->35|58->35|58->35|59->36|59->36|59->36|60->37|60->37|60->37|61->38|61->38|61->38|62->39|62->39|62->39|63->40|63->40|63->40|64->41|64->41|64->41|65->42|65->42|65->42|66->43|66->43|66->43|67->44|67->44|67->44|68->45|68->45|68->45|69->46|69->46|69->46|72->50|73->51|73->51|74->52
                  -- GENERATED --
              */
          