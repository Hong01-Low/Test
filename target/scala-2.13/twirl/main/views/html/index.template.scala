
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<body>
"""),format.raw/*2.1*/("""{"""),format.raw/*2.2*/("""/* Carousel */"""),format.raw/*2.16*/("""}"""),format.raw/*2.17*/("""
"""),format.raw/*3.1*/("""{"""),format.raw/*3.2*/("""adBanners.length > 0 && (
<section>
    <div class="landing-top-section">
        <div id="indicators" class="carousel slide" data-ride="carousel" data-pause="false">
            <div class="carousel-inner carousel-image">
                """),format.raw/*8.17*/("""{"""),format.raw/*8.18*/("""adBanners.map((item, index) => """),format.raw/*8.49*/("""{"""),format.raw/*8.50*/("""
                """),format.raw/*9.17*/("""const image = `landingimage-public/view/photo/$"""),format.raw/*9.64*/("""{"""),format.raw/*9.65*/("""item.id"""),format.raw/*9.72*/("""}"""),format.raw/*9.73*/("""`;
                return (
                <div>
                    <img class="carousel-image" src="""),format.raw/*12.53*/("""{"""),format.raw/*12.54*/("""APIService.base.getResourceUrl(image)"""),format.raw/*12.91*/("""}"""),format.raw/*12.92*/(""" """),format.raw/*12.93*/("""alt="""),format.raw/*12.97*/("""{"""),format.raw/*12.98*/("""item.description"""),format.raw/*12.114*/("""}"""),format.raw/*12.115*/(""" """),format.raw/*12.116*/("""/>
                </div>
                );
                """),format.raw/*15.17*/("""}"""),format.raw/*15.18*/(""")"""),format.raw/*15.19*/("""}"""),format.raw/*15.20*/("""
            """),format.raw/*16.13*/("""</div>
            <a class="carousel-control-prev" href="#indicators" role="button" data-slide="prev">
                <div class="carousel-btn-container">
                    <span class="sr-only">Previous</span>
                </div>
            </a>
            <a class="carousel-control-next" href="#indicators" role="button" data-slide="next">
                <div class="carousel-btn-container">
                    <span class="sr-only">Next</span>
                </div>
            </a>
        </div>
    </div>
</section>
)"""),format.raw/*30.2*/("""}"""),format.raw/*30.3*/("""
"""),format.raw/*31.1*/("""{"""),format.raw/*31.2*/("""/* Marketplace */"""),format.raw/*31.19*/("""}"""),format.raw/*31.20*/("""
"""),format.raw/*32.1*/("""<section class="marketplace-category-section">
    <div class="container">
        <div class="row">
            <div class="col-12 col-lg-4 text-center">
                <div class="card h-100">
                    <img class="card-img-top" src="""),format.raw/*37.51*/("""{"""),format.raw/*37.52*/("""DeveloperIcon"""),format.raw/*37.65*/("""}"""),format.raw/*37.66*/(""" """),format.raw/*37.67*/("""alt="developer" />
                    <div class="card-body">
                        <h3 class="card-title font-weight-bold">
                            Main Contractor Hall
                        </h3>
                        <p class="card-text">
                            The cloud marketplace that not only allows contractors
                            to effortlessly source for reliable sub-contractors, material
                            suppliers and machineries, but also make the perplexing project management
                            to be absolutely seamless without compromising on the professionalism.
                        </p>
                        <a href="/main-contractor" class="text-purple">
                            Explore Now →
                        </a>
                    </div>
                </div>
            </div>
            <div class="col-12 col-lg-4 text-center">
                <div class="card h-100">
                    <img class="card-img-top" src="""),format.raw/*56.51*/("""{"""),format.raw/*56.52*/("""MainConIcon"""),format.raw/*56.63*/("""}"""),format.raw/*56.64*/(""" """),format.raw/*56.65*/("""alt="main-contractor" />
                    <div class="card-body">
                        <h3 class="card-title font-weight-bold">
                            Sub-Contractor Hall
                        </h3>
                        <p class="card-text">
                            The cloud marketplace that serves the sub-contractors
                            communities by connecting you with accredited clientele
                            beyond your traditional marketing reach. NiuAce
                            are made to give you a competitive advantage in
                            terms of tender opportunities, project productivity and profitability.
                        </p>
                        <a href="/sub-contractor" class="text-purple">
                            Explore Now →
                        </a>
                    </div>
                </div>
            </div>
            <div class="col-12 col-lg-4 text-center">
                <div class="card h-100">
                    <img class="card-img-top" src="""),format.raw/*76.51*/("""{"""),format.raw/*76.52*/("""SupplierIcon"""),format.raw/*76.64*/("""}"""),format.raw/*76.65*/(""" """),format.raw/*76.66*/("""alt="supplier" />
                    <div class="card-body">
                        <h3 class="card-title font-weight-bold">
                            Supplier Hall
                        </h3>
                        <p class="card-text">
                            The cloud marketplace brings clientele to you directly
                            if you have what they are looking for. Our
                            extensive modules also ensures your procurement execution
                            is structured and streamlined at all times, to
                            eliminate mistakes that may hinder the workflow otherwise.
                        </p>
                        <a href="/supplier" class="text-purple">
                            Explore Now →
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
"""),format.raw/*97.1*/("""{"""),format.raw/*97.2*/("""/* About Us */"""),format.raw/*97.16*/("""}"""),format.raw/*97.17*/("""
"""),format.raw/*98.1*/("""<section class="about-us-section jumbotron mb-0">
    <div class="container">
        <div class="d-flex align-items-center flex-column">
            <div class="text-center mb-3">
                <h1 class="fs-large fw-700">NiuAce Software as a Service (SaaS)</h1>
            </div>
            <div class="text-center">
                <p class="fs-standard multiline m-0">
                    """),format.raw/*106.21*/("""{"""),format.raw/*106.22*/("""'NiuAce is a Software as a service (SaaS) construction marketplace provides all the project management and productivity business solutions\nto connect all developers, contractors, consultants and suppliers into one B2B business network and collaboration together\nwith all parties to complete complex construction projects on time within the same platform.'"""),format.raw/*106.379*/("""}"""),format.raw/*106.380*/("""
                """),format.raw/*107.17*/("""</p>
            </div>
        </div>
        <div class="row w-100 m-0 justify-content-center mt-5">
            """),format.raw/*111.13*/("""{"""),format.raw/*111.14*/("""constructionDetails.map(item => (
            <div class="col-12 col-md-6 col-lg-3 mb-3">
                <div class="card h-100">
                    <div class="card-body d-flex flex-column">
                        <h4 class="card-title">
                            """),format.raw/*116.29*/("""{"""),format.raw/*116.30*/("""item.title"""),format.raw/*116.40*/("""}"""),format.raw/*116.41*/("""
                        """),format.raw/*117.25*/("""</h4>
                        <p class="card-text lh-20">
                            """),format.raw/*119.29*/("""{"""),format.raw/*119.30*/("""item.desc"""),format.raw/*119.39*/("""}"""),format.raw/*119.40*/("""
                        """),format.raw/*120.25*/("""</p>
                        <a href
                           class="btn btn-brand mt-auto"
                        >
                            Read More
                        </a>
                    </div>
                </div>
            </div>
            ))"""),format.raw/*129.15*/("""}"""),format.raw/*129.16*/("""
        """),format.raw/*130.9*/("""</div>
    </div>
</section>
"""),format.raw/*133.1*/("""{"""),format.raw/*133.2*/("""/* Feedback */"""),format.raw/*133.16*/("""}"""),format.raw/*133.17*/("""
"""),format.raw/*134.1*/("""<section class="feedback-section">
    <div class="container">
        <h1>What Our Client Says</h1>
        <amp-carousel autoPlay desktopItems="""),format.raw/*137.45*/("""{"""),format.raw/*137.46*/("""2"""),format.raw/*137.47*/("""}"""),format.raw/*137.48*/(""" """),format.raw/*137.49*/("""tabletItems="""),format.raw/*137.61*/("""{"""),format.raw/*137.62*/("""2"""),format.raw/*137.63*/("""}"""),format.raw/*137.64*/(""">
            """),format.raw/*138.13*/("""{"""),format.raw/*138.14*/("""testimonial.map(item => (
            <div class="card h-100 mx-auto">
                <div class="card-body d-flex flex-column">
                    <p class="card-text mb-0 mb-md-3 mb-lg-3">"""),format.raw/*141.63*/("""{"""),format.raw/*141.64*/("""item.text"""),format.raw/*141.73*/("""}"""),format.raw/*141.74*/("""</p>
                    <div class="row m-0 mt-auto company-logo-container text-center text-md-left text-lg-left">
                        <div class="col-12 col-md-4">
                            <img src="""),format.raw/*144.38*/("""{"""),format.raw/*144.39*/("""item.logo"""),format.raw/*144.48*/("""}"""),format.raw/*144.49*/(""" """),format.raw/*144.50*/("""alt="""),format.raw/*144.54*/("""{"""),format.raw/*144.55*/("""item.companyName"""),format.raw/*144.71*/("""}"""),format.raw/*144.72*/(""" """),format.raw/*144.73*/("""/>
                        </div>
                        <div class="col-12 col-md-8">
                            <h5>"""),format.raw/*147.33*/("""{"""),format.raw/*147.34*/("""item.companyName"""),format.raw/*147.50*/("""}"""),format.raw/*147.51*/("""</h5>
                        </div>
                    </div>
                </div>
            </div>
            ))"""),format.raw/*152.15*/("""}"""),format.raw/*152.16*/("""
        """),format.raw/*153.9*/("""</amp-carousel>
    </div>
</section>
"""),format.raw/*156.1*/("""{"""),format.raw/*156.2*/("""/* Newsletter */"""),format.raw/*156.18*/("""}"""),format.raw/*156.19*/("""
"""),format.raw/*157.1*/("""<section class="jumbotron jumbortron-fluid m-0 newsletter-section">
    <div class="container">
        <h1>"""),format.raw/*159.13*/("""{"""),format.raw/*159.14*/("""i18n.t('footer.newsletter')"""),format.raw/*159.41*/("""}"""),format.raw/*159.42*/("""</h1>
        <div class="row w-100 m-0 justify-content-center justify-content-md-between text-center text-md-left">
            """),format.raw/*161.13*/("""{"""),format.raw/*161.14*/("""newsletterPreviews.map(item => (
            <a href="/newsletter"
               class="col-12 col-md-4 col-md-4 mb-2 mb-md-0 mb-lg-0"
               onClick="""),format.raw/*164.24*/("""{"""),format.raw/*164.25*/("""onSelectNewsletter(item.id)"""),format.raw/*164.52*/("""}"""),format.raw/*164.53*/("""
            """),format.raw/*165.13*/(""">
                <div class="card h-100">
                    <img class="card-img-top" src="""),format.raw/*167.51*/("""{"""),format.raw/*167.52*/("""`$"""),format.raw/*167.54*/("""{"""),format.raw/*167.55*/("""APIService.base.baseUrl"""),format.raw/*167.78*/("""}"""),format.raw/*167.79*/("""newsletter/thumbnail/$"""),format.raw/*167.101*/("""{"""),format.raw/*167.102*/("""item.id"""),format.raw/*167.109*/("""}"""),format.raw/*167.110*/("""`"""),format.raw/*167.111*/("""}"""),format.raw/*167.112*/(""" """),format.raw/*167.113*/("""alt="""),format.raw/*167.117*/("""{"""),format.raw/*167.118*/("""item.name"""),format.raw/*167.127*/("""}"""),format.raw/*167.128*/(""" """),format.raw/*167.129*/("""/>
                    <div class="card-body">
                    <span>
                      """),format.raw/*170.23*/("""{"""),format.raw/*170.24*/("""item.day > 0 ? (
                        <span>"""),format.raw/*171.31*/("""{"""),format.raw/*171.32*/("""moment(`$"""),format.raw/*171.41*/("""{"""),format.raw/*171.42*/("""item.year"""),format.raw/*171.51*/("""}"""),format.raw/*171.52*/("""-$"""),format.raw/*171.54*/("""{"""),format.raw/*171.55*/("""item.month"""),format.raw/*171.65*/("""}"""),format.raw/*171.66*/("""-$"""),format.raw/*171.68*/("""{"""),format.raw/*171.69*/("""item.day"""),format.raw/*171.77*/("""}"""),format.raw/*171.78*/("""`, 'YYYY-MM-DD').format('DD MMMM YYYY')"""),format.raw/*171.117*/("""}"""),format.raw/*171.118*/("""</span>
                      ) : (
                        <span>"""),format.raw/*173.31*/("""{"""),format.raw/*173.32*/("""moment(`$"""),format.raw/*173.41*/("""{"""),format.raw/*173.42*/("""item.year"""),format.raw/*173.51*/("""}"""),format.raw/*173.52*/("""-$"""),format.raw/*173.54*/("""{"""),format.raw/*173.55*/("""item.month"""),format.raw/*173.65*/("""}"""),format.raw/*173.66*/("""`, 'YYYY-MM').format('MMMM YYYY')"""),format.raw/*173.99*/("""}"""),format.raw/*173.100*/("""</span>
                      )"""),format.raw/*174.24*/("""}"""),format.raw/*174.25*/("""
                    """),format.raw/*175.21*/("""</span>
                        <h5 class="card-title">"""),format.raw/*176.48*/("""{"""),format.raw/*176.49*/("""item.name"""),format.raw/*176.58*/("""}"""),format.raw/*176.59*/("""</h5>
                    </div>
                </div>
            </a>
            ))"""),format.raw/*180.15*/("""}"""),format.raw/*180.16*/("""
        """),format.raw/*181.9*/("""</div>
    </div>
</section>
</body>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: a4a417695362b3f3b7a002d8c14036a32dc6a241
                  MATRIX: 811->0|844->7|871->8|912->22|940->23|967->24|994->25|1260->264|1288->265|1346->296|1374->297|1418->314|1492->361|1520->362|1554->369|1582->370|1712->472|1741->473|1806->510|1835->511|1864->512|1896->516|1925->517|1970->533|2000->534|2030->535|2119->596|2148->597|2177->598|2206->599|2247->612|2811->1149|2839->1150|2867->1151|2895->1152|2940->1169|2969->1170|2997->1171|3271->1417|3300->1418|3341->1431|3370->1432|3399->1433|4441->2447|4470->2448|4509->2459|4538->2460|4567->2461|5655->3521|5684->3522|5724->3534|5753->3535|5782->3536|6727->4454|6755->4455|6797->4469|6826->4470|6854->4471|7280->4868|7310->4869|7697->5226|7728->5227|7774->5244|7918->5359|7948->5360|8247->5630|8277->5631|8316->5641|8346->5642|8400->5667|8515->5753|8545->5754|8583->5763|8613->5764|8667->5789|8966->6059|8996->6060|9033->6069|9090->6098|9119->6099|9162->6113|9192->6114|9221->6115|9395->6260|9425->6261|9455->6262|9485->6263|9515->6264|9556->6276|9586->6277|9616->6278|9646->6279|9689->6293|9719->6294|9940->6486|9970->6487|10008->6496|10038->6497|10274->6704|10304->6705|10342->6714|10372->6715|10402->6716|10435->6720|10465->6721|10510->6737|10540->6738|10570->6739|10719->6859|10749->6860|10794->6876|10824->6877|10973->6997|11003->6998|11040->7007|11106->7045|11135->7046|11180->7062|11210->7063|11239->7064|11376->7172|11406->7173|11462->7200|11492->7201|11650->7330|11680->7331|11868->7490|11898->7491|11954->7518|11984->7519|12026->7532|12148->7625|12178->7626|12209->7628|12239->7629|12291->7652|12321->7653|12373->7675|12404->7676|12441->7683|12472->7684|12503->7685|12534->7686|12565->7687|12599->7691|12630->7692|12669->7701|12700->7702|12731->7703|12856->7799|12886->7800|12962->7847|12992->7848|13030->7857|13060->7858|13098->7867|13128->7868|13159->7870|13189->7871|13228->7881|13258->7882|13289->7884|13319->7885|13356->7893|13386->7894|13455->7933|13486->7934|13581->8000|13611->8001|13649->8010|13679->8011|13717->8020|13747->8021|13778->8023|13808->8024|13847->8034|13877->8035|13939->8068|13970->8069|14030->8100|14060->8101|14110->8122|14194->8177|14224->8178|14262->8187|14292->8188|14408->8275|14438->8276|14475->8285
                  LINES: 26->1|27->2|27->2|27->2|27->2|28->3|28->3|33->8|33->8|33->8|33->8|34->9|34->9|34->9|34->9|34->9|37->12|37->12|37->12|37->12|37->12|37->12|37->12|37->12|37->12|37->12|40->15|40->15|40->15|40->15|41->16|55->30|55->30|56->31|56->31|56->31|56->31|57->32|62->37|62->37|62->37|62->37|62->37|81->56|81->56|81->56|81->56|81->56|101->76|101->76|101->76|101->76|101->76|122->97|122->97|122->97|122->97|123->98|131->106|131->106|131->106|131->106|132->107|136->111|136->111|141->116|141->116|141->116|141->116|142->117|144->119|144->119|144->119|144->119|145->120|154->129|154->129|155->130|158->133|158->133|158->133|158->133|159->134|162->137|162->137|162->137|162->137|162->137|162->137|162->137|162->137|162->137|163->138|163->138|166->141|166->141|166->141|166->141|169->144|169->144|169->144|169->144|169->144|169->144|169->144|169->144|169->144|169->144|172->147|172->147|172->147|172->147|177->152|177->152|178->153|181->156|181->156|181->156|181->156|182->157|184->159|184->159|184->159|184->159|186->161|186->161|189->164|189->164|189->164|189->164|190->165|192->167|192->167|192->167|192->167|192->167|192->167|192->167|192->167|192->167|192->167|192->167|192->167|192->167|192->167|192->167|192->167|192->167|192->167|195->170|195->170|196->171|196->171|196->171|196->171|196->171|196->171|196->171|196->171|196->171|196->171|196->171|196->171|196->171|196->171|196->171|196->171|198->173|198->173|198->173|198->173|198->173|198->173|198->173|198->173|198->173|198->173|198->173|198->173|199->174|199->174|200->175|201->176|201->176|201->176|201->176|205->180|205->180|206->181
                  -- GENERATED --
              */
          